"""
Fixed policies to test our sim integration with. These are intended to take
Brain states and return Brain actions.
"""

import random
from typing import Dict
import requests

def random_policy(state):
    """
    Ignore the state, move randomly.
    """
    action = {"Vm": random.uniform(-3, 3)}
    return action


def brain_policy(
    state: Dict[str, float], exported_brain_url: str = "http://localhost:5000"
):

    prediction_endpoint = f"{exported_brain_url}/v1/prediction"
    response = requests.get(prediction_endpoint, json=state)

    return response.json()

def forget_memory(
    url: str = "http://localhost:5000/v1"
):
    # Reset the Memory vector because exported brains don't understand episodes 
    response = requests.delete(url)
    if response.status_code == 204:
        print('Resetting Memory vector in exported brain...')
    else:
       print('Error: {}'.format(response.status_code)) 
