// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.FlinkStatementComputePoolArgs;
import com.pulumi.confluentcloud.inputs.FlinkStatementCredentialsArgs;
import com.pulumi.confluentcloud.inputs.FlinkStatementEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.FlinkStatementOrganizationArgs;
import com.pulumi.confluentcloud.inputs.FlinkStatementPrincipalArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlinkStatementState extends com.pulumi.resources.ResourceArgs {

    public static final FlinkStatementState Empty = new FlinkStatementState();

    @Import(name="computePool")
    private @Nullable Output<FlinkStatementComputePoolArgs> computePool;

    public Optional<Output<FlinkStatementComputePoolArgs>> computePool() {
        return Optional.ofNullable(this.computePool);
    }

    /**
     * The Cluster API Credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<FlinkStatementCredentialsArgs> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Optional<Output<FlinkStatementCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    @Import(name="environment")
    private @Nullable Output<FlinkStatementEnvironmentArgs> environment;

    public Optional<Output<FlinkStatementEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    @Import(name="organization")
    private @Nullable Output<FlinkStatementOrganizationArgs> organization;

    public Optional<Output<FlinkStatementOrganizationArgs>> organization() {
        return Optional.ofNullable(this.organization);
    }

    @Import(name="principal")
    private @Nullable Output<FlinkStatementPrincipalArgs> principal;

    public Optional<Output<FlinkStatementPrincipalArgs>> principal() {
        return Optional.ofNullable(this.principal);
    }

    /**
     * The custom topic settings to set:
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return The custom topic settings to set:
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
     * 
     */
    public Optional<Output<String>> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    /**
     * The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
     * 
     */
    @Import(name="statement")
    private @Nullable Output<String> statement;

    /**
     * @return The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
     * 
     */
    public Optional<Output<String>> statement() {
        return Optional.ofNullable(this.statement);
    }

    /**
     * The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
     * 
     */
    @Import(name="statementName")
    private @Nullable Output<String> statementName;

    /**
     * @return The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
     * 
     */
    public Optional<Output<String>> statementName() {
        return Optional.ofNullable(this.statementName);
    }

    /**
     * Indicates whether the statement should be stopped.
     * 
     */
    @Import(name="stopped")
    private @Nullable Output<Boolean> stopped;

    /**
     * @return Indicates whether the statement should be stopped.
     * 
     */
    public Optional<Output<Boolean>> stopped() {
        return Optional.ofNullable(this.stopped);
    }

    private FlinkStatementState() {}

    private FlinkStatementState(FlinkStatementState $) {
        this.computePool = $.computePool;
        this.credentials = $.credentials;
        this.environment = $.environment;
        this.organization = $.organization;
        this.principal = $.principal;
        this.properties = $.properties;
        this.restEndpoint = $.restEndpoint;
        this.statement = $.statement;
        this.statementName = $.statementName;
        this.stopped = $.stopped;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlinkStatementState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlinkStatementState $;

        public Builder() {
            $ = new FlinkStatementState();
        }

        public Builder(FlinkStatementState defaults) {
            $ = new FlinkStatementState(Objects.requireNonNull(defaults));
        }

        public Builder computePool(@Nullable Output<FlinkStatementComputePoolArgs> computePool) {
            $.computePool = computePool;
            return this;
        }

        public Builder computePool(FlinkStatementComputePoolArgs computePool) {
            return computePool(Output.of(computePool));
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<FlinkStatementCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(FlinkStatementCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        public Builder environment(@Nullable Output<FlinkStatementEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(FlinkStatementEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        public Builder organization(@Nullable Output<FlinkStatementOrganizationArgs> organization) {
            $.organization = organization;
            return this;
        }

        public Builder organization(FlinkStatementOrganizationArgs organization) {
            return organization(Output.of(organization));
        }

        public Builder principal(@Nullable Output<FlinkStatementPrincipalArgs> principal) {
            $.principal = principal;
            return this;
        }

        public Builder principal(FlinkStatementPrincipalArgs principal) {
            return principal(Output.of(principal));
        }

        /**
         * @param properties The custom topic settings to set:
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The custom topic settings to set:
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param restEndpoint The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            return restEndpoint(Output.of(restEndpoint));
        }

        /**
         * @param statement The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
         * 
         * @return builder
         * 
         */
        public Builder statement(@Nullable Output<String> statement) {
            $.statement = statement;
            return this;
        }

        /**
         * @param statement The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
         * 
         * @return builder
         * 
         */
        public Builder statement(String statement) {
            return statement(Output.of(statement));
        }

        /**
         * @param statementName The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
         * 
         * @return builder
         * 
         */
        public Builder statementName(@Nullable Output<String> statementName) {
            $.statementName = statementName;
            return this;
        }

        /**
         * @param statementName The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
         * 
         * @return builder
         * 
         */
        public Builder statementName(String statementName) {
            return statementName(Output.of(statementName));
        }

        /**
         * @param stopped Indicates whether the statement should be stopped.
         * 
         * @return builder
         * 
         */
        public Builder stopped(@Nullable Output<Boolean> stopped) {
            $.stopped = stopped;
            return this;
        }

        /**
         * @param stopped Indicates whether the statement should be stopped.
         * 
         * @return builder
         * 
         */
        public Builder stopped(Boolean stopped) {
            return stopped(Output.of(stopped));
        }

        public FlinkStatementState build() {
            return $;
        }
    }

}