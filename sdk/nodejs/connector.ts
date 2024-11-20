// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ### Example Managed [Datagen Source Connector](https://docs.confluent.io/cloud/current/connectors/cc-datagen-source.html) that uses a service account to communicate with your Kafka cluster
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * // https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/configurations/connectors/managed-datagen-source-connector
 * const source = new confluentcloud.Connector("source", {
 *     environment: {
 *         id: staging.id,
 *     },
 *     kafkaCluster: {
 *         id: basic.id,
 *     },
 *     configSensitive: {},
 *     configNonsensitive: {
 *         "connector.class": "DatagenSource",
 *         name: "DatagenSourceConnector_0",
 *         "kafka.auth.mode": "SERVICE_ACCOUNT",
 *         "kafka.service.account.id": app_connector.id,
 *         "kafka.topic": orders.topicName,
 *         "output.data.format": "JSON",
 *         quickstart: "ORDERS",
 *         "tasks.max": "1",
 *     },
 * }, {
 *     dependsOn: [
 *         app_connector_describe_on_cluster,
 *         app_connector_write_on_target_topic,
 *         app_connector_create_on_data_preview_topics,
 *         app_connector_write_on_data_preview_topics,
 *     ],
 * });
 * ```
 *
 * ### Example Managed [Amazon S3 Sink Connector](https://docs.confluent.io/cloud/current/connectors/cc-s3-sink.html) that uses a service account to communicate with your Kafka cluster
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * // https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/configurations/connectors/s3-sink-connector
 * const sink = new confluentcloud.Connector("sink", {
 *     environment: {
 *         id: staging.id,
 *     },
 *     kafkaCluster: {
 *         id: basic.id,
 *     },
 *     configSensitive: {
 *         "aws.access.key.id": "***REDACTED***",
 *         "aws.secret.access.key": "***REDACTED***",
 *     },
 *     configNonsensitive: {
 *         topics: orders.topicName,
 *         "input.data.format": "JSON",
 *         "connector.class": "S3_SINK",
 *         name: "S3_SINKConnector_0",
 *         "kafka.auth.mode": "SERVICE_ACCOUNT",
 *         "kafka.service.account.id": app_connector.id,
 *         "s3.bucket.name": "<s3-bucket-name>",
 *         "output.data.format": "JSON",
 *         "time.interval": "DAILY",
 *         "flush.size": "1000",
 *         "tasks.max": "1",
 *     },
 * }, {
 *     dependsOn: [
 *         app_connector_describe_on_cluster,
 *         app_connector_read_on_target_topic,
 *         app_connector_create_on_dlq_lcc_topics,
 *         app_connector_write_on_dlq_lcc_topics,
 *         app_connector_create_on_success_lcc_topics,
 *         app_connector_write_on_success_lcc_topics,
 *         app_connector_create_on_error_lcc_topics,
 *         app_connector_write_on_error_lcc_topics,
 *         app_connector_read_on_connect_lcc_group,
 *     ],
 * });
 * ```
 *
 * ### Example Managed [Amazon S3 Sink Connector](https://docs.confluent.io/cloud/current/connectors/cc-s3-sink.html) that uses a service account to communicate with your Kafka cluster and IAM Roles for AWS authentication
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * // https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/configurations/connectors/s3-sink-connector-assume-role
 * const sink = new confluentcloud.Connector("sink", {
 *     environment: {
 *         id: staging.id,
 *     },
 *     kafkaCluster: {
 *         id: basic.id,
 *     },
 *     configSensitive: {},
 *     configNonsensitive: {
 *         topics: orders.topicName,
 *         "input.data.format": "JSON",
 *         "connector.class": "S3_SINK",
 *         name: "S3_SINKConnector_0",
 *         "kafka.auth.mode": "SERVICE_ACCOUNT",
 *         "kafka.service.account.id": app_connector.id,
 *         "s3.bucket.name": "<s3-bucket-name>",
 *         "output.data.format": "JSON",
 *         "time.interval": "DAILY",
 *         "flush.size": "1000",
 *         "tasks.max": "1",
 *         "authentication.method": "IAM Roles",
 *         "provider.integration.id": main.id,
 *     },
 * }, {
 *     dependsOn: [
 *         app_connector_describe_on_cluster,
 *         app_connector_read_on_target_topic,
 *         app_connector_create_on_dlq_lcc_topics,
 *         app_connector_write_on_dlq_lcc_topics,
 *         app_connector_create_on_success_lcc_topics,
 *         app_connector_write_on_success_lcc_topics,
 *         app_connector_create_on_error_lcc_topics,
 *         app_connector_write_on_error_lcc_topics,
 *         app_connector_read_on_connect_lcc_group,
 *         main,
 *         s3AccessRole,
 *     ],
 * });
 * ```
 *
 * ### Example Managed [Amazon DynamoDB Connector](https://docs.confluent.io/cloud/current/connectors/cc-amazon-dynamo-db-sink.html) that uses a service account to communicate with your Kafka cluster
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * // https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/configurations/connectors/dynamo-db-sink-connector
 * const sink = new confluentcloud.Connector("sink", {
 *     environment: {
 *         id: staging.id,
 *     },
 *     kafkaCluster: {
 *         id: basic.id,
 *     },
 *     configSensitive: {
 *         "aws.access.key.id": "***REDACTED***",
 *         "aws.secret.access.key": "***REDACTED***",
 *     },
 *     configNonsensitive: {
 *         topics: orders.topicName,
 *         "input.data.format": "JSON",
 *         "connector.class": "DynamoDbSink",
 *         name: "DynamoDbSinkConnector_0",
 *         "kafka.auth.mode": "SERVICE_ACCOUNT",
 *         "kafka.service.account.id": app_connector.id,
 *         "aws.dynamodb.pk.hash": "value.userid",
 *         "aws.dynamodb.pk.sort": "value.pageid",
 *         "tasks.max": "1",
 *     },
 * }, {
 *     dependsOn: [
 *         app_connector_describe_on_cluster,
 *         app_connector_read_on_target_topic,
 *         app_connector_create_on_dlq_lcc_topics,
 *         app_connector_write_on_dlq_lcc_topics,
 *         app_connector_create_on_success_lcc_topics,
 *         app_connector_write_on_success_lcc_topics,
 *         app_connector_create_on_error_lcc_topics,
 *         app_connector_write_on_error_lcc_topics,
 *         app_connector_read_on_connect_lcc_group,
 *     ],
 * });
 * ```
 *
 * ### Example Custom [Datagen Source Connector](https://www.confluent.io/hub/confluentinc/kafka-connect-datagen) that uses a Kafka API Key to communicate with your Kafka cluster
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * // https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/configurations/connectors/custom-datagen-source-connector
 * const source = new confluentcloud.Connector("source", {
 *     environment: {
 *         id: staging.id,
 *     },
 *     kafkaCluster: {
 *         id: basic.id,
 *     },
 *     configSensitive: {
 *         "kafka.api.key": "***REDACTED***",
 *         "kafka.api.secret": "***REDACTED***",
 *     },
 *     configNonsensitive: {
 *         "confluent.connector.type": "CUSTOM",
 *         "connector.class": sourceConfluentCustomConnectorPlugin.connectorClass,
 *         name: "DatagenConnectorExampleName",
 *         "kafka.auth.mode": "KAFKA_API_KEY",
 *         "kafka.topic": orders.topicName,
 *         "output.data.format": "JSON",
 *         quickstart: "ORDERS",
 *         "confluent.custom.plugin.id": sourceConfluentCustomConnectorPlugin.id,
 *         "min.interval": "1000",
 *         "max.interval": "2000",
 *         "tasks.max": "1",
 *     },
 * }, {
 *     dependsOn: [app_manager_kafka_cluster_admin],
 * });
 * ```
 *
 * ## Getting Started
 *
 * The following end-to-end examples might help to get started with `confluentcloud.Connector` resource:
 * * `s3-sink-connector`
 * * `s3-sink-connector-assume-role`
 * * `snowflake-sink-connector`
 * * `managed-datagen-source-connector`
 * * `elasticsearch-sink-connector`
 * * `dynamo-db-sink-connector`
 * * `mongo-db-source-connector`
 * * `mongo-db-sink-connector`
 * * `sql-server-cdc-debezium-source-connector`
 * * `postgre-sql-cdc-debezium-source-connector`
 * * `custom-datagen-source-connector`
 *
 * > **Note:** Certain connectors require additional ACL entries. See [Additional ACL entries](https://docs.confluent.io/cloud/current/connectors/service-account.html#additional-acl-entries) for more details.
 *
 * ## Import
 *
 * You can import a connector by using Environment ID, Kafka cluster ID, and connector's name, in the format `<Environment ID>/<Kafka cluster ID>/<Connector name>`, for example:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/connector:Connector my_connector "env-abc123/lkc-abc123/S3_SINKConnector_0"
 * ```
 */
