// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.GetSchemaCredentialsArgs;
import com.pulumi.confluentcloud.inputs.GetSchemaSchemaRegistryClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemaArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaArgs Empty = new GetSchemaArgs();

    @Import(name="credentials")
    private @Nullable Output<GetSchemaCredentialsArgs> credentials;

    public Optional<Output<GetSchemaCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    @Import(name="restEndpoint")
    private @Nullable Output<String> restEndpoint;

    /**
     * @return The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
     * 
     */
    public Optional<Output<String>> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }

    /**
     * The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
     * 
     * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     * 
     */
    @Import(name="schemaIdentifier", required=true)
    private Output<Integer> schemaIdentifier;

    /**
     * @return The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
     * 
     * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
     * 
     */
    public Output<Integer> schemaIdentifier() {
        return this.schemaIdentifier;
    }

    @Import(name="schemaRegistryCluster")
    private @Nullable Output<GetSchemaSchemaRegistryClusterArgs> schemaRegistryCluster;

    public Optional<Output<GetSchemaSchemaRegistryClusterArgs>> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }

    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     * 
     */
    @Import(name="subjectName", required=true)
    private Output<String> subjectName;

    /**
     * @return The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     * 
     */
    public Output<String> subjectName() {
        return this.subjectName;
    }

    private GetSchemaArgs() {}

    private GetSchemaArgs(GetSchemaArgs $) {
        this.credentials = $.credentials;
        this.restEndpoint = $.restEndpoint;
        this.schemaIdentifier = $.schemaIdentifier;
        this.schemaRegistryCluster = $.schemaRegistryCluster;
        this.subjectName = $.subjectName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaArgs $;

        public Builder() {
            $ = new GetSchemaArgs();
        }

        public Builder(GetSchemaArgs defaults) {
            $ = new GetSchemaArgs(Objects.requireNonNull(defaults));
        }

        public Builder credentials(@Nullable Output<GetSchemaCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        public Builder credentials(GetSchemaCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(@Nullable Output<String> restEndpoint) {
            $.restEndpoint = restEndpoint;
            return this;
        }

        /**
         * @param restEndpoint The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
         * 
         * @return builder
         * 
         */
        public Builder restEndpoint(String restEndpoint) {
            return restEndpoint(Output.of(restEndpoint));
        }

        /**
         * @param schemaIdentifier The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
         * 
         * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
         * 
         * @return builder
         * 
         */
        public Builder schemaIdentifier(Output<Integer> schemaIdentifier) {
            $.schemaIdentifier = schemaIdentifier;
            return this;
        }

        /**
         * @param schemaIdentifier The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
         * 
         * &gt; **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
         * 
         * @return builder
         * 
         */
        public Builder schemaIdentifier(Integer schemaIdentifier) {
            return schemaIdentifier(Output.of(schemaIdentifier));
        }

        public Builder schemaRegistryCluster(@Nullable Output<GetSchemaSchemaRegistryClusterArgs> schemaRegistryCluster) {
            $.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }

        public Builder schemaRegistryCluster(GetSchemaSchemaRegistryClusterArgs schemaRegistryCluster) {
            return schemaRegistryCluster(Output.of(schemaRegistryCluster));
        }

        /**
         * @param subjectName The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(Output<String> subjectName) {
            $.subjectName = subjectName;
            return this;
        }

        /**
         * @param subjectName The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
         * 
         * @return builder
         * 
         */
        public Builder subjectName(String subjectName) {
            return subjectName(Output.of(subjectName));
        }

        public GetSchemaArgs build() {
            if ($.schemaIdentifier == null) {
                throw new MissingRequiredPropertyException("GetSchemaArgs", "schemaIdentifier");
            }
            if ($.subjectName == null) {
                throw new MissingRequiredPropertyException("GetSchemaArgs", "subjectName");
            }
            return $;
        }
    }

}
