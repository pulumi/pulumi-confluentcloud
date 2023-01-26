// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.IdentityPoolArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.IdentityPoolState;
import com.pulumi.confluentcloud.outputs.IdentityPoolIdentityProvider;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 * 
 * `confluentcloud.IdentityPool` provides an Identity Pool resource that enables creating, editing, and deleting identity pools on Confluent Cloud.
 * 
 * ## Example Usage
 * ### Example Identity Pool to be used with Azure AD
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.IdentityProvider;
 * import com.pulumi.confluentcloud.IdentityProviderArgs;
 * import com.pulumi.confluentcloud.IdentityPool;
 * import com.pulumi.confluentcloud.IdentityPoolArgs;
 * import com.pulumi.confluentcloud.inputs.IdentityPoolIdentityProviderArgs;
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
 *         var azure = new IdentityProvider(&#34;azure&#34;, IdentityProviderArgs.builder()        
 *             .displayName(&#34;My OIDC Provider: Azure AD&#34;)
 *             .description(&#34;My description&#34;)
 *             .issuer(&#34;https://login.microsoftonline.com/{tenant_id}/v2.0&#34;)
 *             .jwksUri(&#34;https://login.microsoftonline.com/common/discovery/v2.0/keys&#34;)
 *             .build());
 * 
 *         var example = new IdentityPool(&#34;example&#34;, IdentityPoolArgs.builder()        
 *             .identityProvider(IdentityPoolIdentityProviderArgs.builder()
 *                 .id(azure.id())
 *                 .build())
 *             .displayName(&#34;My Identity Pool&#34;)
 *             .description(&#34;Prod Access to Kafka clusters to Release Engineering&#34;)
 *             .identityClaim(&#34;claims.sub&#34;)
 *             .filter(&#34;claims.aud==\&#34;confluent\&#34; &amp;&amp; claims.group!=\&#34;invalid_group\&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example Identity Pool to be used with Okta
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.IdentityProvider;
 * import com.pulumi.confluentcloud.IdentityProviderArgs;
 * import com.pulumi.confluentcloud.IdentityPool;
 * import com.pulumi.confluentcloud.IdentityPoolArgs;
 * import com.pulumi.confluentcloud.inputs.IdentityPoolIdentityProviderArgs;
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
 *         var okta = new IdentityProvider(&#34;okta&#34;, IdentityProviderArgs.builder()        
 *             .displayName(&#34;My OIDC Provider: Okta&#34;)
 *             .description(&#34;My description&#34;)
 *             .issuer(&#34;https://mycompany.okta.com/oauth2/default&#34;)
 *             .jwksUri(&#34;https://mycompany.okta.com/oauth2/default/v1/keys&#34;)
 *             .build());
 * 
 *         var example = new IdentityPool(&#34;example&#34;, IdentityPoolArgs.builder()        
 *             .identityProvider(IdentityPoolIdentityProviderArgs.builder()
 *                 .id(okta.id())
 *                 .build())
 *             .displayName(&#34;My Identity Pool&#34;)
 *             .description(&#34;Prod Access to Kafka clusters to Release Engineering&#34;)
 *             .identityClaim(&#34;claims.sub&#34;)
 *             .filter(&#34;claims.aud==\&#34;confluent\&#34; &amp;&amp; claims.group!=\&#34;invalid_group\&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## External Documentation
 * 
 * * [Use identity pools with your OAuth provider](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html).
 * 
 * ## Import
 * 
 * You can import an Identity Pool by using Identity Provider ID and Identity Pool ID, in the format `&lt;Identity Provider ID&gt;/&lt;Identity Pool ID&gt;`. The following example shows how to import an Identity Pool$ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34; $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 *  $ pulumi import confluentcloud:index/identityPool:IdentityPool example op-abc123/pool-xyz456
 * ```
 * 
 *  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/identityPool:IdentityPool")
public class IdentityPool extends com.pulumi.resources.CustomResource {
    /**
     * A description for the Identity Pool.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description for the Identity Pool.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * A human-readable name for the Identity Pool.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A human-readable name for the Identity Pool.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
     * 
     */
    @Export(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }
    /**
     * The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that &#34;identity Z used identity pool X to access topic A&#34;.
     * 
     */
    @Export(name="identityClaim", type=String.class, parameters={})
    private Output<String> identityClaim;

    /**
     * @return The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that &#34;identity Z used identity pool X to access topic A&#34;.
     * 
     */
    public Output<String> identityClaim() {
        return this.identityClaim;
    }
    /**
     * Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
     * 
     */
    @Export(name="identityProvider", type=IdentityPoolIdentityProvider.class, parameters={})
    private Output<IdentityPoolIdentityProvider> identityProvider;

    /**
     * @return Identity Provider objects represent external OAuth/OpenID Connect providers within Confluent Cloud.
     * 
     */
    public Output<IdentityPoolIdentityProvider> identityProvider() {
        return this.identityProvider;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IdentityPool(String name) {
        this(name, IdentityPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IdentityPool(String name, IdentityPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IdentityPool(String name, IdentityPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/identityPool:IdentityPool", name, args == null ? IdentityPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IdentityPool(String name, Output<String> id, @Nullable IdentityPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/identityPool:IdentityPool", name, state, makeResourceOptions(options, id));
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
    public static IdentityPool get(String name, Output<String> id, @Nullable IdentityPoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IdentityPool(name, id, state, options);
    }
}
