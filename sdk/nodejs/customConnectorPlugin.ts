// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const source = new confluentcloud.CustomConnectorPlugin("source", {
 *     displayName: "Datagen Source Connector Plugin",
 *     documentationLink: "https://www.confluent.io/hub/confluentinc/kafka-connect-datagen",
 *     connectorClass: "io.confluent.kafka.connect.datagen.DatagenConnector",
 *     connectorType: "SOURCE",
 *     sensitiveConfigProperties: [],
 *     filename: "confluentinc-kafka-connect-datagen-0.6.2.zip",
 * });
 * ```
 *
 * ## Import
 *
 * You can import a Custom Connector Plugin by using a Custom Connector Plugin ID, in the format `<Custom Connector Plugin>`. The following example shows how to import a Custom Connector Plugin:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/customConnectorPlugin:CustomConnectorPlugin main ccp-abc123xyz
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class CustomConnectorPlugin extends pulumi.CustomResource {
    /**
     * Get an existing CustomConnectorPlugin resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomConnectorPluginState, opts?: pulumi.CustomResourceOptions): CustomConnectorPlugin {
        return new CustomConnectorPlugin(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/customConnectorPlugin:CustomConnectorPlugin';

    /**
     * Returns true if the given object is an instance of CustomConnectorPlugin.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomConnectorPlugin {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomConnectorPlugin.__pulumiType;
    }

    /**
     * Cloud provider where the Custom Connector Plugin archive is uploaded. Defaults to `AWS`. Accepted values are: `AWS`, `AZURE`.
     */
    public readonly cloud!: pulumi.Output<string>;
    /**
     * The Java class or alias for the connector. You can get the connector class from the connector documentation provided by the developer.
     */
    public readonly connectorClass!: pulumi.Output<string>;
    /**
     * The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
     */
    public readonly connectorType!: pulumi.Output<string>;
    /**
     * The description of the Custom Connector Plugin.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the Custom Connector Plugin.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * The documentation link of the Custom Connector Plugin.
     */
    public readonly documentationLink!: pulumi.Output<string | undefined>;
    /**
     * The path to the Custom Connector Plugin archive to be uploaded. Accepted archive formats are: `.jar`, `.zip`.
     */
    public readonly filename!: pulumi.Output<string>;
    /**
     * The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
     */
    public readonly sensitiveConfigProperties!: pulumi.Output<string[] | undefined>;

    /**
     * Create a CustomConnectorPlugin resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomConnectorPluginArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomConnectorPluginArgs | CustomConnectorPluginState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomConnectorPluginState | undefined;
            resourceInputs["cloud"] = state ? state.cloud : undefined;
            resourceInputs["connectorClass"] = state ? state.connectorClass : undefined;
            resourceInputs["connectorType"] = state ? state.connectorType : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["documentationLink"] = state ? state.documentationLink : undefined;
            resourceInputs["filename"] = state ? state.filename : undefined;
            resourceInputs["sensitiveConfigProperties"] = state ? state.sensitiveConfigProperties : undefined;
        } else {
            const args = argsOrState as CustomConnectorPluginArgs | undefined;
            if ((!args || args.connectorClass === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectorClass'");
            }
            if ((!args || args.connectorType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectorType'");
            }
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.filename === undefined) && !opts.urn) {
                throw new Error("Missing required property 'filename'");
            }
            resourceInputs["cloud"] = args ? args.cloud : undefined;
            resourceInputs["connectorClass"] = args ? args.connectorClass : undefined;
            resourceInputs["connectorType"] = args ? args.connectorType : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["documentationLink"] = args ? args.documentationLink : undefined;
            resourceInputs["filename"] = args ? args.filename : undefined;
            resourceInputs["sensitiveConfigProperties"] = args ? args.sensitiveConfigProperties : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomConnectorPlugin.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomConnectorPlugin resources.
 */
export interface CustomConnectorPluginState {
    /**
     * Cloud provider where the Custom Connector Plugin archive is uploaded. Defaults to `AWS`. Accepted values are: `AWS`, `AZURE`.
     */
    cloud?: pulumi.Input<string>;
    /**
     * The Java class or alias for the connector. You can get the connector class from the connector documentation provided by the developer.
     */
    connectorClass?: pulumi.Input<string>;
    /**
     * The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
     */
    connectorType?: pulumi.Input<string>;
    /**
     * The description of the Custom Connector Plugin.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the Custom Connector Plugin.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The documentation link of the Custom Connector Plugin.
     */
    documentationLink?: pulumi.Input<string>;
    /**
     * The path to the Custom Connector Plugin archive to be uploaded. Accepted archive formats are: `.jar`, `.zip`.
     */
    filename?: pulumi.Input<string>;
    /**
     * The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
     */
    sensitiveConfigProperties?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a CustomConnectorPlugin resource.
 */
export interface CustomConnectorPluginArgs {
    /**
     * Cloud provider where the Custom Connector Plugin archive is uploaded. Defaults to `AWS`. Accepted values are: `AWS`, `AZURE`.
     */
    cloud?: pulumi.Input<string>;
    /**
     * The Java class or alias for the connector. You can get the connector class from the connector documentation provided by the developer.
     */
    connectorClass: pulumi.Input<string>;
    /**
     * The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
     */
    connectorType: pulumi.Input<string>;
    /**
     * The description of the Custom Connector Plugin.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the Custom Connector Plugin.
     */
    displayName: pulumi.Input<string>;
    /**
     * The documentation link of the Custom Connector Plugin.
     */
    documentationLink?: pulumi.Input<string>;
    /**
     * The path to the Custom Connector Plugin archive to be uploaded. Accepted archive formats are: `.jar`, `.zip`.
     */
    filename: pulumi.Input<string>;
    /**
     * The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
     */
    sensitiveConfigProperties?: pulumi.Input<pulumi.Input<string>[]>;
}
