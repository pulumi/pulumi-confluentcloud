// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getTagBinding(args: GetTagBindingArgs, opts?: pulumi.InvokeOptions): Promise<GetTagBindingResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getTagBinding:getTagBinding", {
        "credentials": args.credentials,
        "entityName": args.entityName,
        "entityType": args.entityType,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
        "tagName": args.tagName,
    }, opts);
}

/**
 * A collection of arguments for invoking getTagBinding.
 */
export interface GetTagBindingArgs {
    credentials?: inputs.GetTagBindingCredentials;
    /**
     * The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
     */
    entityName: string;
    /**
     * The entity type, for example, `srSchema`.
     */
    entityType: string;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: string;
    schemaRegistryCluster?: inputs.GetTagBindingSchemaRegistryCluster;
    /**
     * The name of the tag to be applied, for example, `PII`.
     */
    tagName: string;
}

/**
 * A collection of values returned by getTagBinding.
 */
export interface GetTagBindingResult {
    readonly credentials?: outputs.GetTagBindingCredentials;
    readonly entityName: string;
    readonly entityType: string;
    /**
     * (Required String) The ID of the Tag Binding, in the format `<Schema Registry Cluster Id>/<Tag Name>/<Entity Name>/<Entity Type>`, for example, `lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema`.
     */
    readonly id: string;
    readonly restEndpoint?: string;
    readonly schemaRegistryCluster?: outputs.GetTagBindingSchemaRegistryCluster;
    readonly tagName: string;
}
export function getTagBindingOutput(args: GetTagBindingOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTagBindingResult> {
    return pulumi.output(args).apply((a: any) => getTagBinding(a, opts))
}

/**
 * A collection of arguments for invoking getTagBinding.
 */
export interface GetTagBindingOutputArgs {
    credentials?: pulumi.Input<inputs.GetTagBindingCredentialsArgs>;
    /**
     * The qualified name of the entity., for example, `lsrc-8wrx70:.:100001`.
     */
    entityName: pulumi.Input<string>;
    /**
     * The entity type, for example, `srSchema`.
     */
    entityType: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.GetTagBindingSchemaRegistryClusterArgs>;
    /**
     * The name of the tag to be applied, for example, `PII`.
     */
    tagName: pulumi.Input<string>;
}