export class Connector extends pulumi.CustomResource {
    /**
     * Get an existing Connector resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectorState, opts?: pulumi.CustomResourceOptions): Connector {
        return new Connector(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/connector:Connector';

    /**
     * Returns true if the given object is an instance of Connector.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connector {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connector.__pulumiType;
    }

    /**
     * Block for custom *nonsensitive* configuration properties that are *not* labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
     */
    public readonly configNonsensitive!: pulumi.Output<{[key: string]: string}>;
    /**
     * Block for custom *sensitive* configuration properties that are labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
     */
    public readonly configSensitive!: pulumi.Output<{[key: string]: string}>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.ConnectorEnvironment>;
    public readonly kafkaCluster!: pulumi.Output<outputs.ConnectorKafkaCluster>;
    /**
     * The status of the connector (one of `"NONE"`, `"PROVISIONING"`, `"RUNNING"`, `"DEGRADED"`, `"FAILED"`, `"PAUSED"`, `"DELETED"`). Pausing (`"RUNNING" > "PAUSED"`) and resuming (`"PAUSED" > "RUNNING"`) a connector is supported via an update operation.
     *
     * > **Note:** If there are no _sensitive_ configuration settings for your connector, set `configSensitive = {}` explicitly.
     *
     * > **Note:** You may declare sensitive variables for secrets `configSensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id="foo"`).
     */
    public readonly status!: pulumi.Output<string>;

