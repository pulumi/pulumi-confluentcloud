// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.RoleBinding` provides a Role Binding resource that enables creating, reading, and deleting role bindings on Confluent Cloud.
 *
 * > **Note:** For more information on the Role Bindings, see [Predefined RBAC roles in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/access-control/rbac/predefined-rbac-roles.html).
 *
 * ## Example of using timeSleep
 *
 * This configuration introduces a 360-second custom delay after the creation of a role binding, before creating a Kafka topic.
 *
 * For context, using `disableWaitForReady = false` (the default setting) results in a 90-second hardcoded delay, while opting for `disableWaitForReady = true` results in a 0-second delay.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 * import * as time from "@pulumi/time";
 *
 * const app_manager_kafka_cluster_admin_skip_sync = new confluentcloud.RoleBinding("app-manager-kafka-cluster-admin-skip-sync", {
 *     principal: `User:${app_manager.id}`,
 *     roleName: "CloudClusterAdmin",
 *     crnPattern: standard.rbacCrn,
 *     disableWaitForReady: true,
 * });
 * const wait360SecondsAfterRoleBinding = new time.index.Sleep("wait_360_seconds_after_role_binding", {createDuration: "360s"}, {
 *     dependsOn: [app_manager_kafka_cluster_admin_skip_sync],
 * });
 * const orders = new confluentcloud.KafkaTopic("orders", {
 *     kafkaCluster: {
 *         id: standard.id,
 *     },
 *     topicName: "orders",
 *     restEndpoint: standard.restEndpoint,
 *     credentials: {
 *         key: app_manager_kafka_api_key.id,
 *         secret: app_manager_kafka_api_key.secret,
 *     },
 * }, {
 *     dependsOn: [wait360SecondsAfterRoleBinding],
 * });
 * ```
 *
 * ## Import
 *
 * You can import a Role Binding by using Role Binding ID, for example:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/roleBinding:RoleBinding my_rb rb-f3a90de
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class RoleBinding extends pulumi.CustomResource {
    /**
     * Get an existing RoleBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoleBindingState, opts?: pulumi.CustomResourceOptions): RoleBinding {
        return new RoleBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/roleBinding:RoleBinding';

    /**
     * Returns true if the given object is an instance of RoleBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RoleBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RoleBinding.__pulumiType;
    }

    /**
     * A [Confluent Resource Name (CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
     */
    public readonly crnPattern!: pulumi.Output<string>;
    public readonly disableWaitForReady!: pulumi.Output<boolean | undefined>;
    /**
     * A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
     */
    public readonly principal!: pulumi.Output<string>;
    /**
     * A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
     */
    public readonly roleName!: pulumi.Output<string>;

    /**
     * Create a RoleBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RoleBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RoleBindingArgs | RoleBindingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RoleBindingState | undefined;
            resourceInputs["crnPattern"] = state ? state.crnPattern : undefined;
            resourceInputs["disableWaitForReady"] = state ? state.disableWaitForReady : undefined;
            resourceInputs["principal"] = state ? state.principal : undefined;
            resourceInputs["roleName"] = state ? state.roleName : undefined;
        } else {
            const args = argsOrState as RoleBindingArgs | undefined;
            if ((!args || args.crnPattern === undefined) && !opts.urn) {
                throw new Error("Missing required property 'crnPattern'");
            }
            if ((!args || args.principal === undefined) && !opts.urn) {
                throw new Error("Missing required property 'principal'");
            }
            if ((!args || args.roleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleName'");
            }
            resourceInputs["crnPattern"] = args ? args.crnPattern : undefined;
            resourceInputs["disableWaitForReady"] = args ? args.disableWaitForReady : undefined;
            resourceInputs["principal"] = args ? args.principal : undefined;
            resourceInputs["roleName"] = args ? args.roleName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RoleBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RoleBinding resources.
 */
export interface RoleBindingState {
    /**
     * A [Confluent Resource Name (CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
     */
    crnPattern?: pulumi.Input<string>;
    disableWaitForReady?: pulumi.Input<boolean>;
    /**
     * A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
     */
    principal?: pulumi.Input<string>;
    /**
     * A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
     */
    roleName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RoleBinding resource.
 */
export interface RoleBindingArgs {
    /**
     * A [Confluent Resource Name (CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
     */
    crnPattern: pulumi.Input<string>;
    disableWaitForReady?: pulumi.Input<boolean>;
    /**
     * A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
     */
    principal: pulumi.Input<string>;
    /**
     * A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
     */
    roleName: pulumi.Input<string>;
}
