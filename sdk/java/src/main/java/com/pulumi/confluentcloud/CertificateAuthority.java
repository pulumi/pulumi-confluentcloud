// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.CertificateAuthorityArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.CertificateAuthorityState;
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
 * `confluentcloud.CertificateAuthority` provides a Certificate Authority resource that enables creating, editing, and deleting Certificate Authorities on Confluent Cloud.
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
 * import com.pulumi.confluentcloud.CertificateAuthority;
 * import com.pulumi.confluentcloud.CertificateAuthorityArgs;
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
 *         var main = new CertificateAuthority("main", CertificateAuthorityArgs.builder()
 *             .displayName("my_certificate_authority")
 *             .description("description")
 *             .certificateChainFilename("certificate.pem")
 *             .certificateChain("***REDACTED***")
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
 * You can import a Certificate Authority by using Certificate Authority ID, for example:
 * 
 * $ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34;
 * 
 * $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/certificateAuthority:CertificateAuthority main op-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/certificateAuthority:CertificateAuthority")
public class CertificateAuthority extends com.pulumi.resources.CustomResource {
    /**
     * A PEM encoded string containing the signing certificate chain.
     * 
     */
    @Export(name="certificateChain", refs={String.class}, tree="[0]")
    private Output<String> certificateChain;

    /**
     * @return A PEM encoded string containing the signing certificate chain.
     * 
     */
    public Output<String> certificateChain() {
        return this.certificateChain;
    }
    /**
     * The name of the certificate file.
     * 
     */
    @Export(name="certificateChainFilename", refs={String.class}, tree="[0]")
    private Output<String> certificateChainFilename;

    /**
     * @return The name of the certificate file.
     * 
     */
    public Output<String> certificateChainFilename() {
        return this.certificateChainFilename;
    }
    /**
     * A PEM encoded string containing the CRL for this certificate authority.
     * 
     */
    @Export(name="crlChain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> crlChain;

    /**
     * @return A PEM encoded string containing the CRL for this certificate authority.
     * 
     */
    public Output<Optional<String>> crlChain() {
        return Codegen.optional(this.crlChain);
    }
    /**
     * (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL).
     * 
     */
    @Export(name="crlSource", refs={String.class}, tree="[0]")
    private Output<String> crlSource;

    /**
     * @return (Optional String) The source specifies whether the Certificate Revocation List (CRL) is updated from either local file uploaded (LOCAL) or from url of CRL (URL).
     * 
     */
    public Output<String> crlSource() {
        return this.crlSource;
    }
    /**
     * (Optional String) The timestamp for when CRL was last updated.
     * 
     */
    @Export(name="crlUpdatedAt", refs={String.class}, tree="[0]")
    private Output<String> crlUpdatedAt;

    /**
     * @return (Optional String) The timestamp for when CRL was last updated.
     * 
     */
    public Output<String> crlUpdatedAt() {
        return this.crlUpdatedAt;
    }
    /**
     * The url from which to fetch the CRL for the certificate authority.
     * 
     */
    @Export(name="crlUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> crlUrl;

    /**
     * @return The url from which to fetch the CRL for the certificate authority.
     * 
     */
    public Output<Optional<String>> crlUrl() {
        return Codegen.optional(this.crlUrl);
    }
    /**
     * A description of the Certificate Authority.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return A description of the Certificate Authority.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The name of the Certificate Authority.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the Certificate Authority.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Required List of Strings) The expiration dates of certificates in the chain.
     * 
     */
    @Export(name="expirationDates", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> expirationDates;

    /**
     * @return (Required List of Strings) The expiration dates of certificates in the chain.
     * 
     */
    public Output<List<String>> expirationDates() {
        return this.expirationDates;
    }
    /**
     * (Required List of Strings) The fingerprints for each certificate in the certificate chain.
     * 
     */
    @Export(name="fingerprints", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> fingerprints;

    /**
     * @return (Required List of Strings) The fingerprints for each certificate in the certificate chain.
     * 
     */
    public Output<List<String>> fingerprints() {
        return this.fingerprints;
    }
    /**
     * (Required List of Strings) The serial numbers for each certificate in the certificate chain.
     * 
     */
    @Export(name="serialNumbers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> serialNumbers;

    /**
     * @return (Required List of Strings) The serial numbers for each certificate in the certificate chain.
     * 
     */
    public Output<List<String>> serialNumbers() {
        return this.serialNumbers;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateAuthority(java.lang.String name) {
        this(name, CertificateAuthorityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateAuthority(java.lang.String name, CertificateAuthorityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateAuthority(java.lang.String name, CertificateAuthorityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/certificateAuthority:CertificateAuthority", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CertificateAuthority(java.lang.String name, Output<java.lang.String> id, @Nullable CertificateAuthorityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/certificateAuthority:CertificateAuthority", name, state, makeResourceOptions(options, id), false);
    }

    private static CertificateAuthorityArgs makeArgs(CertificateAuthorityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CertificateAuthorityArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "certificateChain",
                "crlChain"
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
    public static CertificateAuthority get(java.lang.String name, Output<java.lang.String> id, @Nullable CertificateAuthorityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CertificateAuthority(name, id, state, options);
    }
}
