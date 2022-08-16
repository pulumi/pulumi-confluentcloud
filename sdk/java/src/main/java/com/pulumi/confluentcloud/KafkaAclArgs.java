// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.KafkaAclCredentialsArgs;
import com.pulumi.confluentcloud.inputs.KafkaAclKafkaClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KafkaAclArgs extends com.pulumi.resources.ResourceArgs {

    public static final KafkaAclArgs Empty = new KafkaAclArgs();

    /**
     * The Cluster API Credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<KafkaAclCredentialsArgs> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Optional<Output<KafkaAclCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The host for the ACL. Should be set to `*` for Confluent Cloud.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return The host for the ACL. Should be set to `*` for Confluent Cloud.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    @Import(name="kafkaCluster", required=true)
    private Output<KafkaAclKafkaClusterArgs> kafkaCluster;

    public Output<KafkaAclKafkaClusterArgs> kafkaCluster() {
        return this.kafkaCluster;
    }

    /**
     * The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
     * 
     */
    @Import(name="operation", required=true)
    private Output<String> operation;

    /**
     * @return The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
     * 
     */
    public Output<String> operation() {
        return this.operation;
    }

    /**
     * The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
     * 
     */
    @Import(name="patternType", required=true)
    private Output<String> patternType;

    /**
     * @return The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
     * 
     */
    public Output<String> patternType() {
        return this.patternType;
    }

    /**
     * The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
     * 
     */
    @Import(name="permission", required=true)
    private Output<String> permission;

    /**
     * @return The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
     * 
     */
    public Output<String> permission() {
        return this.permission;
    }

    /**
     * The principal for the ACL.
     * 
     */
    @Import(name="principal", required=true)
    private Output<String> principal;

    /**
     * @return The principal for the ACL.
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }

    /**
     * The resource name for the ACL.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The resource name for the ACL.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    /**
     * @return The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
     * 
     */
    public Optional<Output<String>> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    private KafkaAclArgs() {}

    private KafkaAclArgs(KafkaAclArgs $) {
        this.credentials = $.credentials;
        this.host = $.host;
        this.kafkaCluster = $.kafkaCluster;
        this.operation = $.operation;
        this.patternType = $.patternType;
        this.permission = $.permission;
        this.principal = $.principal;
        this.resourceName = $.resourceName;
        this.resourceType = $.resourceType;
        this.restEndpoint = $.restEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KafkaAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KafkaAclArgs $;

        public Builder() {
            $ = new KafkaAclArgs();
        }

        public Builder(KafkaAclArgs defaults) {
            $ = new KafkaAclArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<KafkaAclCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(KafkaAclCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param host The host for the ACL. Should be set to `*` for Confluent Cloud.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The host for the ACL. Should be set to `*` for Confluent Cloud.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder kafkaCluster(Output<KafkaAclKafkaClusterArgs> kafkaCluster) {
            $.kafkaCluster = kafkaCluster;
            return this;
        }

        public Builder kafkaCluster(KafkaAclKafkaClusterArgs kafkaCluster) {
            return kafkaCluster(Output.of(kafkaCluster));
        }

        /**
         * @param operation The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
         * 
         * @return builder
         * 
         */
        public Builder operation(Output<String> operation) {
            $.operation = operation;
            return this;
        }

        /**
         * @param operation The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
         * 
         * @return builder
         * 
         */
        public Builder operation(String operation) {
            return operation(Output.of(operation));
        }

        /**
         * @param patternType The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
         * 
         * @return builder
         * 
         */
        public Builder patternType(Output<String> patternType) {
            $.patternType = patternType;
            return this;
        }

        /**
         * @param patternType The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
         * 
         * @return builder
         * 
         */
        public Builder patternType(String patternType) {
            return patternType(Output.of(patternType));
        }

        /**
         * @param permission The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
         * 
         * @return builder
         * 
         */
        public Builder permission(Output<String> permission) {
            $.permission = permission;
            return this;
        }

        /**
         * @param permission The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
         * 
         * @return builder
         * 
         */
        public Builder permission(String permission) {
            return permission(Output.of(permission));
        }

        /**
         * @param principal The principal for the ACL.
         * 
         * @return builder
         * 
         */
        public Builder principal(Output<String> principal) {
            $.principal = principal;
            return this;
        }

        /**
         * @param principal The principal for the ACL.
         * 
         * @return builder
         * 
         */
        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        /**
         * @param resourceName The resource name for the ACL.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The resource name for the ACL.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param resourceType The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param restEndpoint The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            return restEndpoint(Output.of(restEndpoint));
        }

        public KafkaAclArgs build() {
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.kafkaCluster = Objects.requireNonNull($.kafkaCluster, "expected parameter 'kafkaCluster' to be non-null");
            $.operation = Objects.requireNonNull($.operation, "expected parameter 'operation' to be non-null");
            $.patternType = Objects.requireNonNull($.patternType, "expected parameter 'patternType' to be non-null");
            $.permission = Objects.requireNonNull($.permission, "expected parameter 'permission' to be non-null");
            $.principal = Objects.requireNonNull($.principal, "expected parameter 'principal' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
