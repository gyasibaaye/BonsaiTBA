# https://docs.microsoft.com/en-us/bonsai/inkling/basics
inkling "2.0"
using Math
using Goal

# The maximum angle (in radians) before fallover or failure
const MaxPoleAngle = (12 * 2 * Math.Pi) / 360
# Length of the cartpole track in meters
const TrackLength = 2.0
const MaxPosition = TrackLength / 2


# These are all the values the sim produces
type SimState {
    cart_position: number,  # (m). 0 is the center of the track
    cart_velocity: number,  # (m/s)
    pole_angle: number,  # (rad). 0 is vertical.
    pole_angular_velocity: number,  # (rad/s)
    pole_center_position: number,  # (m) -- x position of the center of the pole 
    pole_center_velocity: number,  # (m/s) -- x velocity of the center of the pole
    target_pole_position: number,  # (m)

    # physical params from the config are available too
    cart_mass: number,  # (kg)
    pole_mass: number,  # (kg)
    pole_length: number,  # (m)
    cart_gravity: number, # (m/s^2)
}

# This is a subset of the SimState that we'll make available to the brain
# (these should all be values that will be available to a deployed brain)
type ObservedState {
    cart_position: number,  # (m). 0 is the center of the track
    cart_velocity: number,  # (m/s)
    pole_angle: number,  # (rad). 0 is vertical.
    pole_angular_velocity: number,  # (rad/s)
}

type Action {
    # Force to apply, up to the max force magnitude (1 Newton by default)
    command: number<-1..1>
}

# Configuration variables for the simulator
type SimConfig {
    cart_mass: number,  # (kg), default 0.31
    pole_mass: number,  # (kg), default 0.055
    pole_length: number,  # (m), default 0.4
    cart_gravity: number, # (m/s^2)
    initial_cart_position: number<-MaxPosition .. MaxPosition>,  # (m), default 0 (center)
    initial_cart_velocity: number,   # (m/s), default 0
    initial_pole_angle: number,  # (rad), default 0
    initial_angular_velocity: number,  # (rad/s), default 0
    target_pole_position: number<-MaxPosition .. MaxPosition>,  # (m), default 0
}

graph (input: ObservedState): Action {
    concept BalancePole(input): Action {
        curriculum {
            source simulator (Action: Action, Config: SimConfig): SimState {
            }
            training {
                EpisodeIterationLimit: 200,
            }
            goal (SimState: SimState) {
                avoid FallOver:
                    Math.Abs(SimState.pole_angle) in Goal.RangeAbove(MaxPoleAngle)
                avoid OutOfRange:
                    Math.Abs(SimState.cart_position) in Goal.RangeAbove(MaxPosition)
            }
            # lessons using acceration, added gravity as an additional lesson
            # In terms of laying out the lessons we start with fixed conditions. 
            lesson `Fixed Pole` {
                scenario {
                    pole_mass: 0.055,
                    pole_length: 0.5
                }
            }
            # then we improve the model's understanding of the system dynamics
            lesson `Randomize Pole Length` {
                scenario {
                    pole_mass: 0.055,
                    pole_length: number<0.1 .. 1>,
                    cart_gravity: 9.8
                }
            }
            lesson `Randomize Pole Length & Mass` {
                scenario {
                    pole_length: number<0.1 .. 1>,
                    pole_mass: number<0.01 .. 1.5>,
                    cart_gravity: 9.8
                }
            }
            # then we introduce gravity variability
            lesson `Randomize gravity` {
                scenario {
                    pole_length: number<0.1 .. 1>,
                    pole_mass: number<0.01 .. 1.5>,
                    cart_gravity: number<7.7 .. 11.9> # earth gravity variation
                }
            }
            # once fundamental concepts are hopefully mastered we extend the range to make our model more robust
            lesson `Randomize all parameters` {
                scenario {
                    pole_length: number<0.05 .. 3>,
                    pole_mass: number<0.005 .. 3>,
                    cart_gravity: number<5.0 .. 15> #
                }
            }
        }
    }
}

# Special string to hook up the simulator visualizer
# in the web interface.
const SimulatorVisualizer = "/cartpoleviz/"