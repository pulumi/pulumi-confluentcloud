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

__all__ = ['KafkaClientQuotaArgs', 'KafkaClientQuota']

@pulumi.input_type
class KafkaClientQuotaArgs:
    def __init__(__self__, *,
                 display_name: pulumi.Input[str],
                 environment: pulumi.Input['KafkaClientQuotaEnvironmentArgs'],
                 kafka_cluster: pulumi.Input['KafkaClientQuotaKafkaClusterArgs'],
                 principals: pulumi.Input[Sequence[pulumi.Input[str]]],
                 throughput: pulumi.Input['KafkaClientQuotaThroughputArgs'],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a KafkaClientQuota resource.
        :param pulumi.Input[str] display_name: The name of the Kafka Client Quota.
        :param pulumi.Input['KafkaClientQuotaEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] principals: The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "<default>", to represent the default quota for all users and service accounts.
        :param pulumi.Input['KafkaClientQuotaThroughputArgs'] throughput: Block for representing a Kafka Quota.
        :param pulumi.Input[str] description: The description of the Kafka Client Quota.
        """
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "kafka_cluster", kafka_cluster)
        pulumi.set(__self__, "principals", principals)
        pulumi.set(__self__, "throughput", throughput)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[str]:
        """
        The name of the Kafka Client Quota.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['KafkaClientQuotaEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['KafkaClientQuotaEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> pulumi.Input['KafkaClientQuotaKafkaClusterArgs']:
        return pulumi.get(self, "kafka_cluster")

    @kafka_cluster.setter
    def kafka_cluster(self, value: pulumi.Input['KafkaClientQuotaKafkaClusterArgs']):
        pulumi.set(self, "kafka_cluster", value)

    @property
    @pulumi.getter
    def principals(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "<default>", to represent the default quota for all users and service accounts.
        """
        return pulumi.get(self, "principals")

    @principals.setter
    def principals(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "principals", value)

    @property
    @pulumi.getter
    def throughput(self) -> pulumi.Input['KafkaClientQuotaThroughputArgs']:
        """
        Block for representing a Kafka Quota.
        """
        return pulumi.get(self, "throughput")

    @throughput.setter
    def throughput(self, value: pulumi.Input['KafkaClientQuotaThroughputArgs']):
        pulumi.set(self, "throughput", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Kafka Client Quota.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _KafkaClientQuotaState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input['KafkaClientQuotaEnvironmentArgs']] = None,
                 kafka_cluster: Optional[pulumi.Input['KafkaClientQuotaKafkaClusterArgs']] = None,
                 principals: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 throughput: Optional[pulumi.Input['KafkaClientQuotaThroughputArgs']] = None):
        """
        Input properties used for looking up and filtering KafkaClientQuota resources.
        :param pulumi.Input[str] description: The description of the Kafka Client Quota.
        :param pulumi.Input[str] display_name: The name of the Kafka Client Quota.
        :param pulumi.Input['KafkaClientQuotaEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] principals: The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "<default>", to represent the default quota for all users and service accounts.
        :param pulumi.Input['KafkaClientQuotaThroughputArgs'] throughput: Block for representing a Kafka Quota.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if kafka_cluster is not None:
            pulumi.set(__self__, "kafka_cluster", kafka_cluster)
        if principals is not None:
            pulumi.set(__self__, "principals", principals)
        if throughput is not None:
            pulumi.set(__self__, "throughput", throughput)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the Kafka Client Quota.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Kafka Client Quota.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['KafkaClientQuotaEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['KafkaClientQuotaEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> Optional[pulumi.Input['KafkaClientQuotaKafkaClusterArgs']]:
        return pulumi.get(self, "kafka_cluster")

    @kafka_cluster.setter
    def kafka_cluster(self, value: Optional[pulumi.Input['KafkaClientQuotaKafkaClusterArgs']]):
        pulumi.set(self, "kafka_cluster", value)

    @property
    @pulumi.getter
    def principals(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "<default>", to represent the default quota for all users and service accounts.
        """
        return pulumi.get(self, "principals")

    @principals.setter
    def principals(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "principals", value)

    @property
    @pulumi.getter
    def throughput(self) -> Optional[pulumi.Input['KafkaClientQuotaThroughputArgs']]:
        """
        Block for representing a Kafka Quota.
        """
        return pulumi.get(self, "throughput")

    @throughput.setter
    def throughput(self, value: Optional[pulumi.Input['KafkaClientQuotaThroughputArgs']]):
        pulumi.set(self, "throughput", value)


class KafkaClientQuota(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['KafkaClientQuotaEnvironmentArgs']]] = None,
                 kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KafkaClientQuotaKafkaClusterArgs']]] = None,
                 principals: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 throughput: Optional[pulumi.Input[pulumi.InputType['KafkaClientQuotaThroughputArgs']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        example = confluentcloud.KafkaClientQuota("example",
            display_name="test-quota",
            description="Test Quota",
            throughput=confluentcloud.KafkaClientQuotaThroughputArgs(
                ingress_byte_rate="100",
                egress_byte_rate="200",
            ),
            principals=[
                confluent_service_account["app_manager"]["id"],
                confluent_service_account["app_manager_2"]["id"],
            ],
            kafka_cluster=confluentcloud.KafkaClientQuotaKafkaClusterArgs(
                id=%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
            ),
            environment=confluentcloud.KafkaClientQuotaEnvironmentArgs(
                id=%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
            ))
        ```

        ## Import

        You can import a Kafka Client Quota by using Kafka Client Quota ID. The following example shows how to import a Kafka Client Quota ID$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/kafkaClientQuota:KafkaClientQuota example cq-abc123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Kafka Client Quota.
        :param pulumi.Input[str] display_name: The name of the Kafka Client Quota.
        :param pulumi.Input[pulumi.InputType['KafkaClientQuotaEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] principals: The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "<default>", to represent the default quota for all users and service accounts.
        :param pulumi.Input[pulumi.InputType['KafkaClientQuotaThroughputArgs']] throughput: Block for representing a Kafka Quota.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: KafkaClientQuotaArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        example = confluentcloud.KafkaClientQuota("example",
            display_name="test-quota",
            description="Test Quota",
            throughput=confluentcloud.KafkaClientQuotaThroughputArgs(
                ingress_byte_rate="100",
                egress_byte_rate="200",
            ),
            principals=[
                confluent_service_account["app_manager"]["id"],
                confluent_service_account["app_manager_2"]["id"],
            ],
            kafka_cluster=confluentcloud.KafkaClientQuotaKafkaClusterArgs(
                id=%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
            ),
            environment=confluentcloud.KafkaClientQuotaEnvironmentArgs(
                id=%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
            ))
        ```

        ## Import

        You can import a Kafka Client Quota by using Kafka Client Quota ID. The following example shows how to import a Kafka Client Quota ID$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"

        ```sh
         $ pulumi import confluentcloud:index/kafkaClientQuota:KafkaClientQuota example cq-abc123
        ```

         !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param KafkaClientQuotaArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(KafkaClientQuotaArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 environment: Optional[pulumi.Input[pulumi.InputType['KafkaClientQuotaEnvironmentArgs']]] = None,
                 kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KafkaClientQuotaKafkaClusterArgs']]] = None,
                 principals: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 throughput: Optional[pulumi.Input[pulumi.InputType['KafkaClientQuotaThroughputArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = KafkaClientQuotaArgs.__new__(KafkaClientQuotaArgs)

            __props__.__dict__["description"] = description
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if kafka_cluster is None and not opts.urn:
                raise TypeError("Missing required property 'kafka_cluster'")
            __props__.__dict__["kafka_cluster"] = kafka_cluster
            if principals is None and not opts.urn:
                raise TypeError("Missing required property 'principals'")
            __props__.__dict__["principals"] = principals
            if throughput is None and not opts.urn:
                raise TypeError("Missing required property 'throughput'")
            __props__.__dict__["throughput"] = throughput
        super(KafkaClientQuota, __self__).__init__(
            'confluentcloud:index/kafkaClientQuota:KafkaClientQuota',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            environment: Optional[pulumi.Input[pulumi.InputType['KafkaClientQuotaEnvironmentArgs']]] = None,
            kafka_cluster: Optional[pulumi.Input[pulumi.InputType['KafkaClientQuotaKafkaClusterArgs']]] = None,
            principals: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            throughput: Optional[pulumi.Input[pulumi.InputType['KafkaClientQuotaThroughputArgs']]] = None) -> 'KafkaClientQuota':
        """
        Get an existing KafkaClientQuota resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the Kafka Client Quota.
        :param pulumi.Input[str] display_name: The name of the Kafka Client Quota.
        :param pulumi.Input[pulumi.InputType['KafkaClientQuotaEnvironmentArgs']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] principals: The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "<default>", to represent the default quota for all users and service accounts.
        :param pulumi.Input[pulumi.InputType['KafkaClientQuotaThroughputArgs']] throughput: Block for representing a Kafka Quota.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _KafkaClientQuotaState.__new__(_KafkaClientQuotaState)

        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["kafka_cluster"] = kafka_cluster
        __props__.__dict__["principals"] = principals
        __props__.__dict__["throughput"] = throughput
        return KafkaClientQuota(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the Kafka Client Quota.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The name of the Kafka Client Quota.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.KafkaClientQuotaEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> pulumi.Output['outputs.KafkaClientQuotaKafkaCluster']:
        return pulumi.get(self, "kafka_cluster")

    @property
    @pulumi.getter
    def principals(self) -> pulumi.Output[Sequence[str]]:
        """
        The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "<default>", to represent the default quota for all users and service accounts.
        """
        return pulumi.get(self, "principals")

    @property
    @pulumi.getter
    def throughput(self) -> pulumi.Output['outputs.KafkaClientQuotaThroughput']:
        """
        Block for representing a Kafka Quota.
        """
        return pulumi.get(self, "throughput")

