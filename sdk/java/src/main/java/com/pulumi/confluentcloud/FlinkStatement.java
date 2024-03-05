// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.FlinkStatementArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.FlinkStatementState;
import com.pulumi.confluentcloud.outputs.FlinkStatementComputePool;
import com.pulumi.confluentcloud.outputs.FlinkStatementCredentials;
import com.pulumi.confluentcloud.outputs.FlinkStatementEnvironment;
import com.pulumi.confluentcloud.outputs.FlinkStatementOrganization;
import com.pulumi.confluentcloud.outputs.FlinkStatementPrincipal;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * You can import a Flink statement by using the Flink Statement name, for example:
 * 
 *  Option #1: Manage multiple Flink Compute Pools in the same Terraform workspace
 * 
 *  $ export IMPORT_ORGANIZATION_ID=&#34;&lt;organization_id&gt;&#34;
 * 
 *  $ export IMPORT_ENVIRONMENT_ID=&#34;&lt;environment_id&gt;&#34;
 * 
 *  $ export IMPORT_FLINK_COMPUTE_POOL_ID=&#34;&lt;flink_compute_pool_id&gt;&#34;
 * 
 *  $ export IMPORT_FLINK_API_KEY=&#34;&lt;flink_api_key&gt;&#34;
 * 
 *  $ export IMPORT_FLINK_API_SECRET=&#34;&lt;flink_api_secret&gt;&#34;
 * 
 *  $ export IMPORT_FLINK_REST_ENDPOINT=&#34;&lt;flink_rest_endpoint&gt;&#34;
 * 
 *  $ export IMPORT_FLINK_PRINCIPAL_ID=&#34;&lt;flink_rest_endpoint&gt;&#34;
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/flinkStatement:FlinkStatement example cfeab4fe-b62c-49bd-9e99-51cc98c77a67
 * ```
 * 
 *  Option #2: Manage a single Flink Compute Pool in the same Terraform workspace
 * 
 * ```sh
 * $ pulumi import confluentcloud:index/flinkStatement:FlinkStatement example cfeab4fe-b62c-49bd-9e99-51cc98c77a67
 * ```
 * 
 *  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/flinkStatement:FlinkStatement")
public class FlinkStatement extends com.pulumi.resources.CustomResource {
    @Export(name="computePool", refs={FlinkStatementComputePool.class}, tree="[0]")
    private Output<FlinkStatementComputePool> computePool;

    public Output<FlinkStatementComputePool> computePool() {
        return this.computePool;
    }
    /**
     * The Cluster API Credentials.
     * 
     */
    @Export(name="credentials", refs={FlinkStatementCredentials.class}, tree="[0]")
    private Output</* @Nullable */ FlinkStatementCredentials> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Output<Optional<FlinkStatementCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    @Export(name="environment", refs={FlinkStatementEnvironment.class}, tree="[0]")
    private Output<FlinkStatementEnvironment> environment;

    public Output<FlinkStatementEnvironment> environment() {
        return this.environment;
    }
    @Export(name="organization", refs={FlinkStatementOrganization.class}, tree="[0]")
    private Output<FlinkStatementOrganization> organization;

    public Output<FlinkStatementOrganization> organization() {
        return this.organization;
    }
    @Export(name="principal", refs={FlinkStatementPrincipal.class}, tree="[0]")
    private Output<FlinkStatementPrincipal> principal;

    public Output<FlinkStatementPrincipal> principal() {
        return this.principal;
    }
    /**
     * The custom topic settings to set:
     * 
     */
    @Export(name="properties", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> properties;

    /**
     * @return The custom topic settings to set:
     * 
     */
    public Output<Map<String,String>> properties() {
        return this.properties;
    }
    /**
     * The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
     * 
     */
    @Export(name="restEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> restEndpoint;

    /**
     * @return The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
     * 
     */
    public Output<Optional<String>> restEndpoint() {
        return Codegen.optional(this.restEndpoint);
    }
    /**
     * The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
     * 
     */
    @Export(name="statement", refs={String.class}, tree="[0]")
    private Output<String> statement;

    /**
     * @return The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
     * 
     */
    public Output<String> statement() {
        return this.statement;
    }
    /**
     * The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
     * 
     */
    @Export(name="statementName", refs={String.class}, tree="[0]")
    private Output<String> statementName;

    /**
     * @return The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
     * 
     */
    public Output<String> statementName() {
        return this.statementName;
    }
    /**
     * Indicates whether the statement should be stopped.
     * 
     */
    @Export(name="stopped", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> stopped;

    /**
     * @return Indicates whether the statement should be stopped.
     * 
     */
    public Output<Optional<Boolean>> stopped() {
        return Codegen.optional(this.stopped);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlinkStatement(String name) {
        this(name, FlinkStatementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlinkStatement(String name, FlinkStatementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlinkStatement(String name, FlinkStatementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/flinkStatement:FlinkStatement", name, args == null ? FlinkStatementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlinkStatement(String name, Output<String> id, @Nullable FlinkStatementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/flinkStatement:FlinkStatement", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static FlinkStatement get(String name, Output<String> id, @Nullable FlinkStatementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlinkStatement(name, id, state, options);
    }
}
