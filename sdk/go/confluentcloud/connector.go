// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ### Example Managed [Datagen Source Connector](https://docs.confluent.io/cloud/current/connectors/cc-datagen-source.html) that uses a service account to communicate with your Kafka cluster
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/configurations/connectors/managed-datagen-source-connector
//			_, err := confluentcloud.NewConnector(ctx, "source", &confluentcloud.ConnectorArgs{
//				Environment: &confluentcloud.ConnectorEnvironmentArgs{
//					Id: pulumi.Any(staging.Id),
//				},
//				KafkaCluster: &confluentcloud.ConnectorKafkaClusterArgs{
//					Id: pulumi.Any(basic.Id),
//				},
//				ConfigSensitive: pulumi.StringMap{},
//				ConfigNonsensitive: pulumi.StringMap{
//					"connector.class":          pulumi.String("DatagenSource"),
//					"name":                     pulumi.String("DatagenSourceConnector_0"),
//					"kafka.auth.mode":          pulumi.String("SERVICE_ACCOUNT"),
//					"kafka.service.account.id": pulumi.Any(app_connector.Id),
//					"kafka.topic":              pulumi.Any(orders.TopicName),
//					"output.data.format":       pulumi.String("JSON"),
//					"quickstart":               pulumi.String("ORDERS"),
//					"tasks.max":                pulumi.String("1"),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				app_connector_describe_on_cluster,
//				app_connector_write_on_target_topic,
//				app_connector_create_on_data_preview_topics,
//				app_connector_write_on_data_preview_topics,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Example Managed [Amazon S3 Sink Connector](https://docs.confluent.io/cloud/current/connectors/cc-s3-sink.html) that uses a service account to communicate with your Kafka cluster
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/configurations/connectors/s3-sink-connector
//			_, err := confluentcloud.NewConnector(ctx, "sink", &confluentcloud.ConnectorArgs{
//				Environment: &confluentcloud.ConnectorEnvironmentArgs{
//					Id: pulumi.Any(staging.Id),
//				},
//				KafkaCluster: &confluentcloud.ConnectorKafkaClusterArgs{
//					Id: pulumi.Any(basic.Id),
//				},
//				ConfigSensitive: pulumi.StringMap{
//					"aws.access.key.id":     pulumi.String("***REDACTED***"),
//					"aws.secret.access.key": pulumi.String("***REDACTED***"),
//				},
//				ConfigNonsensitive: pulumi.StringMap{
//					"topics":                   pulumi.Any(orders.TopicName),
//					"input.data.format":        pulumi.String("JSON"),
//					"connector.class":          pulumi.String("S3_SINK"),
//					"name":                     pulumi.String("S3_SINKConnector_0"),
//					"kafka.auth.mode":          pulumi.String("SERVICE_ACCOUNT"),
//					"kafka.service.account.id": pulumi.Any(app_connector.Id),
//					"s3.bucket.name":           pulumi.String("<s3-bucket-name>"),
//					"output.data.format":       pulumi.String("JSON"),
//					"time.interval":            pulumi.String("DAILY"),
//					"flush.size":               pulumi.String("1000"),
//					"tasks.max":                pulumi.String("1"),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				app_connector_describe_on_cluster,
//				app_connector_read_on_target_topic,
//				app_connector_create_on_dlq_lcc_topics,
//				app_connector_write_on_dlq_lcc_topics,
//				app_connector_create_on_success_lcc_topics,
//				app_connector_write_on_success_lcc_topics,
//				app_connector_create_on_error_lcc_topics,
//				app_connector_write_on_error_lcc_topics,
//				app_connector_read_on_connect_lcc_group,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Example Managed [Amazon S3 Sink Connector](https://docs.confluent.io/cloud/current/connectors/cc-s3-sink.html) that uses a service account to communicate with your Kafka cluster and IAM Roles for AWS authentication
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/configurations/connectors/s3-sink-connector-assume-role
//			_, err := confluentcloud.NewConnector(ctx, "sink", &confluentcloud.ConnectorArgs{
//				Environment: &confluentcloud.ConnectorEnvironmentArgs{
//					Id: pulumi.Any(staging.Id),
//				},
//				KafkaCluster: &confluentcloud.ConnectorKafkaClusterArgs{
//					Id: pulumi.Any(basic.Id),
//				},
//				ConfigSensitive: pulumi.StringMap{},
//				ConfigNonsensitive: pulumi.StringMap{
//					"topics":                   pulumi.Any(orders.TopicName),
//					"input.data.format":        pulumi.String("JSON"),
//					"connector.class":          pulumi.String("S3_SINK"),
//					"name":                     pulumi.String("S3_SINKConnector_0"),
//					"kafka.auth.mode":          pulumi.String("SERVICE_ACCOUNT"),
//					"kafka.service.account.id": pulumi.Any(app_connector.Id),
//					"s3.bucket.name":           pulumi.String("<s3-bucket-name>"),
//					"output.data.format":       pulumi.String("JSON"),
//					"time.interval":            pulumi.String("DAILY"),
//					"flush.size":               pulumi.String("1000"),
//					"tasks.max":                pulumi.String("1"),
//					"authentication.method":    pulumi.String("IAM Roles"),
//					"provider.integration.id":  pulumi.Any(main.Id),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				app_connector_describe_on_cluster,
//				app_connector_read_on_target_topic,
//				app_connector_create_on_dlq_lcc_topics,
//				app_connector_write_on_dlq_lcc_topics,
//				app_connector_create_on_success_lcc_topics,
//				app_connector_write_on_success_lcc_topics,
//				app_connector_create_on_error_lcc_topics,
//				app_connector_write_on_error_lcc_topics,
//				app_connector_read_on_connect_lcc_group,
//				main,
//				s3AccessRole,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Example Managed [Amazon DynamoDB Connector](https://docs.confluent.io/cloud/current/connectors/cc-amazon-dynamo-db-sink.html) that uses a service account to communicate with your Kafka cluster
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/configurations/connectors/dynamo-db-sink-connector
//			_, err := confluentcloud.NewConnector(ctx, "sink", &confluentcloud.ConnectorArgs{
//				Environment: &confluentcloud.ConnectorEnvironmentArgs{
//					Id: pulumi.Any(staging.Id),
//				},
//				KafkaCluster: &confluentcloud.ConnectorKafkaClusterArgs{
//					Id: pulumi.Any(basic.Id),
//				},
//				ConfigSensitive: pulumi.StringMap{
//					"aws.access.key.id":     pulumi.String("***REDACTED***"),
//					"aws.secret.access.key": pulumi.String("***REDACTED***"),
//				},
//				ConfigNonsensitive: pulumi.StringMap{
//					"topics":                   pulumi.Any(orders.TopicName),
//					"input.data.format":        pulumi.String("JSON"),
//					"connector.class":          pulumi.String("DynamoDbSink"),
//					"name":                     pulumi.String("DynamoDbSinkConnector_0"),
//					"kafka.auth.mode":          pulumi.String("SERVICE_ACCOUNT"),
//					"kafka.service.account.id": pulumi.Any(app_connector.Id),
//					"aws.dynamodb.pk.hash":     pulumi.String("value.userid"),
//					"aws.dynamodb.pk.sort":     pulumi.String("value.pageid"),
//					"tasks.max":                pulumi.String("1"),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				app_connector_describe_on_cluster,
//				app_connector_read_on_target_topic,
//				app_connector_create_on_dlq_lcc_topics,
//				app_connector_write_on_dlq_lcc_topics,
//				app_connector_create_on_success_lcc_topics,
//				app_connector_write_on_success_lcc_topics,
//				app_connector_create_on_error_lcc_topics,
//				app_connector_write_on_error_lcc_topics,
//				app_connector_read_on_connect_lcc_group,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Example Managed [MySQL Sink Connector](https://docs.confluent.io/cloud/current/connectors/cc-mysql-sink.html) that uses a service account to communicate with your Kafka cluster
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/configurations/connectors/manage-offsets-source-sink-connector
//			_, err := confluentcloud.NewConnector(ctx, "sink", &confluentcloud.ConnectorArgs{
//				Environment: &confluentcloud.ConnectorEnvironmentArgs{
//					Id: pulumi.Any(staging.Id),
//				},
//				KafkaCluster: &confluentcloud.ConnectorKafkaClusterArgs{
//					Id: pulumi.Any(basic.Id),
//				},
//				ConfigSensitive: pulumi.StringMap{
//					"connection.password": pulumi.String("***REDACTED***"),
//				},
//				ConfigNonsensitive: pulumi.StringMap{
//					"connector.class":          pulumi.String("MySqlSink"),
//					"name":                     pulumi.String("MySQLSinkConnector_0"),
//					"topics":                   pulumi.Any(orders.TopicName),
//					"input.data.format":        pulumi.String("AVRO"),
//					"kafka.auth.mode":          pulumi.String("SERVICE_ACCOUNT"),
//					"kafka.service.account.id": pulumi.Any(app_connector.Id),
//					"db.name":                  pulumi.String("test_database"),
//					"connection.user":          pulumi.String("confluent_user"),
//					"connection.host":          pulumi.String("dev-testing-temp.abcdefghijk.us-west-7.rds.amazonaws.com"),
//					"connection.port":          pulumi.String("3306"),
//					"insert.mode":              pulumi.String("INSERT"),
//					"auto.create":              pulumi.String("true"),
//					"auto.evolve":              pulumi.String("true"),
//					"tasks.max":                pulumi.String("1"),
//				},
//				Offsets: confluentcloud.ConnectorOffsetArray{
//					&confluentcloud.ConnectorOffsetArgs{
//						Partition: pulumi.StringMap{
//							"kafka_partition": pulumi.String("0"),
//							"kafka_topic":     pulumi.Any(orders.TopicName),
//						},
//						Offset: pulumi.StringMap{
//							"kafka_offset": pulumi.String("100"),
//						},
//					},
//					&confluentcloud.ConnectorOffsetArgs{
//						Partition: pulumi.StringMap{
//							"kafka_partition": pulumi.String("1"),
//							"kafka_topic":     pulumi.Any(orders.TopicName),
//						},
//						Offset: pulumi.StringMap{
//							"kafka_offset": pulumi.String("200"),
//						},
//					},
//					&confluentcloud.ConnectorOffsetArgs{
//						Partition: pulumi.StringMap{
//							"kafka_partition": pulumi.String("2"),
//							"kafka_topic":     pulumi.Any(orders.TopicName),
//						},
//						Offset: pulumi.StringMap{
//							"kafka_offset": pulumi.String("300"),
//						},
//					},
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				app_connector_describe_on_cluster,
//				app_connector_read_on_target_topic,
//				app_connector_create_on_dlq_lcc_topics,
//				app_connector_write_on_dlq_lcc_topics,
//				app_connector_create_on_success_lcc_topics,
//				app_connector_write_on_success_lcc_topics,
//				app_connector_create_on_error_lcc_topics,
//				app_connector_write_on_error_lcc_topics,
//				app_connector_read_on_connect_lcc_group,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Example Custom [Datagen Source Connector](https://www.confluent.io/hub/confluentinc/kafka-connect-datagen) that uses a Kafka API Key to communicate with your Kafka cluster
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/configurations/connectors/custom-datagen-source-connector
//			_, err := confluentcloud.NewConnector(ctx, "source", &confluentcloud.ConnectorArgs{
//				Environment: &confluentcloud.ConnectorEnvironmentArgs{
//					Id: pulumi.Any(staging.Id),
//				},
//				KafkaCluster: &confluentcloud.ConnectorKafkaClusterArgs{
//					Id: pulumi.Any(basic.Id),
//				},
//				ConfigSensitive: pulumi.StringMap{
//					"kafka.api.key":    pulumi.String("***REDACTED***"),
//					"kafka.api.secret": pulumi.String("***REDACTED***"),
//				},
//				ConfigNonsensitive: pulumi.StringMap{
//					"confluent.connector.type":   pulumi.String("CUSTOM"),
//					"connector.class":            pulumi.Any(sourceConfluentCustomConnectorPlugin.ConnectorClass),
//					"name":                       pulumi.String("DatagenConnectorExampleName"),
//					"kafka.auth.mode":            pulumi.String("KAFKA_API_KEY"),
//					"kafka.topic":                pulumi.Any(orders.TopicName),
//					"output.data.format":         pulumi.String("JSON"),
//					"quickstart":                 pulumi.String("ORDERS"),
//					"confluent.custom.plugin.id": pulumi.Any(sourceConfluentCustomConnectorPlugin.Id),
//					"min.interval":               pulumi.String("1000"),
//					"max.interval":               pulumi.String("2000"),
//					"tasks.max":                  pulumi.String("1"),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				app_manager_kafka_cluster_admin,
//			}))
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Getting Started
//
// The following end-to-end examples might help to get started with `Connector` resource:
// * s3-sink-connector
// * s3-sink-connector-assume-role
// * snowflake-sink-connector
// * managed-datagen-source-connector
// * elasticsearch-sink-connector
// * dynamo-db-sink-connector
// * mongo-db-source-connector
// * mongo-db-sink-connector
// * sql-server-cdc-debezium-source-connector
// * postgre-sql-cdc-debezium-source-connector
// * custom-datagen-source-connector
// * manage-offsets-github-source-connector
// * manage-offsets-mongo-db-source-connector
// * manage-offsets-mysql-sink-connector
//
// > **Note:** Certain connectors require additional ACL entries. See [Additional ACL entries](https://docs.confluent.io/cloud/current/connectors/service-account.html#additional-acl-entries) for more details.
//
// > **Note:** If there isn’t an example available for your target connector in the connectors folder, use the Confluent Cloud Console to begin the provisioning process. This can help you determine the required ACLs (example). You can also refer to the connector’s documentation page ([example](https://docs.confluent.io/cloud/current/connectors/cc-amazon-dynamo-db-sink.html#step-3-create-the-connector-configuration-file)) to copy its default configuration and learn more about all available settings. Afterward, we recommend selecting an example with the same connector type (sink or source) and modifying its ACL list and configuration to fit your specific requirements.
//
// ## Import
//
// You can import a connector by using Environment ID, Kafka cluster ID, and connector's name, in the format `<Environment ID>/<Kafka cluster ID>/<Connector name>`, for example:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/connector:Connector my_connector "env-abc123/lkc-abc123/S3_SINKConnector_0"
// ```
type Connector struct {
	pulumi.CustomResourceState

	// Block for custom *nonsensitive* configuration properties that are *not* labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
	ConfigNonsensitive pulumi.StringMapOutput `pulumi:"configNonsensitive"`
	// Block for custom *sensitive* configuration properties that are labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
	ConfigSensitive pulumi.StringMapOutput `pulumi:"configSensitive"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  ConnectorEnvironmentOutput  `pulumi:"environment"`
	KafkaCluster ConnectorKafkaClusterOutput `pulumi:"kafkaCluster"`
	// Connector partitions with offsets
	Offsets ConnectorOffsetArrayOutput `pulumi:"offsets"`
	// The status of the connector (one of `"NONE"`, `"PROVISIONING"`, `"RUNNING"`, `"DEGRADED"`, `"FAILED"`, `"PAUSED"`, `"DELETED"`). Pausing (`"RUNNING" > "PAUSED"`) and resuming (`"PAUSED" > "RUNNING"`) a connector is supported via an update operation.
	//
	// For more information on connector offset management, see [Manage Offsets for Fully-Managed Connectors in Confluent Cloud](https://docs.confluent.io/cloud/current/connectors/offsets.html).
	//
	// > **Note:** If there are no _sensitive_ configuration settings for your connector, set `configSensitive = {}` explicitly.
	//
	// > **Note:** You may declare sensitive variables for secrets `configSensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id="foo"`).
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewConnector registers a new resource with the given unique name, arguments, and options.
func NewConnector(ctx *pulumi.Context,
	name string, args *ConnectorArgs, opts ...pulumi.ResourceOption) (*Connector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigNonsensitive == nil {
		return nil, errors.New("invalid value for required argument 'ConfigNonsensitive'")
	}
	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.KafkaCluster == nil {
		return nil, errors.New("invalid value for required argument 'KafkaCluster'")
	}
	if args.ConfigSensitive != nil {
		args.ConfigSensitive = pulumi.ToSecret(args.ConfigSensitive).(pulumi.StringMapInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"configSensitive",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Connector
	err := ctx.RegisterResource("confluentcloud:index/connector:Connector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnector gets an existing Connector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectorState, opts ...pulumi.ResourceOption) (*Connector, error) {
	var resource Connector
	err := ctx.ReadResource("confluentcloud:index/connector:Connector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connector resources.
type connectorState struct {
	// Block for custom *nonsensitive* configuration properties that are *not* labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
	ConfigNonsensitive map[string]string `pulumi:"configNonsensitive"`
	// Block for custom *sensitive* configuration properties that are labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
	ConfigSensitive map[string]string `pulumi:"configSensitive"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  *ConnectorEnvironment  `pulumi:"environment"`
	KafkaCluster *ConnectorKafkaCluster `pulumi:"kafkaCluster"`
	// Connector partitions with offsets
	Offsets []ConnectorOffset `pulumi:"offsets"`
	// The status of the connector (one of `"NONE"`, `"PROVISIONING"`, `"RUNNING"`, `"DEGRADED"`, `"FAILED"`, `"PAUSED"`, `"DELETED"`). Pausing (`"RUNNING" > "PAUSED"`) and resuming (`"PAUSED" > "RUNNING"`) a connector is supported via an update operation.
	//
	// For more information on connector offset management, see [Manage Offsets for Fully-Managed Connectors in Confluent Cloud](https://docs.confluent.io/cloud/current/connectors/offsets.html).
	//
	// > **Note:** If there are no _sensitive_ configuration settings for your connector, set `configSensitive = {}` explicitly.
	//
	// > **Note:** You may declare sensitive variables for secrets `configSensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id="foo"`).
	Status *string `pulumi:"status"`
}

