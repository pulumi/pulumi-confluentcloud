// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * // https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/cluster-links-cc.html#create-a-cluster-link-in-bidirectional-mode
 * const east_to_west = new confluentcloud.ClusterLink("east-to-west", {
 *     linkMode: "BIDIRECTIONAL",
 *     localKafkaCluster: {
 *         id: data.confluent_kafka_cluster.east.id,
 *         restEndpoint: data.confluent_kafka_cluster.east.rest_endpoint,
 *         credentials: {
 *             key: confluent_api_key["app-manager-east-cluster-api-key"].id,
 *             secret: confluent_api_key["app-manager-east-cluster-api-key"].secret,
 *         },
 *     },
 *     remoteKafkaCluster: {
 *         id: data.confluent_kafka_cluster.west.id,
 *         bootstrapEndpoint: data.confluent_kafka_cluster.west.bootstrap_endpoint,
 *         credentials: {
 *             key: confluent_api_key["app-manager-west-cluster-api-key"].id,
 *             secret: confluent_api_key["app-manager-west-cluster-api-key"].secret,
 *         },
 *     },
 * });
 * const west_to_east = new confluentcloud.ClusterLink("west-to-east", {
 *     linkMode: "BIDIRECTIONAL",
 *     localKafkaCluster: {
 *         id: data.confluent_kafka_cluster.west.id,
 *         restEndpoint: data.confluent_kafka_cluster.west.rest_endpoint,
 *         credentials: {
 *             key: confluent_api_key["app-manager-west-cluster-api-key"].id,
 *             secret: confluent_api_key["app-manager-west-cluster-api-key"].secret,
 *         },
 *     },
 *     remoteKafkaCluster: {
 *         id: data.confluent_kafka_cluster.east.id,
 *         bootstrapEndpoint: data.confluent_kafka_cluster.east.bootstrap_endpoint,
 *         credentials: {
 *             key: confluent_api_key["app-manager-east-cluster-api-key"].id,
 *             secret: confluent_api_key["app-manager-east-cluster-api-key"].secret,
 *         },
 *     },
 * });
 * ```
 * ## Getting Started
 *
 * The following end-to-end examples might help to get started with `confluentcloud.ClusterLink` resource:
 *   * `destination-initiated-cluster-link-rbac`: An example of setting up a _destination_ initiated cluster link with a mirror topic
 *   * `source-initiated-cluster-link-rbac`: An example of setting up a _source_ initiated cluster link with a mirror topic
 *   * `regular-bidirectional-cluster-link-rbac`: An example of setting up a bidirectional cluster link with 2 mirror topics
 *   * `advanced-bidirectional-cluster-link-rbac`: An example of setting up a bidirectional cluster link with 2 mirror topics ([advanced option](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/cluster-links-cc.html#create-a-cluster-link-in-bidirectional-mode))
 *
 * See [Cluster Linking on Confluent Cloud](https://docs.confluent.io/cloud/current/multi-cloud/cluster-linking/index.html) to learn more about Cluster Linking on Confluent Cloud.
 *
 * ## Import
 *
 * You can import a Kafka mirror topic by using the cluster link name, cluster link mode, cluster link connection mode, source (or local for bidirectional cluster links) Kafka cluster ID, and destination (or remote
 *
 * for bidirectional cluster links) Kafka cluster ID, in the format `<Cluster link name>/<Cluster link mode>/<Cluster connection mode>/<Source (Local) Kafka cluster ID>/<Destination (Remote) Kafka cluster ID>`, for exampleOption #1 when using source-initiated or destination-initiated cluster links $ export IMPORT_SOURCE_KAFKA_BOOTSTRAP_ENDPOINT="<source_kafka_bootstrap_endpoint>" $ export IMPORT_SOURCE_KAFKA_API_KEY="<source_kafka_api_key>" $ export IMPORT_SOURCE_KAFKA_API_SECRET="<source_kafka_api_secret>" $ export IMPORT_DESTINATION_KAFKA_REST_ENDPOINT="<destination_kafka_rest_endpoint>" $ export IMPORT_DESTINATION_KAFKA_API_KEY="<destination_kafka_api_key>" $ export IMPORT_DESTINATION_KAFKA_API_SECRET="<destination_kafka_api_secret>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/clusterLink:ClusterLink my_cluster_link my-cluster-link/DESTINATION/OUTBOUND/lkc-abc123/lkc-xyz456
 * ```
 *
 *  Option #2 when using bidirectional cluster links $ export IMPORT_LOCAL_KAFKA_BOOTSTRAP_ENDPOINT="<local_kafka_bootstrap_endpoint>" $ export IMPORT_LOCAL_KAFKA_API_KEY="<local_kafka_api_key>" $ export IMPORT_LOCAL_KAFKA_API_SECRET="<local_kafka_api_secret>" $ export IMPORT_REMOTE_KAFKA_REST_ENDPOINT="<remote_kafka_rest_endpoint>" $ export IMPORT_REMOTE_KAFKA_API_KEY="<remote_kafka_api_key>" $ export IMPORT_REMOTE_KAFKA_API_SECRET="<remote_kafka_api_secret>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/clusterLink:ClusterLink my_cluster_link my-cluster-link/BIDIRECTIONAL/OUTBOUND/lkc-abc123/lkc-xyz456
 * ```
 *
 *  !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class ClusterLink extends pulumi.CustomResource {
    /**
     * Get an existing ClusterLink resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterLinkState, opts?: pulumi.CustomResourceOptions): ClusterLink {
        return new ClusterLink(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/clusterLink:ClusterLink';

    /**
     * Returns true if the given object is an instance of ClusterLink.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClusterLink {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClusterLink.__pulumiType;
    }

    /**
     * The custom cluster link settings to set:
     */
    public readonly config!: pulumi.Output<{[key: string]: string}>;
    /**
     * The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
     */
    public readonly connectionMode!: pulumi.Output<string | undefined>;
    public readonly destinationKafkaCluster!: pulumi.Output<outputs.ClusterLinkDestinationKafkaCluster | undefined>;
    /**
     * The name of the cluster link, for example, `my-cluster-link`.
     */
    public readonly link!: pulumi.Output<string>;
    /**
     * The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
     */
    public readonly linkMode!: pulumi.Output<string | undefined>;
    public readonly localKafkaCluster!: pulumi.Output<outputs.ClusterLinkLocalKafkaCluster | undefined>;
    public readonly remoteKafkaCluster!: pulumi.Output<outputs.ClusterLinkRemoteKafkaCluster | undefined>;
    public readonly sourceKafkaCluster!: pulumi.Output<outputs.ClusterLinkSourceKafkaCluster | undefined>;

    /**
     * Create a ClusterLink resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ClusterLinkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterLinkArgs | ClusterLinkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterLinkState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["connectionMode"] = state ? state.connectionMode : undefined;
            resourceInputs["destinationKafkaCluster"] = state ? state.destinationKafkaCluster : undefined;
            resourceInputs["link"] = state ? state.link : undefined;
            resourceInputs["linkMode"] = state ? state.linkMode : undefined;
            resourceInputs["localKafkaCluster"] = state ? state.localKafkaCluster : undefined;
            resourceInputs["remoteKafkaCluster"] = state ? state.remoteKafkaCluster : undefined;
            resourceInputs["sourceKafkaCluster"] = state ? state.sourceKafkaCluster : undefined;
        } else {
            const args = argsOrState as ClusterLinkArgs | undefined;
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["connectionMode"] = args ? args.connectionMode : undefined;
            resourceInputs["destinationKafkaCluster"] = args ? args.destinationKafkaCluster : undefined;
            resourceInputs["link"] = args ? args.link : undefined;
            resourceInputs["linkMode"] = args ? args.linkMode : undefined;
            resourceInputs["localKafkaCluster"] = args ? args.localKafkaCluster : undefined;
            resourceInputs["remoteKafkaCluster"] = args ? args.remoteKafkaCluster : undefined;
            resourceInputs["sourceKafkaCluster"] = args ? args.sourceKafkaCluster : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClusterLink.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClusterLink resources.
 */
export interface ClusterLinkState {
    /**
     * The custom cluster link settings to set:
     */
    config?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
     */
    connectionMode?: pulumi.Input<string>;
    destinationKafkaCluster?: pulumi.Input<inputs.ClusterLinkDestinationKafkaCluster>;
    /**
     * The name of the cluster link, for example, `my-cluster-link`.
     */
    link?: pulumi.Input<string>;
    /**
     * The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
     */
    linkMode?: pulumi.Input<string>;
    localKafkaCluster?: pulumi.Input<inputs.ClusterLinkLocalKafkaCluster>;
    remoteKafkaCluster?: pulumi.Input<inputs.ClusterLinkRemoteKafkaCluster>;
    sourceKafkaCluster?: pulumi.Input<inputs.ClusterLinkSourceKafkaCluster>;
}

/**
 * The set of arguments for constructing a ClusterLink resource.
 */
export interface ClusterLinkArgs {
    /**
     * The custom cluster link settings to set:
     */
    config?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
     */
    connectionMode?: pulumi.Input<string>;
    destinationKafkaCluster?: pulumi.Input<inputs.ClusterLinkDestinationKafkaCluster>;
    /**
     * The name of the cluster link, for example, `my-cluster-link`.
     */
    link?: pulumi.Input<string>;
    /**
     * The mode of the cluster link. The supported values are `"DESTINATION"`, `"SOURCE"`, and `"BIDIRECTIONAL"`. Defaults to `"DESTINATION"`.
     */
    linkMode?: pulumi.Input<string>;
    localKafkaCluster?: pulumi.Input<inputs.ClusterLinkLocalKafkaCluster>;
    remoteKafkaCluster?: pulumi.Input<inputs.ClusterLinkRemoteKafkaCluster>;
    sourceKafkaCluster?: pulumi.Input<inputs.ClusterLinkSourceKafkaCluster>;
}
