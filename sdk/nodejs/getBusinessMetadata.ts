// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getBusinessMetadata(args: GetBusinessMetadataArgs, opts?: pulumi.InvokeOptions): Promise<GetBusinessMetadataResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getBusinessMetadata:getBusinessMetadata", {
        "credentials": args.credentials,
        "name": args.name,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
    }, opts);
}

/**
 * A collection of arguments for invoking getBusinessMetadata.
 */
export interface GetBusinessMetadataArgs {
    credentials?: inputs.GetBusinessMetadataCredentials;
    /**
     * The name of the Business Metadata, for example, `PII`.
     */
    name: string;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: string;
    schemaRegistryCluster?: inputs.GetBusinessMetadataSchemaRegistryCluster;
}

/**
 * A collection of values returned by getBusinessMetadata.
 */
export interface GetBusinessMetadataResult {
    /**
     * (Optional List) The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
     */
    readonly attributeDefinitions: outputs.GetBusinessMetadataAttributeDefinition[];
    readonly credentials?: outputs.GetBusinessMetadataCredentials;
    /**
     * (Optional String) The description of this attribute.
     */
    readonly description: string;
    /**
     * (Required String) The ID of the Business Metadata, in the format `<Schema Registry cluster ID>/<Business Metadata name>`, for example, `lsrc-8wrx70/PII`.
     */
    readonly id: string;
    /**
     * (Required String) The name of the attribute.
     */
    readonly name: string;
    readonly restEndpoint?: string;
    readonly schemaRegistryCluster?: outputs.GetBusinessMetadataSchemaRegistryCluster;
    /**
     * (Required Integer) The version of the Business Metadata, for example, `1`.
     */
    readonly version: number;
}
export function getBusinessMetadataOutput(args: GetBusinessMetadataOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBusinessMetadataResult> {
    return pulumi.output(args).apply((a: any) => getBusinessMetadata(a, opts))
}

/**
 * A collection of arguments for invoking getBusinessMetadata.
 */
export interface GetBusinessMetadataOutputArgs {
    credentials?: pulumi.Input<inputs.GetBusinessMetadataCredentialsArgs>;
    /**
     * The name of the Business Metadata, for example, `PII`.
     */
    name: pulumi.Input<string>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.GetBusinessMetadataSchemaRegistryClusterArgs>;
}