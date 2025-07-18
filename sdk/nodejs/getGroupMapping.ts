// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.GroupMapping` describes a Group Mapping data source.
 *
 * > **Note:** See [Group Mapping in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html) for more details.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getGroupMapping({
 *         id: "group-abc123",
 *     });
 *     const exampleUsingName = await confluentcloud.getGroupMapping({
 *         displayName: "Default",
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *     };
 * }
 * ```
 */
export function getGroupMapping(args?: GetGroupMappingArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupMappingResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getGroupMapping:getGroupMapping", {
        "displayName": args.displayName,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroupMapping.
 */
export interface GetGroupMappingArgs {
    /**
     * The name of the Group Mapping.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    displayName?: string;
    /**
     * The ID of the Group Mapping.
     */
    id?: string;
}

/**
 * A collection of values returned by getGroupMapping.
 */
export interface GetGroupMappingResult {
    /**
     * (Required String) A description explaining the purpose and use of the group mapping.
     */
    readonly description: string;
    /**
     * (Required String) The name of the Group Mapping.
     */
    readonly displayName: string;
    /**
     * (Required String) A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
     */
    readonly filter: string;
    /**
     * (Required String) The ID of the Group Mapping (for example, `group-abc123`).
     */
    readonly id: string;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.GroupMapping` describes a Group Mapping data source.
 *
 * > **Note:** See [Group Mapping in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html) for more details.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getGroupMapping({
 *         id: "group-abc123",
 *     });
 *     const exampleUsingName = await confluentcloud.getGroupMapping({
 *         displayName: "Default",
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *     };
 * }
 * ```
 */
export function getGroupMappingOutput(args?: GetGroupMappingOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGroupMappingResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getGroupMapping:getGroupMapping", {
        "displayName": args.displayName,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroupMapping.
 */
export interface GetGroupMappingOutputArgs {
    /**
     * The name of the Group Mapping.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The ID of the Group Mapping.
     */
    id?: pulumi.Input<string>;
}
