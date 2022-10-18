// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.ApiKeyArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.ApiKeyState;
import com.pulumi.confluentcloud.outputs.ApiKeyManagedResource;
import com.pulumi.confluentcloud.outputs.ApiKeyOwner;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * You can import a Kafka API Key by using the Environment ID and Kafka API Key ID in the format `&lt;Environment ID&gt;/&lt;Kafka API Key ID&gt;`, for example$ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34; $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34; $ export API_KEY_SECRET=&#34;&lt;api_key_secret&gt;&#34; Option #1Kafka API Key
 * 
 * ```sh
 *  $ pulumi import confluentcloud:index/apiKey:ApiKey example_kafka_api_key &#34;env-abc123/UTT6WDRXX7FHD2GV&#34;
 * ```
 * 
 *  You can import a Cloud API Key by using Cloud API Key ID, for example$ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34; $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34; $ export API_KEY_SECRET=&#34;&lt;api_key_secret&gt;&#34; Option #2Cloud API Key
 * 
 * ```sh
 *  $ pulumi import confluentcloud:index/apiKey:ApiKey example_cloud_api_key &#34;4UEXOMMWIBE5KZQG&#34;
 * ```
 * 
 *  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/apiKey:ApiKey")
public class ApiKey extends com.pulumi.resources.CustomResource {
    /**
     * A free-form description of the API Account.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A free-form description of the API Account.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
     * 
     */
    @Export(name="disableWaitForReady", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableWaitForReady;

    /**
     * @return An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> disableWaitForReady() {
        return Codegen.optional(this.disableWaitForReady);
    }
    /**
     * A human-readable name for the API Key.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A human-readable name for the API Key.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The resource associated with this object. The only resource that is supported is &#39;cmk.v2.KafkaCluster&#39;.
     * 
     */
    @Export(name="managedResource", type=ApiKeyManagedResource.class, parameters={})
    private Output</* @Nullable */ ApiKeyManagedResource> managedResource;

    /**
     * @return The resource associated with this object. The only resource that is supported is &#39;cmk.v2.KafkaCluster&#39;.
     * 
     */
    public Output<Optional<ApiKeyManagedResource>> managedResource() {
        return Codegen.optional(this.managedResource);
    }
    /**
     * The owner to which the API Key belongs. The owner can be one of &#39;iam.v2.User&#39;, &#39;iam.v2.ServiceAccount&#39;.
     * 
     */
    @Export(name="owner", type=ApiKeyOwner.class, parameters={})
    private Output<ApiKeyOwner> owner;

    /**
     * @return The owner to which the API Key belongs. The owner can be one of &#39;iam.v2.User&#39;, &#39;iam.v2.ServiceAccount&#39;.
     * 
     */
    public Output<ApiKeyOwner> owner() {
        return this.owner;
    }
    /**
     * (Required String, Sensitive) The secret of the API Key.
     * 
     */
    @Export(name="secret", type=String.class, parameters={})
    private Output<String> secret;

    /**
     * @return (Required String, Sensitive) The secret of the API Key.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiKey(String name) {
        this(name, ApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiKey(String name, ApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiKey(String name, ApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/apiKey:ApiKey", name, args == null ? ApiKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiKey(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/apiKey:ApiKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "secret"
            ))
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
    public static ApiKey get(String name, Output<String> id, @Nullable ApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiKey(name, id, state, options);
    }
}
