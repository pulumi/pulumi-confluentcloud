// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Kafka cluster config by using the Kafka cluster ID, for example:
 *
 * Option #1: Manage multiple Kafka clusters in the same Terraform workspace
 *
 * $ export IMPORT_KAFKA_API_KEY="<kafka_api_key>"
 *
 * $ export IMPORT_KAFKA_API_SECRET="<kafka_api_secret>"
 *
 * $ export IMPORT_KAFKA_REST_ENDPOINT="<kafka_rest_endpoint>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig test lkc-abc123
 * ```
 *
 * Option #2: Manage a single Kafka cluster in the same Terraform workspace
 *
 * ```sh
 * $ pulumi import confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig test lkc-abc123
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class KafkaClusterConfig extends pulumi.CustomResource {
    /**
     * Get an existing KafkaClusterConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KafkaClusterConfigState, opts?: pulumi.CustomResourceOptions): KafkaClusterConfig {
        return new KafkaClusterConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig';

    /**
     * Returns true if the given object is an instance of KafkaClusterConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KafkaClusterConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KafkaClusterConfig.__pulumiType;
    }

    /**
     * The custom cluster settings to set:
     */
    public readonly config!: pulumi.Output<{[key: string]: string}>;
    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.KafkaClusterConfigCredentials | undefined>;
    public readonly kafkaCluster!: pulumi.Output<outputs.KafkaClusterConfigKafkaCluster | undefined>;
    /**
     * The REST endpoint of the Dedicated Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    public readonly restEndpoint!: pulumi.Output<string | undefined>;

    /**
     * Create a KafkaClusterConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KafkaClusterConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KafkaClusterConfigArgs | KafkaClusterConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KafkaClusterConfigState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["kafkaCluster"] = state ? state.kafkaCluster : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
        } else {
            const args = argsOrState as KafkaClusterConfigArgs | undefined;
            if ((!args || args.config === undefined) && !opts.urn) {
                throw new Error("Missing required property 'config'");
            }
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["kafkaCluster"] = args ? args.kafkaCluster : undefined;
            resourceInputs["restEndpoint"] = args ? args.restEndpoint : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(KafkaClusterConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KafkaClusterConfig resources.
 */
export interface KafkaClusterConfigState {
    /**
     * The custom cluster settings to set:
     */
    config?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.KafkaClusterConfigCredentials>;
    kafkaCluster?: pulumi.Input<inputs.KafkaClusterConfigKafkaCluster>;
    /**
     * The REST endpoint of the Dedicated Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a KafkaClusterConfig resource.
 */
export interface KafkaClusterConfigArgs {
    /**
     * The custom cluster settings to set:
     */
    config: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.KafkaClusterConfigCredentials>;
    kafkaCluster?: pulumi.Input<inputs.KafkaClusterConfigKafkaCluster>;
    /**
     * The REST endpoint of the Dedicated Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
}