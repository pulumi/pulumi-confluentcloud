# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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

__all__ = ['CatalogIntegrationArgs', 'CatalogIntegration']

@pulumi.input_type
class CatalogIntegrationArgs:
    def __init__(__self__, *,
                 display_name: pulumi.Input[builtins.str],
                 environment: pulumi.Input['CatalogIntegrationEnvironmentArgs'],
                 kafka_cluster: pulumi.Input['CatalogIntegrationKafkaClusterArgs'],
                 aws_glue: Optional[pulumi.Input['CatalogIntegrationAwsGlueArgs']] = None,
                 credentials: Optional[pulumi.Input['CatalogIntegrationCredentialsArgs']] = None,
                 snowflake: Optional[pulumi.Input['CatalogIntegrationSnowflakeArgs']] = None):
        """
        The set of arguments for constructing a CatalogIntegration resource.
        :param pulumi.Input[builtins.str] display_name: The name of the catalog integration.
        :param pulumi.Input['CatalogIntegrationEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['CatalogIntegrationAwsGlueArgs'] aws_glue: supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
        :param pulumi.Input['CatalogIntegrationCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input['CatalogIntegrationSnowflakeArgs'] snowflake: supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
        """
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "environment", environment)
        pulumi.set(__self__, "kafka_cluster", kafka_cluster)
        if aws_glue is not None:
            pulumi.set(__self__, "aws_glue", aws_glue)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if snowflake is not None:
            pulumi.set(__self__, "snowflake", snowflake)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[builtins.str]:
        """
        The name of the catalog integration.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Input['CatalogIntegrationEnvironmentArgs']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: pulumi.Input['CatalogIntegrationEnvironmentArgs']):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> pulumi.Input['CatalogIntegrationKafkaClusterArgs']:
        return pulumi.get(self, "kafka_cluster")

    @kafka_cluster.setter
    def kafka_cluster(self, value: pulumi.Input['CatalogIntegrationKafkaClusterArgs']):
        pulumi.set(self, "kafka_cluster", value)

    @property
    @pulumi.getter(name="awsGlue")
    def aws_glue(self) -> Optional[pulumi.Input['CatalogIntegrationAwsGlueArgs']]:
        """
        supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
        """
        return pulumi.get(self, "aws_glue")

    @aws_glue.setter
    def aws_glue(self, value: Optional[pulumi.Input['CatalogIntegrationAwsGlueArgs']]):
        pulumi.set(self, "aws_glue", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['CatalogIntegrationCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['CatalogIntegrationCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter
    def snowflake(self) -> Optional[pulumi.Input['CatalogIntegrationSnowflakeArgs']]:
        """
        supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
        """
        return pulumi.get(self, "snowflake")

    @snowflake.setter
    def snowflake(self, value: Optional[pulumi.Input['CatalogIntegrationSnowflakeArgs']]):
        pulumi.set(self, "snowflake", value)


@pulumi.input_type
class _CatalogIntegrationState:
    def __init__(__self__, *,
                 aws_glue: Optional[pulumi.Input['CatalogIntegrationAwsGlueArgs']] = None,
                 credentials: Optional[pulumi.Input['CatalogIntegrationCredentialsArgs']] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input['CatalogIntegrationEnvironmentArgs']] = None,
                 kafka_cluster: Optional[pulumi.Input['CatalogIntegrationKafkaClusterArgs']] = None,
                 snowflake: Optional[pulumi.Input['CatalogIntegrationSnowflakeArgs']] = None,
                 suspended: Optional[pulumi.Input[builtins.bool]] = None):
        """
        Input properties used for looking up and filtering CatalogIntegration resources.
        :param pulumi.Input['CatalogIntegrationAwsGlueArgs'] aws_glue: supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
        :param pulumi.Input['CatalogIntegrationCredentialsArgs'] credentials: The Cluster API Credentials.
        :param pulumi.Input[builtins.str] display_name: The name of the catalog integration.
        :param pulumi.Input['CatalogIntegrationEnvironmentArgs'] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input['CatalogIntegrationSnowflakeArgs'] snowflake: supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
        :param pulumi.Input[builtins.bool] suspended: (Optional Boolean) Indicates whether the Catalog Integration should be suspended.
        """
        if aws_glue is not None:
            pulumi.set(__self__, "aws_glue", aws_glue)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if kafka_cluster is not None:
            pulumi.set(__self__, "kafka_cluster", kafka_cluster)
        if snowflake is not None:
            pulumi.set(__self__, "snowflake", snowflake)
        if suspended is not None:
            pulumi.set(__self__, "suspended", suspended)

    @property
    @pulumi.getter(name="awsGlue")
    def aws_glue(self) -> Optional[pulumi.Input['CatalogIntegrationAwsGlueArgs']]:
        """
        supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
        """
        return pulumi.get(self, "aws_glue")

    @aws_glue.setter
    def aws_glue(self, value: Optional[pulumi.Input['CatalogIntegrationAwsGlueArgs']]):
        pulumi.set(self, "aws_glue", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['CatalogIntegrationCredentialsArgs']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['CatalogIntegrationCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the catalog integration.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input['CatalogIntegrationEnvironmentArgs']]:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input['CatalogIntegrationEnvironmentArgs']]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> Optional[pulumi.Input['CatalogIntegrationKafkaClusterArgs']]:
        return pulumi.get(self, "kafka_cluster")

    @kafka_cluster.setter
    def kafka_cluster(self, value: Optional[pulumi.Input['CatalogIntegrationKafkaClusterArgs']]):
        pulumi.set(self, "kafka_cluster", value)

    @property
    @pulumi.getter
    def snowflake(self) -> Optional[pulumi.Input['CatalogIntegrationSnowflakeArgs']]:
        """
        supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
        """
        return pulumi.get(self, "snowflake")

    @snowflake.setter
    def snowflake(self, value: Optional[pulumi.Input['CatalogIntegrationSnowflakeArgs']]):
        pulumi.set(self, "snowflake", value)

    @property
    @pulumi.getter
    def suspended(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        (Optional Boolean) Indicates whether the Catalog Integration should be suspended.
        """
        return pulumi.get(self, "suspended")

    @suspended.setter
    def suspended(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "suspended", value)


class CatalogIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_glue: Optional[pulumi.Input[Union['CatalogIntegrationAwsGlueArgs', 'CatalogIntegrationAwsGlueArgsDict']]] = None,
                 credentials: Optional[pulumi.Input[Union['CatalogIntegrationCredentialsArgs', 'CatalogIntegrationCredentialsArgsDict']]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[Union['CatalogIntegrationEnvironmentArgs', 'CatalogIntegrationEnvironmentArgsDict']]] = None,
                 kafka_cluster: Optional[pulumi.Input[Union['CatalogIntegrationKafkaClusterArgs', 'CatalogIntegrationKafkaClusterArgsDict']]] = None,
                 snowflake: Optional[pulumi.Input[Union['CatalogIntegrationSnowflakeArgs', 'CatalogIntegrationSnowflakeArgsDict']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ### Option #1: Manage multiple Catalog Integrations in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        example = confluentcloud.CatalogIntegration("example",
            environment={
                "id": staging["id"],
            },
            kafka_cluster={
                "id": staging_confluent_kafka_cluster["id"],
            },
            display_name="catalog-integration-1",
            aws_glue={
                "provider_integration_id": main["id"],
            },
            credentials={
                "key": env_admin_tableflow_api_key["id"],
                "secret": env_admin_tableflow_api_key["secret"],
            })
        ```

        ### Option #2: Manage a single Catalog Integration in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        example = confluentcloud.CatalogIntegration("example",
            environment={
                "id": staging["id"],
            },
            kafka_cluster={
                "id": staging_confluent_kafka_cluster["id"],
            },
            display_name="catalog-integration-1",
            snowflake={
                "endpoint": "https://vuser1_polaris.snowflakecomputing.com/",
                "client_id": "***REDACTED***",
                "client_secret": "***REDACTED***",
                "warehouse": "catalog-name",
                "allowed_scope": "session:role:R1",
            })
        ```

        ## Import

        You can import a Catalog Integration by using the Catalog Integration name, Environment ID, and Kafka Cluster ID, in the format `<Environment ID>/<Kafka Cluster ID>/<Catalog Integration Id>`, for example:

        Option #1: Manage multiple Catalog Integrations in the same Pulumi Stack

        $ export IMPORT_TABLEFLOW_API_KEY="<tableflow_api_key>"

        $ export IMPORT_TABLEFLOW_API_SECRET="<tableflow_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/catalogIntegration:CatalogIntegration example env-abc123/lkc-abc123/tci-abc123
        ```

        Option #2: Manage a single Catalog Integration in the same Pulumi Stack

        ```sh
        $ pulumi import confluentcloud:index/catalogIntegration:CatalogIntegration example env-abc123/lkc-abc123/tci-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['CatalogIntegrationAwsGlueArgs', 'CatalogIntegrationAwsGlueArgsDict']] aws_glue: supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
        :param pulumi.Input[Union['CatalogIntegrationCredentialsArgs', 'CatalogIntegrationCredentialsArgsDict']] credentials: The Cluster API Credentials.
        :param pulumi.Input[builtins.str] display_name: The name of the catalog integration.
        :param pulumi.Input[Union['CatalogIntegrationEnvironmentArgs', 'CatalogIntegrationEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Union['CatalogIntegrationSnowflakeArgs', 'CatalogIntegrationSnowflakeArgsDict']] snowflake: supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CatalogIntegrationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ### Option #1: Manage multiple Catalog Integrations in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        example = confluentcloud.CatalogIntegration("example",
            environment={
                "id": staging["id"],
            },
            kafka_cluster={
                "id": staging_confluent_kafka_cluster["id"],
            },
            display_name="catalog-integration-1",
            aws_glue={
                "provider_integration_id": main["id"],
            },
            credentials={
                "key": env_admin_tableflow_api_key["id"],
                "secret": env_admin_tableflow_api_key["secret"],
            })
        ```

        ### Option #2: Manage a single Catalog Integration in the same Pulumi Stack

        ```python
        import pulumi
        import pulumi_confluentcloud as confluentcloud

        example = confluentcloud.CatalogIntegration("example",
            environment={
                "id": staging["id"],
            },
            kafka_cluster={
                "id": staging_confluent_kafka_cluster["id"],
            },
            display_name="catalog-integration-1",
            snowflake={
                "endpoint": "https://vuser1_polaris.snowflakecomputing.com/",
                "client_id": "***REDACTED***",
                "client_secret": "***REDACTED***",
                "warehouse": "catalog-name",
                "allowed_scope": "session:role:R1",
            })
        ```

        ## Import

        You can import a Catalog Integration by using the Catalog Integration name, Environment ID, and Kafka Cluster ID, in the format `<Environment ID>/<Kafka Cluster ID>/<Catalog Integration Id>`, for example:

        Option #1: Manage multiple Catalog Integrations in the same Pulumi Stack

        $ export IMPORT_TABLEFLOW_API_KEY="<tableflow_api_key>"

        $ export IMPORT_TABLEFLOW_API_SECRET="<tableflow_api_secret>"

        ```sh
        $ pulumi import confluentcloud:index/catalogIntegration:CatalogIntegration example env-abc123/lkc-abc123/tci-abc123
        ```

        Option #2: Manage a single Catalog Integration in the same Pulumi Stack

        ```sh
        $ pulumi import confluentcloud:index/catalogIntegration:CatalogIntegration example env-abc123/lkc-abc123/tci-abc123
        ```

        !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.

        :param str resource_name: The name of the resource.
        :param CatalogIntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CatalogIntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_glue: Optional[pulumi.Input[Union['CatalogIntegrationAwsGlueArgs', 'CatalogIntegrationAwsGlueArgsDict']]] = None,
                 credentials: Optional[pulumi.Input[Union['CatalogIntegrationCredentialsArgs', 'CatalogIntegrationCredentialsArgsDict']]] = None,
                 display_name: Optional[pulumi.Input[builtins.str]] = None,
                 environment: Optional[pulumi.Input[Union['CatalogIntegrationEnvironmentArgs', 'CatalogIntegrationEnvironmentArgsDict']]] = None,
                 kafka_cluster: Optional[pulumi.Input[Union['CatalogIntegrationKafkaClusterArgs', 'CatalogIntegrationKafkaClusterArgsDict']]] = None,
                 snowflake: Optional[pulumi.Input[Union['CatalogIntegrationSnowflakeArgs', 'CatalogIntegrationSnowflakeArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CatalogIntegrationArgs.__new__(CatalogIntegrationArgs)

            __props__.__dict__["aws_glue"] = aws_glue
            __props__.__dict__["credentials"] = None if credentials is None else pulumi.Output.secret(credentials)
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if environment is None and not opts.urn:
                raise TypeError("Missing required property 'environment'")
            __props__.__dict__["environment"] = environment
            if kafka_cluster is None and not opts.urn:
                raise TypeError("Missing required property 'kafka_cluster'")
            __props__.__dict__["kafka_cluster"] = kafka_cluster
            __props__.__dict__["snowflake"] = snowflake
            __props__.__dict__["suspended"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(CatalogIntegration, __self__).__init__(
            'confluentcloud:index/catalogIntegration:CatalogIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws_glue: Optional[pulumi.Input[Union['CatalogIntegrationAwsGlueArgs', 'CatalogIntegrationAwsGlueArgsDict']]] = None,
            credentials: Optional[pulumi.Input[Union['CatalogIntegrationCredentialsArgs', 'CatalogIntegrationCredentialsArgsDict']]] = None,
            display_name: Optional[pulumi.Input[builtins.str]] = None,
            environment: Optional[pulumi.Input[Union['CatalogIntegrationEnvironmentArgs', 'CatalogIntegrationEnvironmentArgsDict']]] = None,
            kafka_cluster: Optional[pulumi.Input[Union['CatalogIntegrationKafkaClusterArgs', 'CatalogIntegrationKafkaClusterArgsDict']]] = None,
            snowflake: Optional[pulumi.Input[Union['CatalogIntegrationSnowflakeArgs', 'CatalogIntegrationSnowflakeArgsDict']]] = None,
            suspended: Optional[pulumi.Input[builtins.bool]] = None) -> 'CatalogIntegration':
        """
        Get an existing CatalogIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['CatalogIntegrationAwsGlueArgs', 'CatalogIntegrationAwsGlueArgsDict']] aws_glue: supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
        :param pulumi.Input[Union['CatalogIntegrationCredentialsArgs', 'CatalogIntegrationCredentialsArgsDict']] credentials: The Cluster API Credentials.
        :param pulumi.Input[builtins.str] display_name: The name of the catalog integration.
        :param pulumi.Input[Union['CatalogIntegrationEnvironmentArgs', 'CatalogIntegrationEnvironmentArgsDict']] environment: Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        :param pulumi.Input[Union['CatalogIntegrationSnowflakeArgs', 'CatalogIntegrationSnowflakeArgsDict']] snowflake: supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
        :param pulumi.Input[builtins.bool] suspended: (Optional Boolean) Indicates whether the Catalog Integration should be suspended.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CatalogIntegrationState.__new__(_CatalogIntegrationState)

        __props__.__dict__["aws_glue"] = aws_glue
        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["environment"] = environment
        __props__.__dict__["kafka_cluster"] = kafka_cluster
        __props__.__dict__["snowflake"] = snowflake
        __props__.__dict__["suspended"] = suspended
        return CatalogIntegration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="awsGlue")
    def aws_glue(self) -> pulumi.Output[Optional['outputs.CatalogIntegrationAwsGlue']]:
        """
        supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
        """
        return pulumi.get(self, "aws_glue")

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional['outputs.CatalogIntegrationCredentials']]:
        """
        The Cluster API Credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the catalog integration.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output['outputs.CatalogIntegrationEnvironment']:
        """
        Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter(name="kafkaCluster")
    def kafka_cluster(self) -> pulumi.Output['outputs.CatalogIntegrationKafkaCluster']:
        return pulumi.get(self, "kafka_cluster")

    @property
    @pulumi.getter
    def snowflake(self) -> pulumi.Output[Optional['outputs.CatalogIntegrationSnowflake']]:
        """
        supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
        """
        return pulumi.get(self, "snowflake")

    @property
    @pulumi.getter
    def suspended(self) -> pulumi.Output[builtins.bool]:
        """
        (Optional Boolean) Indicates whether the Catalog Integration should be suspended.
        """
        return pulumi.get(self, "suspended")

