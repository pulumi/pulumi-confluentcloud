// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Kafka clusters in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const orders = new confluentcloud.KafkaTopic("orders", {
 *     kafkaCluster: {
 *         id: basic_cluster.id,
 *     },
 *     topicName: "orders",
 *     restEndpoint: basic_cluster.restEndpoint,
 *     credentials: {
 *         key: app_manager_kafka_api_key.id,
 *         secret: app_manager_kafka_api_key.secret,
 *     },
 * });
 * ```
 *
 * ### Option #2: Manage a single Kafka cluster in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const orders = new confluentcloud.KafkaTopic("orders", {topicName: "orders"});
 * ```
 *
 * ## Getting Started
 *
 * The following end-to-end examples might help to get started with `confluentcloud.KafkaTopic` resource:
 *   * basic-kafka-acls: _Basic_ Kafka cluster with authorization using ACLs
 *   * basic-kafka-acls-with-alias: _Basic_ Kafka cluster with authorization using ACLs
 *   * standard-kafka-acls: _Standard_ Kafka cluster with authorization using ACLs
 *   * standard-kafka-rbac: _Standard_ Kafka cluster with authorization using RBAC
 *   * dedicated-public-kafka-acls: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using ACLs
 *   * dedicated-public-kafka-rbac: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using RBAC
 *   * dedicated-privatelink-aws-kafka-acls: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
 *   * dedicated-privatelink-aws-kafka-rbac: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
 *   * dedicated-privatelink-azure-kafka-rbac: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
 *   * dedicated-privatelink-azure-kafka-acls: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
 *   * dedicated-private-service-connect-gcp-kafka-acls: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
 *   * dedicated-private-service-connect-gcp-kafka-rbac: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC
 *   * dedicated-vnet-peering-azure-kafka-acls: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using ACLs
 *   * dedicated-vnet-peering-azure-kafka-rbac: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using RBAC
 *   * dedicated-vpc-peering-aws-kafka-acls: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using ACLs
 *   * dedicated-vpc-peering-aws-kafka-rbac: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using RBAC
 *   * dedicated-vpc-peering-gcp-kafka-acls: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using ACLs
 *   * dedicated-vpc-peering-gcp-kafka-rbac: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using RBAC
 *   * dedicated-transit-gateway-attachment-aws-kafka-acls: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
 *   * dedicated-transit-gateway-attachment-aws-kafka-rbac: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using RBAC
 *   * enterprise-privatelinkattachment-aws-kafka-acls: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
 *
 * ## Import
 *
 * You can import a Kafka topic by using the Kafka cluster ID and Kafka topic name in the format `<Kafka cluster ID>/<Kafka topic name>`, for example:
 *
 * Option #1: Manage multiple Kafka clusters in the same Pulumi Stack
 *
 * $ export IMPORT_KAFKA_API_KEY="<kafka_api_key>"
 *
 * $ export IMPORT_KAFKA_API_SECRET="<kafka_api_secret>"
 *
 * $ export IMPORT_KAFKA_REST_ENDPOINT="<kafka_rest_endpoint>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/kafkaTopic:KafkaTopic my_topic lkc-abc123/orders-123
 * ```
 *
 * Option #2: Manage a single Kafka cluster in the same Pulumi Stack
 *
 * ```sh
 * $ pulumi import confluentcloud:index/kafkaTopic:KafkaTopic my_topic lkc-abc123/orders-123
 * ```
 *
 * resource "confluent_kafka_topic" "orders" {
 *
 *   kafka_cluster {
 *
 *     id = confluent_kafka_cluster.basic-cluster.id
 *
 *   }
 *
 *   topic_name         = "orders"
 *
 *   partitions_count   = 4
 *
 *   rest_endpoint      = confluent_kafka_cluster.basic-cluster.rest_endpoint
 *
 * # https://docs.confluent.io/cloud/current/client-apps/topics/manage.html#ak-topic-configurations-for-all-ccloud-cluster-types
 *
 *   config = {
 *
 *     "cleanup.policy"                      = "delete"
 *     
 *     "delete.retention.ms"                 = "86400000"
 *     
 *     "max.compaction.lag.ms"               = "9223372036854775807"
 *     
 *     "max.message.bytes"                   = "2097164"
 *     
 *     "message.timestamp.after.max.ms"      = "9223372036854775807"
 *     
 *     "message.timestamp.before.max.ms"     = "9223372036854775807"      
 *     
 *     "message.timestamp.difference.max.ms" = "9223372036854775807"
 *     
 *     "message.timestamp.type"              = "CreateTime"
 *     
 *     "min.compaction.lag.ms"               = "0"
 *     
 *     "min.insync.replicas"                 = "2"
 *     
 *     "retention.bytes"                     = "-1"
 *     
 *     "retention.ms"                        = "604800000"
 *     
 *     "segment.bytes"                       = "104857600"
 *     
 *     "segment.ms"                          = "604800000"
 *
 *   }
 *
 *   credentials {
 *
 *     key    = confluent_api_key.app-manager-kafka-api-key.id
 *     
 *     secret = confluent_api_key.app-manager-kafka-api-key.secret
 *
 *   }
 *
 * }
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class KafkaTopic extends pulumi.CustomResource {
    /**
     * Get an existing KafkaTopic resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KafkaTopicState, opts?: pulumi.CustomResourceOptions): KafkaTopic {
        return new KafkaTopic(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/kafkaTopic:KafkaTopic';

    /**
     * Returns true if the given object is an instance of KafkaTopic.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KafkaTopic {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KafkaTopic.__pulumiType;
    }

    /**
     * The custom topic settings to set:
     */
    public readonly config!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.KafkaTopicCredentials | undefined>;
    /**
     * @deprecated This property has been deprecated. Please use "restEndpoint" instead.
     */
    public readonly httpEndpoint!: pulumi.Output<string>;
    public readonly kafkaCluster!: pulumi.Output<outputs.KafkaTopicKafkaCluster | undefined>;
    /**
     * The number of partitions to create in the topic. Defaults to `6`.
     */
    public readonly partitionsCount!: pulumi.Output<number | undefined>;
    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    public readonly restEndpoint!: pulumi.Output<string | undefined>;
    /**
     * The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
     */
    public readonly topicName!: pulumi.Output<string>;

    /**
     * Create a KafkaTopic resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KafkaTopicArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KafkaTopicArgs | KafkaTopicState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KafkaTopicState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["httpEndpoint"] = state ? state.httpEndpoint : undefined;
            resourceInputs["kafkaCluster"] = state ? state.kafkaCluster : undefined;
            resourceInputs["partitionsCount"] = state ? state.partitionsCount : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
            resourceInputs["topicName"] = state ? state.topicName : undefined;
        } else {
            const args = argsOrState as KafkaTopicArgs | undefined;
            if ((!args || args.topicName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'topicName'");
            }
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["httpEndpoint"] = args ? args.httpEndpoint : undefined;
            resourceInputs["kafkaCluster"] = args ? args.kafkaCluster : undefined;
            resourceInputs["partitionsCount"] = args ? args.partitionsCount : undefined;
            resourceInputs["restEndpoint"] = args ? args.restEndpoint : undefined;
            resourceInputs["topicName"] = args ? args.topicName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(KafkaTopic.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KafkaTopic resources.
 */
export interface KafkaTopicState {
    /**
     * The custom topic settings to set:
     */
    config?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.KafkaTopicCredentials>;
    /**
     * @deprecated This property has been deprecated. Please use "restEndpoint" instead.
     */
    httpEndpoint?: pulumi.Input<string>;
    kafkaCluster?: pulumi.Input<inputs.KafkaTopicKafkaCluster>;
    /**
     * The number of partitions to create in the topic. Defaults to `6`.
     */
    partitionsCount?: pulumi.Input<number>;
    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    /**
     * The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
     */
    topicName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a KafkaTopic resource.
 */
export interface KafkaTopicArgs {
    /**
     * The custom topic settings to set:
     */
    config?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.KafkaTopicCredentials>;
    /**
     * @deprecated This property has been deprecated. Please use "restEndpoint" instead.
     */
    httpEndpoint?: pulumi.Input<string>;
    kafkaCluster?: pulumi.Input<inputs.KafkaTopicKafkaCluster>;
    /**
     * The number of partitions to create in the topic. Defaults to `6`.
     */
    partitionsCount?: pulumi.Input<number>;
    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    /**
     * The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
     */
    topicName: pulumi.Input<string>;
}
