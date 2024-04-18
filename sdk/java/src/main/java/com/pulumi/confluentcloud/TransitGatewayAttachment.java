// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.TransitGatewayAttachmentArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.TransitGatewayAttachmentState;
import com.pulumi.confluentcloud.outputs.TransitGatewayAttachmentAws;
import com.pulumi.confluentcloud.outputs.TransitGatewayAttachmentEnvironment;
import com.pulumi.confluentcloud.outputs.TransitGatewayAttachmentNetwork;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Example Transit Gateway Attachment on AWS
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.Environment;
 * import com.pulumi.confluentcloud.EnvironmentArgs;
 * import com.pulumi.confluentcloud.Network;
 * import com.pulumi.confluentcloud.NetworkArgs;
 * import com.pulumi.confluentcloud.inputs.NetworkEnvironmentArgs;
 * import com.pulumi.confluentcloud.TransitGatewayAttachment;
 * import com.pulumi.confluentcloud.TransitGatewayAttachmentArgs;
 * import com.pulumi.confluentcloud.inputs.TransitGatewayAttachmentAwsArgs;
 * import com.pulumi.confluentcloud.inputs.TransitGatewayAttachmentEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.TransitGatewayAttachmentNetworkArgs;
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
 *         var development = new Environment(&#34;development&#34;, EnvironmentArgs.builder()        
 *             .displayName(&#34;Development&#34;)
 *             .build());
 * 
 *         var aws_transit_gateway_attachment = new Network(&#34;aws-transit-gateway-attachment&#34;, NetworkArgs.builder()        
 *             .displayName(&#34;AWS Transit Gateway Attachment Network&#34;)
 *             .cloud(&#34;AWS&#34;)
 *             .region(&#34;us-east-2&#34;)
 *             .cidr(&#34;10.10.0.0/16&#34;)
 *             .connectionTypes(&#34;TRANSITGATEWAY&#34;)
 *             .environment(NetworkEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .build());
 * 
 *         var aws = new TransitGatewayAttachment(&#34;aws&#34;, TransitGatewayAttachmentArgs.builder()        
 *             .displayName(&#34;AWS Transit Gateway Attachment&#34;)
 *             .aws(TransitGatewayAttachmentAwsArgs.builder()
 *                 .ramResourceShareArn(&#34;arn:aws:ram:us-east-2:000000000000:resource-share/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxx&#34;)
 *                 .transitGatewayId(&#34;tgw-xxxxxxxxxxxxxxxxx&#34;)
 *                 .routes(                
 *                     &#34;192.168.0.0/16&#34;,
 *                     &#34;172.16.0.0/12&#34;,
 *                     &#34;100.64.0.0/10&#34;,
 *                     &#34;10.0.0.0/8&#34;)
 *                 .build())
 *             .environment(TransitGatewayAttachmentEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .network(TransitGatewayAttachmentNetworkArgs.builder()
 *                 .id(aws_transit_gateway_attachment.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Getting Started
 * 
 * The following end-to-end examples might help to get started with `confluentcloud.TransitGatewayAttachment` resource:
 *   * `dedicated-transit-gateway-attachment-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
 *   * enterprise-privatelinkattachment-aws-kafka-acls
 * 
 * ## Import
 * 
 * You can import a Transit Gateway Attachment by using Environment ID and Transit Gateway Attachment ID, in the format `&lt;Environment ID&gt;/&lt;Transit Gateway Attachment ID&gt;`. The following example shows how to import a Transit Gateway Attachment:
 * 
 * $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 * $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment my_tgwa env-abc123/tgwa-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment")
public class TransitGatewayAttachment extends com.pulumi.resources.CustomResource {
    /**
     * (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
     * 
     */
    @Export(name="aws", refs={TransitGatewayAttachmentAws.class}, tree="[0]")
    private Output</* @Nullable */ TransitGatewayAttachmentAws> aws;

    /**
     * @return (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
     * 
     */
    public Output<Optional<TransitGatewayAttachmentAws>> aws() {
        return Codegen.optional(this.aws);
    }
    /**
     * The name of the Transit Gateway Attachment.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the Transit Gateway Attachment.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={TransitGatewayAttachmentEnvironment.class}, tree="[0]")
    private Output<TransitGatewayAttachmentEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<TransitGatewayAttachmentEnvironment> environment() {
        return this.environment;
    }
    /**
     * Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    @Export(name="network", refs={TransitGatewayAttachmentNetwork.class}, tree="[0]")
    private Output<TransitGatewayAttachmentNetwork> network;

    /**
     * @return Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
     * accounts.
     * 
     */
    public Output<TransitGatewayAttachmentNetwork> network() {
        return this.network;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGatewayAttachment(String name) {
        this(name, TransitGatewayAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGatewayAttachment(String name, TransitGatewayAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayAttachment(String name, TransitGatewayAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment", name, args == null ? TransitGatewayAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitGatewayAttachment(String name, Output<String> id, @Nullable TransitGatewayAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment", name, state, makeResourceOptions(options, id));
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
    public static TransitGatewayAttachment get(String name, Output<String> id, @Nullable TransitGatewayAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayAttachment(name, id, state, options);
    }
}
