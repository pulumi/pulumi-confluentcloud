"""A Python Pulumi program"""

import pulumi
import pulumi_random as random
import pulumi_confluentcloud as confluent

pet_name = random.RandomPet("py-environment")

environment = confluent.Environment("py-environment", display_name=pet_name.id)
