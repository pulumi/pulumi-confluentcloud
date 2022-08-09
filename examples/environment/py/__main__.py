"""A Python Pulumi program"""

import pulumi
import pulumi_confluentcloud as confluent

environment = confluent.Environment("py-environment")
