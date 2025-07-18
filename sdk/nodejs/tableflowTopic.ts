// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ### Option #1: Manage multiple Tableflow Topics in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const example = new confluentcloud.TableflowTopic("example", {
 *     managedStorages: [{}],
 *     environment: {
 *         id: staging.id,
 *     },
 *     kafkaCluster: {
 *         id: stagingConfluentKafkaCluster.id,
 *     },
 *     displayName: orders.topicName,
 *     tableFormats: [
 *         "ICEBERG",
 *         "DELTA",
 *     ],
 *     credentials: {
 *         key: env_admin_tableflow_api_key.id,
 *         secret: env_admin_tableflow_api_key.secret,
 *     },
 * });
 * ```
 *
 * ### Option #2: Manage a single Tableflow Topic in the same Pulumi Stack
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const example = new confluentcloud.TableflowTopic("example", {
 *     environment: {
 *         id: staging.id,
 *     },
 *     kafkaCluster: {
 *         id: stagingConfluentKafkaCluster.id,
 *     },
 *     displayName: orders.topicName,
 *     byobAws: {
 *         bucketName: "bucket_1",
 *         providerIntegrationId: main.id,
 *     },
 * });
 * ```
 *
 * ## Getting Started
 *
 * The following end-to-end examples might help to get started with `confluentcloud.TableflowTopic` resource:
 * * confluent-managed-storage: Tableflow topic with Confluent-managed storage.
 * * byob-aws-storage: Tableflow topic with custom (BYOB AWS) storage.
 * * datagen-connector-byob-aws-storage: Datagen Source connector with a Tableflow topic with custom (BYOB AWS) storage.
 * * datagen-connector-confluent-managed-storage: Datagen Source connector with a Tableflow topic with Confluent-managed storage.
 *
 * ## Import
 *
 * You can import a Tableflow Topic by using the Tableflow Topic name, Environment ID, and Kafka Cluster ID, in the format `<Environment ID>/<Kafka Cluster ID>/<Tableflow Topic name>`, for example:
 *
 * Option #1: Manage multiple Tableflow Topics in the same Pulumi Stack
 *
 * $ export IMPORT_TABLEFLOW_API_KEY="<tableflow_api_key>"
 *
 * $ export IMPORT_TABLEFLOW_API_SECRET="<tableflow_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/tableflowTopic:TableflowTopic example env-abc123/lkc-abc123/orders
 * ```
 *
 * Option #2: Manage a single Tableflow Topic in the same Pulumi Stack
 *
 * ```sh
 * $ pulumi import confluentcloud:index/tableflowTopic:TableflowTopic example env-abc123/lkc-abc123/orders
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class TableflowTopic extends pulumi.CustomResource {
    /**
     * Get an existing TableflowTopic resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TableflowTopicState, opts?: pulumi.CustomResourceOptions): TableflowTopic {
        return new TableflowTopic(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/tableflowTopic:TableflowTopic';

    /**
     * Returns true if the given object is an instance of TableflowTopic.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TableflowTopic {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TableflowTopic.__pulumiType;
    }

    /**
     * supports the following (See [Quick Start with Custom Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-custom-storage-glue.html#cloud-tableflow-quick-start) for more details):
     */
    public readonly byobAws!: pulumi.Output<outputs.TableflowTopicByobAws | undefined>;
    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.TableflowTopicCredentials | undefined>;
    /**
     * The name of the Kafka topic for which Tableflow is enabled.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * (Optional Boolean) This flag determines whether to enable compaction for the Tableflow enabled topic.
     */
    public /*out*/ readonly enableCompaction!: pulumi.Output<boolean>;
    /**
     * (Optional Boolean) This flag determines whether to enable partitioning for the Tableflow enabled topic.
     */
    public /*out*/ readonly enablePartitioning!: pulumi.Output<boolean>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.TableflowTopicEnvironment>;
    public readonly kafkaCluster!: pulumi.Output<outputs.TableflowTopicKafkaCluster>;
    /**
     * The configuration of the Confluent managed storage. See [Quick Start with Managed Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-managed-storage.html#cloud-tableflow-quick-start-managed-storage) for more details.
     */
    public readonly managedStorages!: pulumi.Output<outputs.TableflowTopicManagedStorage[] | undefined>;
    /**
     * The strategy to handle record failures in the Tableflow enabled topic during materialization. Accepted values are `SKIP`, `SUSPEND`. For `SKIP`, we skip the bad records and move to the next record. For `SUSPEND`, we suspend the materialization of the topic.
     */
    public readonly recordFailureStrategy!: pulumi.Output<string>;
    /**
     * The max age of snapshots (Iceberg) or versions (Delta) (snapshot/version expiration) to keep on the table in milliseconds for the Tableflow enabled topic.
     */
    public readonly retentionMs!: pulumi.Output<string | undefined>;
    /**
     * (Optional Boolean) Indicates whether the Tableflow should be suspended.
     */
    public /*out*/ readonly suspended!: pulumi.Output<boolean>;
    /**
     * The supported table formats for the Tableflow-enabled topic. Accepted values are `DELTA`, `ICEBERG`.
     */
    public readonly tableFormats!: pulumi.Output<string[]>;

    /**
     * Create a TableflowTopic resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TableflowTopicArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TableflowTopicArgs | TableflowTopicState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TableflowTopicState | undefined;
            resourceInputs["byobAws"] = state ? state.byobAws : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["enableCompaction"] = state ? state.enableCompaction : undefined;
            resourceInputs["enablePartitioning"] = state ? state.enablePartitioning : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["kafkaCluster"] = state ? state.kafkaCluster : undefined;
            resourceInputs["managedStorages"] = state ? state.managedStorages : undefined;
            resourceInputs["recordFailureStrategy"] = state ? state.recordFailureStrategy : undefined;
            resourceInputs["retentionMs"] = state ? state.retentionMs : undefined;
            resourceInputs["suspended"] = state ? state.suspended : undefined;
            resourceInputs["tableFormats"] = state ? state.tableFormats : undefined;
        } else {
            const args = argsOrState as TableflowTopicArgs | undefined;
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.kafkaCluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kafkaCluster'");
            }
            resourceInputs["byobAws"] = args ? args.byobAws : undefined;
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["kafkaCluster"] = args ? args.kafkaCluster : undefined;
            resourceInputs["managedStorages"] = args ? args.managedStorages : undefined;
            resourceInputs["recordFailureStrategy"] = args ? args.recordFailureStrategy : undefined;
            resourceInputs["retentionMs"] = args ? args.retentionMs : undefined;
            resourceInputs["tableFormats"] = args ? args.tableFormats : undefined;
            resourceInputs["enableCompaction"] = undefined /*out*/;
            resourceInputs["enablePartitioning"] = undefined /*out*/;
            resourceInputs["suspended"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(TableflowTopic.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TableflowTopic resources.
 */
export interface TableflowTopicState {
    /**
     * supports the following (See [Quick Start with Custom Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-custom-storage-glue.html#cloud-tableflow-quick-start) for more details):
     */
    byobAws?: pulumi.Input<inputs.TableflowTopicByobAws>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.TableflowTopicCredentials>;
    /**
     * The name of the Kafka topic for which Tableflow is enabled.
     */
    displayName?: pulumi.Input<string>;
    /**
     * (Optional Boolean) This flag determines whether to enable compaction for the Tableflow enabled topic.
     */
    enableCompaction?: pulumi.Input<boolean>;
    /**
     * (Optional Boolean) This flag determines whether to enable partitioning for the Tableflow enabled topic.
     */
    enablePartitioning?: pulumi.Input<boolean>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.TableflowTopicEnvironment>;
    kafkaCluster?: pulumi.Input<inputs.TableflowTopicKafkaCluster>;
    /**
     * The configuration of the Confluent managed storage. See [Quick Start with Managed Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-managed-storage.html#cloud-tableflow-quick-start-managed-storage) for more details.
     */
    managedStorages?: pulumi.Input<pulumi.Input<inputs.TableflowTopicManagedStorage>[]>;
    /**
     * The strategy to handle record failures in the Tableflow enabled topic during materialization. Accepted values are `SKIP`, `SUSPEND`. For `SKIP`, we skip the bad records and move to the next record. For `SUSPEND`, we suspend the materialization of the topic.
     */
    recordFailureStrategy?: pulumi.Input<string>;
    /**
     * The max age of snapshots (Iceberg) or versions (Delta) (snapshot/version expiration) to keep on the table in milliseconds for the Tableflow enabled topic.
     */
    retentionMs?: pulumi.Input<string>;
    /**
     * (Optional Boolean) Indicates whether the Tableflow should be suspended.
     */
    suspended?: pulumi.Input<boolean>;
    /**
     * The supported table formats for the Tableflow-enabled topic. Accepted values are `DELTA`, `ICEBERG`.
     */
    tableFormats?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a TableflowTopic resource.
 */
export interface TableflowTopicArgs {
    /**
     * supports the following (See [Quick Start with Custom Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-custom-storage-glue.html#cloud-tableflow-quick-start) for more details):
     */
    byobAws?: pulumi.Input<inputs.TableflowTopicByobAws>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.TableflowTopicCredentials>;
    /**
     * The name of the Kafka topic for which Tableflow is enabled.
     */
    displayName: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.TableflowTopicEnvironment>;
    kafkaCluster: pulumi.Input<inputs.TableflowTopicKafkaCluster>;
    /**
     * The configuration of the Confluent managed storage. See [Quick Start with Managed Storage](https://docs.confluent.io/cloud/current/topics/tableflow/get-started/quick-start-managed-storage.html#cloud-tableflow-quick-start-managed-storage) for more details.
     */
    managedStorages?: pulumi.Input<pulumi.Input<inputs.TableflowTopicManagedStorage>[]>;
    /**
     * The strategy to handle record failures in the Tableflow enabled topic during materialization. Accepted values are `SKIP`, `SUSPEND`. For `SKIP`, we skip the bad records and move to the next record. For `SUSPEND`, we suspend the materialization of the topic.
     */
    recordFailureStrategy?: pulumi.Input<string>;
    /**
     * The max age of snapshots (Iceberg) or versions (Delta) (snapshot/version expiration) to keep on the table in milliseconds for the Tableflow enabled topic.
     */
    retentionMs?: pulumi.Input<string>;
    /**
     * The supported table formats for the Tableflow-enabled topic. Accepted values are `DELTA`, `ICEBERG`.
     */
    tableFormats?: pulumi.Input<pulumi.Input<string>[]>;
}
