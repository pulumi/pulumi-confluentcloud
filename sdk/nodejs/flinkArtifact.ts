// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const development = new confluentcloud.Environment("development", {displayName: "Development"});
 * const main = new confluentcloud.FlinkArtifact("main", {
 *     cloud: "AWS",
 *     region: "us-west-2",
 *     displayName: "my_flink_sumscalar_artifact",
 *     contentFormat: "JAR",
 *     artifactFile: "path/to/your/artifact.jar",
 *     environment: {
 *         id: development.id,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * You can import a Flink Artifact by using cloud, region, Flink Artifact ID and artifact file, in the format `<Environment ID>/<region>/<cloud>/<Flink Artifact ID>`. The following example shows how to import a Flink Artifact:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/flinkArtifact:FlinkArtifact main env-abc123/us-east-1/aws/fa-123
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class FlinkArtifact extends pulumi.CustomResource {
    /**
     * Get an existing FlinkArtifact resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FlinkArtifactState, opts?: pulumi.CustomResourceOptions): FlinkArtifact {
        return new FlinkArtifact(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/flinkArtifact:FlinkArtifact';

    /**
     * Returns true if the given object is an instance of FlinkArtifact.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FlinkArtifact {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FlinkArtifact.__pulumiType;
    }

    /**
     * (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
     */
    public /*out*/ readonly apiVersion!: pulumi.Output<string>;
    /**
     * The artifact file for Flink Artifact. Can be a relative or absolute path. Must have a `.jar` or `.zip` extension. This can be relative or absolute path
     */
    public readonly artifactFile!: pulumi.Output<string | undefined>;
    /**
     * Java class or alias for the Flink Artifact as provided by developer.
     *
     * @deprecated The "class" attribute has been deprecated and will be removed in the next major version of the provider (3.0.0). Refer to the Upgrade Guide at https://registry.terraform.io/providers/confluentinc/confluent/latest/docs/guides/version-3-upgrade for more details. The guide will be published once version 3.0.0 is released.
     */
    public readonly class!: pulumi.Output<string | undefined>;
    /**
     * The cloud service provider that runs the Flink Artifact. Accepted values are: `AWS`, `AZURE`.
     */
    public readonly cloud!: pulumi.Output<string>;
    /**
     * Archive format of the Flink Artifact. Accepted values are: `JAR`, `ZIP`. Should match the file extension of your artifact file.
     */
    public readonly contentFormat!: pulumi.Output<string>;
    /**
     * (Optional String) Description of the Flink Artifact.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The unique name of the Flink Artifact per cloud, region, environment scope.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * (Optional String) Documentation link of the Flink Artifact.
     */
    public readonly documentationLink!: pulumi.Output<string | undefined>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    public readonly environment!: pulumi.Output<outputs.FlinkArtifactEnvironment>;
    /**
     * (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
     */
    public /*out*/ readonly kind!: pulumi.Output<string>;
    /**
     * The cloud service provider region that hosts the Flink Artifact.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * (Optional String) Runtime language of the Flink Artifact as `Python` or `Java`. Defaults to `Java`.
     */
    public readonly runtimeLanguage!: pulumi.Output<string | undefined>;
    /**
     * List of versions for this Flink Artifact.
     */
    public /*out*/ readonly versions!: pulumi.Output<outputs.FlinkArtifactVersion[]>;

    /**
     * Create a FlinkArtifact resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FlinkArtifactArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FlinkArtifactArgs | FlinkArtifactState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FlinkArtifactState | undefined;
            resourceInputs["apiVersion"] = state ? state.apiVersion : undefined;
            resourceInputs["artifactFile"] = state ? state.artifactFile : undefined;
            resourceInputs["class"] = state ? state.class : undefined;
            resourceInputs["cloud"] = state ? state.cloud : undefined;
            resourceInputs["contentFormat"] = state ? state.contentFormat : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["documentationLink"] = state ? state.documentationLink : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["runtimeLanguage"] = state ? state.runtimeLanguage : undefined;
            resourceInputs["versions"] = state ? state.versions : undefined;
        } else {
            const args = argsOrState as FlinkArtifactArgs | undefined;
            if ((!args || args.cloud === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cloud'");
            }
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.environment === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environment'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["artifactFile"] = args ? args.artifactFile : undefined;
            resourceInputs["class"] = args ? args.class : undefined;
            resourceInputs["cloud"] = args ? args.cloud : undefined;
            resourceInputs["contentFormat"] = args ? args.contentFormat : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["documentationLink"] = args ? args.documentationLink : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["runtimeLanguage"] = args ? args.runtimeLanguage : undefined;
            resourceInputs["apiVersion"] = undefined /*out*/;
            resourceInputs["kind"] = undefined /*out*/;
            resourceInputs["versions"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FlinkArtifact.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FlinkArtifact resources.
 */
export interface FlinkArtifactState {
    /**
     * (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
     */
    apiVersion?: pulumi.Input<string>;
    /**
     * The artifact file for Flink Artifact. Can be a relative or absolute path. Must have a `.jar` or `.zip` extension. This can be relative or absolute path
     */
    artifactFile?: pulumi.Input<string>;
    /**
     * Java class or alias for the Flink Artifact as provided by developer.
     *
     * @deprecated The "class" attribute has been deprecated and will be removed in the next major version of the provider (3.0.0). Refer to the Upgrade Guide at https://registry.terraform.io/providers/confluentinc/confluent/latest/docs/guides/version-3-upgrade for more details. The guide will be published once version 3.0.0 is released.
     */
    class?: pulumi.Input<string>;
    /**
     * The cloud service provider that runs the Flink Artifact. Accepted values are: `AWS`, `AZURE`.
     */
    cloud?: pulumi.Input<string>;
    /**
     * Archive format of the Flink Artifact. Accepted values are: `JAR`, `ZIP`. Should match the file extension of your artifact file.
     */
    contentFormat?: pulumi.Input<string>;
    /**
     * (Optional String) Description of the Flink Artifact.
     */
    description?: pulumi.Input<string>;
    /**
     * The unique name of the Flink Artifact per cloud, region, environment scope.
     */
    displayName?: pulumi.Input<string>;
    /**
     * (Optional String) Documentation link of the Flink Artifact.
     */
    documentationLink?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment?: pulumi.Input<inputs.FlinkArtifactEnvironment>;
    /**
     * (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
     */
    kind?: pulumi.Input<string>;
    /**
     * The cloud service provider region that hosts the Flink Artifact.
     */
    region?: pulumi.Input<string>;
    /**
     * (Optional String) Runtime language of the Flink Artifact as `Python` or `Java`. Defaults to `Java`.
     */
    runtimeLanguage?: pulumi.Input<string>;
    /**
     * List of versions for this Flink Artifact.
     */
    versions?: pulumi.Input<pulumi.Input<inputs.FlinkArtifactVersion>[]>;
}

/**
 * The set of arguments for constructing a FlinkArtifact resource.
 */
export interface FlinkArtifactArgs {
    /**
     * The artifact file for Flink Artifact. Can be a relative or absolute path. Must have a `.jar` or `.zip` extension. This can be relative or absolute path
     */
    artifactFile?: pulumi.Input<string>;
    /**
     * Java class or alias for the Flink Artifact as provided by developer.
     *
     * @deprecated The "class" attribute has been deprecated and will be removed in the next major version of the provider (3.0.0). Refer to the Upgrade Guide at https://registry.terraform.io/providers/confluentinc/confluent/latest/docs/guides/version-3-upgrade for more details. The guide will be published once version 3.0.0 is released.
     */
    class?: pulumi.Input<string>;
    /**
     * The cloud service provider that runs the Flink Artifact. Accepted values are: `AWS`, `AZURE`.
     */
    cloud: pulumi.Input<string>;
    /**
     * Archive format of the Flink Artifact. Accepted values are: `JAR`, `ZIP`. Should match the file extension of your artifact file.
     */
    contentFormat?: pulumi.Input<string>;
    /**
     * (Optional String) Description of the Flink Artifact.
     */
    description?: pulumi.Input<string>;
    /**
     * The unique name of the Flink Artifact per cloud, region, environment scope.
     */
    displayName: pulumi.Input<string>;
    /**
     * (Optional String) Documentation link of the Flink Artifact.
     */
    documentationLink?: pulumi.Input<string>;
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     */
    environment: pulumi.Input<inputs.FlinkArtifactEnvironment>;
    /**
     * The cloud service provider region that hosts the Flink Artifact.
     */
    region: pulumi.Input<string>;
    /**
     * (Optional String) Runtime language of the Flink Artifact as `Python` or `Java`. Defaults to `Java`.
     */
    runtimeLanguage?: pulumi.Input<string>;
}
