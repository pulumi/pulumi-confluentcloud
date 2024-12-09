# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = ['FlinkArtifactArgs', 'FlinkArtifact']

@pulumi.input_type
class FlinkArtifactArgs:
    def __init__(__self__, *,
                 class_: pulumi.Input[str],
                 cloud: pulumi.Input[str],
                 display_name: pulumi.Input[str],
                 environment: pulumi.Input['FlinkArtifactEnvironmentArgs'],
                 region: pulumi.Input[str],
                 artifact_file: Optional[pulumi.Input[str]] = None,
                 content_format: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 runtime_language: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FlinkArtifact resource.
        :param pulumi.Input[str] class_: Java class or alias for the Flink Artifact as provided by developer.
        :param pulumi.Input[str] cloud: The cloud service provider that runs the Flink Artifact.
        :param pulumi.Input[str] display_name: The display name of Flink Artifact.
        :param pulumi.Input['FlinkArtifactEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[str] region: The cloud service provider region that hosts the Flink Artifact.
        :param pulumi.Input[str] artifact_file: The artifact file for Flink Artifact.
        :param pulumi.Input[str] content_format: (Optional String) Archive format of the Flink Artifact.
        :param pulumi.Input[str] description: (Optional String) Description of the Flink Artifact.
        :param pulumi.Input[str] runtime_language: (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
        """
        pulumi.set(__self__, "class_", class_)
        pulumi.set(__self__, "cloud", cloud)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "region", region)
        if artifact_file is not None:
            pulumi.set(__self__, "artifact_file", artifact_file)
        if content_format is not None:
            pulumi.set(__self__, "content_format", content_format)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if runtime_language is not None:
            pulumi.set(__self__, "runtime_language", runtime_language)

    @property
    @pulumi.getter(name="class")
    def class_(self) -> pulumi.Input[str]:
        """
        Java class or alias for the Flink Artifact as provided by developer.
        """
        return pulumi.get(self, "class_")

    @class_.setter
    def class_(self, value: pulumi.Input[str]):
        pulumi.set(self, "class_", value)

    @property
    @pulumi.getter
    def cloud(self) -> pulumi.Input[str]:
        """
        The cloud service provider that runs the Flink Artifact.
        """
        return pulumi.get(self, "cloud")

    @cloud.setter
    def cloud(self, value: pulumi.Input[str]):
        pulumi.set(self, "cloud", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[str]:
        """
        The display name of Flink Artifact.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['FlinkArtifactEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['FlinkArtifactEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        The cloud service provider region that hosts the Flink Artifact.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="artifactFile")
    def artifact_file(self) -> Optional[pulumi.Input[str]]:
        """
        The artifact file for Flink Artifact.
        """
        return pulumi.get(self, "artifact_file")

    @artifact_file.setter
    def artifact_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "artifact_file", value)

    @property
    @pulumi.getter(name="contentFormat")
    def content_format(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional String) Archive format of the Flink Artifact.
        """
        return pulumi.get(self, "content_format")

    @content_format.setter
    def content_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_format", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional String) Description of the Flink Artifact.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="runtimeLanguage")
    def runtime_language(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
        """
        return pulumi.get(self, "runtime_language")

    @runtime_language.setter
    def runtime_language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runtime_language", value)


@pulumi.input_type
class _FlinkArtifactState:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[str]] = None,
                 artifact_file: Optional[pulumi.Input[str]] = None,
                 class_: Optional[pulumi.Input[str]] = None,
                 cloud: Optional[pulumi.Input[str]] = None,
                 content_format: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input['FlinkArtifactEnvironmentArgs']] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 runtime_language: Optional[pulumi.Input[str]] = None,
                 versions: Optional[pulumi.Input[Sequence[pulumi.Input['FlinkArtifactVersionArgs']]]] = None):
        """
        Input properties used for looking up and filtering FlinkArtifact resources.
        :param pulumi.Input[str] api_version: (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
        :param pulumi.Input[str] artifact_file: The artifact file for Flink Artifact.
        :param pulumi.Input[str] class_: Java class or alias for the Flink Artifact as provided by developer.
        :param pulumi.Input[str] cloud: The cloud service provider that runs the Flink Artifact.
        :param pulumi.Input[str] content_format: (Optional String) Archive format of the Flink Artifact.
        :param pulumi.Input[str] description: (Optional String) Description of the Flink Artifact.
        :param pulumi.Input[str] display_name: The display name of Flink Artifact.
        :param pulumi.Input['FlinkArtifactEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[str] kind: (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
        :param pulumi.Input[str] region: The cloud service provider region that hosts the Flink Artifact.
        :param pulumi.Input[str] runtime_language: (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
        :param pulumi.Input[Sequence[pulumi.Input['FlinkArtifactVersionArgs']]] versions: List of versions for this Flink Artifact.
        """
        if api_version is not None:
            pulumi.set(__self__, "api_version", api_version)
        if artifact_file is not None:
            pulumi.set(__self__, "artifact_file", artifact_file)
        if class_ is not None:
            pulumi.set(__self__, "class_", class_)
        if cloud is not None:
            pulumi.set(__self__, "cloud", cloud)
        if content_format is not None:
            pulumi.set(__self__, "content_format", content_format)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if runtime_language is not None:
            pulumi.set(__self__, "runtime_language", runtime_language)
        if versions is not None:
            pulumi.set(__self__, "versions", versions)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
        """
        return pulumi.get(self, "api_version")

    @api_version.setter
    def api_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_version", value)

    @property
    @pulumi.getter(name="artifactFile")
    def artifact_file(self) -> Optional[pulumi.Input[str]]:
        """
        The artifact file for Flink Artifact.
        """
        return pulumi.get(self, "artifact_file")

    @artifact_file.setter
    def artifact_file(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "artifact_file", value)

    @property
    @pulumi.getter(name="class")
    def class_(self) -> Optional[pulumi.Input[str]]:
        """
        Java class or alias for the Flink Artifact as provided by developer.
        """
        return pulumi.get(self, "class_")

    @class_.setter
    def class_(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "class_", value)

    @property
    @pulumi.getter
    def cloud(self) -> Optional[pulumi.Input[str]]:
        """
        The cloud service provider that runs the Flink Artifact.
        """
        return pulumi.get(self, "cloud")

    @cloud.setter
    def cloud(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cloud", value)

    @property
    @pulumi.getter(name="contentFormat")
    def content_format(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional String) Archive format of the Flink Artifact.
        """
        return pulumi.get(self, "content_format")

    @content_format.setter
    def content_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content_format", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional String) Description of the Flink Artifact.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The display name of Flink Artifact.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['FlinkArtifactEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['FlinkArtifactEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The cloud service provider region that hosts the Flink Artifact.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="runtimeLanguage")
    def runtime_language(self) -> Optional[pulumi.Input[str]]:
        """
        (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
        """
        return pulumi.get(self, "runtime_language")

    @runtime_language.setter
    def runtime_language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runtime_language", value)

    @property
    @pulumi.getter
    def versions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FlinkArtifactVersionArgs']]]]:
        """
        List of versions for this Flink Artifact.
        """
        return pulumi.get(self, "versions")

    @versions.setter
    def versions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FlinkArtifactVersionArgs']]]]):
        pulumi.set(self, "versions", value)


