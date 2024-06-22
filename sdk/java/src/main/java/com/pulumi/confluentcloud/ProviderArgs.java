// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * The Confluent Cloud API Key.
     * 
     */
    @Import(name="cloudApiKey")
    private @Nullable Output<String> cloudApiKey;

    /**
     * @return The Confluent Cloud API Key.
     * 
     */
    public Optional<Output<String>> cloudApiKey() {
        return Optional.ofNullable(this.cloudApiKey);
    }

    /**
     * The Confluent Cloud API Secret.
     * 
     */
    @Import(name="cloudApiSecret")
    private @Nullable Output<String> cloudApiSecret;

    /**
     * @return The Confluent Cloud API Secret.
     * 
     */
    public Optional<Output<String>> cloudApiSecret() {
        return Optional.ofNullable(this.cloudApiSecret);
    }

    /**
     * The base endpoint of Confluent Cloud API.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The base endpoint of Confluent Cloud API.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The Flink Environment ID.
     * 
     */
    @Import(name="environmentId")
    private @Nullable Output<String> environmentId;

    /**
     * @return The Flink Environment ID.
     * 
     */
    public Optional<Output<String>> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    /**
     * The Flink API Key.
     * 
     */
    @Import(name="flinkApiKey")
    private @Nullable Output<String> flinkApiKey;

    /**
     * @return The Flink API Key.
     * 
     */
    public Optional<Output<String>> flinkApiKey() {
        return Optional.ofNullable(this.flinkApiKey);
    }

    /**
     * The Flink API Secret.
     * 
     */
    @Import(name="flinkApiSecret")
    private @Nullable Output<String> flinkApiSecret;

    /**
     * @return The Flink API Secret.
     * 
     */
    public Optional<Output<String>> flinkApiSecret() {
        return Optional.ofNullable(this.flinkApiSecret);
    }

    /**
     * The Flink Compute Pool ID.
     * 
     */
    @Import(name="flinkComputePoolId")
    private @Nullable Output<String> flinkComputePoolId;

    /**
     * @return The Flink Compute Pool ID.
     * 
     */
    public Optional<Output<String>> flinkComputePoolId() {
        return Optional.ofNullable(this.flinkComputePoolId);
    }

    /**
     * The Flink Principal ID.
     * 
     */
    @Import(name="flinkPrincipalId")
    private @Nullable Output<String> flinkPrincipalId;

    /**
     * @return The Flink Principal ID.
     * 
     */
    public Optional<Output<String>> flinkPrincipalId() {
        return Optional.ofNullable(this.flinkPrincipalId);
    }

    /**
     * The Flink REST Endpoint.
     * 
     */
    @Import(name="flinkRestEndpoint")
    private @Nullable Output<String> flinkRestEndpoint;

    /**
     * @return The Flink REST Endpoint.
     * 
     */
    public Optional<Output<String>> flinkRestEndpoint() {
        return Optional.ofNullable(this.flinkRestEndpoint);
    }

    /**
     * The Kafka Cluster API Key.
     * 
     */
    @Import(name="kafkaApiKey")
    private @Nullable Output<String> kafkaApiKey;

    /**
     * @return The Kafka Cluster API Key.
     * 
     */
    public Optional<Output<String>> kafkaApiKey() {
        return Optional.ofNullable(this.kafkaApiKey);
    }

    /**
     * The Kafka Cluster API Secret.
     * 
     */
    @Import(name="kafkaApiSecret")
    private @Nullable Output<String> kafkaApiSecret;

    /**
     * @return The Kafka Cluster API Secret.
     * 
     */
    public Optional<Output<String>> kafkaApiSecret() {
        return Optional.ofNullable(this.kafkaApiSecret);
    }

    /**
     * The Kafka Cluster ID.
     * 
     */
    @Import(name="kafkaId")
    private @Nullable Output<String> kafkaId;

    /**
     * @return The Kafka Cluster ID.
     * 
     */
    public Optional<Output<String>> kafkaId() {
        return Optional.ofNullable(this.kafkaId);
    }

    /**
     * The Kafka Cluster REST Endpoint.
     * 
     */
    @Import(name="kafkaRestEndpoint")
    private @Nullable Output<String> kafkaRestEndpoint;

    /**
     * @return The Kafka Cluster REST Endpoint.
     * 
     */
    public Optional<Output<String>> kafkaRestEndpoint() {
        return Optional.ofNullable(this.kafkaRestEndpoint);
    }

    /**
     * Maximum number of retries of HTTP client. Defaults to 4.
     * 
     */
    @Import(name="maxRetries", json=true)
    private @Nullable Output<Integer> maxRetries;

    /**
     * @return Maximum number of retries of HTTP client. Defaults to 4.
     * 
     */
    public Optional<Output<Integer>> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

    /**
     * The Flink Organization ID.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The Flink Organization ID.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * The Schema Registry Cluster API Key.
     * 
     */
    @Import(name="schemaRegistryApiKey")
    private @Nullable Output<String> schemaRegistryApiKey;

    /**
     * @return The Schema Registry Cluster API Key.
     * 
     */
    public Optional<Output<String>> schemaRegistryApiKey() {
        return Optional.ofNullable(this.schemaRegistryApiKey);
    }

    /**
     * The Schema Registry Cluster API Secret.
     * 
     */
    @Import(name="schemaRegistryApiSecret")
    private @Nullable Output<String> schemaRegistryApiSecret;

    /**
     * @return The Schema Registry Cluster API Secret.
     * 
     */
    public Optional<Output<String>> schemaRegistryApiSecret() {
        return Optional.ofNullable(this.schemaRegistryApiSecret);
    }

    /**
     * The Schema Registry Cluster ID.
     * 
     */
    @Import(name="schemaRegistryId")
    private @Nullable Output<String> schemaRegistryId;

    /**
     * @return The Schema Registry Cluster ID.
     * 
     */
    public Optional<Output<String>> schemaRegistryId() {
        return Optional.ofNullable(this.schemaRegistryId);
    }

    /**
     * The Schema Registry Cluster REST Endpoint.
     * 
     */
    @Import(name="schemaRegistryRestEndpoint")
    private @Nullable Output<String> schemaRegistryRestEndpoint;

    /**
     * @return The Schema Registry Cluster REST Endpoint.
     * 
     */
    public Optional<Output<String>> schemaRegistryRestEndpoint() {
        return Optional.ofNullable(this.schemaRegistryRestEndpoint);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.cloudApiKey = $.cloudApiKey;
        this.cloudApiSecret = $.cloudApiSecret;
        this.endpoint = $.endpoint;
        this.environmentId = $.environmentId;
        this.flinkApiKey = $.flinkApiKey;
        this.flinkApiSecret = $.flinkApiSecret;
        this.flinkComputePoolId = $.flinkComputePoolId;
        this.flinkPrincipalId = $.flinkPrincipalId;
        this.flinkRestEndpoint = $.flinkRestEndpoint;
        this.kafkaApiKey = $.kafkaApiKey;
        this.kafkaApiSecret = $.kafkaApiSecret;
        this.kafkaId = $.kafkaId;
        this.kafkaRestEndpoint = $.kafkaRestEndpoint;
        this.maxRetries = $.maxRetries;
        this.organizationId = $.organizationId;
        this.schemaRegistryApiKey = $.schemaRegistryApiKey;
        this.schemaRegistryApiSecret = $.schemaRegistryApiSecret;
        this.schemaRegistryId = $.schemaRegistryId;
        this.schemaRegistryRestEndpoint = $.schemaRegistryRestEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudApiKey The Confluent Cloud API Key.
         * 
         * @return builder
         * 
         */
        public Builder cloudApiKey(@Nullable Output<String> cloudApiKey) {
            $.cloudApiKey = cloudApiKey;
            return this;
        }

        /**
         * @param cloudApiKey The Confluent Cloud API Key.
         * 
         * @return builder
         * 
         */
        public Builder cloudApiKey(String cloudApiKey) {
            return cloudApiKey(Output.of(cloudApiKey));
        }

        /**
         * @param cloudApiSecret The Confluent Cloud API Secret.
         * 
         * @return builder
         * 
         */
        public Builder cloudApiSecret(@Nullable Output<String> cloudApiSecret) {
            $.cloudApiSecret = cloudApiSecret;
            return this;
        }

        /**
         * @param cloudApiSecret The Confluent Cloud API Secret.
         * 
         * @return builder
         * 
         */
        public Builder cloudApiSecret(String cloudApiSecret) {
            return cloudApiSecret(Output.of(cloudApiSecret));
        }

        /**
         * @param endpoint The base endpoint of Confluent Cloud API.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The base endpoint of Confluent Cloud API.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param environmentId The Flink Environment ID.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(@Nullable Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentId The Flink Environment ID.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param flinkApiKey The Flink API Key.
         * 
         * @return builder
         * 
         */
        public Builder flinkApiKey(@Nullable Output<String> flinkApiKey) {
            $.flinkApiKey = flinkApiKey;
            return this;
        }

        /**
         * @param flinkApiKey The Flink API Key.
         * 
         * @return builder
         * 
         */
        public Builder flinkApiKey(String flinkApiKey) {
            return flinkApiKey(Output.of(flinkApiKey));
        }

        /**
         * @param flinkApiSecret The Flink API Secret.
         * 
         * @return builder
         * 
         */
        public Builder flinkApiSecret(@Nullable Output<String> flinkApiSecret) {
            $.flinkApiSecret = flinkApiSecret;
            return this;
        }

        /**
         * @param flinkApiSecret The Flink API Secret.
         * 
         * @return builder
         * 
         */
        public Builder flinkApiSecret(String flinkApiSecret) {
            return flinkApiSecret(Output.of(flinkApiSecret));
        }

        /**
         * @param flinkComputePoolId The Flink Compute Pool ID.
         * 
         * @return builder
         * 
         */
        public Builder flinkComputePoolId(@Nullable Output<String> flinkComputePoolId) {
            $.flinkComputePoolId = flinkComputePoolId;
            return this;
        }

        /**
         * @param flinkComputePoolId The Flink Compute Pool ID.
         * 
         * @return builder
         * 
         */
        public Builder flinkComputePoolId(String flinkComputePoolId) {
            return flinkComputePoolId(Output.of(flinkComputePoolId));
        }

        /**
         * @param flinkPrincipalId The Flink Principal ID.
         * 
         * @return builder
         * 
         */
        public Builder flinkPrincipalId(@Nullable Output<String> flinkPrincipalId) {
            $.flinkPrincipalId = flinkPrincipalId;
            return this;
        }

        /**
         * @param flinkPrincipalId The Flink Principal ID.
         * 
         * @return builder
         * 
         */
        public Builder flinkPrincipalId(String flinkPrincipalId) {
            return flinkPrincipalId(Output.of(flinkPrincipalId));
        }

        /**
         * @param flinkRestEndpoint The Flink REST Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder flinkRestEndpoint(@Nullable Output<String> flinkRestEndpoint) {
            $.flinkRestEndpoint = flinkRestEndpoint;
            return this;
        }

        /**
         * @param flinkRestEndpoint The Flink REST Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder flinkRestEndpoint(String flinkRestEndpoint) {
            return flinkRestEndpoint(Output.of(flinkRestEndpoint));
        }

        /**
         * @param kafkaApiKey The Kafka Cluster API Key.
         * 
         * @return builder
         * 
         */
        public Builder kafkaApiKey(@Nullable Output<String> kafkaApiKey) {
            $.kafkaApiKey = kafkaApiKey;
            return this;
        }

        /**
         * @param kafkaApiKey The Kafka Cluster API Key.
         * 
         * @return builder
         * 
         */
        public Builder kafkaApiKey(String kafkaApiKey) {
            return kafkaApiKey(Output.of(kafkaApiKey));
        }

        /**
         * @param kafkaApiSecret The Kafka Cluster API Secret.
         * 
         * @return builder
         * 
         */
        public Builder kafkaApiSecret(@Nullable Output<String> kafkaApiSecret) {
            $.kafkaApiSecret = kafkaApiSecret;
            return this;
        }

        /**
         * @param kafkaApiSecret The Kafka Cluster API Secret.
         * 
         * @return builder
         * 
         */
        public Builder kafkaApiSecret(String kafkaApiSecret) {
            return kafkaApiSecret(Output.of(kafkaApiSecret));
        }

        /**
         * @param kafkaId The Kafka Cluster ID.
         * 
         * @return builder
         * 
         */
        public Builder kafkaId(@Nullable Output<String> kafkaId) {
            $.kafkaId = kafkaId;
            return this;
        }

        /**
         * @param kafkaId The Kafka Cluster ID.
         * 
         * @return builder
         * 
         */
        public Builder kafkaId(String kafkaId) {
            return kafkaId(Output.of(kafkaId));
        }

        /**
         * @param kafkaRestEndpoint The Kafka Cluster REST Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder kafkaRestEndpoint(@Nullable Output<String> kafkaRestEndpoint) {
            $.kafkaRestEndpoint = kafkaRestEndpoint;
            return this;
        }

        /**
         * @param kafkaRestEndpoint The Kafka Cluster REST Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder kafkaRestEndpoint(String kafkaRestEndpoint) {
            return kafkaRestEndpoint(Output.of(kafkaRestEndpoint));
        }

        /**
         * @param maxRetries Maximum number of retries of HTTP client. Defaults to 4.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        /**
         * @param maxRetries Maximum number of retries of HTTP client. Defaults to 4.
         * 
         * @return builder
         * 
         */
        public Builder maxRetries(Integer maxRetries) {
            return maxRetries(Output.of(maxRetries));
        }

        /**
         * @param organizationId The Flink Organization ID.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The Flink Organization ID.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param schemaRegistryApiKey The Schema Registry Cluster API Key.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistryApiKey(@Nullable Output<String> schemaRegistryApiKey) {
            $.schemaRegistryApiKey = schemaRegistryApiKey;
            return this;
        }

        /**
         * @param schemaRegistryApiKey The Schema Registry Cluster API Key.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistryApiKey(String schemaRegistryApiKey) {
            return schemaRegistryApiKey(Output.of(schemaRegistryApiKey));
        }

        /**
         * @param schemaRegistryApiSecret The Schema Registry Cluster API Secret.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistryApiSecret(@Nullable Output<String> schemaRegistryApiSecret) {
            $.schemaRegistryApiSecret = schemaRegistryApiSecret;
            return this;
        }

        /**
         * @param schemaRegistryApiSecret The Schema Registry Cluster API Secret.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistryApiSecret(String schemaRegistryApiSecret) {
            return schemaRegistryApiSecret(Output.of(schemaRegistryApiSecret));
        }

        /**
         * @param schemaRegistryId The Schema Registry Cluster ID.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistryId(@Nullable Output<String> schemaRegistryId) {
            $.schemaRegistryId = schemaRegistryId;
            return this;
        }

        /**
         * @param schemaRegistryId The Schema Registry Cluster ID.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistryId(String schemaRegistryId) {
            return schemaRegistryId(Output.of(schemaRegistryId));
        }

        /**
         * @param schemaRegistryRestEndpoint The Schema Registry Cluster REST Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistryRestEndpoint(@Nullable Output<String> schemaRegistryRestEndpoint) {
            $.schemaRegistryRestEndpoint = schemaRegistryRestEndpoint;
            return this;
        }

        /**
         * @param schemaRegistryRestEndpoint The Schema Registry Cluster REST Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder schemaRegistryRestEndpoint(String schemaRegistryRestEndpoint) {
            return schemaRegistryRestEndpoint(Output.of(schemaRegistryRestEndpoint));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}