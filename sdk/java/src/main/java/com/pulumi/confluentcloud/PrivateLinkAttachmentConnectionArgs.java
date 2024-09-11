// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentConnectionAwsArgs;
import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentConnectionAzureArgs;
import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentConnectionEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentConnectionGcpArgs;
import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkAttachmentConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkAttachmentConnectionArgs Empty = new PrivateLinkAttachmentConnectionArgs();

    @Import(name="aws")
    private @Nullable Output<PrivateLinkAttachmentConnectionAwsArgs> aws;

    public Optional<Output<PrivateLinkAttachmentConnectionAwsArgs>> aws() {
        return Optional.ofNullable(this.aws);
    }

    @Import(name="azure")
    private @Nullable Output<PrivateLinkAttachmentConnectionAzureArgs> azure;

    public Optional<Output<PrivateLinkAttachmentConnectionAzureArgs>> azure() {
        return Optional.ofNullable(this.azure);
    }

    /**
     * The name of the Private Link Attachment Connection.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The name of the Private Link Attachment Connection.
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
    private Output<PrivateLinkAttachmentConnectionEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Output<PrivateLinkAttachmentConnectionEnvironmentArgs> environment() {
        return this.environment;
    }

    @Import(name="gcp")
    private @Nullable Output<PrivateLinkAttachmentConnectionGcpArgs> gcp;

    public Optional<Output<PrivateLinkAttachmentConnectionGcpArgs>> gcp() {
        return Optional.ofNullable(this.gcp);
    }

    /**
     * The private_link_attachment to which this belongs.
     * 
     */
    @Import(name="privateLinkAttachment", required=true)
    private Output<PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs> privateLinkAttachment;

    /**
     * @return The private_link_attachment to which this belongs.
     * 
     */
    public Output<PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs> privateLinkAttachment() {
        return this.privateLinkAttachment;
    }

    private PrivateLinkAttachmentConnectionArgs() {}

    private PrivateLinkAttachmentConnectionArgs(PrivateLinkAttachmentConnectionArgs $) {
        this.aws = $.aws;
        this.azure = $.azure;
        this.displayName = $.displayName;
        this.environment = $.environment;
        this.gcp = $.gcp;
        this.privateLinkAttachment = $.privateLinkAttachment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkAttachmentConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkAttachmentConnectionArgs $;

        public Builder() {
            $ = new PrivateLinkAttachmentConnectionArgs();
        }

        public Builder(PrivateLinkAttachmentConnectionArgs defaults) {
            $ = new PrivateLinkAttachmentConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder aws(@Nullable Output<PrivateLinkAttachmentConnectionAwsArgs> aws) {
            $.aws = aws;
            return this;
        }

        public Builder aws(PrivateLinkAttachmentConnectionAwsArgs aws) {
            return aws(Output.of(aws));
        }

        public Builder azure(@Nullable Output<PrivateLinkAttachmentConnectionAzureArgs> azure) {
            $.azure = azure;
            return this;
        }

        public Builder azure(PrivateLinkAttachmentConnectionAzureArgs azure) {
            return azure(Output.of(azure));
        }

        /**
         * @param displayName The name of the Private Link Attachment Connection.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Private Link Attachment Connection.
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
        public Builder environment(Output<PrivateLinkAttachmentConnectionEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(PrivateLinkAttachmentConnectionEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        public Builder gcp(@Nullable Output<PrivateLinkAttachmentConnectionGcpArgs> gcp) {
            $.gcp = gcp;
            return this;
        }

        public Builder gcp(PrivateLinkAttachmentConnectionGcpArgs gcp) {
            return gcp(Output.of(gcp));
        }

        /**
         * @param privateLinkAttachment The private_link_attachment to which this belongs.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkAttachment(Output<PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs> privateLinkAttachment) {
            $.privateLinkAttachment = privateLinkAttachment;
            return this;
        }

        /**
         * @param privateLinkAttachment The private_link_attachment to which this belongs.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkAttachment(PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs privateLinkAttachment) {
            return privateLinkAttachment(Output.of(privateLinkAttachment));
        }

        public PrivateLinkAttachmentConnectionArgs build() {
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("PrivateLinkAttachmentConnectionArgs", "displayName");
            }
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("PrivateLinkAttachmentConnectionArgs", "environment");
            }
            if ($.privateLinkAttachment == null) {
                throw new MissingRequiredPropertyException("PrivateLinkAttachmentConnectionArgs", "privateLinkAttachment");
            }
            return $;
        }
    }

}
