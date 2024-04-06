// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.PrivateLinkAttachmentConnectionArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentConnectionState;
import com.pulumi.confluentcloud.outputs.PrivateLinkAttachmentConnectionAws;
import com.pulumi.confluentcloud.outputs.PrivateLinkAttachmentConnectionAzure;
import com.pulumi.confluentcloud.outputs.PrivateLinkAttachmentConnectionEnvironment;
import com.pulumi.confluentcloud.outputs.PrivateLinkAttachmentConnectionGcp;
import com.pulumi.confluentcloud.outputs.PrivateLinkAttachmentConnectionPrivateLinkAttachment;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 * 
 * `confluentcloud.PrivateLinkAttachmentConnection` provides a Private Link Attachment Connection resource that enables creating, editing, and deleting Private Link Attachment Connections on Confluent Cloud.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.PrivateLinkAttachmentConnection;
 * import com.pulumi.confluentcloud.PrivateLinkAttachmentConnectionArgs;
 * import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentConnectionEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentConnectionAwsArgs;
 * import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs;
 * import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentConnectionAzureArgs;
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
 *         var aws = new PrivateLinkAttachmentConnection(&#34;aws&#34;, PrivateLinkAttachmentConnectionArgs.builder()        
 *             .displayName(&#34;my_endpoint&#34;)
 *             .environment(PrivateLinkAttachmentConnectionEnvironmentArgs.builder()
 *                 .id(&#34;env-8gv0v5&#34;)
 *                 .build())
 *             .aws(PrivateLinkAttachmentConnectionAwsArgs.builder()
 *                 .vpcEndpointId(&#34;vpce-0ed4d51f5d6ef9b6d&#34;)
 *                 .build())
 *             .privateLinkAttachment(PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs.builder()
 *                 .id(&#34;platt-plyvyl&#34;)
 *                 .build())
 *             .build());
 * 
 *         var azure = new PrivateLinkAttachmentConnection(&#34;azure&#34;, PrivateLinkAttachmentConnectionArgs.builder()        
 *             .displayName(&#34;prod-azure-central-us-az1-connection&#34;)
 *             .environment(PrivateLinkAttachmentConnectionEnvironmentArgs.builder()
 *                 .id(&#34;env-12345&#34;)
 *                 .build())
 *             .azure(PrivateLinkAttachmentConnectionAzureArgs.builder()
 *                 .privateEndpointResourceId(&#34;/subscriptions/123aaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa/resourceGroups/testvpc/providers/Microsoft.Network/privateEndpoints/pe-platt-abcdef-az1&#34;)
 *                 .build())
 *             .privateLinkAttachment(PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs.builder()
 *                 .id(&#34;platt-abcdef&#34;)
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;privateLinkAttachmentConnection&#34;, aws);
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Getting Started
 * 
 * The following end-to-end examples might help to get started with `confluentcloud.PrivateLinkAttachmentConnection` resource:
 * * enterprise-privatelinkattachment-aws-kafka-acls
 * 
 * ## Import
 * 
 * You can import a Private Link Attachment Connection by using Environment ID and Private Link Attachment Connection ID, in the format `&lt;Environment ID&gt;/&lt;Private Link Attachment Connection ID&gt;`. The following example shows how to import a Private Link Attachment Connection:
 * 
 * $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 * $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection main env-abc123/plattc-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection")
public class PrivateLinkAttachmentConnection extends com.pulumi.resources.CustomResource {
    @Export(name="aws", refs={PrivateLinkAttachmentConnectionAws.class}, tree="[0]")
    private Output</* @Nullable */ PrivateLinkAttachmentConnectionAws> aws;

    public Output<Optional<PrivateLinkAttachmentConnectionAws>> aws() {
        return Codegen.optional(this.aws);
    }
    @Export(name="azure", refs={PrivateLinkAttachmentConnectionAzure.class}, tree="[0]")
    private Output</* @Nullable */ PrivateLinkAttachmentConnectionAzure> azure;

    public Output<Optional<PrivateLinkAttachmentConnectionAzure>> azure() {
        return Codegen.optional(this.azure);
    }
    /**
     * The name of the Private Link Attachment Connection.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the Private Link Attachment Connection.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={PrivateLinkAttachmentConnectionEnvironment.class}, tree="[0]")
    private Output<PrivateLinkAttachmentConnectionEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<PrivateLinkAttachmentConnectionEnvironment> environment() {
        return this.environment;
    }
    @Export(name="gcp", refs={PrivateLinkAttachmentConnectionGcp.class}, tree="[0]")
    private Output</* @Nullable */ PrivateLinkAttachmentConnectionGcp> gcp;

    public Output<Optional<PrivateLinkAttachmentConnectionGcp>> gcp() {
        return Codegen.optional(this.gcp);
    }
    /**
     * The private_link_attachment to which this belongs.
     * 
     */
    @Export(name="privateLinkAttachment", refs={PrivateLinkAttachmentConnectionPrivateLinkAttachment.class}, tree="[0]")
    private Output<PrivateLinkAttachmentConnectionPrivateLinkAttachment> privateLinkAttachment;

    /**
     * @return The private_link_attachment to which this belongs.
     * 
     */
    public Output<PrivateLinkAttachmentConnectionPrivateLinkAttachment> privateLinkAttachment() {
        return this.privateLinkAttachment;
    }
    /**
     * (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
     * 
     */
    @Export(name="resourceName", refs={String.class}, tree="[0]")
    private Output<String> resourceName;

    /**
     * @return (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateLinkAttachmentConnection(String name) {
        this(name, PrivateLinkAttachmentConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateLinkAttachmentConnection(String name, PrivateLinkAttachmentConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateLinkAttachmentConnection(String name, PrivateLinkAttachmentConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection", name, args == null ? PrivateLinkAttachmentConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateLinkAttachmentConnection(String name, Output<String> id, @Nullable PrivateLinkAttachmentConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection", name, state, makeResourceOptions(options, id));
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
    public static PrivateLinkAttachmentConnection get(String name, Output<String> id, @Nullable PrivateLinkAttachmentConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkAttachmentConnection(name, id, state, options);
    }
}
