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
 * const prod = new confluentcloud.Environment("prod", {
 *     displayName: "Production",
 *     streamGovernance: {
 *         "package": "ESSENTIALS",
 *     },
 * });
 * ```
 *
 * ## Getting Started
 *
 * The following end-to-end examples might help to get started with `confluentcloud.Environment` resource:
 *   * `basic-kafka-acls`: _Basic_ Kafka cluster with authorization using ACLs
 *   * `basic-kafka-acls-with-alias`: _Basic_ Kafka cluster with authorization using ACLs
 *   * `standard-kafka-acls`: _Standard_ Kafka cluster with authorization using ACLs
 *   * `standard-kafka-rbac`: _Standard_ Kafka cluster with authorization using RBAC
 *   * `dedicated-public-kafka-acls`: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using ACLs
 *   * `dedicated-public-kafka-rbac`: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using RBAC
 *   * `dedicated-privatelink-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
 *   * `dedicated-privatelink-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
 *   * `dedicated-privatelink-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
 *   * `dedicated-privatelink-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
 *   * `dedicated-private-service-connect-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
 *   * `dedicated-private-service-connect-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC
 *   * `dedicated-vnet-peering-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using ACLs
 *   * `dedicated-vnet-peering-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using RBAC
 *   * `dedicated-vpc-peering-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using ACLs
 *   * `dedicated-vpc-peering-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using RBAC
 *   * `dedicated-vpc-peering-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using ACLs
 *   * `dedicated-vpc-peering-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using RBAC
 *   * `dedicated-transit-gateway-attachment-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
 *   * `dedicated-transit-gateway-attachment-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using RBAC
 *   * `enterprise-privatelinkattachment-aws-kafka-acls`: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
 *
 * ## Import
 *
 * You can import an Environment by using Environment ID, for example:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/environment:Environment my_env env-abc123
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class Environment extends pulumi.CustomResource {
    /**
     * Get an existing Environment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EnvironmentState, opts?: pulumi.CustomResourceOptions): Environment {
        return new Environment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/environment:Environment';

    /**
     * Returns true if the given object is an instance of Environment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Environment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Environment.__pulumiType;
    }

    /**
     * A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
     */
    public /*out*/ readonly resourceName!: pulumi.Output<string>;
    /**
     * The stream governance configuration for the Environment. The block supports the following arguments:
     */
    public readonly streamGovernance!: pulumi.Output<outputs.EnvironmentStreamGovernance>;

    /**
     * Create a Environment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: EnvironmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EnvironmentArgs | EnvironmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EnvironmentState | undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["resourceName"] = state ? state.resourceName : undefined;
            resourceInputs["streamGovernance"] = state ? state.streamGovernance : undefined;
        } else {
            const args = argsOrState as EnvironmentArgs | undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["streamGovernance"] = args ? args.streamGovernance : undefined;
            resourceInputs["resourceName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Environment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Environment resources.
 */
export interface EnvironmentState {
    /**
     * A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
     */
    displayName?: pulumi.Input<string>;
    /**
     * (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
     */
    resourceName?: pulumi.Input<string>;
    /**
     * The stream governance configuration for the Environment. The block supports the following arguments:
     */
    streamGovernance?: pulumi.Input<inputs.EnvironmentStreamGovernance>;
}

/**
 * The set of arguments for constructing a Environment resource.
 */
export interface EnvironmentArgs {
    /**
     * A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, "Development". The name can contain hyphens and underscores.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The stream governance configuration for the Environment. The block supports the following arguments:
     */
    streamGovernance?: pulumi.Input<inputs.EnvironmentStreamGovernance>;
}
