// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.DnsForwarderArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.DnsForwarderState;
import com.pulumi.confluentcloud.outputs.DnsForwarderEnvironment;
import com.pulumi.confluentcloud.outputs.DnsForwarderForwardViaIp;
import com.pulumi.confluentcloud.outputs.DnsForwarderGateway;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 * 
 * `confluentcloud.DnsForwarder` provides a DNS Forwarder resource that enables creating, editing, and deleting DNS Forwarders on Confluent Cloud.
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
 * import com.pulumi.confluentcloud.DnsForwarder;
 * import com.pulumi.confluentcloud.DnsForwarderArgs;
 * import com.pulumi.confluentcloud.inputs.DnsForwarderEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.DnsForwarderGatewayArgs;
 * import com.pulumi.confluentcloud.inputs.DnsForwarderForwardViaIpArgs;
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
 *         var main = new DnsForwarder("main", DnsForwarderArgs.builder()
 *             .displayName("dns_forwarder")
 *             .environment(DnsForwarderEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .domains(            
 *                 "example.com",
 *                 "domainname.com")
 *             .gateway(DnsForwarderGatewayArgs.builder()
 *                 .id(mainConfluentNetwork.gateway()[0].id())
 *                 .build())
 *             .forwardViaIp(DnsForwarderForwardViaIpArgs.builder()
 *                 .dnsServerIps(                
 *                     "10.200.0.0",
 *                     "10.200.0.1")
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
 * You can import a DNS Forwarder by using Environment ID and DNS Forwarder ID, in the format `&lt;Environment ID&gt;/&lt;DNS Forwarder ID&gt;`. The following example shows how to import a DNS Forwarder:
 * 
 * $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 * $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/dnsForwarder:DnsForwarder main env-abc123/dnsf-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/dnsForwarder:DnsForwarder")
public class DnsForwarder extends com.pulumi.resources.CustomResource {
    /**
     * The name of the DNS Forwarder.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the DNS Forwarder.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * List of domains for the DNS forwarder to use.
     * 
     */
    @Export(name="domains", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> domains;

    /**
     * @return List of domains for the DNS forwarder to use.
     * 
     */
    public Output<List<String>> domains() {
        return this.domains;
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={DnsForwarderEnvironment.class}, tree="[0]")
    private Output<DnsForwarderEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<DnsForwarderEnvironment> environment() {
        return this.environment;
    }
    @Export(name="forwardViaIp", refs={DnsForwarderForwardViaIp.class}, tree="[0]")
    private Output</* @Nullable */ DnsForwarderForwardViaIp> forwardViaIp;

    public Output<Optional<DnsForwarderForwardViaIp>> forwardViaIp() {
        return Codegen.optional(this.forwardViaIp);
    }
    @Export(name="gateway", refs={DnsForwarderGateway.class}, tree="[0]")
    private Output<DnsForwarderGateway> gateway;

    public Output<DnsForwarderGateway> gateway() {
        return this.gateway;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DnsForwarder(String name) {
        this(name, DnsForwarderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DnsForwarder(String name, DnsForwarderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DnsForwarder(String name, DnsForwarderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/dnsForwarder:DnsForwarder", name, args == null ? DnsForwarderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DnsForwarder(String name, Output<String> id, @Nullable DnsForwarderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/dnsForwarder:DnsForwarder", name, state, makeResourceOptions(options, id));
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
    public static DnsForwarder get(String name, Output<String> id, @Nullable DnsForwarderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DnsForwarder(name, id, state, options);
    }
}
