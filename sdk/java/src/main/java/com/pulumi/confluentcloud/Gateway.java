// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.GatewayArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.GatewayState;
import com.pulumi.confluentcloud.outputs.GatewayAwsEgressPrivateLinkGateway;
import com.pulumi.confluentcloud.outputs.GatewayAzureEgressPrivateLinkGateway;
import com.pulumi.confluentcloud.outputs.GatewayEnvironment;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 * 
 * `confluentcloud.Gateway` provides a Gateway resource that enables creating, editing, and deleting Gateways on Confluent Cloud.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.Environment;
 * import com.pulumi.confluentcloud.EnvironmentArgs;
 * import com.pulumi.confluentcloud.Gateway;
 * import com.pulumi.confluentcloud.GatewayArgs;
 * import com.pulumi.confluentcloud.inputs.GatewayEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.GatewayAwsEgressPrivateLinkGatewayArgs;
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
 *         var development = new Environment("development", EnvironmentArgs.builder()
 *             .displayName("Development")
 *             .build());
 * 
 *         var main = new Gateway("main", GatewayArgs.builder()
 *             .displayName("my_gateway")
 *             .environment(GatewayEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .awsEgressPrivateLinkGateway(GatewayAwsEgressPrivateLinkGatewayArgs.builder()
 *                 .region("us-west-2")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * You can import a Gateway by using Environment ID and Gateway ID, in the format `&lt;Environment ID&gt;/&lt;Gateway ID&gt;`. The following example shows how to import a Gateway:
 * 
 * $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 * $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/gateway:Gateway main env-abc123/gw-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/gateway:Gateway")
public class Gateway extends com.pulumi.resources.CustomResource {
    /**
     * (Optional Configuration Block) supports the following:
     * 
     */
    @Export(name="awsEgressPrivateLinkGateway", refs={GatewayAwsEgressPrivateLinkGateway.class}, tree="[0]")
    private Output<GatewayAwsEgressPrivateLinkGateway> awsEgressPrivateLinkGateway;

    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public Output<GatewayAwsEgressPrivateLinkGateway> awsEgressPrivateLinkGateway() {
        return this.awsEgressPrivateLinkGateway;
    }
    /**
     * (Optional Configuration Block) supports the following:
     * 
     */
    @Export(name="azureEgressPrivateLinkGateway", refs={GatewayAzureEgressPrivateLinkGateway.class}, tree="[0]")
    private Output<GatewayAzureEgressPrivateLinkGateway> azureEgressPrivateLinkGateway;

    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public Output<GatewayAzureEgressPrivateLinkGateway> azureEgressPrivateLinkGateway() {
        return this.azureEgressPrivateLinkGateway;
    }
    /**
     * The name of the Gateway.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the Gateway.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={GatewayEnvironment.class}, tree="[0]")
    private Output<GatewayEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<GatewayEnvironment> environment() {
        return this.environment;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gateway(java.lang.String name) {
        this(name, GatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gateway(java.lang.String name, GatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gateway(java.lang.String name, GatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/gateway:Gateway", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Gateway(java.lang.String name, Output<java.lang.String> id, @Nullable GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/gateway:Gateway", name, state, makeResourceOptions(options, id), false);
    }

    private static GatewayArgs makeArgs(GatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GatewayArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Gateway get(java.lang.String name, Output<java.lang.String> id, @Nullable GatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Gateway(name, id, state, options);
    }
}
