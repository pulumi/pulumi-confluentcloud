// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.getUsers` describes a data source for Users.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getUsers({});
 * export const users = main.then(main => main.ids);
 * ```
 */
export function getUsers(opts?: pulumi.InvokeOptions): Promise<GetUsersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getUsers:getUsers", {
    }, opts);
}

/**
 * A collection of values returned by getUsers.
 */
export interface GetUsersResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Required List of Strings) The list of User IDs, for example: `["u-abc123", "u-abc124"]`.
     */
    readonly ids: string[];
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.getUsers` describes a data source for Users.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const main = confluentcloud.getUsers({});
 * export const users = main.then(main => main.ids);
 * ```
 */
export function getUsersOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetUsersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getUsers:getUsers", {
    }, opts);
}
