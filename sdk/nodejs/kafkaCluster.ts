// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Kafka cluster by using Environment ID and Kafka cluster ID, in the format `<Environment ID>/<Kafka cluster ID>`, e.g. $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/kafkaCluster:KafkaCluster my_kafka env-abc123/lkc-abc123
 * ```
 *
 *  !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class KafkaCluster extends pulumi.CustomResource {
    /**
     * Get an existing KafkaCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KafkaClusterState, opts?: pulumi.CustomResourceOptions): KafkaCluster {
        return new KafkaCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/kafkaCluster:KafkaCluster';

    /**
     * Returns true if the given object is an instance of KafkaCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KafkaCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KafkaCluster.__pulumiType;
    }

    /**
     * (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
     */
    public /*out*/ readonly apiVersion!: pulumi.Output<string>;
    /**
     * The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
     */
    public readonly availability!: pulumi.Output<string>;
    /**
     * The configuration of the Basic Kafka cluster.
     */
    public readonly basic!: pulumi.Output<outputs.KafkaClusterBasic | undefined>;
    /**
     * (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     */
    public /*out*/ readonly bootstrapEndpoint!: pulumi.Output<string>;
    public readonly byokKey!: pulumi.Output<outputs.KafkaClusterByokKey>;
    /**
     * The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    public readonly cloud!: pulumi.Output<string>;
    /**
     * (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
     */
    public readonly dedicated!: pulumi.Output<outputs.KafkaClusterDedicated | undefined>;
    /**
     * The name of the Kafka cluster.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.KafkaClusterEnvironment>;
    /**
     * (Required String) A kind of the Kafka cluster, for example, `Cluster`.
     */
    public /*out*/ readonly kind!: pulumi.Output<string>;
    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     */
    public readonly network!: pulumi.Output<outputs.KafkaClusterNetwork>;
    /**
     * (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
     */
    public /*out*/ readonly rbacCrn!: pulumi.Output<string>;
    /**
     * The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    public /*out*/ readonly restEndpoint!: pulumi.Output<string>;
    /**
     * The configuration of the Standard Kafka cluster.
     */
    public readonly standard!: pulumi.Output<outputs.KafkaClusterStandard | undefined>;

    /**
     * Create a KafkaCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KafkaClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KafkaClusterArgs | KafkaClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KafkaClusterState | undefined;
            resourceInputs["apiVersion"] = state ? state.apiVersion : undefined;
            resourceInputs["availability"] = state ? state.availability : undefined;
            resourceInputs["basic"] = state ? state.basic : undefined;
            resourceInputs["bootstrapEndpoint"] = state ? state.bootstrapEndpoint : undefined;
            resourceInputs["byokKey"] = state ? state.byokKey : undefined;
            resourceInputs["cloud"] = state ? state.cloud : undefined;
            resourceInputs["dedicated"] = state ? state.dedicated : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["rbacCrn"] = state ? state.rbacCrn : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
            resourceInputs["standard"] = state ? state.standard : undefined;
        } else {
            const args = argsOrState as KafkaClusterArgs | undefined;
            if ((!args || args.availability === undefined) && !opts.urn) {
                throw new Error("Missing required property 'availability'");
            }
            if ((!args || args.cloud === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cloud'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["availability"] = args ? args.availability : undefined;
            resourceInputs["basic"] = args ? args.basic : undefined;
            resourceInputs["byokKey"] = args ? args.byokKey : undefined;
            resourceInputs["cloud"] = args ? args.cloud : undefined;
            resourceInputs["dedicated"] = args ? args.dedicated : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["standard"] = args ? args.standard : undefined;
            resourceInputs["apiVersion"] = undefined /*out*/;
            resourceInputs["bootstrapEndpoint"] = undefined /*out*/;
            resourceInputs["kind"] = undefined /*out*/;
            resourceInputs["rbacCrn"] = undefined /*out*/;
            resourceInputs["restEndpoint"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KafkaCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KafkaCluster resources.
 */
export interface KafkaClusterState {
    /**
     * (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
     */
    apiVersion?: pulumi.Input<string>;
    /**
     * The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
     */
    availability?: pulumi.Input<string>;
    /**
     * The configuration of the Basic Kafka cluster.
     */
    basic?: pulumi.Input<inputs.KafkaClusterBasic>;
    /**
     * (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     */
    bootstrapEndpoint?: pulumi.Input<string>;
    byokKey?: pulumi.Input<inputs.KafkaClusterByokKey>;
    /**
     * The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    cloud?: pulumi.Input<string>;
    /**
     * (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
     */
    dedicated?: pulumi.Input<inputs.KafkaClusterDedicated>;
    /**
     * The name of the Kafka cluster.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.KafkaClusterEnvironment>;
    /**
     * (Required String) A kind of the Kafka cluster, for example, `Cluster`.
     */
    kind?: pulumi.Input<string>;
    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     */
    network?: pulumi.Input<inputs.KafkaClusterNetwork>;
    /**
     * (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
     */
    rbacCrn?: pulumi.Input<string>;
    /**
     * The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     */
    region?: pulumi.Input<string>;
    /**
     * (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    /**
     * The configuration of the Standard Kafka cluster.
     */
    standard?: pulumi.Input<inputs.KafkaClusterStandard>;
}

/**
 * The set of arguments for constructing a KafkaCluster resource.
 */
export interface KafkaClusterArgs {
    /**
     * The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
     */
    availability: pulumi.Input<string>;
    /**
     * The configuration of the Basic Kafka cluster.
     */
    basic?: pulumi.Input<inputs.KafkaClusterBasic>;
    byokKey?: pulumi.Input<inputs.KafkaClusterByokKey>;
    /**
     * The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    cloud: pulumi.Input<string>;
    /**
     * (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
     */
    dedicated?: pulumi.Input<inputs.KafkaClusterDedicated>;
    /**
     * The name of the Kafka cluster.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.KafkaClusterEnvironment>;
    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     */
    network?: pulumi.Input<inputs.KafkaClusterNetwork>;
    /**
     * The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
     */
    region: pulumi.Input<string>;
    /**
     * The configuration of the Standard Kafka cluster.
     */
    standard?: pulumi.Input<inputs.KafkaClusterStandard>;
}
