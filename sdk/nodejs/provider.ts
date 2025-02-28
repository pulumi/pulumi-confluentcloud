// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the confluent package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'confluentcloud';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === "pulumi:providers:" + Provider.__pulumiType;
    }

    /**
     * The Stream Catalog REST Endpoint.
     */
    public readonly catalogRestEndpoint!: pulumi.Output<string | undefined>;
    /**
     * The Confluent Cloud API Key.
     */
    public readonly cloudApiKey!: pulumi.Output<string | undefined>;
    /**
     * The Confluent Cloud API Secret.
     */
    public readonly cloudApiSecret!: pulumi.Output<string | undefined>;
    /**
     * The base endpoint of Confluent Cloud API.
     */
    public readonly endpoint!: pulumi.Output<string | undefined>;
    /**
     * The Flink Environment ID.
     */
    public readonly environmentId!: pulumi.Output<string | undefined>;
    /**
     * The Flink API Key.
     */
    public readonly flinkApiKey!: pulumi.Output<string | undefined>;
    /**
     * The Flink API Secret.
     */
    public readonly flinkApiSecret!: pulumi.Output<string | undefined>;
    /**
     * The Flink Compute Pool ID.
     */
    public readonly flinkComputePoolId!: pulumi.Output<string | undefined>;
    /**
     * The Flink Principal ID.
     */
    public readonly flinkPrincipalId!: pulumi.Output<string | undefined>;
    /**
     * The Flink REST Endpoint.
     */
    public readonly flinkRestEndpoint!: pulumi.Output<string | undefined>;
    /**
     * The Kafka Cluster API Key.
     */
    public readonly kafkaApiKey!: pulumi.Output<string | undefined>;
    /**
     * The Kafka Cluster API Secret.
     */
    public readonly kafkaApiSecret!: pulumi.Output<string | undefined>;
    /**
     * The Kafka Cluster ID.
     */
    public readonly kafkaId!: pulumi.Output<string | undefined>;
    /**
     * The Kafka Cluster REST Endpoint.
     */
    public readonly kafkaRestEndpoint!: pulumi.Output<string | undefined>;
    /**
     * The Flink Organization ID.
     */
    public readonly organizationId!: pulumi.Output<string | undefined>;
    /**
     * The Schema Registry Cluster API Key.
     */
    public readonly schemaRegistryApiKey!: pulumi.Output<string | undefined>;
    /**
     * The Schema Registry Cluster API Secret.
     */
    public readonly schemaRegistryApiSecret!: pulumi.Output<string | undefined>;
    /**
     * The Schema Registry Cluster ID.
     */
    public readonly schemaRegistryId!: pulumi.Output<string | undefined>;
    /**
     * The Schema Registry Cluster REST Endpoint.
     */
    public readonly schemaRegistryRestEndpoint!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            resourceInputs["catalogRestEndpoint"] = args ? args.catalogRestEndpoint : undefined;
            resourceInputs["cloudApiKey"] = args?.cloudApiKey ? pulumi.secret(args.cloudApiKey) : undefined;
            resourceInputs["cloudApiSecret"] = args?.cloudApiSecret ? pulumi.secret(args.cloudApiSecret) : undefined;
            resourceInputs["endpoint"] = args ? args.endpoint : undefined;
            resourceInputs["environmentId"] = args ? args.environmentId : undefined;
            resourceInputs["flinkApiKey"] = args?.flinkApiKey ? pulumi.secret(args.flinkApiKey) : undefined;
            resourceInputs["flinkApiSecret"] = args?.flinkApiSecret ? pulumi.secret(args.flinkApiSecret) : undefined;
            resourceInputs["flinkComputePoolId"] = args ? args.flinkComputePoolId : undefined;
            resourceInputs["flinkPrincipalId"] = args ? args.flinkPrincipalId : undefined;
            resourceInputs["flinkRestEndpoint"] = args ? args.flinkRestEndpoint : undefined;
            resourceInputs["kafkaApiKey"] = args?.kafkaApiKey ? pulumi.secret(args.kafkaApiKey) : undefined;
            resourceInputs["kafkaApiSecret"] = args?.kafkaApiSecret ? pulumi.secret(args.kafkaApiSecret) : undefined;
            resourceInputs["kafkaId"] = args ? args.kafkaId : undefined;
            resourceInputs["kafkaRestEndpoint"] = args ? args.kafkaRestEndpoint : undefined;
            resourceInputs["maxRetries"] = pulumi.output(args ? args.maxRetries : undefined).apply(JSON.stringify);
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["schemaRegistryApiKey"] = args?.schemaRegistryApiKey ? pulumi.secret(args.schemaRegistryApiKey) : undefined;
            resourceInputs["schemaRegistryApiSecret"] = args?.schemaRegistryApiSecret ? pulumi.secret(args.schemaRegistryApiSecret) : undefined;
            resourceInputs["schemaRegistryId"] = args ? args.schemaRegistryId : undefined;
            resourceInputs["schemaRegistryRestEndpoint"] = args ? args.schemaRegistryRestEndpoint : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["cloudApiKey", "cloudApiSecret", "flinkApiKey", "flinkApiSecret", "kafkaApiKey", "kafkaApiSecret", "schemaRegistryApiKey", "schemaRegistryApiSecret"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Provider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * The Stream Catalog REST Endpoint.
     */
    catalogRestEndpoint?: pulumi.Input<string>;
    /**
     * The Confluent Cloud API Key.
     */
    cloudApiKey?: pulumi.Input<string>;
    /**
     * The Confluent Cloud API Secret.
     */
    cloudApiSecret?: pulumi.Input<string>;
    /**
     * The base endpoint of Confluent Cloud API.
     */
    endpoint?: pulumi.Input<string>;
    /**
     * The Flink Environment ID.
     */
    environmentId?: pulumi.Input<string>;
    /**
     * The Flink API Key.
     */
    flinkApiKey?: pulumi.Input<string>;
    /**
     * The Flink API Secret.
     */
    flinkApiSecret?: pulumi.Input<string>;
    /**
     * The Flink Compute Pool ID.
     */
    flinkComputePoolId?: pulumi.Input<string>;
    /**
     * The Flink Principal ID.
     */
    flinkPrincipalId?: pulumi.Input<string>;
    /**
     * The Flink REST Endpoint.
     */
    flinkRestEndpoint?: pulumi.Input<string>;
    /**
     * The Kafka Cluster API Key.
     */
    kafkaApiKey?: pulumi.Input<string>;
    /**
     * The Kafka Cluster API Secret.
     */
    kafkaApiSecret?: pulumi.Input<string>;
    /**
     * The Kafka Cluster ID.
     */
    kafkaId?: pulumi.Input<string>;
    /**
     * The Kafka Cluster REST Endpoint.
     */
    kafkaRestEndpoint?: pulumi.Input<string>;
    /**
     * Maximum number of retries of HTTP client. Defaults to 4.
     */
    maxRetries?: pulumi.Input<number>;
    /**
     * The Flink Organization ID.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * The Schema Registry Cluster API Key.
     */
    schemaRegistryApiKey?: pulumi.Input<string>;
    /**
     * The Schema Registry Cluster API Secret.
     */
    schemaRegistryApiSecret?: pulumi.Input<string>;
    /**
     * The Schema Registry Cluster ID.
     */
    schemaRegistryId?: pulumi.Input<string>;
    /**
     * The Schema Registry Cluster REST Endpoint.
     */
    schemaRegistryRestEndpoint?: pulumi.Input<string>;
}
