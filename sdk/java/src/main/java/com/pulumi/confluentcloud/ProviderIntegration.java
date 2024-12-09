// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.ProviderIntegrationArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.ProviderIntegrationState;
import com.pulumi.confluentcloud.outputs.ProviderIntegrationAws;
import com.pulumi.confluentcloud.outputs.ProviderIntegrationEnvironment;
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
 * import com.pulumi.confluentcloud.inputs.EnvironmentStreamGovernanceArgs;
 * import com.pulumi.confluentcloud.ProviderIntegration;
 * import com.pulumi.confluentcloud.ProviderIntegrationArgs;
 * import com.pulumi.confluentcloud.inputs.ProviderIntegrationEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.ProviderIntegrationAwsArgs;
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
 *         var staging = new Environment("staging", EnvironmentArgs.builder()
 *             .displayName("Staging")
 *             .streamGovernance(EnvironmentStreamGovernanceArgs.builder()
 *                 .package_("ESSENTIALS")
 *                 .build())
 *             .build());
 * 
 *         var main = new ProviderIntegration("main", ProviderIntegrationArgs.builder()
 *             .environment(ProviderIntegrationEnvironmentArgs.builder()
 *                 .id(staging.id())
 *                 .build())
 *             .aws(ProviderIntegrationAwsArgs.builder()
 *                 .customerRoleArn(customerRoleArn)
 *                 .build())
 *             .displayName("provider_integration_main")
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
 * You can import a Provider Integration by using Environment ID and Provider Integration ID, in the format `&lt;Environment ID&gt;/&lt;Provider Integration ID&gt;`. The following example shows how to import a Provider Integration:
 * 
 * $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 * $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/providerIntegration:ProviderIntegration main env-abc123/cspi-4xg0q
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/providerIntegration:ProviderIntegration")
public class ProviderIntegration extends com.pulumi.resources.CustomResource {
    /**
     * (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
     * 
     */
    @Export(name="aws", refs={ProviderIntegrationAws.class}, tree="[0]")
    private Output</* @Nullable */ ProviderIntegrationAws> aws;

    /**
     * @return (Required Configuration Block) The AWS-specific Provider Integration config details. It supports the following:
     * 
     */
    public Output<Optional<ProviderIntegrationAws>> aws() {
        return Codegen.optional(this.aws);
    }
    /**
     * The name of the Provider Integration.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the Provider Integration.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={ProviderIntegrationEnvironment.class}, tree="[0]")
    private Output<ProviderIntegrationEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<ProviderIntegrationEnvironment> environment() {
        return this.environment;
    }
    /**
     * (Required List of Strings) List of resource CRNs where this provider integration is being used.
     * 
     */
    @Export(name="usages", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> usages;

    /**
     * @return (Required List of Strings) List of resource CRNs where this provider integration is being used.
     * 
     */
    public Output<List<String>> usages() {
        return this.usages;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProviderIntegration(java.lang.String name) {
        this(name, ProviderIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProviderIntegration(java.lang.String name, ProviderIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProviderIntegration(java.lang.String name, ProviderIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/providerIntegration:ProviderIntegration", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ProviderIntegration(java.lang.String name, Output<java.lang.String> id, @Nullable ProviderIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/providerIntegration:ProviderIntegration", name, state, makeResourceOptions(options, id), false);
    }

    private static ProviderIntegrationArgs makeArgs(ProviderIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProviderIntegrationArgs.Empty : args;
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
    public static ProviderIntegration get(java.lang.String name, Output<java.lang.String> id, @Nullable ProviderIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProviderIntegration(name, id, state, options);
    }
}