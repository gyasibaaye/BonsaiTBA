"""
Classic cart-pole system implemented by Rich Sutton et al.
Copied from http://incompleteideas.net/sutton/book/code/pole.c
permalink: https://perma.cc/C9ZM-652R """

import math
import random
from collections import namedtuple


# Constants that we might want to let people change
DEFAULT_CART_MASS = 0.31  # kg
DEFAULT_POLE_MASS = 0.055  # kg
DEFAULT_POLE_LENGTH = 0.4  # m
# moved gravity to a constant that can be changed
DEFAULT_GRAVITY = 9.8  # a classic...

# Constants not exposed for changing for now
FORCE_MAG = 1.0
STEP_DURATION = 0.02  # seconds between state updates (20ms)
TRACK_WIDTH = 2.0  # m
FORCE_NOISE = 0.02  # % of FORCE_MAG


CartPoleState = namedtuple("CartPoleState", "x x_dot y y_dot")


def normalize_angle(x):
    """
    convert an angle to [-pi, pi]
    """
    return (x+math.pi) % (2*math.pi) - math.pi


class CartPole:
    """
    Model for the dynamics of an inverted pendulum
    """

    def __init__(self):
        # Set a constants needed by renderer
        self.x_threshold = TRACK_WIDTH / 2

        self.reset(
            # setting a fixed pole start angle at ~180 degrees to see the affects of gravity. Zeroed angular velocity to remove added energy to the system
            initial_pole_angle=3.14,#random.uniform(-0.05, 0.05),
            initial_angular_velocity=0#random.uniform(-0.05, 0.05),
        )

    def reset(
        self,
        cart_mass: float = DEFAULT_CART_MASS,
        pole_mass: float = DEFAULT_POLE_MASS,
        pole_length: float = DEFAULT_POLE_LENGTH,
        cart_gravity: float = DEFAULT_GRAVITY, # Added to reset so that ingling gravity parameter can be passed through to the sim 
        initial_cart_position: float = 0,
        initial_cart_velocity: float = 0,
        initial_pole_angle: float = 0,
        initial_angular_velocity: float = 0,
        target_pole_position: float = 0,
    ):
        self._cart_mass = cart_mass  # (kg)
        self._pole_mass = pole_mass  # (kg)
        self._pole_length = pole_length  # (m)
        self._cart_gravity = cart_gravity # (m/s^2)
        self._cart_position = initial_cart_position  # (m)
        self._cart_velocity = initial_cart_velocity  # (m/s)
        self._pole_angle = normalize_angle(initial_pole_angle)  # (rad)
        self._pole_angular_velocity = initial_angular_velocity  # (rad/s)
        self._target_pole_position = target_pole_position  # (m)
        self._update_pole_center_state()

    def _update_pole_center_state(self):
        """
        Update _pole_center_position and _pole_center_velocity.
        """
        # Use the pole center, not the cart center, for tracking
        # pole center velocity.
        pole_half_length = self._pole_length / 2
        self._pole_center_position = (
            self._cart_position + math.sin(self._pole_angle) * pole_half_length
        )
        self._pole_center_velocity = (
            self._cart_velocity
            + math.sin(self._pole_angular_velocity) * pole_half_length
        )

    def step(self, action: float):
        """ 
        Move the state of the cartpole simulation forward one time unit.

        Args:
            action: a dict with a key 'command', with value between -1 and 1.
        """
        # We are expecting the input command to be -1 or 1,
        # but we'll support a continuous action space.
        # Add a small amount of random noise to the force so
        # the policy can't succeed by simply applying zero
        # force each time.
        #zeroing out force to observe conservation of energy
        force = 0#FORCE_MAG * (action + random.uniform(-0.02, 0.02))

        # Precompute some helpful quantities
        total_mass = self._cart_mass + self._pole_mass
        pole_half_length = self._pole_length / 2
        pole_mass_length = self._pole_mass * pole_half_length

        cosTheta = math.cos(self._pole_angle)
        sinTheta = math.sin(self._pole_angle)

        temp = (
            force + pole_mass_length * self._pole_angular_velocity ** 2 * sinTheta
        ) / total_mass
        # replaced gravity reference to reference the self. parameter
        angularAccel = (self._cart_gravity * sinTheta - cosTheta * temp) / (
            pole_half_length
            * (4.0 / 3.0 - (self._pole_mass * cosTheta ** 2) / total_mass)
        )
        #fixed cart position
        linearAccel = 0#temp - (pole_mass_length * angularAccel * cosTheta) / total_mass

        self._cart_position = self._cart_position + STEP_DURATION * self._cart_velocity
        self._cart_velocity = self._cart_velocity + STEP_DURATION * linearAccel

        self._pole_angle = (
            self._pole_angle + STEP_DURATION * self._pole_angular_velocity
        )
        self._pole_angle = normalize_angle(self._pole_angle)

        self._pole_angular_velocity = (
            self._pole_angular_velocity + STEP_DURATION * angularAccel
        )

        self._update_pole_center_state()

    @property
    def state(self):
        return {
            "cart_position": self._cart_position,
            "cart_velocity": self._cart_velocity,
            "pole_angle": self._pole_angle,
            "pole_angular_velocity": self._pole_angular_velocity,
            "pole_center_position": self._pole_center_position,
            "pole_center_velocity": self._pole_center_velocity,
            "target_pole_position": self._target_pole_position,
            # also return the constants from the config
            "cart_mass": self._cart_mass,
            "pole_mass": self._pole_mass,
            "pole_length": self._pole_length,
            "cart_gravity": self._cart_gravity, #added return for current gravity
        }


def create_viewer(model):
    from render import Viewer

    viewer = Viewer()
    viewer.model = model
    return viewer


if __name__ == "__main__":

    import random
    import sys

    model = CartPole()
    viewer = create_viewer(model)
    number_iterations = 2000 #increased steps to observe behavior
    for i in range(number_iterations):
        print(", ".join([f"{k}: {v:.3f}" for k,v in model.state.items()]))
        actions = [-1,0,1]
        action = random.sample(actions, 1)[0]
        state = viewer.model.step(0) # not introducing external force action
        ##state = viewer.model.step(action)
        viewer.update()
        if viewer.has_exit:
            viewer.close()
            sys.exit(0)
