// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.getUser` describes a User data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getUser({
 *         id: "u-abc123",
 *     });
 *     const exampleUsingEmail = await confluentcloud.getUser({
 *         email: "test123@gmail.com",
 *     });
 *     const test_env = new confluentcloud.Environment("test-env", {displayName: `env_for_${exampleUsingId.fullName}`});
 *     const standard_cluster_on_aws = new confluentcloud.KafkaCluster("standard-cluster-on-aws", {
 *         displayName: "standard_kafka_cluster_on_aws",
 *         availability: "SINGLE_ZONE",
 *         cloud: "AWS",
 *         region: "us-west-2",
 *         standard: {},
 *         environment: {
 *             id: test_env.id,
 *         },
 *     });
 *     const test_role_binding = new confluentcloud.RoleBinding("test-role-binding", {
 *         principal: `User:${exampleUsingEmail.id}`,
 *         roleName: "CloudClusterAdmin",
 *         crnPattern: standard_cluster_on_aws.rbacCrn,
 *     });
 *     const exampleUsingFullName = await confluentcloud.getUser({
 *         fullName: "John Doe",
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *     };
 * }
 * ```
 */
export function getUser(args?: GetUserArgs, opts?: pulumi.InvokeOptions): Promise<GetUserResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getUser:getUser", {
        "email": args.email,
        "fullName": args.fullName,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserArgs {
    /**
     * The email address of the User.
     *
     * > **Note:** Exactly one from the `id`, `fullName` and `email` attributes must be specified.
     */
    email?: string;
    /**
     * The full name of the User.
     */
    fullName?: string;
    /**
     * The ID of the User (e.g., `u-abc123`).
     */
    id?: string;
}

/**
 * A collection of values returned by getUser.
 */
export interface GetUserResult {
    /**
     * (Required String) An API Version of the schema version of the User.
     */
    readonly apiVersion: string;
    /**
     * (Required String) The email address of the User.
     */
    readonly email: string;
    /**
     * (Required String) The full name of the User.
     */
    readonly fullName: string;
    /**
     * (Required String) The ID of the User, for example, `u-abc123`.
     */
    readonly id: string;
    /**
     * (Required String) A kind of the User.
     */
    readonly kind: string;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.getUser` describes a User data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getUser({
 *         id: "u-abc123",
 *     });
 *     const exampleUsingEmail = await confluentcloud.getUser({
 *         email: "test123@gmail.com",
 *     });
 *     const test_env = new confluentcloud.Environment("test-env", {displayName: `env_for_${exampleUsingId.fullName}`});
 *     const standard_cluster_on_aws = new confluentcloud.KafkaCluster("standard-cluster-on-aws", {
 *         displayName: "standard_kafka_cluster_on_aws",
 *         availability: "SINGLE_ZONE",
 *         cloud: "AWS",
 *         region: "us-west-2",
 *         standard: {},
 *         environment: {
 *             id: test_env.id,
 *         },
 *     });
 *     const test_role_binding = new confluentcloud.RoleBinding("test-role-binding", {
 *         principal: `User:${exampleUsingEmail.id}`,
 *         roleName: "CloudClusterAdmin",
 *         crnPattern: standard_cluster_on_aws.rbacCrn,
 *     });
 *     const exampleUsingFullName = await confluentcloud.getUser({
 *         fullName: "John Doe",
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *     };
 * }
 * ```
 */
export function getUserOutput(args?: GetUserOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetUserResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getUser:getUser", {
        "email": args.email,
        "fullName": args.fullName,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserOutputArgs {
    /**
     * The email address of the User.
     *
     * > **Note:** Exactly one from the `id`, `fullName` and `email` attributes must be specified.
     */
    email?: pulumi.Input<string>;
    /**
     * The full name of the User.
     */
    fullName?: pulumi.Input<string>;
    /**
     * The ID of the User (e.g., `u-abc123`).
     */
    id?: pulumi.Input<string>;
}
