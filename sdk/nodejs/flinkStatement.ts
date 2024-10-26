// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * You can import a Flink statement by using the Flink Statement name, for example:
 *
 * Option #1: Manage multiple Flink Compute Pools in the same Terraform workspace
 *
 * $ export IMPORT_CONFLUENT_ORGANIZATION_ID="<organization_id>"
 *
 * $ export IMPORT_CONFLUENT_ENVIRONMENT_ID="<environment_id>"
 *
 * $ export IMPORT_FLINK_COMPUTE_POOL_ID="<flink_compute_pool_id>"
 *
 * $ export IMPORT_FLINK_API_KEY="<flink_api_key>"
 *
 * $ export IMPORT_FLINK_API_SECRET="<flink_api_secret>"
 *
 * $ export IMPORT_FLINK_REST_ENDPOINT="<flink_rest_endpoint>"
 *
 * $ export IMPORT_FLINK_PRINCIPAL_ID="<flink_rest_endpoint>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/flinkStatement:FlinkStatement example cfeab4fe-b62c-49bd-9e99-51cc98c77a67
 * ```
 *
 * Option #2: Manage a single Flink Compute Pool in the same Terraform workspace
 *
 * ```sh
 * $ pulumi import confluentcloud:index/flinkStatement:FlinkStatement example cfeab4fe-b62c-49bd-9e99-51cc98c77a67
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class FlinkStatement extends pulumi.CustomResource {
    /**
     * Get an existing FlinkStatement resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FlinkStatementState, opts?: pulumi.CustomResourceOptions): FlinkStatement {
        return new FlinkStatement(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/flinkStatement:FlinkStatement';

    /**
     * Returns true if the given object is an instance of FlinkStatement.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FlinkStatement {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FlinkStatement.__pulumiType;
    }

    public readonly computePool!: pulumi.Output<outputs.FlinkStatementComputePool>;
    /**
     * The Cluster API Credentials.
     */
    public readonly credentials!: pulumi.Output<outputs.FlinkStatementCredentials | undefined>;
    public readonly environment!: pulumi.Output<outputs.FlinkStatementEnvironment>;
    /**
     * (Optional String) The last Kafka offsets that a statement has processed. Represented by a mapping from Kafka topic to a string representation of partitions mapped to offsets. For example,
     * ```bash
     * "latest_offsets": {
     * "topic-1": "partition:0,offset:100;partition:1,offset:200",
     * "topic-2": "partition:0,offset:50"
     * }
     * ```
     */
    public /*out*/ readonly latestOffsets!: pulumi.Output<{[key: string]: string}>;
    /**
     * (Optional String) The date and time at which the Kafka topic offsets were added to the statement status. It is represented in RFC3339 format and is in UTC. For example, `2023-03-31T00:00:00-00:00`.
     */
    public /*out*/ readonly latestOffsetsTimestamp!: pulumi.Output<string>;
    public readonly organization!: pulumi.Output<outputs.FlinkStatementOrganization>;
    public readonly principal!: pulumi.Output<outputs.FlinkStatementPrincipal>;
    /**
     * The custom topic settings to set:
     */
    public readonly properties!: pulumi.Output<{[key: string]: string}>;
    /**
     * The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
     */
    public readonly restEndpoint!: pulumi.Output<string | undefined>;
    /**
     * The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
     */
    public readonly statement!: pulumi.Output<string>;
    /**
     * The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
     */
    public readonly statementName!: pulumi.Output<string>;
    /**
     * Indicates whether the statement should be stopped.
     */
    public readonly stopped!: pulumi.Output<boolean>;

    /**
     * Create a FlinkStatement resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FlinkStatementArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FlinkStatementArgs | FlinkStatementState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FlinkStatementState | undefined;
            resourceInputs["computePool"] = state ? state.computePool : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["latestOffsets"] = state ? state.latestOffsets : undefined;
            resourceInputs["latestOffsetsTimestamp"] = state ? state.latestOffsetsTimestamp : undefined;
            resourceInputs["organization"] = state ? state.organization : undefined;
            resourceInputs["principal"] = state ? state.principal : undefined;
            resourceInputs["properties"] = state ? state.properties : undefined;
            resourceInputs["restEndpoint"] = state ? state.restEndpoint : undefined;
            resourceInputs["statement"] = state ? state.statement : undefined;
            resourceInputs["statementName"] = state ? state.statementName : undefined;
            resourceInputs["stopped"] = state ? state.stopped : undefined;
        } else {
            const args = argsOrState as FlinkStatementArgs | undefined;
            if ((!args || args.statement === undefined) && !opts.urn) {
                throw new Error("Missing required property 'statement'");
            }
            resourceInputs["computePool"] = args ? args.computePool : undefined;
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["organization"] = args ? args.organization : undefined;
            resourceInputs["principal"] = args ? args.principal : undefined;
            resourceInputs["properties"] = args ? args.properties : undefined;
            resourceInputs["restEndpoint"] = args ? args.restEndpoint : undefined;
            resourceInputs["statement"] = args ? args.statement : undefined;
            resourceInputs["statementName"] = args ? args.statementName : undefined;
            resourceInputs["stopped"] = args ? args.stopped : undefined;
            resourceInputs["latestOffsets"] = undefined /*out*/;
            resourceInputs["latestOffsetsTimestamp"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(FlinkStatement.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FlinkStatement resources.
 */
export interface FlinkStatementState {
    computePool?: pulumi.Input<inputs.FlinkStatementComputePool>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.FlinkStatementCredentials>;
    environment?: pulumi.Input<inputs.FlinkStatementEnvironment>;
    /**
     * (Optional String) The last Kafka offsets that a statement has processed. Represented by a mapping from Kafka topic to a string representation of partitions mapped to offsets. For example,
     * ```bash
     * "latest_offsets": {
     * "topic-1": "partition:0,offset:100;partition:1,offset:200",
     * "topic-2": "partition:0,offset:50"
     * }
     * ```
     */
    latestOffsets?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * (Optional String) The date and time at which the Kafka topic offsets were added to the statement status. It is represented in RFC3339 format and is in UTC. For example, `2023-03-31T00:00:00-00:00`.
     */
    latestOffsetsTimestamp?: pulumi.Input<string>;
    organization?: pulumi.Input<inputs.FlinkStatementOrganization>;
    principal?: pulumi.Input<inputs.FlinkStatementPrincipal>;
    /**
     * The custom topic settings to set:
     */
    properties?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
     */
    restEndpoint?: pulumi.Input<string>;
    /**
     * The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
     */
    statement?: pulumi.Input<string>;
    /**
     * The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
     */
    statementName?: pulumi.Input<string>;
    /**
     * Indicates whether the statement should be stopped.
     */
    stopped?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a FlinkStatement resource.
 */
export interface FlinkStatementArgs {
    computePool?: pulumi.Input<inputs.FlinkStatementComputePool>;
    /**
     * The Cluster API Credentials.
     */
    credentials?: pulumi.Input<inputs.FlinkStatementCredentials>;
    environment?: pulumi.Input<inputs.FlinkStatementEnvironment>;
    organization?: pulumi.Input<inputs.FlinkStatementOrganization>;
    principal?: pulumi.Input<inputs.FlinkStatementPrincipal>;
    /**
     * The custom topic settings to set:
     */
    properties?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
     */
    restEndpoint?: pulumi.Input<string>;
    /**
     * The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
     */
    statement: pulumi.Input<string>;
    /**
     * The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
     */
    statementName?: pulumi.Input<string>;
    /**
     * Indicates whether the statement should be stopped.
     */
    stopped?: pulumi.Input<boolean>;
}
