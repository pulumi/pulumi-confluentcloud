// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getSubjectMode(args: GetSubjectModeArgs, opts?: pulumi.InvokeOptions): Promise<GetSubjectModeResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getSubjectMode:getSubjectMode", {
        "credentials": args.credentials,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
        "subjectName": args.subjectName,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubjectMode.
 */
export interface GetSubjectModeArgs {
    credentials?: inputs.GetSubjectModeCredentials;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: string;
    schemaRegistryCluster?: inputs.GetSubjectModeSchemaRegistryCluster;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     *
     * > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     */
    subjectName: string;
}

/**
 * A collection of values returned by getSubjectMode.
 */
export interface GetSubjectModeResult {
    readonly credentials?: outputs.GetSubjectModeCredentials;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Required String) The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
     */
    readonly mode: string;
    readonly restEndpoint?: string;
    readonly schemaRegistryCluster?: outputs.GetSubjectModeSchemaRegistryCluster;
    readonly subjectName: string;
}
export function getSubjectModeOutput(args: GetSubjectModeOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSubjectModeResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getSubjectMode:getSubjectMode", {
        "credentials": args.credentials,
        "restEndpoint": args.restEndpoint,
        "schemaRegistryCluster": args.schemaRegistryCluster,
        "subjectName": args.subjectName,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubjectMode.
 */
export interface GetSubjectModeOutputArgs {
    credentials?: pulumi.Input<inputs.GetSubjectModeCredentialsArgs>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    schemaRegistryCluster?: pulumi.Input<inputs.GetSubjectModeSchemaRegistryClusterArgs>;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`.
     *
     * > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     */
    subjectName: pulumi.Input<string>;
}
