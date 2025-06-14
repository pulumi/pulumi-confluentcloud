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
    'GetFlinkArtifactResult',
    'AwaitableGetFlinkArtifactResult',
    'get_flink_artifact',
    'get_flink_artifact_output',
]

@pulumi.output_type
class GetFlinkArtifactResult:
    """
    A collection of values returned by getFlinkArtifact.
    """
    def __init__(__self__, api_version=None, class_=None, cloud=None, content_format=None, description=None, display_name=None, documentation_link=None, environment=None, id=None, kind=None, region=None, runtime_language=None, versions=None):
        if api_version and not isinstance(api_version, str):
            raise TypeError("Expected argument 'api_version' to be a str")
        pulumi.set(__self__, "api_version", api_version)
        if class_ and not isinstance(class_, str):
            raise TypeError("Expected argument 'class_' to be a str")
        pulumi.set(__self__, "class_", class_)
        if cloud and not isinstance(cloud, str):
            raise TypeError("Expected argument 'cloud' to be a str")
        pulumi.set(__self__, "cloud", cloud)
        if content_format and not isinstance(content_format, str):
            raise TypeError("Expected argument 'content_format' to be a str")
        pulumi.set(__self__, "content_format", content_format)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if documentation_link and not isinstance(documentation_link, str):
            raise TypeError("Expected argument 'documentation_link' to be a str")
        pulumi.set(__self__, "documentation_link", documentation_link)
        if environment and not isinstance(environment, dict):
            raise TypeError("Expected argument 'environment' to be a dict")
        pulumi.set(__self__, "environment", environment)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kind and not isinstance(kind, str):
            raise TypeError("Expected argument 'kind' to be a str")
        pulumi.set(__self__, "kind", kind)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if runtime_language and not isinstance(runtime_language, str):
            raise TypeError("Expected argument 'runtime_language' to be a str")
        pulumi.set(__self__, "runtime_language", runtime_language)
        if versions and not isinstance(versions, list):
            raise TypeError("Expected argument 'versions' to be a list")
        pulumi.set(__self__, "versions", versions)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> builtins.str:
        """
        (Required String) The API Version of the schema version of the Flink Artifact, for example, `fa/v2`.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter(name="class")
    @_utilities.deprecated("""The \"class\" attribute has been deprecated and will be removed in the next major version of the provider (3.0.0). Refer to the Upgrade Guide at https://registry.terraform.io/providers/confluentinc/confluent/latest/docs/guides/version-3-upgrade for more details. The guide will be published once version 3.0.0 is released.""")
    def class_(self) -> builtins.str:
        """
        (Required String) Java class or alias for the Flink Artifact as provided by developer.
        """
        return pulumi.get(self, "class_")

    @property
    @pulumi.getter
    def cloud(self) -> builtins.str:
        return pulumi.get(self, "cloud")

    @property
    @pulumi.getter(name="contentFormat")
    def content_format(self) -> builtins.str:
        """
        (Required String) Archive format of the Flink Artifact.
        """
        return pulumi.get(self, "content_format")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        (Required String) Description of the Flink Artifact.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> builtins.str:
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="documentationLink")
    def documentation_link(self) -> builtins.str:
        return pulumi.get(self, "documentation_link")

    @property
    @pulumi.getter
    def environment(self) -> 'outputs.GetFlinkArtifactEnvironmentResult':
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def kind(self) -> builtins.str:
        """
        (Required String) The kind of the Flink Artifact, for example, `FlinkArtifact`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def region(self) -> builtins.str:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="runtimeLanguage")
    def runtime_language(self) -> builtins.str:
        """
        (Required String) Runtime language of the Flink Artifact. The default runtime language is JAVA.
        """
        return pulumi.get(self, "runtime_language")

    @property
    @pulumi.getter
    def versions(self) -> Sequence['outputs.GetFlinkArtifactVersionResult']:
        return pulumi.get(self, "versions")


class AwaitableGetFlinkArtifactResult(GetFlinkArtifactResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFlinkArtifactResult(
            api_version=self.api_version,
            class_=self.class_,
            cloud=self.cloud,
            content_format=self.content_format,
            description=self.description,
            display_name=self.display_name,
            documentation_link=self.documentation_link,
            environment=self.environment,
            id=self.id,
            kind=self.kind,
            region=self.region,
            runtime_language=self.runtime_language,
            versions=self.versions)


def get_flink_artifact(class_: Optional[builtins.str] = None,
                       cloud: Optional[builtins.str] = None,
                       display_name: Optional[builtins.str] = None,
                       environment: Optional[Union['GetFlinkArtifactEnvironmentArgs', 'GetFlinkArtifactEnvironmentArgsDict']] = None,
                       id: Optional[builtins.str] = None,
                       region: Optional[builtins.str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFlinkArtifactResult:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `FlinkArtifact` describes a Flink Artifact data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_flink_artifact(id="lfa-abc123",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_flink_artifact(display_name="my_artifact",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param builtins.str class_: (Required String) Java class or alias for the Flink Artifact as provided by developer.
    :param builtins.str cloud: The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
    :param builtins.str display_name: A human-readable name for the Flink Artifact.
    :param builtins.str id: The ID of the Flink Artifact, for example, `lfa-abc123`.
    :param builtins.str region: The cloud service provider region, for example, `us-east-1`.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    """
    __args__ = dict()
    __args__['class'] = class_
    __args__['cloud'] = cloud
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('confluentcloud:index/getFlinkArtifact:getFlinkArtifact', __args__, opts=opts, typ=GetFlinkArtifactResult).value

    return AwaitableGetFlinkArtifactResult(
        api_version=pulumi.get(__ret__, 'api_version'),
        class_=pulumi.get(__ret__, 'class_'),
        cloud=pulumi.get(__ret__, 'cloud'),
        content_format=pulumi.get(__ret__, 'content_format'),
        description=pulumi.get(__ret__, 'description'),
        display_name=pulumi.get(__ret__, 'display_name'),
        documentation_link=pulumi.get(__ret__, 'documentation_link'),
        environment=pulumi.get(__ret__, 'environment'),
        id=pulumi.get(__ret__, 'id'),
        kind=pulumi.get(__ret__, 'kind'),
        region=pulumi.get(__ret__, 'region'),
        runtime_language=pulumi.get(__ret__, 'runtime_language'),
        versions=pulumi.get(__ret__, 'versions'))
