// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * <img src="https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8" alt="">
 *
 * `confluentcloud.RoleBinding` describes a Role Binding.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const exampleRoleBinding = confluentcloud.getRoleBinding({
 *     id: "rb-abc123",
 * });
 * export const example = exampleRoleBinding;
 * ```
 */
export function getRoleBinding(args: GetRoleBindingArgs, opts?: pulumi.InvokeOptions): Promise<GetRoleBindingResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("confluentcloud:index/getRoleBinding:getRoleBinding", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoleBinding.
 */
export interface GetRoleBindingArgs {
    /**
     * The ID of the Role Binding (for example, `rb-abc123`).
     */
    id: string;
}

/**
 * A collection of values returned by getRoleBinding.
 */
export interface GetRoleBindingResult {
    /**
     * (Required String) A [Confluent Resource Name(CRN)](https://docs.confluent.io/cloud/current/api.html#section/Identifiers-and-URLs/Confluent-Resource-Names-(CRNs)) that specifies the scope and resource patterns necessary for the role to bind.
     */
    readonly crnPattern: string;
    readonly id: string;
    /**
     * (Required String) A principal User to bind the role to, for example, "User:u-111aaa" for binding to a user "u-111aaa", or "User:sa-111aaa" for binding to a service account "sa-111aaa".
     */
    readonly principal: string;
    /**
     * (Required String) A name of the role to bind to the principal. See [Confluent Cloud RBAC Roles](https://docs.confluent.io/cloud/current/access-management/access-control/cloud-rbac.html#ccloud-rbac-roles) for a full list of supported role names.
     */
    readonly roleName: string;
}

export function getRoleBindingOutput(args: GetRoleBindingOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRoleBindingResult> {
    return pulumi.output(args).apply(a => getRoleBinding(a, opts))
}

/**
 * A collection of arguments for invoking getRoleBinding.
 */
export interface GetRoleBindingOutputArgs {
    /**
     * The ID of the Role Binding (for example, `rb-abc123`).
     */
    id: pulumi.Input<string>;
}
