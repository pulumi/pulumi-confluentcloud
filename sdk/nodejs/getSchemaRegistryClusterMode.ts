// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getSchemaRegistryClusterMode(args?: GetSchemaRegistryClusterModeArgs, opts?: pulumi.InvokeOptions): Promise<GetSchemaRegistryClusterModeResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getSchemaRegistryClusterMode:getSchemaRegistryClusterMode", {
        "credentials": args.credentials,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemaRegistryClusterMode.
 */
export interface GetSchemaRegistryClusterModeArgs {
    credentials?: inputs.GetSchemaRegistryClusterModeCredentials;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: string;
    schemaRegistryCluster?: inputs.GetSchemaRegistryClusterModeSchemaRegistryCluster;
}

/**
 * A collection of values returned by getSchemaRegistryClusterMode.
 */
export interface GetSchemaRegistryClusterModeResult {
    readonly credentials?: outputs.GetSchemaRegistryClusterModeCredentials;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Optional String) The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
     */
    readonly mode: string;
    readonly restEndpoint?: string;
    readonly schemaRegistryCluster?: outputs.GetSchemaRegistryClusterModeSchemaRegistryCluster;
}
export function getSchemaRegistryClusterModeOutput(args?: GetSchemaRegistryClusterModeOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSchemaRegistryClusterModeResult> {
    return pulumi.output(args).apply((a: any) => getSchemaRegistryClusterMode(a, opts))
}

/**
 * A collection of arguments for invoking getSchemaRegistryClusterMode.
 */
export interface GetSchemaRegistryClusterModeOutputArgs {
    credentials?: pulumi.Input<inputs.GetSchemaRegistryClusterModeCredentialsArgs>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.GetSchemaRegistryClusterModeSchemaRegistryClusterArgs>;
}
