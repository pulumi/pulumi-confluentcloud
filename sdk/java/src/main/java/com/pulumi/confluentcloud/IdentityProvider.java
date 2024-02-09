// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.IdentityProviderArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.IdentityProviderState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 * 
 * `confluentcloud.IdentityProvider` provides an Identity Provider resource that enables creating, editing, and deleting identity providers on Confluent Cloud.
 * 
 * ## Example Usage
 * ### Example Identity Provider: Azure AD
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.IdentityProvider;
 * import com.pulumi.confluentcloud.IdentityProviderArgs;
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
 *             .description(&#34;My description&#34;)
 *             .displayName(&#34;My OIDC Provider: Azure AD&#34;)
 *             .issuer(&#34;https://login.microsoftonline.com/{tenant_id}/v2.0&#34;)
 *             .jwksUri(&#34;https://login.microsoftonline.com/common/discovery/v2.0/keys&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example Identity Provider: Okta
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.IdentityProvider;
 * import com.pulumi.confluentcloud.IdentityProviderArgs;
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
 *             .description(&#34;My description&#34;)
 *             .displayName(&#34;My OIDC Provider: Okta&#34;)
 *             .issuer(&#34;https://mycompany.okta.com/oauth2/default&#34;)
 *             .jwksUri(&#34;https://mycompany.okta.com/oauth2/default/v1/keys&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## External Documentation
 * 
 * * [Authenticating with OAuth](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/overview.html).
 * 
 * ## Import
 * 
 * You can import an Identity Provider by using Identity Provider ID, for example:
 * 
 *  $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 *  $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/identityProvider:IdentityProvider example op-abc123
 * ```
 * 
 *  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/identityProvider:IdentityProvider")
public class IdentityProvider extends com.pulumi.resources.CustomResource {
    /**
     * A description for the Identity Provider.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return A description for the Identity Provider.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * A human-readable name for the Identity Provider.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return A human-readable name for the Identity Provider.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
     * 
     */
    @Export(name="issuer", refs={String.class}, tree="[0]")
    private Output<String> issuer;

    /**
     * @return A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }
    /**
     * A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
     * 
     * &gt; **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
     * 
     */
    @Export(name="jwksUri", refs={String.class}, tree="[0]")
    private Output<String> jwksUri;

    /**
     * @return A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
     * 
     * &gt; **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
     * 
     */
    public Output<String> jwksUri() {
        return this.jwksUri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IdentityProvider(String name) {
        this(name, IdentityProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IdentityProvider(String name, IdentityProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IdentityProvider(String name, IdentityProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/identityProvider:IdentityProvider", name, args == null ? IdentityProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IdentityProvider(String name, Output<String> id, @Nullable IdentityProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/identityProvider:IdentityProvider", name, state, makeResourceOptions(options, id));
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
    public static IdentityProvider get(String name, Output<String> id, @Nullable IdentityProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IdentityProvider(name, id, state, options);
    }
}
