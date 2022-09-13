// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
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
 * const exampleUsingIdEnvironment = confluentcloud.getEnvironment({
 *     id: "env-abc123",
 * });
 * export const exampleUsingId = exampleUsingIdEnvironment;
 * const exampleUsingNameEnvironment = confluentcloud.getEnvironment({
 *     displayName: "stag",
 * });
 * const exampleUsingNameServiceAccount = confluentcloud.getServiceAccount({
 *     displayName: "test_sa",
 * });
 * const test_role_binding = new confluentcloud.RoleBinding("test-role-binding", {
 *     principal: exampleUsingNameServiceAccount.then(exampleUsingNameServiceAccount => `User:${exampleUsingNameServiceAccount.id}`),
 *     roleName: "EnvironmentAdmin",
 *     crnPattern: exampleUsingNameEnvironment.then(exampleUsingNameEnvironment => exampleUsingNameEnvironment.resourceName),
 * });
 * ```
 */
export function getEnvironment(args?: GetEnvironmentArgs, opts?: pulumi.InvokeOptions): Promise<GetEnvironmentResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("confluentcloud:index/getEnvironment:getEnvironment", {
        "displayName": args.displayName,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getEnvironment.
 */
export interface GetEnvironmentArgs {
    /**
     * A human-readable name for the Environment.
     */
    displayName?: string;
    /**
     * The ID of the Environment, for example, `env-abc123`.
     */
    id?: string;
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
}

export function getEnvironmentOutput(args?: GetEnvironmentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEnvironmentResult> {
    return pulumi.output(args).apply(a => getEnvironment(a, opts))
}

/**
 * A collection of arguments for invoking getEnvironment.
 */
export interface GetEnvironmentOutputArgs {
    /**
     * A human-readable name for the Environment.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The ID of the Environment, for example, `env-abc123`.
     */
    id?: pulumi.Input<string>;
}