type ConnectorState struct {
	// Block for custom *nonsensitive* configuration properties that are *not* labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
	ConfigNonsensitive pulumi.StringMapInput
	// Block for custom *sensitive* configuration properties that are labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
	ConfigSensitive pulumi.StringMapInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  ConnectorEnvironmentPtrInput
	KafkaCluster ConnectorKafkaClusterPtrInput
	// Connector partitions with offsets
	Offsets ConnectorOffsetArrayInput
	// The status of the connector (one of `"NONE"`, `"PROVISIONING"`, `"RUNNING"`, `"DEGRADED"`, `"FAILED"`, `"PAUSED"`, `"DELETED"`). Pausing (`"RUNNING" > "PAUSED"`) and resuming (`"PAUSED" > "RUNNING"`) a connector is supported via an update operation.
	//
	// For more information on connector offset management, see [Manage Offsets for Fully-Managed Connectors in Confluent Cloud](https://docs.confluent.io/cloud/current/connectors/offsets.html).
	//
	// > **Note:** If there are no _sensitive_ configuration settings for your connector, set `configSensitive = {}` explicitly.
	//
	// > **Note:** You may declare sensitive variables for secrets `configSensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id="foo"`).
	Status pulumi.StringPtrInput
}

func (ConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorState)(nil)).Elem()
}

