// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.Environment` describes an Environment data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getEnvironment({
 *         id: "env-abc123",
 *     });
 *     const exampleUsingName = await confluentcloud.getEnvironment({
 *         displayName: "stag",
 *     });
 *     const exampleUsingNameGetServiceAccount = await confluentcloud.getServiceAccount({
 *         displayName: "test_sa",
 *     });
 *     const test_role_binding = new confluentcloud.RoleBinding("test-role-binding", {
 *         principal: `User:${exampleUsingNameGetServiceAccount.id}`,
 *         roleName: "EnvironmentAdmin",
 *         crnPattern: exampleUsingName.resourceName,
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *     };
 * }
 * ```
 */
export function getEnvironment(args?: GetEnvironmentArgs, opts?: pulumi.InvokeOptions): Promise<GetEnvironmentResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getEnvironment:getEnvironment", {
        "displayName": args.displayName,
        "id": args.id,
        "streamGovernance": args.streamGovernance,
    }, opts);
}

/**
 * A collection of arguments for invoking getEnvironment.
 */
export interface GetEnvironmentArgs {
    /**
     * A human-readable name for the Environment.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    displayName?: string;
    /**
     * The ID of the Environment, for example, `env-abc123`.
     */
    id?: string;
    streamGovernance?: inputs.GetEnvironmentStreamGovernance;
}

/**
 * A collection of values returned by getEnvironment.
 */
export interface GetEnvironmentResult {
    /**
     * (Required String) A human-readable name for the Environment.
     */
    readonly displayName: string;
    /**
     * (Required String) The ID of the Environment, for example, `env-abc123`.
     */
    readonly id: string;
    /**
     * (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
     */
    readonly resourceName: string;
    readonly streamGovernance: outputs.GetEnvironmentStreamGovernance;
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.Environment` describes an Environment data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getEnvironment({
 *         id: "env-abc123",
 *     });
 *     const exampleUsingName = await confluentcloud.getEnvironment({
 *         displayName: "stag",
 *     });
 *     const exampleUsingNameGetServiceAccount = await confluentcloud.getServiceAccount({
 *         displayName: "test_sa",
 *     });
 *     const test_role_binding = new confluentcloud.RoleBinding("test-role-binding", {
 *         principal: `User:${exampleUsingNameGetServiceAccount.id}`,
 *         roleName: "EnvironmentAdmin",
 *         crnPattern: exampleUsingName.resourceName,
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *     };
 * }
 * ```
 */
export function getEnvironmentOutput(args?: GetEnvironmentOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetEnvironmentResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getEnvironment:getEnvironment", {
        "displayName": args.displayName,
        "id": args.id,
        "streamGovernance": args.streamGovernance,
    }, opts);
}

/**
 * A collection of arguments for invoking getEnvironment.
 */
export interface GetEnvironmentOutputArgs {
    /**
     * A human-readable name for the Environment.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The ID of the Environment, for example, `env-abc123`.
     */
    id?: pulumi.Input<string>;
    streamGovernance?: pulumi.Input<inputs.GetEnvironmentStreamGovernanceArgs>;
}
