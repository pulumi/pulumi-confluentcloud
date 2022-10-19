// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Kafka mirror topic by using the cluster link name, cluster link mode, cluster link connection mode, source Kafka cluster ID, and destination Kafka cluster ID, in the format `<Cluster link name>/<Cluster link mode>/<Cluster connection mode>/<Source Kafka cluster ID>/<Destination Kafka cluster ID>`, for example$ export IMPORT_SOURCE_KAFKA_BOOTSTRAP_ENDPOINT="<source_kafka_bootstrap_endpoint>" $ export IMPORT_SOURCE_KAFKA_API_KEY="<source_kafka_api_key>" $ export IMPORT_SOURCE_KAFKA_API_SECRET="<source_kafka_api_secret>" $ export IMPORT_DESTINATION_KAFKA_REST_ENDPOINT="<destination_kafka_rest_endpoint>" $ export IMPORT_DESTINATION_KAFKA_API_KEY="<destination_kafka_api_key>" $ export IMPORT_DESTINATION_KAFKA_API_SECRET="<destination_kafka_api_secret>"
 *
 * ```sh
 *  $ pulumi import confluentcloud:index/clusterLink:ClusterLink my_cluster_link my-cluster-link/DESTINATION/OUTBOUND/lkc-abc123/lkc-xyz456
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
     * The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
     */
    public readonly connectionMode!: pulumi.Output<string | undefined>;
    public readonly destinationKafkaCluster!: pulumi.Output<outputs.ClusterLinkDestinationKafkaCluster>;
    /**
     * The name of the cluster link, for example, `my-cluster-link`.
     */
    public readonly link!: pulumi.Output<string>;
    /**
     * The mode of the cluster link. The supported values are `"DESTINATION"` and `"SOURCE"`. Defaults to `"DESTINATION"`.
     */
    public readonly linkMode!: pulumi.Output<string | undefined>;
    public readonly sourceKafkaCluster!: pulumi.Output<outputs.ClusterLinkSourceKafkaCluster>;

    /**
     * Create a ClusterLink resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterLinkArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterLinkArgs | ClusterLinkState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterLinkState | undefined;
            resourceInputs["connectionMode"] = state ? state.connectionMode : undefined;
            resourceInputs["destinationKafkaCluster"] = state ? state.destinationKafkaCluster : undefined;
            resourceInputs["link"] = state ? state.link : undefined;
            resourceInputs["linkMode"] = state ? state.linkMode : undefined;
            resourceInputs["sourceKafkaCluster"] = state ? state.sourceKafkaCluster : undefined;
        } else {
            const args = argsOrState as ClusterLinkArgs | undefined;
            if ((!args || args.destinationKafkaCluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationKafkaCluster'");
            }
            if ((!args || args.sourceKafkaCluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceKafkaCluster'");
            }
            resourceInputs["connectionMode"] = args ? args.connectionMode : undefined;
            resourceInputs["destinationKafkaCluster"] = args ? args.destinationKafkaCluster : undefined;
            resourceInputs["link"] = args ? args.link : undefined;
            resourceInputs["linkMode"] = args ? args.linkMode : undefined;
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
     * The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
     */
    connectionMode?: pulumi.Input<string>;
    destinationKafkaCluster?: pulumi.Input<inputs.ClusterLinkDestinationKafkaCluster>;
    /**
     * The name of the cluster link, for example, `my-cluster-link`.
     */
    link?: pulumi.Input<string>;
    /**
     * The mode of the cluster link. The supported values are `"DESTINATION"` and `"SOURCE"`. Defaults to `"DESTINATION"`.
     */
    linkMode?: pulumi.Input<string>;
    sourceKafkaCluster?: pulumi.Input<inputs.ClusterLinkSourceKafkaCluster>;
}

/**
 * The set of arguments for constructing a ClusterLink resource.
 */
export interface ClusterLinkArgs {
    /**
     * The connection mode of the cluster link. The supported values are `"INBOUND"` and `"OUTBOUND"`. Defaults to `"OUTBOUND"`.
     */
    connectionMode?: pulumi.Input<string>;
    destinationKafkaCluster: pulumi.Input<inputs.ClusterLinkDestinationKafkaCluster>;
    /**
     * The name of the cluster link, for example, `my-cluster-link`.
     */
    link?: pulumi.Input<string>;
    /**
     * The mode of the cluster link. The supported values are `"DESTINATION"` and `"SOURCE"`. Defaults to `"DESTINATION"`.
     */
    linkMode?: pulumi.Input<string>;
    sourceKafkaCluster: pulumi.Input<inputs.ClusterLinkSourceKafkaCluster>;
}
