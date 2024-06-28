// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getSchema(args: GetSchemaArgs, opts?: pulumi.InvokeOptions): Promise<GetSchemaResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("confluentcloud:index/getSchema:getSchema", {
        "credentials": args.credentials,
        "metadata": args.metadata,
        "restEndpoint": args.restEndpoint,
        "ruleset": args.ruleset,
        "schemaIdentifier": args.schemaIdentifier,
        "schemaRegistryCluster": args.schemaRegistryCluster,
        "subjectName": args.subjectName,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchema.
 */
export interface GetSchemaArgs {
    credentials?: inputs.GetSchemaCredentials;
    /**
     * (Optional Block) See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
     */
    metadata?: inputs.GetSchemaMetadata;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: string;
    /**
     * (Optional Block) The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
     */
    ruleset?: inputs.GetSchemaRuleset;
    /**
     * The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
     *
     * > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     */
    schemaIdentifier: number;
    schemaRegistryCluster?: inputs.GetSchemaSchemaRegistryCluster;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     */
    subjectName: string;
}

/**
 * A collection of values returned by getSchema.
 */
export interface GetSchemaResult {
    readonly credentials?: outputs.GetSchemaCredentials;
    /**
     * (Required String) The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
     */
    readonly format: string;
    readonly hardDelete: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Optional Block) See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
     */
    readonly metadata: outputs.GetSchemaMetadata;
    readonly recreateOnUpdate: boolean;
    readonly restEndpoint?: string;
    /**
     * (Optional Block) The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
     */
    readonly ruleset: outputs.GetSchemaRuleset;
    /**
     * (Required String) The schema string, for example, `file("./schema_version_1.avsc")`.
     */
    readonly schema: string;
    readonly schemaIdentifier: number;
    /**
     * (Optional List) The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
     */
    readonly schemaReferences: outputs.GetSchemaSchemaReference[];
    readonly schemaRegistryCluster?: outputs.GetSchemaSchemaRegistryCluster;
    readonly skipValidationDuringPlan: boolean;
    /**
     * (Required String) The name for the reference. (For Avro Schema, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf Schema, it is the name of another Protobuf file.)
     */
    readonly subjectName: string;
    /**
     * (Required Integer) The version of the Schema, for example, `4`.
     */
    readonly version: number;
}
export function getSchemaOutput(args: GetSchemaOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSchemaResult> {
    return pulumi.output(args).apply((a: any) => getSchema(a, opts))
}

/**
 * A collection of arguments for invoking getSchema.
 */
export interface GetSchemaOutputArgs {
    credentials?: pulumi.Input<inputs.GetSchemaCredentialsArgs>;
    /**
     * (Optional Block) See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
     */
    metadata?: pulumi.Input<inputs.GetSchemaMetadataArgs>;
    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: pulumi.Input<string>;
    /**
     * (Optional Block) The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
     */
    ruleset?: pulumi.Input<inputs.GetSchemaRulesetArgs>;
    /**
     * The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
     *
     * > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     */
    schemaIdentifier: pulumi.Input<number>;
    schemaRegistryCluster?: pulumi.Input<inputs.GetSchemaSchemaRegistryClusterArgs>;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     */
    subjectName: pulumi.Input<string>;
}
