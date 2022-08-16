// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.KafkaAclArgs;
import com.pulumi.confluentcloud.Utilities;
import com.pulumi.confluentcloud.inputs.KafkaAclState;
import com.pulumi.confluentcloud.outputs.KafkaAclCredentials;
import com.pulumi.confluentcloud.outputs.KafkaAclKafkaCluster;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * You can import Kafka ACLs by using the Kafka cluster ID and attributes of `confluent_kafka_acl` resource in the format `&lt;Kafka cluster ID&gt;/&lt;Kafka ACL resource type&gt;#&lt;Kafka ACL resource name&gt;#&lt;Kafka ACL pattern type&gt;#&lt;Kafka ACL principal&gt;#&lt;Kafka ACL host&gt;#&lt;Kafka ACL operation&gt;#&lt;Kafka ACL permission&gt;`, for example$ export CONFLUENT_CLOUD_API_KEY=&#34;&lt;cloud_api_key&gt;&#34; $ export CONFLUENT_CLOUD_API_SECRET=&#34;&lt;cloud_api_secret&gt;&#34; $ export IMPORT_KAFKA_API_KEY=&#34;&lt;kafka_api_key&gt;&#34; $ export IMPORT_KAFKA_API_SECRET=&#34;&lt;kafka_api_secret&gt;&#34; $ export IMPORT_KAFKA_REST_ENDPOINT=&#34;&lt;kafka_rest_endpoint&gt;&#34;
 * 
 * ```sh
 *  $ pulumi import confluentcloud:index/kafkaAcl:KafkaAcl describe-cluster &#34;lkc-12345/CLUSTER#kafka-cluster#LITERAL#User:sa-xyz123#*#DESCRIBE#ALLOW&#34;
 * ```
 * 
 *  !&gt; **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 * 
 */
@ResourceType(type="confluentcloud:index/kafkaAcl:KafkaAcl")
public class KafkaAcl extends com.pulumi.resources.CustomResource {
    /**
     * The Cluster API Credentials.
     * 
     */
    @Export(name="credentials", type=KafkaAclCredentials.class, parameters={})
    private Output</* @Nullable */ KafkaAclCredentials> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Output<Optional<KafkaAclCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * The host for the ACL. Should be set to `*` for Confluent Cloud.
     * 
     */
    @Export(name="host", type=String.class, parameters={})
    private Output<String> host;

    /**
     * @return The host for the ACL. Should be set to `*` for Confluent Cloud.
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    @Export(name="kafkaCluster", type=KafkaAclKafkaCluster.class, parameters={})
    private Output<KafkaAclKafkaCluster> kafkaCluster;

    public Output<KafkaAclKafkaCluster> kafkaCluster() {
        return this.kafkaCluster;
    }
    /**
     * The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
     * 
     */
    @Export(name="operation", type=String.class, parameters={})
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
    @Export(name="patternType", type=String.class, parameters={})
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
    @Export(name="permission", type=String.class, parameters={})
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
    @Export(name="principal", type=String.class, parameters={})
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
    @Export(name="resourceName", type=String.class, parameters={})
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
    @Export(name="resourceType", type=String.class, parameters={})
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
    @Export(name="restEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> restEndpoint;

    /**
     * @return The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
     * 
     */
    public Output<Optional<String>> restEndpoint() {
        return Codegen.optional(this.restEndpoint);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KafkaAcl(String name) {
        this(name, KafkaAclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KafkaAcl(String name, KafkaAclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KafkaAcl(String name, KafkaAclArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/kafkaAcl:KafkaAcl", name, args == null ? KafkaAclArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KafkaAcl(String name, Output<String> id, @Nullable KafkaAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("confluentcloud:index/kafkaAcl:KafkaAcl", name, state, makeResourceOptions(options, id));
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
    public static KafkaAcl get(String name, Output<String> id, @Nullable KafkaAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KafkaAcl(name, id, state, options);
    }
}