    /**
     * Create a Connector resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectorArgs | ConnectorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectorState | undefined;
            resourceInputs["configNonsensitive"] = state ? state.configNonsensitive : undefined;
            resourceInputs["configSensitive"] = state ? state.configSensitive : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["kafkaCluster"] = state ? state.kafkaCluster : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as ConnectorArgs | undefined;
            if ((!args || args.configNonsensitive === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configNonsensitive'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.kafkaCluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kafkaCluster'");
            }
            resourceInputs["configNonsensitive"] = args ? args.configNonsensitive : undefined;
            resourceInputs["configSensitive"] = args?.configSensitive ? pulumi.secret(args.configSensitive) : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["kafkaCluster"] = args ? args.kafkaCluster : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["configSensitive"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Connector.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connector resources.
 */
export interface ConnectorState {
    /**
     * Block for custom *nonsensitive* configuration properties that are *not* labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
     */
    configNonsensitive?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Block for custom *sensitive* configuration properties that are labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
     */
    configSensitive?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.ConnectorEnvironment>;
    kafkaCluster?: pulumi.Input<inputs.ConnectorKafkaCluster>;
    /**
     * The status of the connector (one of `"NONE"`, `"PROVISIONING"`, `"RUNNING"`, `"DEGRADED"`, `"FAILED"`, `"PAUSED"`, `"DELETED"`). Pausing (`"RUNNING" > "PAUSED"`) and resuming (`"PAUSED" > "RUNNING"`) a connector is supported via an update operation.
     *
     * > **Note:** If there are no _sensitive_ configuration settings for your connector, set `configSensitive = {}` explicitly.
     *
     * > **Note:** You may declare sensitive variables for secrets `configSensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id="foo"`).
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Connector resource.
 */
export interface ConnectorArgs {
    /**
     * Block for custom *nonsensitive* configuration properties that are *not* labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
     */
    configNonsensitive: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Block for custom *sensitive* configuration properties that are labelled with "Type: password" under "Configuration Properties" section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
     */
    configSensitive?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.ConnectorEnvironment>;
    kafkaCluster: pulumi.Input<inputs.ConnectorKafkaCluster>;
    /**
     * The status of the connector (one of `"NONE"`, `"PROVISIONING"`, `"RUNNING"`, `"DEGRADED"`, `"FAILED"`, `"PAUSED"`, `"DELETED"`). Pausing (`"RUNNING" > "PAUSED"`) and resuming (`"PAUSED" > "RUNNING"`) a connector is supported via an update operation.
     *
     * > **Note:** If there are no _sensitive_ configuration settings for your connector, set `configSensitive = {}` explicitly.
     *
     * > **Note:** You may declare sensitive variables for secrets `configSensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id="foo"`).
     */
    status?: pulumi.Input<string>;
}
