// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.CatalogIntegrationAwsGlueArgs;
import com.pulumi.confluentcloud.inputs.CatalogIntegrationCredentialsArgs;
import com.pulumi.confluentcloud.inputs.CatalogIntegrationEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.CatalogIntegrationKafkaClusterArgs;
import com.pulumi.confluentcloud.inputs.CatalogIntegrationSnowflakeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogIntegrationArgs Empty = new CatalogIntegrationArgs();

    /**
     * supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
     * 
     */
    @Import(name="awsGlue")
    private @Nullable Output<CatalogIntegrationAwsGlueArgs> awsGlue;

    /**
     * @return supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
     * 
     */
    public Optional<Output<CatalogIntegrationAwsGlueArgs>> awsGlue() {
        return Optional.ofNullable(this.awsGlue);
    }

    /**
     * The Cluster API Credentials.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<CatalogIntegrationCredentialsArgs> credentials;

    /**
     * @return The Cluster API Credentials.
     * 
     */
    public Optional<Output<CatalogIntegrationCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * The name of the catalog integration.
     * 
     */
    @Import(name="displayName", required=true)
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
    @Import(name="environment", required=true)
    private Output<CatalogIntegrationEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<CatalogIntegrationEnvironmentArgs> environment() {
        return this.environment;
    }

    @Import(name="kafkaCluster", required=true)
    private Output<CatalogIntegrationKafkaClusterArgs> kafkaCluster;

    public Output<CatalogIntegrationKafkaClusterArgs> kafkaCluster() {
        return this.kafkaCluster;
    }

    /**
     * supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
     * 
     */
    @Import(name="snowflake")
    private @Nullable Output<CatalogIntegrationSnowflakeArgs> snowflake;

    /**
     * @return supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
     * 
     */
    public Optional<Output<CatalogIntegrationSnowflakeArgs>> snowflake() {
        return Optional.ofNullable(this.snowflake);
    }

    private CatalogIntegrationArgs() {}

    private CatalogIntegrationArgs(CatalogIntegrationArgs $) {
        this.awsGlue = $.awsGlue;
        this.credentials = $.credentials;
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.kafkaCluster = $.kafkaCluster;
        this.snowflake = $.snowflake;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogIntegrationArgs $;

        public Builder() {
            $ = new CatalogIntegrationArgs();
        }

        public Builder(CatalogIntegrationArgs defaults) {
            $ = new CatalogIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsGlue supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
         * 
         * @return builder
         * 
         */
        public Builder awsGlue(@Nullable Output<CatalogIntegrationAwsGlueArgs> awsGlue) {
            $.awsGlue = awsGlue;
            return this;
        }

        /**
         * @param awsGlue supports the following (see [Integrate Tableflow with the AWS Glue Catalog in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-aws-glue-catalog.html) for more details):
         * 
         * @return builder
         * 
         */
        public Builder awsGlue(CatalogIntegrationAwsGlueArgs awsGlue) {
            return awsGlue(Output.of(awsGlue));
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<CatalogIntegrationCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The Cluster API Credentials.
         * 
         * @return builder
         * 
         */
        public Builder credentials(CatalogIntegrationCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param displayName The name of the catalog integration.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the catalog integration.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(Output<CatalogIntegrationEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(CatalogIntegrationEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        public Builder kafkaCluster(Output<CatalogIntegrationKafkaClusterArgs> kafkaCluster) {
            $.kafkaCluster = kafkaCluster;
            return this;
        }

        public Builder kafkaCluster(CatalogIntegrationKafkaClusterArgs kafkaCluster) {
            return kafkaCluster(Output.of(kafkaCluster));
        }

        /**
         * @param snowflake supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
         * 
         * @return builder
         * 
         */
        public Builder snowflake(@Nullable Output<CatalogIntegrationSnowflakeArgs> snowflake) {
            $.snowflake = snowflake;
            return this;
        }

        /**
         * @param snowflake supports the following (see [Integrate Tableflow with Snowflake Open Catalog or Apache Polaris in Confluent Cloud](https://docs.confluent.io/cloud/current/topics/tableflow/how-to-guides/catalog-integration/integrate-with-snowflake-open-catalog-or-apache-polaris.html) for more details):
         * 
         * @return builder
         * 
         */
        public Builder snowflake(CatalogIntegrationSnowflakeArgs snowflake) {
            return snowflake(Output.of(snowflake));
        }

        public CatalogIntegrationArgs build() {
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("CatalogIntegrationArgs", "displayName");
            }
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("CatalogIntegrationArgs", "environment");
            }
            if ($.kafkaCluster == null) {
                throw new MissingRequiredPropertyException("CatalogIntegrationArgs", "kafkaCluster");
            }
            return $;
        }
    }

}