class FlinkArtifact(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 artifact_file: Optional[pulumi.Input[str]] = None,
                 class_: Optional[pulumi.Input[str]] = None,
                 cloud: Optional[pulumi.Input[str]] = None,
                 content_format: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[Union['FlinkArtifactEnvironmentArgs', 'FlinkArtifactEnvironmentArgsDict']]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 runtime_language: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        main = confluentcloud.FlinkArtifact("main",
            class_="io.confluent.example.SumScalarFunction",
            region="us-west-2",
            cloud="AWS",
            display_name="flink_sumscalar_artifact",
            content_format="JAR",
            environment={
                "id": development.id,
            })
        ```

        ## Import

        You can import a Flink Artifact by using cloud, region, Flink Artifact ID and artifact file, in the format `<Environment ID>/<region>/<cloud>/<Flink Artifact ID>`. The following example shows how to import a Flink Artifact:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/flinkArtifact:FlinkArtifact main env-abc123/us-east-1/aws/fa-123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] artifact_file: The artifact file for Flink Artifact.
        :param pulumi.Input[str] class_: Java class or alias for the Flink Artifact as provided by developer.
        :param pulumi.Input[str] cloud: The cloud service provider that runs the Flink Artifact.
        :param pulumi.Input[str] content_format: (Optional String) Archive format of the Flink Artifact.
        :param pulumi.Input[str] description: (Optional String) Description of the Flink Artifact.
        :param pulumi.Input[str] display_name: The display name of Flink Artifact.
        :param pulumi.Input[Union['FlinkArtifactEnvironmentArgs', 'FlinkArtifactEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[str] region: The cloud service provider region that hosts the Flink Artifact.
        :param pulumi.Input[str] runtime_language: (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FlinkArtifactArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development", display_name="Development")
        main = confluentcloud.FlinkArtifact("main",
            class_="io.confluent.example.SumScalarFunction",
            region="us-west-2",
            cloud="AWS",
            display_name="flink_sumscalar_artifact",
            content_format="JAR",
            environment={
                "id": development.id,
            })
        ```

        ## Import

        You can import a Flink Artifact by using cloud, region, Flink Artifact ID and artifact file, in the format `<Environment ID>/<region>/<cloud>/<Flink Artifact ID>`. The following example shows how to import a Flink Artifact:

        $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"

        $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/flinkArtifact:FlinkArtifact main env-abc123/us-east-1/aws/fa-123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param FlinkArtifactArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FlinkArtifactArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 artifact_file: Optional[pulumi.Input[str]] = None,
                 class_: Optional[pulumi.Input[str]] = None,
                 cloud: Optional[pulumi.Input[str]] = None,
                 content_format: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[Union['FlinkArtifactEnvironmentArgs', 'FlinkArtifactEnvironmentArgsDict']]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 runtime_language: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FlinkArtifactArgs.__new__(FlinkArtifactArgs)

            __props__.__dict__["artifact_file"] = artifact_file
            if class_ is None and not opts.urn:
                raise TypeError("Missing required property 'class_'")
            __props__.__dict__["class_"] = class_
            if cloud is None and not opts.urn:
                raise TypeError("Missing required property 'cloud'")
            __props__.__dict__["cloud"] = cloud
            __props__.__dict__["content_format"] = content_format
            __props__.__dict__["description"] = description
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["runtime_language"] = runtime_language
            __props__.__dict__["api_version"] = None
            __props__.__dict__["kind"] = None
            __props__.__dict__["versions"] = None
        super(FlinkArtifact, __self__).__init__(
            'confluentcloud:index/flinkArtifact:FlinkArtifact',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_version: Optional[pulumi.Input[str]] = None,
            artifact_file: Optional[pulumi.Input[str]] = None,
            class_: Optional[pulumi.Input[str]] = None,
            cloud: Optional[pulumi.Input[str]] = None,
            content_format: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[Union['FlinkArtifactEnvironmentArgs', 'FlinkArtifactEnvironmentArgsDict']]] = None,
            kind: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            runtime_language: Optional[pulumi.Input[str]] = None,
            versions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['FlinkArtifactVersionArgs', 'FlinkArtifactVersionArgsDict']]]]] = None) -> 'FlinkArtifact':
        """
        Get an existing FlinkArtifact resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_version: (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
        :param pulumi.Input[str] artifact_file: The artifact file for Flink Artifact.
        :param pulumi.Input[str] class_: Java class or alias for the Flink Artifact as provided by developer.
        :param pulumi.Input[str] cloud: The cloud service provider that runs the Flink Artifact.
        :param pulumi.Input[str] content_format: (Optional String) Archive format of the Flink Artifact.
        :param pulumi.Input[str] description: (Optional String) Description of the Flink Artifact.
        :param pulumi.Input[str] display_name: The display name of Flink Artifact.
        :param pulumi.Input[Union['FlinkArtifactEnvironmentArgs', 'FlinkArtifactEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[str] kind: (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
        :param pulumi.Input[str] region: The cloud service provider region that hosts the Flink Artifact.
        :param pulumi.Input[str] runtime_language: (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
        :param pulumi.Input[Sequence[pulumi.Input[Union['FlinkArtifactVersionArgs', 'FlinkArtifactVersionArgsDict']]]] versions: List of versions for this Flink Artifact.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FlinkArtifactState.__new__(_FlinkArtifactState)

        __props__.__dict__["api_version"] = api_version
        __props__.__dict__["artifact_file"] = artifact_file
        __props__.__dict__["class_"] = class_
        __props__.__dict__["cloud"] = cloud
        __props__.__dict__["content_format"] = content_format
        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["kind"] = kind
        __props__.__dict__["region"] = region
        __props__.__dict__["runtime_language"] = runtime_language
        __props__.__dict__["versions"] = versions
        return FlinkArtifact(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> pulumi.Output[str]:
        """
        (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter(name="artifactFile")
    def artifact_file(self) -> pulumi.Output[Optional[str]]:
        """
        The artifact file for Flink Artifact.
        """
        return pulumi.get(self, "artifact_file")

    @property
    @pulumi.getter(name="class")
    def class_(self) -> pulumi.Output[str]:
        """
        Java class or alias for the Flink Artifact as provided by developer.
        """
        return pulumi.get(self, "class_")

    @property
    @pulumi.getter
    def cloud(self) -> pulumi.Output[str]:
        """
        The cloud service provider that runs the Flink Artifact.
        """
        return pulumi.get(self, "cloud")

    @property
    @pulumi.getter(name="contentFormat")
    def content_format(self) -> pulumi.Output[str]:
        """
        (Optional String) Archive format of the Flink Artifact.
        """
        return pulumi.get(self, "content_format")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        (Optional String) Description of the Flink Artifact.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The display name of Flink Artifact.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.FlinkArtifactEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[str]:
        """
        (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The cloud service provider region that hosts the Flink Artifact.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="runtimeLanguage")
    def runtime_language(self) -> pulumi.Output[Optional[str]]:
        """
        (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
        """
        return pulumi.get(self, "runtime_language")

    @property
    @pulumi.getter
    def versions(self) -> pulumi.Output[Sequence['outputs.FlinkArtifactVersion']]:
        """
        List of versions for this Flink Artifact.
        """
        return pulumi.get(self, "versions")
