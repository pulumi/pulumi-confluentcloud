// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.ServiceAccount` provides a Service Account resource that enables creating, editing, and deleting service accounts on Confluent Cloud.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const example_sa = new confluentcloud.ServiceAccount("example-sa", {
 *     displayName: "orders-app-sa",
 *     description: "Service Account for orders app",
 * });
 * ```
 *
 * ## Getting Started
 *
 * The following end-to-end examples might help to get started with `confluentcloud.ServiceAccount` resource:
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
 * You can import a Service Account by using Service Account ID, for example:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/serviceAccount:ServiceAccount my_sa sa-abc123
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class ServiceAccount extends pulumi.CustomResource {
    /**
     * Get an existing ServiceAccount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceAccountState, opts?: pulumi.CustomResourceOptions): ServiceAccount {
        return new ServiceAccount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/serviceAccount:ServiceAccount';

    /**
     * Returns true if the given object is an instance of ServiceAccount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceAccount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceAccount.__pulumiType;
    }

    /**
     * (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
     */
    public /*out*/ readonly apiVersion!: pulumi.Output<string>;
    /**
     * A free-form description of the Service Account.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A human-readable name for the Service Account.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * (Required String) A kind of the Service Account, for example, `ServiceAccount`.
     */
    public /*out*/ readonly kind!: pulumi.Output<string>;

    /**
     * Create a ServiceAccount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ServiceAccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceAccountArgs | ServiceAccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceAccountState | undefined;
            resourceInputs["apiVersion"] = state ? state.apiVersion : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
        } else {
            const args = argsOrState as ServiceAccountArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["apiVersion"] = undefined /*out*/;
            resourceInputs["kind"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceAccount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceAccount resources.
 */
export interface ServiceAccountState {
    /**
     * (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
     */
    apiVersion?: pulumi.Input<string>;
    /**
     * A free-form description of the Service Account.
     */
    description?: pulumi.Input<string>;
    /**
     * A human-readable name for the Service Account.
     */
    displayName?: pulumi.Input<string>;
    /**
     * (Required String) A kind of the Service Account, for example, `ServiceAccount`.
     */
    kind?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceAccount resource.
 */
export interface ServiceAccountArgs {
    /**
     * A free-form description of the Service Account.
     */
    description?: pulumi.Input<string>;
    /**
     * A human-readable name for the Service Account.
     */
    displayName?: pulumi.Input<string>;
}
