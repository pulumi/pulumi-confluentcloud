# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetSchemaRegistryClusterModeResult',
    'AwaitableGetSchemaRegistryClusterModeResult',
    'get_schema_registry_cluster_mode',
    'get_schema_registry_cluster_mode_output',
]

@pulumi.output_type
class GetSchemaRegistryClusterModeResult:
    """
    A collection of values returned by getSchemaRegistryClusterMode.
    """
    def __init__(__self__, credentials=None, id=None, mode=None, rest_endpoint=None, schema_registry_cluster=None):
        if credentials and not isinstance(credentials, dict):
            raise TypeError("Expected argument 'credentials' to be a dict")
        pulumi.set(__self__, "credentials", credentials)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if mode and not isinstance(mode, str):
            raise TypeError("Expected argument 'mode' to be a str")
        pulumi.set(__self__, "mode", mode)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster and not isinstance(schema_registry_cluster, dict):
            raise TypeError("Expected argument 'schema_registry_cluster' to be a dict")
        pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)

    @property
    @pulumi.getter
    def credentials(self) -> Optional['outputs.GetSchemaRegistryClusterModeCredentialsResult']:
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def mode(self) -> str:
        """
        (Optional String) The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[str]:
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional['outputs.GetSchemaRegistryClusterModeSchemaRegistryClusterResult']:
        return pulumi.get(self, "schema_registry_cluster")


class AwaitableGetSchemaRegistryClusterModeResult(GetSchemaRegistryClusterModeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSchemaRegistryClusterModeResult(
            credentials=self.credentials,
            id=self.id,
            mode=self.mode,
            rest_endpoint=self.rest_endpoint,
            schema_registry_cluster=self.schema_registry_cluster)


def get_schema_registry_cluster_mode(credentials: Optional[pulumi.InputType['GetSchemaRegistryClusterModeCredentialsArgs']] = None,
                                     rest_endpoint: Optional[str] = None,
                                     schema_registry_cluster: Optional[pulumi.InputType['GetSchemaRegistryClusterModeSchemaRegistryClusterArgs']] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSchemaRegistryClusterModeResult:
    """
    Use this data source to access information about an existing resource.

    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    """
    __args__ = dict()
    __args__['credentials'] = credentials
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getSchemaRegistryClusterMode:getSchemaRegistryClusterMode', __args__, opts=opts, typ=GetSchemaRegistryClusterModeResult).value

    return AwaitableGetSchemaRegistryClusterModeResult(
        credentials=pulumi.get(__ret__, 'credentials'),
        id=pulumi.get(__ret__, 'id'),
        mode=pulumi.get(__ret__, 'mode'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__ret__, 'schema_registry_cluster'))


@_utilities.lift_output_func(get_schema_registry_cluster_mode)
def get_schema_registry_cluster_mode_output(credentials: Optional[pulumi.Input[Optional[pulumi.InputType['GetSchemaRegistryClusterModeCredentialsArgs']]]] = None,
                                            rest_endpoint: Optional[pulumi.Input[Optional[str]]] = None,
                                            schema_registry_cluster: Optional[pulumi.Input[Optional[pulumi.InputType['GetSchemaRegistryClusterModeSchemaRegistryClusterArgs']]]] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSchemaRegistryClusterModeResult]:
    """
    Use this data source to access information about an existing resource.

    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    """
    ...
