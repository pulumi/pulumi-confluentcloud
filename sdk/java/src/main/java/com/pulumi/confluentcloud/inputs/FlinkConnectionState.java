// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.FlinkConnectionComputePoolArgs;
import com.pulumi.confluentcloud.inputs.FlinkConnectionCredentialsArgs;
import com.pulumi.confluentcloud.inputs.FlinkConnectionEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.FlinkConnectionOrganizationArgs;
import com.pulumi.confluentcloud.inputs.FlinkConnectionPrincipalArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlinkConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final FlinkConnectionState Empty = new FlinkConnectionState();

    /**
     * API key for the type.
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    /**
     * @return API key for the type.
     * 
     */
    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * The schema version of this representation of a resource.
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return The schema version of this representation of a resource.
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * Access key for the type.
     * 
     */
    @Import(name="awsAccessKey")
    private @Nullable Output<String> awsAccessKey;

    /**
     * @return Access key for the type.
     * 
     */
    public Optional<Output<String>> awsAccessKey() {
        return Optional.ofNullable(this.awsAccessKey);
    }

    /**
     * Secret key for the type.
     * 
     */
    @Import(name="awsSecretKey")
    private @Nullable Output<String> awsSecretKey;

    /**
     * @return Secret key for the type.
     * 
     */
    public Optional<Output<String>> awsSecretKey() {
        return Optional.ofNullable(this.awsSecretKey);
    }

    /**
     * Session token for the type.
     * 
     */
    @Import(name="awsSessionToken")
    private @Nullable Output<String> awsSessionToken;

    /**
     * @return Session token for the type.
     * 
     */
    public Optional<Output<String>> awsSessionToken() {
        return Optional.ofNullable(this.awsSessionToken);
    }

    @Import(name="computePool")
    private @Nullable Output<FlinkConnectionComputePoolArgs> computePool;

    public Optional<Output<FlinkConnectionComputePoolArgs>> computePool() {
        return Optional.ofNullable(this.computePool);
    }

    /**
     * The Cluster API Credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<FlinkConnectionCredentialsArgs> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Optional<Output<FlinkConnectionCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The unique name of the Flink Connection per organization, environment scope.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The unique name of the Flink Connection per organization, environment scope.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The endpoint of the flink connection.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The endpoint of the flink connection.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    @Import(name="environment")
    private @Nullable Output<FlinkConnectionEnvironmentArgs> environment;

    public Optional<Output<FlinkConnectionEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * The object this REST resource represents.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The object this REST resource represents.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    @Import(name="organization")
    private @Nullable Output<FlinkConnectionOrganizationArgs> organization;

    public Optional<Output<FlinkConnectionOrganizationArgs>> organization() {
        return Optional.ofNullable(this.organization);
    }

    /**
     * Password for the type.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for the type.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="principal")
    private @Nullable Output<FlinkConnectionPrincipalArgs> principal;

    public Optional<Output<FlinkConnectionPrincipalArgs>> principal() {
        return Optional.ofNullable(this.principal);
    }

    /**
     * The REST endpoint of the Flink Connection cluster, for example,
     * `https://flink.us-east-1.aws.confluent.cloud/sql/v1/organizations/1111aaaa-11aa-11aa-11aa-111111aaaaaa/environments/env-abc123`).
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return The REST endpoint of the Flink Connection cluster, for example,
     * `https://flink.us-east-1.aws.confluent.cloud/sql/v1/organizations/1111aaaa-11aa-11aa-11aa-111111aaaaaa/environments/env-abc123`).
     * 
     */
    public Optional<Output<String>> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    /**
     * Service Key for the type.
     * 
     */
    @Import(name="serviceKey")
    private @Nullable Output<String> serviceKey;

    /**
     * @return Service Key for the type.
     * 
     */
    public Optional<Output<String>> serviceKey() {
        return Optional.ofNullable(this.serviceKey);
    }

    /**
     * The type of the flink connection.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the flink connection.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Username for the type.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username for the type.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private FlinkConnectionState() {}

    private FlinkConnectionState(FlinkConnectionState $) {
        this.apiKey = $.apiKey;
        this.apiVersion = $.apiVersion;
        this.awsAccessKey = $.awsAccessKey;
        this.awsSecretKey = $.awsSecretKey;
        this.awsSessionToken = $.awsSessionToken;
        this.computePool = $.computePool;
        this.credentials = $.credentials;
        this.displayName = $.displayName;
        this.endpoint = $.endpoint;
        this.environment = $.environment;
        this.kind = $.kind;
        this.organization = $.organization;
        this.password = $.password;
        this.principal = $.principal;
        this.restEndpoint = $.restEndpoint;
        this.serviceKey = $.serviceKey;
        this.type = $.type;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlinkConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlinkConnectionState $;

        public Builder() {
            $ = new FlinkConnectionState();
        }

        public Builder(FlinkConnectionState defaults) {
            $ = new FlinkConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey API key for the type.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey API key for the type.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param apiVersion The schema version of this representation of a resource.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion The schema version of this representation of a resource.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param awsAccessKey Access key for the type.
         * 
         * @return builder
         * 
         */
        public Builder awsAccessKey(@Nullable Output<String> awsAccessKey) {
            $.awsAccessKey = awsAccessKey;
            return this;
        }

        /**
         * @param awsAccessKey Access key for the type.
         * 
         * @return builder
         * 
         */
        public Builder awsAccessKey(String awsAccessKey) {
            return awsAccessKey(Output.of(awsAccessKey));
        }

        /**
         * @param awsSecretKey Secret key for the type.
         * 
         * @return builder
         * 
         */
        public Builder awsSecretKey(@Nullable Output<String> awsSecretKey) {
            $.awsSecretKey = awsSecretKey;
            return this;
        }

        /**
         * @param awsSecretKey Secret key for the type.
         * 
         * @return builder
         * 
         */
        public Builder awsSecretKey(String awsSecretKey) {
            return awsSecretKey(Output.of(awsSecretKey));
        }

        /**
         * @param awsSessionToken Session token for the type.
         * 
         * @return builder
         * 
         */
        public Builder awsSessionToken(@Nullable Output<String> awsSessionToken) {
            $.awsSessionToken = awsSessionToken;
            return this;
        }

        /**
         * @param awsSessionToken Session token for the type.
         * 
         * @return builder
         * 
         */
        public Builder awsSessionToken(String awsSessionToken) {
            return awsSessionToken(Output.of(awsSessionToken));
        }

        public Builder computePool(@Nullable Output<FlinkConnectionComputePoolArgs> computePool) {
            $.computePool = computePool;
            return this;
        }

        public Builder computePool(FlinkConnectionComputePoolArgs computePool) {
            return computePool(Output.of(computePool));
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<FlinkConnectionCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(FlinkConnectionCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param displayName The unique name of the Flink Connection per organization, environment scope.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The unique name of the Flink Connection per organization, environment scope.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param endpoint The endpoint of the flink connection.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The endpoint of the flink connection.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder environment(@Nullable Output<FlinkConnectionEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(FlinkConnectionEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param kind The object this REST resource represents.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The object this REST resource represents.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder organization(@Nullable Output<FlinkConnectionOrganizationArgs> organization) {
            $.organization = organization;
            return this;
        }

        public Builder organization(FlinkConnectionOrganizationArgs organization) {
            return organization(Output.of(organization));
        }

        /**
         * @param password Password for the type.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for the type.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder principal(@Nullable Output<FlinkConnectionPrincipalArgs> principal) {
            $.principal = principal;
            return this;
        }

        public Builder principal(FlinkConnectionPrincipalArgs principal) {
            return principal(Output.of(principal));
        }

        /**
         * @param restEndpoint The REST endpoint of the Flink Connection cluster, for example,
         * `https://flink.us-east-1.aws.confluent.cloud/sql/v1/organizations/1111aaaa-11aa-11aa-11aa-111111aaaaaa/environments/env-abc123`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Flink Connection cluster, for example,
         * `https://flink.us-east-1.aws.confluent.cloud/sql/v1/organizations/1111aaaa-11aa-11aa-11aa-111111aaaaaa/environments/env-abc123`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            return restEndpoint(Output.of(restEndpoint));
        }

        /**
         * @param serviceKey Service Key for the type.
         * 
         * @return builder
         * 
         */
        public Builder serviceKey(@Nullable Output<String> serviceKey) {
            $.serviceKey = serviceKey;
            return this;
        }

        /**
         * @param serviceKey Service Key for the type.
         * 
         * @return builder
         * 
         */
        public Builder serviceKey(String serviceKey) {
            return serviceKey(Output.of(serviceKey));
        }

        /**
         * @param type The type of the flink connection.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the flink connection.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param username Username for the type.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for the type.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public FlinkConnectionState build() {
            return $;
        }
    }

}
