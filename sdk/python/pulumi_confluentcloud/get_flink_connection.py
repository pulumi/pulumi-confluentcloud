# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetFlinkConnectionResult',
    'AwaitableGetFlinkConnectionResult',
    'get_flink_connection',
    'get_flink_connection_output',
]

@pulumi.output_type
class GetFlinkConnectionResult:
    """
    A collection of values returned by getFlinkConnection.
    """
    def __init__(__self__, compute_pool=None, credentials=None, data=None, display_name=None, endpoint=None, environment=None, id=None, organization=None, principal=None, rest_endpoint=None, status=None, status_detail=None, type=None):
        if compute_pool and not isinstance(compute_pool, dict):
            raise TypeError("Expected argument 'compute_pool' to be a dict")
        pulumi.set(__self__, "compute_pool", compute_pool)
        if credentials and not isinstance(credentials, dict):
            raise TypeError("Expected argument 'credentials' to be a dict")
        pulumi.set(__self__, "credentials", credentials)
        if data and not isinstance(data, str):
            raise TypeError("Expected argument 'data' to be a str")
        pulumi.set(__self__, "data", data)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if endpoint and not isinstance(endpoint, str):
            raise TypeError("Expected argument 'endpoint' to be a str")
        pulumi.set(__self__, "endpoint", endpoint)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if organization and not isinstance(organization, dict):
            raise TypeError("Expected argument 'organization' to be a dict")
        pulumi.set(__self__, "organization", organization)
        if principal and not isinstance(principal, dict):
            raise TypeError("Expected argument 'principal' to be a dict")
        pulumi.set(__self__, "principal", principal)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if status_detail and not isinstance(status_detail, str):
            raise TypeError("Expected argument 'status_detail' to be a str")
        pulumi.set(__self__, "status_detail", status_detail)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="computePool")
    def compute_pool(self) -> 'outputs.GetFlinkConnectionComputePoolResult':
        return pulumi.get(self, "compute_pool")

    @property
    @pulumi.getter
    def credentials(self) -> Optional['outputs.GetFlinkConnectionCredentialsResult']:
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def data(self) -> builtins.str:
        """
        (Required String) The authentication data of the Flink Connection.
        """
        return pulumi.get(self, "data")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> builtins.str:
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def endpoint(self) -> builtins.str:
        """
        (Required String) The endpoint of the Flink Connection, for example, `https://api.openai.com/v1/chat/completions`
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetFlinkConnectionEnvironmentResult':
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def organization(self) -> 'outputs.GetFlinkConnectionOrganizationResult':
        return pulumi.get(self, "organization")

    @property
    @pulumi.getter
    def principal(self) -> 'outputs.GetFlinkConnectionPrincipalResult':
        return pulumi.get(self, "principal")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[builtins.str]:
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter
    def status(self) -> builtins.str:
        """
        (Required String) The status of the Flink Connection.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusDetail")
    def status_detail(self) -> builtins.str:
        """
        (Required String) The status details of the Flink Connection.
        -
        """
        return pulumi.get(self, "status_detail")

    @property
    @pulumi.getter
    def type(self) -> Optional[builtins.str]:
        return pulumi.get(self, "type")


