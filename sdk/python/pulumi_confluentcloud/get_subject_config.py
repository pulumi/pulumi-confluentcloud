# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetSubjectConfigResult',
    'AwaitableGetSubjectConfigResult',
    'get_subject_config',
    'get_subject_config_output',
]

@pulumi.output_type
class GetSubjectConfigResult:
    """
    A collection of values returned by getSubjectConfig.
    """
    def __init__(__self__, compatibility_level=None, credentials=None, id=None, rest_endpoint=None, schema_registry_cluster=None, subject_name=None):
        if compatibility_level and not isinstance(compatibility_level, str):
            raise TypeError("Expected argument 'compatibility_level' to be a str")
        pulumi.set(__self__, "compatibility_level", compatibility_level)
        if credentials and not isinstance(credentials, dict):
            raise TypeError("Expected argument 'credentials' to be a dict")
        pulumi.set(__self__, "credentials", credentials)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if rest_endpoint and not isinstance(rest_endpoint, str):
            raise TypeError("Expected argument 'rest_endpoint' to be a str")
        pulumi.set(__self__, "rest_endpoint", rest_endpoint)
        if schema_registry_cluster and not isinstance(schema_registry_cluster, dict):
            raise TypeError("Expected argument 'schema_registry_cluster' to be a dict")
        pulumi.set(__self__, "schema_registry_cluster", schema_registry_cluster)
        if subject_name and not isinstance(subject_name, str):
            raise TypeError("Expected argument 'subject_name' to be a str")
        pulumi.set(__self__, "subject_name", subject_name)

    @property
    @pulumi.getter(name="compatibilityLevel")
    def compatibility_level(self) -> str:
        """
        (Required String) The Compatibility Level of the specified subject. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
        """
        return pulumi.get(self, "compatibility_level")

    @property
    @pulumi.getter
    def credentials(self) -> Optional['outputs.GetSubjectConfigCredentialsResult']:
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[str]:
        return pulumi.get(self, "rest_endpoint")

    @property
    @pulumi.getter(name="schemaRegistryCluster")
    def schema_registry_cluster(self) -> Optional['outputs.GetSubjectConfigSchemaRegistryClusterResult']:
        return pulumi.get(self, "schema_registry_cluster")

    @property
    @pulumi.getter(name="subjectName")
    def subject_name(self) -> str:
        return pulumi.get(self, "subject_name")


class AwaitableGetSubjectConfigResult(GetSubjectConfigResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSubjectConfigResult(
            compatibility_level=self.compatibility_level,
            credentials=self.credentials,
            id=self.id,
            rest_endpoint=self.rest_endpoint,
            schema_registry_cluster=self.schema_registry_cluster,
            subject_name=self.subject_name)


def get_subject_config(credentials: Optional[pulumi.InputType['GetSubjectConfigCredentialsArgs']] = None,
                       rest_endpoint: Optional[str] = None,
                       schema_registry_cluster: Optional[pulumi.InputType['GetSubjectConfigSchemaRegistryClusterArgs']] = None,
                       subject_name: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSubjectConfigResult:
    """
    Use this data source to access information about an existing resource.

    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    :param str subject_name: The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
    """
    __args__ = dict()
    __args__['credentials'] = credentials
    __args__['restEndpoint'] = rest_endpoint
    __args__['schemaRegistryCluster'] = schema_registry_cluster
    __args__['subjectName'] = subject_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getSubjectConfig:getSubjectConfig', __args__, opts=opts, typ=GetSubjectConfigResult).value

    return AwaitableGetSubjectConfigResult(
        compatibility_level=pulumi.get(__ret__, 'compatibility_level'),
        credentials=pulumi.get(__ret__, 'credentials'),
        id=pulumi.get(__ret__, 'id'),
        rest_endpoint=pulumi.get(__ret__, 'rest_endpoint'),
        schema_registry_cluster=pulumi.get(__ret__, 'schema_registry_cluster'),
        subject_name=pulumi.get(__ret__, 'subject_name'))


@_utilities.lift_output_func(get_subject_config)
def get_subject_config_output(credentials: Optional[pulumi.Input[Optional[pulumi.InputType['GetSubjectConfigCredentialsArgs']]]] = None,
                              rest_endpoint: Optional[pulumi.Input[Optional[str]]] = None,
                              schema_registry_cluster: Optional[pulumi.Input[Optional[pulumi.InputType['GetSubjectConfigSchemaRegistryClusterArgs']]]] = None,
                              subject_name: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSubjectConfigResult]:
    """
    Use this data source to access information about an existing resource.

    :param str rest_endpoint: The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
    :param str subject_name: The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
    """
    ...
