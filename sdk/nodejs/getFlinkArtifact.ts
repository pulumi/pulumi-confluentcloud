// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.FlinkArtifact` describes a Flink Artifact data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getFlinkArtifact({
 *         id: "lfa-abc123",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingName = await confluentcloud.getFlinkArtifact({
 *         displayName: "my_artifact",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *         exampleUsingName: exampleUsingName,
 *     };
 * }
 * ```
 */
export function getFlinkArtifact(args: GetFlinkArtifactArgs, opts?: pulumi.InvokeOptions): Promise<GetFlinkArtifactResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getFlinkArtifact:getFlinkArtifact", {
        "cloud": args.cloud,
        "displayName": args.displayName,
        "environment": args.environment,
        "id": args.id,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getFlinkArtifact.
 */
export interface GetFlinkArtifactArgs {
    /**
     * The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    cloud: string;
    /**
     * A human-readable name for the Flink Artifact.
     */
    displayName?: string;
    environment: inputs.GetFlinkArtifactEnvironment;
    /**
     * The ID of the Flink Artifact, for example, `lfa-abc123`.
     */
    id?: string;
    /**
     * The cloud service provider region, for example, `us-east-1`.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    region: string;
}

/**
 * A collection of values returned by getFlinkArtifact.
 */
export interface GetFlinkArtifactResult {
    /**
     * (Required String) The API Version of the schema version of the Flink Artifact, for example, `fa/v2`.
     */
    readonly apiVersion: string;
    /**
     * (Required String) Java class or alias for the Flink Artifact as provided by developer.
     */
    readonly class: string;
    readonly cloud: string;
    /**
     * (Required String) Archive format of the Flink Artifact.
     */
    readonly contentFormat: string;
    /**
     * (Required String) Description of the Flink Artifact.
     */
    readonly description: string;
    readonly displayName: string;
    readonly environment: outputs.GetFlinkArtifactEnvironment;
    readonly id: string;
    /**
     * (Required String) The kind of the Flink Artifact, for example, `FlinkArtifact`.
     */
    readonly kind: string;
    readonly region: string;
    /**
     * (Required String) Runtime language of the Flink Artifact. The default runtime language is JAVA.
     */
    readonly runtimeLanguage: string;
    readonly versions: outputs.GetFlinkArtifactVersion[];
}
/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.FlinkArtifact` describes a Flink Artifact data source.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * export = async () => {
 *     const exampleUsingId = await confluentcloud.getFlinkArtifact({
 *         id: "lfa-abc123",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     const exampleUsingName = await confluentcloud.getFlinkArtifact({
 *         displayName: "my_artifact",
 *         environment: {
 *             id: "env-xyz456",
 *         },
 *     });
 *     return {
 *         exampleUsingId: exampleUsingId,
 *         exampleUsingName: exampleUsingName,
 *     };
 * }
 * ```
 */
export function getFlinkArtifactOutput(args: GetFlinkArtifactOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFlinkArtifactResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("confluentcloud:index/getFlinkArtifact:getFlinkArtifact", {
        "cloud": args.cloud,
        "displayName": args.displayName,
        "environment": args.environment,
        "id": args.id,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getFlinkArtifact.
 */
export interface GetFlinkArtifactOutputArgs {
    /**
     * The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
     */
    cloud: pulumi.Input<string>;
    /**
     * A human-readable name for the Flink Artifact.
     */
    displayName?: pulumi.Input<string>;
    environment: pulumi.Input<inputs.GetFlinkArtifactEnvironmentArgs>;
    /**
     * The ID of the Flink Artifact, for example, `lfa-abc123`.
     */
    id?: pulumi.Input<string>;
    /**
     * The cloud service provider region, for example, `us-east-1`.
     *
     * > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
     */
    region: pulumi.Input<string>;
}
