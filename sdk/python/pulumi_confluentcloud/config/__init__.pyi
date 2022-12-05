# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

cloudApiKey: Optional[str]
"""
The Confluent Cloud API Key.
"""

cloudApiSecret: Optional[str]
"""
The Confluent Cloud API Secret.
"""

endpoint: Optional[str]
"""
The base endpoint of Confluent Cloud API.
"""

kafkaApiKey: Optional[str]
"""
The Kafka Cluster API Key.
"""

kafkaApiSecret: Optional[str]
"""
The Kafka Cluster API Secret.
"""

kafkaRestEndpoint: Optional[str]
"""
The Kafka Cluster REST Endpoint.
"""

maxRetries: Optional[int]
"""
Maximum number of retries of HTTP client. Defaults to 4.
"""