type connectorArgs struct {
	// Block for custom *nonsensitive* configuration properties that are *not* labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
	ConfigNonsensitive map[string]string `pulumi:"configNonsensitive"`
	// Block for custom *sensitive* configuration properties that are labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
	ConfigSensitive map[string]string `pulumi:"configSensitive"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  ConnectorEnvironment  `pulumi:"environment"`
	KafkaCluster ConnectorKafkaCluster `pulumi:"kafkaCluster"`
	// Connector partitions with offsets
	Offsets []ConnectorOffset `pulumi:"offsets"`
	// The status of the connector (one of `"NONE"`, `"PROVISIONING"`, `"RUNNING"`, `"DEGRADED"`, `"FAILED"`, `"PAUSED"`, `"DELETED"`). Pausing (`"RUNNING" > "PAUSED"`) and resuming (`"PAUSED" > "RUNNING"`) a connector is supported via an update operation.
	//
	// For more information on connector offset management, see [Manage Offsets for Fully-Managed Connectors in Confluent Cloud](https://docs.confluent.io/cloud/current/connectors/offsets.html).
	//
	// > **Note:** If there are no _sensitive_ configuration settings for your connector, set `configSensitive = {}` explicitly.
	//
	// > **Note:** You may declare sensitive variables for secrets `configSensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id="foo"`).
	Status *string `pulumi:"status"`
}

// The set of arguments for constructing a Connector resource.
type ConnectorArgs struct {
	// Block for custom *nonsensitive* configuration properties that are *not* labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
	ConfigNonsensitive pulumi.StringMapInput
	// Block for custom *sensitive* configuration properties that are labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
	ConfigSensitive pulumi.StringMapInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  ConnectorEnvironmentInput
	KafkaCluster ConnectorKafkaClusterInput
	// Connector partitions with offsets
	Offsets ConnectorOffsetArrayInput
	// The status of the connector (one of `"NONE"`, `"PROVISIONING"`, `"RUNNING"`, `"DEGRADED"`, `"FAILED"`, `"PAUSED"`, `"DELETED"`). Pausing (`"RUNNING" > "PAUSED"`) and resuming (`"PAUSED" > "RUNNING"`) a connector is supported via an update operation.
	//
	// For more information on connector offset management, see [Manage Offsets for Fully-Managed Connectors in Confluent Cloud](https://docs.confluent.io/cloud/current/connectors/offsets.html).
	//
	// > **Note:** If there are no _sensitive_ configuration settings for your connector, set `configSensitive = {}` explicitly.
	//
	// > **Note:** You may declare sensitive variables for secrets `configSensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id="foo"`).
	Status pulumi.StringPtrInput
}

func (ConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorArgs)(nil)).Elem()
}

type ConnectorInput interface {
	pulumi.Input

	ToConnectorOutput() ConnectorOutput
	ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput
}

func (*Connector) ElementType() reflect.Type {
	return reflect.TypeOf((**Connector)(nil)).Elem()
}

func (i *Connector) ToConnectorOutput() ConnectorOutput {
	return i.ToConnectorOutputWithContext(context.Background())
}

func (i *Connector) ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorOutput)
}

// ConnectorArrayInput is an input type that accepts ConnectorArray and ConnectorArrayOutput values.
// You can construct a concrete instance of `ConnectorArrayInput` via:
//
//	ConnectorArray{ ConnectorArgs{...} }
type ConnectorArrayInput interface {
	pulumi.Input

	ToConnectorArrayOutput() ConnectorArrayOutput
	ToConnectorArrayOutputWithContext(context.Context) ConnectorArrayOutput
}

type ConnectorArray []ConnectorInput

func (ConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connector)(nil)).Elem()
}

func (i ConnectorArray) ToConnectorArrayOutput() ConnectorArrayOutput {
	return i.ToConnectorArrayOutputWithContext(context.Background())
}

func (i ConnectorArray) ToConnectorArrayOutputWithContext(ctx context.Context) ConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorArrayOutput)
}

// ConnectorMapInput is an input type that accepts ConnectorMap and ConnectorMapOutput values.
// You can construct a concrete instance of `ConnectorMapInput` via:
//
//	ConnectorMap{ "key": ConnectorArgs{...} }
type ConnectorMapInput interface {
	pulumi.Input

	ToConnectorMapOutput() ConnectorMapOutput
	ToConnectorMapOutputWithContext(context.Context) ConnectorMapOutput
}

type ConnectorMap map[string]ConnectorInput

func (ConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connector)(nil)).Elem()
}

func (i ConnectorMap) ToConnectorMapOutput() ConnectorMapOutput {
	return i.ToConnectorMapOutputWithContext(context.Background())
}

func (i ConnectorMap) ToConnectorMapOutputWithContext(ctx context.Context) ConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorMapOutput)
}

type ConnectorOutput struct{ *pulumi.OutputState }

func (ConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connector)(nil)).Elem()
}

func (o ConnectorOutput) ToConnectorOutput() ConnectorOutput {
	return o
}

func (o ConnectorOutput) ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput {
	return o
}

// Block for custom *nonsensitive* configuration properties that are *not* labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
func (o ConnectorOutput) ConfigNonsensitive() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringMapOutput { return v.ConfigNonsensitive }).(pulumi.StringMapOutput)
}

// Block for custom *sensitive* configuration properties that are labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
func (o ConnectorOutput) ConfigSensitive() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringMapOutput { return v.ConfigSensitive }).(pulumi.StringMapOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o ConnectorOutput) Environment() ConnectorEnvironmentOutput {
	return o.ApplyT(func(v *Connector) ConnectorEnvironmentOutput { return v.Environment }).(ConnectorEnvironmentOutput)
}

func (o ConnectorOutput) KafkaCluster() ConnectorKafkaClusterOutput {
	return o.ApplyT(func(v *Connector) ConnectorKafkaClusterOutput { return v.KafkaCluster }).(ConnectorKafkaClusterOutput)
}

// Connector partitions with offsets
func (o ConnectorOutput) Offsets() ConnectorOffsetArrayOutput {
	return o.ApplyT(func(v *Connector) ConnectorOffsetArrayOutput { return v.Offsets }).(ConnectorOffsetArrayOutput)
}

// The status of the connector (one of `"NONE"`, `"PROVISIONING"`, `"RUNNING"`, `"DEGRADED"`, `"FAILED"`, `"PAUSED"`, `"DELETED"`). Pausing (`"RUNNING" > "PAUSED"`) and resuming (`"PAUSED" > "RUNNING"`) a connector is supported via an update operation.
//
// For more information on connector offset management, see [Manage Offsets for Fully-Managed Connectors in Confluent Cloud](https://docs.confluent.io/cloud/current/connectors/offsets.html).
//
// > **Note:** If there are no _sensitive_ configuration settings for your connector, set `configSensitive = {}` explicitly.
//
// > **Note:** You may declare sensitive variables for secrets `configSensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id="foo"`).
func (o ConnectorOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type ConnectorArrayOutput struct{ *pulumi.OutputState }

func (ConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connector)(nil)).Elem()
}

func (o ConnectorArrayOutput) ToConnectorArrayOutput() ConnectorArrayOutput {
	return o
}

func (o ConnectorArrayOutput) ToConnectorArrayOutputWithContext(ctx context.Context) ConnectorArrayOutput {
	return o
}

func (o ConnectorArrayOutput) Index(i pulumi.IntInput) ConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connector {
		return vs[0].([]*Connector)[vs[1].(int)]
	}).(ConnectorOutput)
}

type ConnectorMapOutput struct{ *pulumi.OutputState }

func (ConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connector)(nil)).Elem()
}

func (o ConnectorMapOutput) ToConnectorMapOutput() ConnectorMapOutput {
	return o
}

func (o ConnectorMapOutput) ToConnectorMapOutputWithContext(ctx context.Context) ConnectorMapOutput {
	return o
}

func (o ConnectorMapOutput) MapIndex(k pulumi.StringInput) ConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connector {
		return vs[0].(map[string]*Connector)[vs[1].(string)]
	}).(ConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorInput)(nil)).Elem(), &Connector{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorArrayInput)(nil)).Elem(), ConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorMapInput)(nil)).Elem(), ConnectorMap{})
	pulumi.RegisterOutputType(ConnectorOutput{})
	pulumi.RegisterOutputType(ConnectorArrayOutput{})
	pulumi.RegisterOutputType(ConnectorMapOutput{})
}
