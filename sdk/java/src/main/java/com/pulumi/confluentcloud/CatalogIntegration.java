// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.CatalogIntegrationArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.CatalogIntegrationState;
import com.pulumi.confluentcloud.outputs.CatalogIntegrationAwsGlue;
import com.pulumi.confluentcloud.outputs.CatalogIntegrationCredentials;
import com.pulumi.confluentcloud.outputs.CatalogIntegrationEnvironment;
import com.pulumi.confluentcloud.outputs.CatalogIntegrationKafkaCluster;
import com.pulumi.confluentcloud.outputs.CatalogIntegrationSnowflake;
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
 * ## Example Usage
 * 
 * ### Option #1: Manage multiple Catalog Integrations in the same Pulumi Stack
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.CatalogIntegration;
 * import com.pulumi.confluentcloud.CatalogIntegrationArgs;
 * import com.pulumi.confluentcloud.inputs.CatalogIntegrationEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.CatalogIntegrationKafkaClusterArgs;
 * import com.pulumi.confluentcloud.inputs.CatalogIntegrationAwsGlueArgs;
 * import com.pulumi.confluentcloud.inputs.CatalogIntegrationCredentialsArgs;
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
 *         var example = new CatalogIntegration("example", CatalogIntegrationArgs.builder()
 *             .environment(CatalogIntegrationEnvironmentArgs.builder()
 *                 .id(staging.id())
 *                 .build())
 *             .kafkaCluster(CatalogIntegrationKafkaClusterArgs.builder()
 *                 .id(stagingConfluentKafkaCluster.id())
 *                 .build())
 *             .displayName("catalog-integration-1")
 *             .awsGlue(CatalogIntegrationAwsGlueArgs.builder()
 *                 .providerIntegrationId(main.id())
 *                 .build())
 *             .credentials(CatalogIntegrationCredentialsArgs.builder()
 *                 .key(env_admin_tableflow_api_key.id())
 *                 .secret(env_admin_tableflow_api_key.secret())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Option #2: Manage a single Catalog Integration in the same Pulumi Stack
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.confluentcloud.CatalogIntegration;
 * import com.pulumi.confluentcloud.CatalogIntegrationArgs;
 * import com.pulumi.confluentcloud.inputs.CatalogIntegrationEnvironmentArgs;
 * import com.pulumi.confluentcloud.inputs.CatalogIntegrationKafkaClusterArgs;
 * import com.pulumi.confluentcloud.inputs.CatalogIntegrationSnowflakeArgs;
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
 *         var example = new CatalogIntegration("example", CatalogIntegrationArgs.builder()
 *             .environment(CatalogIntegrationEnvironmentArgs.builder()
 *                 .id(staging.id())
 *                 .build())
 *             .kafkaCluster(CatalogIntegrationKafkaClusterArgs.builder()
 *                 .id(stagingConfluentKafkaCluster.id())
 *                 .build())
 *             .displayName("catalog-integration-1")
 *             .snowflake(CatalogIntegrationSnowflakeArgs.builder()
 *                 .endpoint("https://vuser1_polaris.snowflakecomputing.com/")
 *                 .clientId("***REDACTED***")
 *                 .clientSecret("***REDACTED***")
 *                 .warehouse("catalog-name")
 *                 .allowedScope("session:role:R1")
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
 * You can import a Catalog Integration by using the Catalog Integration name, Environment ID, and Kafka Cluster ID, in the format `&lt;Environment ID&gt;/&lt;Kafka Cluster ID&gt;/&lt;Catalog Integration Id&gt;`, for example:
 * 
 * Option #1: Manage multiple Catalog Integrations in the same Pulumi Stack
 * 
 * $ export IMPORT_TABLEFLOW_API_KEY=&#34;&lt;tableflow_api_key&gt;&#34;
 * 
 * $ export IMPORT_TABLEFLOW_API_SECRET=&#34;&lt;tableflow_api_secret&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/catalogIntegration:CatalogIntegration example env-abc123/lkc-abc123/tci-abc123
 * ```
 * 
 * Option #2: Manage a single Catalog Integration in the same Pulumi Stack
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/catalogIntegration:CatalogIntegration example env-abc123/lkc-abc123/tci-abc123
 * ```
 * 
 * !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/catalogIntegration:CatalogIntegration")
public class CatalogIntegration extends com.pulumi.resources.CustomResource {
    /**
     * supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
     * 
     */
    @Export(name="awsGlue", refs={CatalogIntegrationAwsGlue.class}, tree="[0]")
    private Output</* @Nullable */ CatalogIntegrationAwsGlue> awsGlue;

    /**
     * @return supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
     * 
     */
    public Output<Optional<CatalogIntegrationAwsGlue>> awsGlue() {
        return Codegen.optional(this.awsGlue);
    }
    /**
     * The Cluster API Credentials.
     * 
     */
    @Export(name="credentials", refs={CatalogIntegrationCredentials.class}, tree="[0]")
    private Output</* @Nullable */ CatalogIntegrationCredentials> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Output<Optional<CatalogIntegrationCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * The name of the catalog integration.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name of the catalog integration.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Export(name="environment", refs={CatalogIntegrationEnvironment.class}, tree="[0]")
    private Output<CatalogIntegrationEnvironment> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<CatalogIntegrationEnvironment> environment() {
        return this.environment;
    }
    @Export(name="kafkaCluster", refs={CatalogIntegrationKafkaCluster.class}, tree="[0]")
    private Output<CatalogIntegrationKafkaCluster> kafkaCluster;

    public Output<CatalogIntegrationKafkaCluster> kafkaCluster() {
        return this.kafkaCluster;
    }
    /**
     * supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
     * 
     */
    @Export(name="snowflake", refs={CatalogIntegrationSnowflake.class}, tree="[0]")
    private Output</* @Nullable */ CatalogIntegrationSnowflake> snowflake;

    /**
     * @return supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
     * 
     */
    public Output<Optional<CatalogIntegrationSnowflake>> snowflake() {
        return Codegen.optional(this.snowflake);
    }
    /**
     * (Optional Boolean) Indicates whether the Catalog Integration should be suspended.
     * 
     */
    @Export(name="suspended", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> suspended;

    /**
     * @return (Optional Boolean) Indicates whether the Catalog Integration should be suspended.
     * 
     */
    public Output<Boolean> suspended() {
        return this.suspended;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CatalogIntegration(java.lang.String name) {
        this(name, CatalogIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CatalogIntegration(java.lang.String name, CatalogIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CatalogIntegration(java.lang.String name, CatalogIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/catalogIntegration:CatalogIntegration", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CatalogIntegration(java.lang.String name, Output<java.lang.String> id, @Nullable CatalogIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/catalogIntegration:CatalogIntegration", name, state, makeResourceOptions(options, id), false);
    }

    private static CatalogIntegrationArgs makeArgs(CatalogIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CatalogIntegrationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "credentials"
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
    public static CatalogIntegration get(java.lang.String name, Output<java.lang.String> id, @Nullable CatalogIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CatalogIntegration(name, id, state, options);
    }
}
