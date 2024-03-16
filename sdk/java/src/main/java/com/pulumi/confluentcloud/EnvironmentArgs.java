// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.confluentcloud.inputs.EnvironmentStreamGovernanceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, &#34;Development&#34;. The name can contain hyphens and underscores.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, &#34;Development&#34;. The name can contain hyphens and underscores.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The stream governance configuration for the Environment. The block supports the following arguments:
     * 
     */
    @Import(name="streamGovernance")
    private @Nullable Output<EnvironmentStreamGovernanceArgs> streamGovernance;

    /**
     * @return The stream governance configuration for the Environment. The block supports the following arguments:
     * 
     */
    public Optional<Output<EnvironmentStreamGovernanceArgs>> streamGovernance() {
        return Optional.ofNullable(this.streamGovernance);
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.displayName = $.displayName;
        this.streamGovernance = $.streamGovernance;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, &#34;Development&#34;. The name can contain hyphens and underscores.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A human-readable name for the Environment. Start and end the name with alphanumeric characters, for example, &#34;Development&#34;. The name can contain hyphens and underscores.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param streamGovernance The stream governance configuration for the Environment. The block supports the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder streamGovernance(@Nullable Output<EnvironmentStreamGovernanceArgs> streamGovernance) {
            $.streamGovernance = streamGovernance;
            return this;
        }

        /**
         * @param streamGovernance The stream governance configuration for the Environment. The block supports the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder streamGovernance(EnvironmentStreamGovernanceArgs streamGovernance) {
            return streamGovernance(Output.of(streamGovernance));
        }

        public EnvironmentArgs build() {
            return $;
        }
    }

}
