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

__all__ = ['SchemaRegistryClusterArgs', 'SchemaRegistryCluster']

@pulumi.input_type
class SchemaRegistryClusterArgs:
    def __init__(__self__, *,
                 environment: pulumi.Input['SchemaRegistryClusterEnvironmentArgs'],
                 package: pulumi.Input[str],
                 region: pulumi.Input['SchemaRegistryClusterRegionArgs']):
        """
        The set of arguments for constructing a SchemaRegistryCluster resource.
        :param pulumi.Input['SchemaRegistryClusterEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[str] package: The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        """
        SchemaRegistryClusterArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            environment=environment,
            package=package,
            region=region,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             environment: pulumi.Input['SchemaRegistryClusterEnvironmentArgs'],
             package: pulumi.Input[str],
             region: pulumi.Input['SchemaRegistryClusterRegionArgs'],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("environment", environment)
        _setter("package", package)
        _setter("region", region)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['SchemaRegistryClusterEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['SchemaRegistryClusterEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def package(self) -> pulumi.Input[str]:
        """
        The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        """
        return pulumi.get(self, "package")

    @package.setter
    def package(self, value: pulumi.Input[str]):
        pulumi.set(self, "package", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input['SchemaRegistryClusterRegionArgs']:
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input['SchemaRegistryClusterRegionArgs']):
        pulumi.set(self, "region", value)


@pulumi.input_type
class _SchemaRegistryClusterState:
    def __init__(__self__, *,
                 api_version: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input['SchemaRegistryClusterEnvironmentArgs']] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 package: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input['SchemaRegistryClusterRegionArgs']] = None,
                 resource_name: Optional[pulumi.Input[str]] = None,
                 rest_endpoint: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SchemaRegistryCluster resources.
        :param pulumi.Input[str] api_version: (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `srcm/v2`.
        :param pulumi.Input[str] display_name: (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
        :param pulumi.Input['SchemaRegistryClusterEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[str] kind: (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
        :param pulumi.Input[str] package: The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        :param pulumi.Input[str] resource_name: (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
        :param pulumi.Input[str] rest_endpoint: (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
        """
        _SchemaRegistryClusterState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            api_version=api_version,
            display_name=display_name,
            environment=environment,
            kind=kind,
            package=package,
            region=region,
            resource_name=resource_name,
            rest_endpoint=rest_endpoint,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             api_version: Optional[pulumi.Input[str]] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             environment: Optional[pulumi.Input['SchemaRegistryClusterEnvironmentArgs']] = None,
             kind: Optional[pulumi.Input[str]] = None,
             package: Optional[pulumi.Input[str]] = None,
             region: Optional[pulumi.Input['SchemaRegistryClusterRegionArgs']] = None,
             resource_name: Optional[pulumi.Input[str]] = None,
             rest_endpoint: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if api_version is not None:
            _setter("api_version", api_version)
        if display_name is not None:
            _setter("display_name", display_name)
        if environment is not None:
            _setter("environment", environment)
        if kind is not None:
            _setter("kind", kind)
        if package is not None:
            _setter("package", package)
        if region is not None:
            _setter("region", region)
        if resource_name is not None:
            _setter("resource_name", resource_name)
        if rest_endpoint is not None:
            _setter("rest_endpoint", rest_endpoint)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `srcm/v2`.
        """
        return pulumi.get(self, "api_version")

    @api_version.setter
    def api_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_version", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['SchemaRegistryClusterEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['SchemaRegistryClusterEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter
    def package(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        """
        return pulumi.get(self, "package")

    @package.setter
    def package(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "package", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input['SchemaRegistryClusterRegionArgs']]:
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input['SchemaRegistryClusterRegionArgs']]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
        """
        return pulumi.get(self, "resource_name")

    @resource_name.setter
    def resource_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_name", value)

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
        """
        return pulumi.get(self, "rest_endpoint")

    @rest_endpoint.setter
    def rest_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rest_endpoint", value)


class SchemaRegistryCluster(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['SchemaRegistryClusterEnvironmentArgs']]] = None,
                 package: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[pulumi.InputType['SchemaRegistryClusterRegionArgs']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development")
        example = confluentcloud.get_schema_registry_region(cloud="AWS",
            region="us-east-2",
            package="ESSENTIALS")
        essentials = confluentcloud.SchemaRegistryCluster("essentials",
            package=example.package,
            environment=confluentcloud.SchemaRegistryClusterEnvironmentArgs(
                id=development.id,
            ),
            region=confluentcloud.SchemaRegistryClusterRegionArgs(
                id=example.id,
            ))
        ```

        ## Import

        You can import a Schema Registry cluster by using Environment ID and Schema Registry cluster ID, in the format `<Environment ID>/<Schema Registry cluster ID>`, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/schemaRegistryCluster:SchemaRegistryCluster example env-abc123/lsrc-abc123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['SchemaRegistryClusterEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[str] package: The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SchemaRegistryClusterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        development = confluentcloud.Environment("development")
        example = confluentcloud.get_schema_registry_region(cloud="AWS",
            region="us-east-2",
            package="ESSENTIALS")
        essentials = confluentcloud.SchemaRegistryCluster("essentials",
            package=example.package,
            environment=confluentcloud.SchemaRegistryClusterEnvironmentArgs(
                id=development.id,
            ),
            region=confluentcloud.SchemaRegistryClusterRegionArgs(
                id=example.id,
            ))
        ```

        ## Import

        You can import a Schema Registry cluster by using Environment ID and Schema Registry cluster ID, in the format `<Environment ID>/<Schema Registry cluster ID>`, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/schemaRegistryCluster:SchemaRegistryCluster example env-abc123/lsrc-abc123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param SchemaRegistryClusterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SchemaRegistryClusterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            SchemaRegistryClusterArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['SchemaRegistryClusterEnvironmentArgs']]] = None,
                 package: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[pulumi.InputType['SchemaRegistryClusterRegionArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SchemaRegistryClusterArgs.__new__(SchemaRegistryClusterArgs)

            if environment is not None and not isinstance(environment, SchemaRegistryClusterEnvironmentArgs):
                environment = environment or {}
                def _setter(key, value):
                    environment[key] = value
                SchemaRegistryClusterEnvironmentArgs._configure(_setter, **environment)
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if package is None and not opts.urn:
                raise TypeError("Missing required property 'package'")
            __props__.__dict__["package"] = package
            if region is not None and not isinstance(region, SchemaRegistryClusterRegionArgs):
                region = region or {}
                def _setter(key, value):
                    region[key] = value
                SchemaRegistryClusterRegionArgs._configure(_setter, **region)
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["api_version"] = None
            __props__.__dict__["display_name"] = None
            __props__.__dict__["kind"] = None
            __props__.__dict__["resource_name"] = None
            __props__.__dict__["rest_endpoint"] = None
        super(SchemaRegistryCluster, __self__).__init__(
            'confluentcloud:index/schemaRegistryCluster:SchemaRegistryCluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_version: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[pulumi.InputType['SchemaRegistryClusterEnvironmentArgs']]] = None,
            kind: Optional[pulumi.Input[str]] = None,
            package: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[pulumi.InputType['SchemaRegistryClusterRegionArgs']]] = None,
            resource_name_: Optional[pulumi.Input[str]] = None,
            rest_endpoint: Optional[pulumi.Input[str]] = None) -> 'SchemaRegistryCluster':
        """
        Get an existing SchemaRegistryCluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_version: (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `srcm/v2`.
        :param pulumi.Input[str] display_name: (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
        :param pulumi.Input[pulumi.InputType['SchemaRegistryClusterEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[str] kind: (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
        :param pulumi.Input[str] package: The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        :param pulumi.Input[str] resource_name_: (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
        :param pulumi.Input[str] rest_endpoint: (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SchemaRegistryClusterState.__new__(_SchemaRegistryClusterState)

        __props__.__dict__["api_version"] = api_version
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["kind"] = kind
        __props__.__dict__["package"] = package
        __props__.__dict__["region"] = region
        __props__.__dict__["resource_name"] = resource_name_
        __props__.__dict__["rest_endpoint"] = rest_endpoint
        return SchemaRegistryCluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiVersion")
    def api_version(self) -> pulumi.Output[str]:
        """
        (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `srcm/v2`.
        """
        return pulumi.get(self, "api_version")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.SchemaRegistryClusterEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[str]:
        """
        (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def package(self) -> pulumi.Output[str]:
        """
        The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        """
        return pulumi.get(self, "package")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output['outputs.SchemaRegistryClusterRegion']:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="resourceName")
    def resource_name(self) -> pulumi.Output[str]:
        """
        (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
        """
        return pulumi.get(self, "resource_name")

    @property
    @pulumi.getter(name="restEndpoint")
    def rest_endpoint(self) -> pulumi.Output[str]:
        """
        (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
        """
        return pulumi.get(self, "rest_endpoint")

