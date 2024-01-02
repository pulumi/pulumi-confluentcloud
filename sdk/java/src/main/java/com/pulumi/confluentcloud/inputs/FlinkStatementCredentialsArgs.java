// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FlinkStatementCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlinkStatementCredentialsArgs Empty = new FlinkStatementCredentialsArgs();

    /**
     * The Flink API Key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The Flink API Key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The Flink API Secret.
     * 
     * &gt; **Note:** A Flink API key consists of a key and a secret. Flink API keys are required to interact with Flink Statements in Confluent Cloud. Each Flink API key is valid for one specific Flink Region.
     * 
     * &gt; **Note:** Use Option #2 to simplify the key rotation process. When using Option #1, to rotate a Flink API key, create a new Flink API key, update the `credentials` block in all configuration files to use the new Flink API key, run `pulumi up -target=&#34;confluent_flink_statement.example&#34;`, and remove the old Flink API key. Alternatively, in case the old Flink API Key was deleted already, you might need to run `pulumi preview -refresh=false -target=&#34;confluent_flink_statement.example&#34; -out=rotate-flink-api-key` and `pulumi up rotate-flink-api-key` instead.
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return The Flink API Secret.
     * 
     * &gt; **Note:** A Flink API key consists of a key and a secret. Flink API keys are required to interact with Flink Statements in Confluent Cloud. Each Flink API key is valid for one specific Flink Region.
     * 
     * &gt; **Note:** Use Option #2 to simplify the key rotation process. When using Option #1, to rotate a Flink API key, create a new Flink API key, update the `credentials` block in all configuration files to use the new Flink API key, run `pulumi up -target=&#34;confluent_flink_statement.example&#34;`, and remove the old Flink API key. Alternatively, in case the old Flink API Key was deleted already, you might need to run `pulumi preview -refresh=false -target=&#34;confluent_flink_statement.example&#34; -out=rotate-flink-api-key` and `pulumi up rotate-flink-api-key` instead.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    private FlinkStatementCredentialsArgs() {}

    private FlinkStatementCredentialsArgs(FlinkStatementCredentialsArgs $) {
        this.key = $.key;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlinkStatementCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlinkStatementCredentialsArgs $;

        public Builder() {
            $ = new FlinkStatementCredentialsArgs();
        }

        public Builder(FlinkStatementCredentialsArgs defaults) {
            $ = new FlinkStatementCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The Flink API Key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The Flink API Key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param secret The Flink API Secret.
         * 
         * &gt; **Note:** A Flink API key consists of a key and a secret. Flink API keys are required to interact with Flink Statements in Confluent Cloud. Each Flink API key is valid for one specific Flink Region.
         * 
         * &gt; **Note:** Use Option #2 to simplify the key rotation process. When using Option #1, to rotate a Flink API key, create a new Flink API key, update the `credentials` block in all configuration files to use the new Flink API key, run `pulumi up -target=&#34;confluent_flink_statement.example&#34;`, and remove the old Flink API key. Alternatively, in case the old Flink API Key was deleted already, you might need to run `pulumi preview -refresh=false -target=&#34;confluent_flink_statement.example&#34; -out=rotate-flink-api-key` and `pulumi up rotate-flink-api-key` instead.
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The Flink API Secret.
         * 
         * &gt; **Note:** A Flink API key consists of a key and a secret. Flink API keys are required to interact with Flink Statements in Confluent Cloud. Each Flink API key is valid for one specific Flink Region.
         * 
         * &gt; **Note:** Use Option #2 to simplify the key rotation process. When using Option #1, to rotate a Flink API key, create a new Flink API key, update the `credentials` block in all configuration files to use the new Flink API key, run `pulumi up -target=&#34;confluent_flink_statement.example&#34;`, and remove the old Flink API key. Alternatively, in case the old Flink API Key was deleted already, you might need to run `pulumi preview -refresh=false -target=&#34;confluent_flink_statement.example&#34; -out=rotate-flink-api-key` and `pulumi up rotate-flink-api-key` instead.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public FlinkStatementCredentialsArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("FlinkStatementCredentialsArgs", "key");
            }
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("FlinkStatementCredentialsArgs", "secret");
            }
            return $;
        }
    }

}
