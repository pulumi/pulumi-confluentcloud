// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.CustomConnectorPluginArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.CustomConnectorPluginState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.CustomConnectorPlugin;
 * import com.pulumi.confluentcloud.CustomConnectorPluginArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var source = new CustomConnectorPlugin(&#34;source&#34;, CustomConnectorPluginArgs.builder()        
 *             .connectorClass(&#34;io.confluent.kafka.connect.datagen.DatagenConnector&#34;)
 *             .connectorType(&#34;SOURCE&#34;)
 *             .displayName(&#34;Datagen Source Connector Plugin&#34;)
 *             .documentationLink(&#34;https://www.confluent.io/hub/confluentinc/kafka-connect-datagen&#34;)
 *             .filename(&#34;confluentinc-kafka-connect-datagen-0.6.2.zip&#34;)
 *             .sensitiveConfigProperties()
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * You can import a Custom Connector Plugin by using a Custom Connector Plugin ID, in the format `&lt;Custom Connector Plugin&gt;`. The following example shows how to import a Custom Connector Plugin$ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34; $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 *  $ pulumi import confluentcloud:index/customConnectorPlugin:CustomConnectorPlugin main ccp-abc123xyz
 * ```
 * 
 *  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/customConnectorPlugin:CustomConnectorPlugin")
public class CustomConnectorPlugin extends com.pulumi.resources.CustomResource {
    /**
     * The Java class or alias for the connector. You can get the connector class from the connector documentation provided by the developer.
     * 
     */
    @Export(name="connectorClass", refs={String.class}, tree="[0]")
    private Output<String> connectorClass;

    /**
     * @return The Java class or alias for the connector. You can get the connector class from the connector documentation provided by the developer.
     * 
     */
    public Output<String> connectorClass() {
        return this.connectorClass;
    }
    /**
     * The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
     * 
     */
    @Export(name="connectorType", refs={String.class}, tree="[0]")
    private Output<String> connectorType;

    /**
     * @return The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
     * 
     */
    public Output<String> connectorType() {
        return this.connectorType;
    }
    /**
     * The description of the Custom Connector Plugin.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Custom Connector Plugin.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the Custom Connector Plugin.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the Custom Connector Plugin.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The documentation link of the Custom Connector Plugin.
     * 
     */
    @Export(name="documentationLink", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> documentationLink;

    /**
     * @return The documentation link of the Custom Connector Plugin.
     * 
     */
    public Output<Optional<String>> documentationLink() {
        return Codegen.optional(this.documentationLink);
    }
    /**
     * The path to the Custom Connector Plugin archive to be uploaded. Accepted archive formats are: `.jar`, `.zip`.
     * 
     */
    @Export(name="filename", refs={String.class}, tree="[0]")
    private Output<String> filename;

    /**
     * @return The path to the Custom Connector Plugin archive to be uploaded. Accepted archive formats are: `.jar`, `.zip`.
     * 
     */
    public Output<String> filename() {
        return this.filename;
    }
    /**
     * The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
     * 
     */
    @Export(name="sensitiveConfigProperties", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sensitiveConfigProperties;

    /**
     * @return The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
     * 
     */
    public Output<Optional<List<String>>> sensitiveConfigProperties() {
        return Codegen.optional(this.sensitiveConfigProperties);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomConnectorPlugin(String name) {
        this(name, CustomConnectorPluginArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomConnectorPlugin(String name, CustomConnectorPluginArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomConnectorPlugin(String name, CustomConnectorPluginArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/customConnectorPlugin:CustomConnectorPlugin", name, args == null ? CustomConnectorPluginArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomConnectorPlugin(String name, Output<String> id, @Nullable CustomConnectorPluginState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/customConnectorPlugin:CustomConnectorPlugin", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CustomConnectorPlugin get(String name, Output<String> id, @Nullable CustomConnectorPluginState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomConnectorPlugin(name, id, state, options);
    }
}
