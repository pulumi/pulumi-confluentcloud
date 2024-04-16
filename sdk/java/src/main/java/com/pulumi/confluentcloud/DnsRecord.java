// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.DnsRecordArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.DnsRecordState;
import com.pulumi.confluentcloud.outputs.DnsRecordEnvironment;
import com.pulumi.confluentcloud.outputs.DnsRecordGateway;
import com.pulumi.confluentcloud.outputs.DnsRecordPrivateLinkAccessPoint;
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
 * `confluentcloud.DnsRecord` provides a DNS Record resource that enables creating, editing, and deleting DNS Records on Confluent Cloud.
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
 * import com.pulumi.confluentcloud.Environment;
 * import com.pulumi.confluentcloud.EnvironmentArgs;
 * import com.pulumi.confluentcloud.DnsRecord;
 * import com.pulumi.confluentcloud.DnsRecordArgs;
 * import com.pulumi.confluentcloud.inputs.DnsRecordEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.DnsRecordGatewayArgs;
 * import com.pulumi.confluentcloud.inputs.DnsRecordPrivateLinkAccessPointArgs;
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
 *         var main = new DnsRecord(&#34;main&#34;, DnsRecordArgs.builder()        
 *             .displayName(&#34;dns_record&#34;)
 *             .environment(DnsRecordEnvironmentArgs.builder()
 *                 .id(development.id())
 *                 .build())
 *             .domain(&#34;example.com&#34;)
 *             .gateway(DnsRecordGatewayArgs.builder()
 *                 .id(mainConfluentNetwork.gateway()[0].id())
 *                 .build())
 *             .privateLinkAccessPoint(DnsRecordPrivateLinkAccessPointArgs.builder()
 *                 .id(mainConfluentAccessPoint.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * You can import a DNS Record by using Environment ID and DNS Record ID, in the format `&lt;Environment ID&gt;/&lt;DNS Record ID&gt;`. The following example shows how to import a DNS Record:
 * 
 * $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 * $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/dnsRecord:DnsRecord main env-abc123/dnsrec-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/dnsRecord:DnsRecord")
public class DnsRecord extends com.pulumi.resources.CustomResource {
    /**
     * The name of the DNS Record.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the DNS Record.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The fully qualified domain name of the DNS Record.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    /**
     * @return The fully qualified domain name of the DNS Record.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={DnsRecordEnvironment.class}, tree="[0]")
    private Output<DnsRecordEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<DnsRecordEnvironment> environment() {
        return this.environment;
    }
    @Export(name="gateway", refs={DnsRecordGateway.class}, tree="[0]")
    private Output<DnsRecordGateway> gateway;

    public Output<DnsRecordGateway> gateway() {
        return this.gateway;
    }
    @Export(name="privateLinkAccessPoint", refs={DnsRecordPrivateLinkAccessPoint.class}, tree="[0]")
    private Output</* @Nullable */ DnsRecordPrivateLinkAccessPoint> privateLinkAccessPoint;

    public Output<Optional<DnsRecordPrivateLinkAccessPoint>> privateLinkAccessPoint() {
        return Codegen.optional(this.privateLinkAccessPoint);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DnsRecord(String name) {
        this(name, DnsRecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DnsRecord(String name, DnsRecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DnsRecord(String name, DnsRecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/dnsRecord:DnsRecord", name, args == null ? DnsRecordArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DnsRecord(String name, Output<String> id, @Nullable DnsRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/dnsRecord:DnsRecord", name, state, makeResourceOptions(options, id));
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
    public static DnsRecord get(String name, Output<String> id, @Nullable DnsRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DnsRecord(name, id, state, options);
    }
}