def get_flink_artifact_output(class_: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                              cloud: Optional[pulumi.Input[builtins.str]] = None,
                              display_name: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                              environment: Optional[pulumi.Input[Union['GetFlinkArtifactEnvironmentArgs', 'GetFlinkArtifactEnvironmentArgsDict']]] = None,
                              id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                              region: Optional[pulumi.Input[builtins.str]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetFlinkArtifactResult]:
    """
    [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)

    `FlinkArtifact` describes a Flink Artifact data source.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_confluentcloud as confluentcloud

    example_using_id = confluentcloud.get_flink_artifact(id="lfa-abc123",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingId", example_using_id)
    example_using_name = confluentcloud.get_flink_artifact(display_name="my_artifact",
        environment={
            "id": "env-xyz456",
        })
    pulumi.export("exampleUsingName", example_using_name)
    ```


    :param builtins.str class_: (Required String) Java class or alias for the Flink Artifact as provided by developer.
    :param builtins.str cloud: The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
    :param builtins.str display_name: A human-readable name for the Flink Artifact.
    :param builtins.str id: The ID of the Flink Artifact, for example, `lfa-abc123`.
    :param builtins.str region: The cloud service provider region, for example, `us-east-1`.
           
           > **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
    """
    __args__ = dict()
    __args__['class'] = class_
    __args__['cloud'] = cloud
    __args__['displayName'] = display_name
    __args__['environment'] = environment
    __args__['id'] = id
    __args__['region'] = region
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('confluentcloud:index/getFlinkArtifact:getFlinkArtifact', __args__, opts=opts, typ=GetFlinkArtifactResult)
    return __ret__.apply(lambda __response__: GetFlinkArtifactResult(
        api_version=pulumi.get(__response__, 'api_version'),
        class_=pulumi.get(__response__, 'class_'),
        cloud=pulumi.get(__response__, 'cloud'),
        content_format=pulumi.get(__response__, 'content_format'),
        description=pulumi.get(__response__, 'description'),
        display_name=pulumi.get(__response__, 'display_name'),
        documentation_link=pulumi.get(__response__, 'documentation_link'),
        environment=pulumi.get(__response__, 'environment'),
        id=pulumi.get(__response__, 'id'),
        kind=pulumi.get(__response__, 'kind'),
        region=pulumi.get(__response__, 'region'),
        runtime_language=pulumi.get(__response__, 'runtime_language'),
        versions=pulumi.get(__response__, 'versions')))
