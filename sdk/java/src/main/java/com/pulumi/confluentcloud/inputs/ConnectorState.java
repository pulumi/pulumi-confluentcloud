// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.ConnectorEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.ConnectorKafkaClusterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorState Empty = new ConnectorState();

    /**
     * Block for custom *nonsensitive* configuration properties that are *not* labelled with &#34;Type: password&#34; under &#34;Configuration Properties&#34; section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
     * 
     */
    @Import(name="configNonsensitive")
    private @Nullable Output<Map<String,String>> configNonsensitive;

    /**
     * @return Block for custom *nonsensitive* configuration properties that are *not* labelled with &#34;Type: password&#34; under &#34;Configuration Properties&#34; section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
     * 
     */
    public Optional<Output<Map<String,String>>> configNonsensitive() {
        return Optional.ofNullable(this.configNonsensitive);
    }

    /**
     * Block for custom *sensitive* configuration properties that are labelled with &#34;Type: password&#34; under &#34;Configuration Properties&#34; section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
     * 
     */
    @Import(name="configSensitive")
    private @Nullable Output<Map<String,String>> configSensitive;

    /**
     * @return Block for custom *sensitive* configuration properties that are labelled with &#34;Type: password&#34; under &#34;Configuration Properties&#34; section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
     * 
     */
    public Optional<Output<Map<String,String>>> configSensitive() {
        return Optional.ofNullable(this.configSensitive);
    }

    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<ConnectorEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Optional<Output<ConnectorEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    @Import(name="kafkaCluster")
    private @Nullable Output<ConnectorKafkaClusterArgs> kafkaCluster;

    public Optional<Output<ConnectorKafkaClusterArgs>> kafkaCluster() {
        return Optional.ofNullable(this.kafkaCluster);
    }

    /**
     * The status of the connector (one of `&#34;NONE&#34;`, `&#34;PROVISIONING&#34;`, `&#34;RUNNING&#34;`, `&#34;DEGRADED&#34;`, `&#34;FAILED&#34;`, `&#34;PAUSED&#34;`, `&#34;DELETED&#34;`). Pausing (`&#34;RUNNING&#34; &gt; &#34;PAUSED&#34;`) and resuming (`&#34;PAUSED&#34; &gt; &#34;RUNNING&#34;`) a connector is supported via an update operation.
     * 
     * &gt; **Note:** If there are no *sensitive* configuration settings for your connector, set `config_sensitive = {}` explicitly.
     * 
     * &gt; **Note:** You may declare sensitive variables for secrets `config_sensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id=&#34;foo&#34;`).
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the connector (one of `&#34;NONE&#34;`, `&#34;PROVISIONING&#34;`, `&#34;RUNNING&#34;`, `&#34;DEGRADED&#34;`, `&#34;FAILED&#34;`, `&#34;PAUSED&#34;`, `&#34;DELETED&#34;`). Pausing (`&#34;RUNNING&#34; &gt; &#34;PAUSED&#34;`) and resuming (`&#34;PAUSED&#34; &gt; &#34;RUNNING&#34;`) a connector is supported via an update operation.
     * 
     * &gt; **Note:** If there are no *sensitive* configuration settings for your connector, set `config_sensitive = {}` explicitly.
     * 
     * &gt; **Note:** You may declare sensitive variables for secrets `config_sensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id=&#34;foo&#34;`).
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ConnectorState() {}

    private ConnectorState(ConnectorState $) {
        this.configNonsensitive = $.configNonsensitive;
        this.configSensitive = $.configSensitive;
        this.environment = $.environment;
        this.kafkaCluster = $.kafkaCluster;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorState $;

        public Builder() {
            $ = new ConnectorState();
        }

        public Builder(ConnectorState defaults) {
            $ = new ConnectorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configNonsensitive Block for custom *nonsensitive* configuration properties that are *not* labelled with &#34;Type: password&#34; under &#34;Configuration Properties&#34; section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
         * 
         * @return builder
         * 
         */
        public Builder configNonsensitive(@Nullable Output<Map<String,String>> configNonsensitive) {
            $.configNonsensitive = configNonsensitive;
            return this;
        }

        /**
         * @param configNonsensitive Block for custom *nonsensitive* configuration properties that are *not* labelled with &#34;Type: password&#34; under &#34;Configuration Properties&#34; section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
         * 
         * @return builder
         * 
         */
        public Builder configNonsensitive(Map<String,String> configNonsensitive) {
            return configNonsensitive(Output.of(configNonsensitive));
        }

        /**
         * @param configSensitive Block for custom *sensitive* configuration properties that are labelled with &#34;Type: password&#34; under &#34;Configuration Properties&#34; section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
         * 
         * @return builder
         * 
         */
        public Builder configSensitive(@Nullable Output<Map<String,String>> configSensitive) {
            $.configSensitive = configSensitive;
            return this;
        }

        /**
         * @param configSensitive Block for custom *sensitive* configuration properties that are labelled with &#34;Type: password&#34; under &#34;Configuration Properties&#34; section in [the docs](https://docs.confluent.io/cloud/current/connectors/index.html):
         * 
         * @return builder
         * 
         */
        public Builder configSensitive(Map<String,String> configSensitive) {
            return configSensitive(Output.of(configSensitive));
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<ConnectorEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(ConnectorEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        public Builder kafkaCluster(@Nullable Output<ConnectorKafkaClusterArgs> kafkaCluster) {
            $.kafkaCluster = kafkaCluster;
            return this;
        }

        public Builder kafkaCluster(ConnectorKafkaClusterArgs kafkaCluster) {
            return kafkaCluster(Output.of(kafkaCluster));
        }

        /**
         * @param status The status of the connector (one of `&#34;NONE&#34;`, `&#34;PROVISIONING&#34;`, `&#34;RUNNING&#34;`, `&#34;DEGRADED&#34;`, `&#34;FAILED&#34;`, `&#34;PAUSED&#34;`, `&#34;DELETED&#34;`). Pausing (`&#34;RUNNING&#34; &gt; &#34;PAUSED&#34;`) and resuming (`&#34;PAUSED&#34; &gt; &#34;RUNNING&#34;`) a connector is supported via an update operation.
         * 
         * &gt; **Note:** If there are no *sensitive* configuration settings for your connector, set `config_sensitive = {}` explicitly.
         * 
         * &gt; **Note:** You may declare sensitive variables for secrets `config_sensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id=&#34;foo&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the connector (one of `&#34;NONE&#34;`, `&#34;PROVISIONING&#34;`, `&#34;RUNNING&#34;`, `&#34;DEGRADED&#34;`, `&#34;FAILED&#34;`, `&#34;PAUSED&#34;`, `&#34;DELETED&#34;`). Pausing (`&#34;RUNNING&#34; &gt; &#34;PAUSED&#34;`) and resuming (`&#34;PAUSED&#34; &gt; &#34;RUNNING&#34;`) a connector is supported via an update operation.
         * 
         * &gt; **Note:** If there are no *sensitive* configuration settings for your connector, set `config_sensitive = {}` explicitly.
         * 
         * &gt; **Note:** You may declare sensitive variables for secrets `config_sensitive` block and set them using environment variables (for example, `export TF_VAR_aws_access_key_id=&#34;foo&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ConnectorState build() {
            return $;
        }
    }

}