class AwaitableGetFlinkConnectionResult(GetFlinkConnectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFlinkConnectionResult(
            compute_pool=self.compute_pool,
            credentials=self.credentials,
            data=self.data,
            display_name=self.display_name,
            endpoint=self.endpoint,
            environment=self.environment,
            id=self.id,
            organization=self.organization,
            principal=self.principal,
            rest_endpoint=self.rest_endpoint,
            status=self.status,
            status_detail=self.status_detail,
            type=self.type)


def get_flink_connection(compute_pool: Optional[Union['GetFlinkConnectionComputePoolArgs', 'GetFlinkConnectionComputePoolArgsDict']] = None,
                         credentials: Optional[Union['GetFlinkConnectionCredentialsArgs', 'GetFlinkConnectionCredentialsArgsDict']] = None,
                         display_name: Optional[builtins.str] = None,
                         environment: Optional[Union['GetFlinkConnectionEnvironmentArgs', 'GetFlinkConnectionEnvironmentArgsDict']] = None,
                         organization: Optional[Union['GetFlinkConnectionOrganizationArgs', 'GetFlinkConnectionOrganizationArgsDict']] = None,
                         principal: Optional[Union['GetFlinkConnectionPrincipalArgs', 'GetFlinkConnectionPrincipalArgsDict']] = None,
                         rest_endpoint: Optional[builtins.str] = None,
                         type: Optional[builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFlinkConnectionResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `FlinkConnection` describes a Flink Connection data source.

    ## Example Usage


    :param builtins.str display_name: The name of the Flink Connection.
    :param builtins.str rest_endpoint: The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
    :param builtins.str type: The type of the Flink Connection. The accepted values are: `OPENAI`, `AZUREML`, `AZUREOPENAI`, `BEDROCK`, `SAGEMAKER`, `GOOGLEAI`, `VERTEXAI`, `MONGODB`, `PINECONE`, `ELASTIC` and `COUCHBASE`.
    """
    __args__ = dict()
    __args__['computePool'] = compute_pool
    __args__['credentials'] = credentials
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['organization'] = organization
    __args__['principal'] = principal
    __args__['restEndpoint'] = rest_endpoint
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getFlinkConnection:getFlinkConnection', __args__, opts=opts, typ=GetFlinkConnectionResult).value

    return AwaitableGetFlinkConnectionResult(
        compute_pool=pulumi.get(__ret__, 'compute_pool'),
        credentials=pulumi.get(__ret__, 'credentials'),
        data=pulumi.get(__ret__, 'data'),
        display_name=pulumi.get(__ret__, 'display_name'),
        endpoint=pulumi.get(__ret__, 'endpoint'),
        environment=pulumi.get(__ret__, 'environment'),
        id=pulumi.get(__ret__, 'id'),
        organization=pulumi.get(__ret__, 'organization'),
        principal=pulumi.get(__ret__, 'principal'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        status=pulumi.get(__ret__, 'status'),
        status_detail=pulumi.get(__ret__, 'status_detail'),
        type=pulumi.get(__ret__, 'type'))
def get_flink_connection_output(compute_pool: Optional[pulumi.Input[Optional[Union['GetFlinkConnectionComputePoolArgs', 'GetFlinkConnectionComputePoolArgsDict']]]] = None,
                                credentials: Optional[pulumi.Input[Optional[Union['GetFlinkConnectionCredentialsArgs', 'GetFlinkConnectionCredentialsArgsDict']]]] = None,
                                display_name: Optional[pulumi.Input[builtins.str]] = None,
                                environment: Optional[pulumi.Input[Optional[Union['GetFlinkConnectionEnvironmentArgs', 'GetFlinkConnectionEnvironmentArgsDict']]]] = None,
                                organization: Optional[pulumi.Input[Optional[Union['GetFlinkConnectionOrganizationArgs', 'GetFlinkConnectionOrganizationArgsDict']]]] = None,
                                principal: Optional[pulumi.Input[Optional[Union['GetFlinkConnectionPrincipalArgs', 'GetFlinkConnectionPrincipalArgsDict']]]] = None,
                                rest_endpoint: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                type: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetFlinkConnectionResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `FlinkConnection` describes a Flink Connection data source.

    ## Example Usage


    :param builtins.str display_name: The name of the Flink Connection.
    :param builtins.str rest_endpoint: The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
    :param builtins.str type: The type of the Flink Connection. The accepted values are: `OPENAI`, `AZUREML`, `AZUREOPENAI`, `BEDROCK`, `SAGEMAKER`, `GOOGLEAI`, `VERTEXAI`, `MONGODB`, `PINECONE`, `ELASTIC` and `COUCHBASE`.
    """
    __args__ = dict()
    __args__['computePool'] = compute_pool
    __args__['credentials'] = credentials
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['organization'] = organization
    __args__['principal'] = principal
    __args__['restEndpoint'] = rest_endpoint
    __args__['type'] = type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getFlinkConnection:getFlinkConnection', __args__, opts=opts, typ=GetFlinkConnectionResult)
    return __ret__.apply(lambda __response__: GetFlinkConnectionResult(
        compute_pool=pulumi.get(__response__, 'compute_pool'),
        credentials=pulumi.get(__response__, 'credentials'),
        data=pulumi.get(__response__, 'data'),
        display_name=pulumi.get(__response__, 'display_name'),
        endpoint=pulumi.get(__response__, 'endpoint'),
        environment=pulumi.get(__response__, 'environment'),
        id=pulumi.get(__response__, 'id'),
        organization=pulumi.get(__response__, 'organization'),
        principal=pulumi.get(__response__, 'principal'),
        rest_endpoint=pulumi.get(__response__, 'rest_endpoint'),
        status=pulumi.get(__response__, 'status'),
        status_detail=pulumi.get(__response__, 'status_detail'),
        type=pulumi.get(__response__, 'type')))
