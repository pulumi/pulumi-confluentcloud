// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.EnvironmentStreamGovernanceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentState extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentState Empty = new EnvironmentState();

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
     * (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * Stream Governance configurations for the environment
     * 
     */
    @Import(name="streamGovernance")
    private @Nullable Output<EnvironmentStreamGovernanceArgs> streamGovernance;

    /**
     * @return Stream Governance configurations for the environment
     * 
     */
    public Optional<Output<EnvironmentStreamGovernanceArgs>> streamGovernance() {
        return Optional.ofNullable(this.streamGovernance);
    }

    private EnvironmentState() {}

    private EnvironmentState(EnvironmentState $) {
        this.displayName = $.displayName;
        this.resourceName = $.resourceName;
        this.streamGovernance = $.streamGovernance;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentState $;

        public Builder() {
            $ = new EnvironmentState();
        }

        public Builder(EnvironmentState defaults) {
            $ = new EnvironmentState(Objects.requireNonNull(defaults));
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
         * @param resourceName (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName (Required String) The Confluent Resource Name of the Environment, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param streamGovernance Stream Governance configurations for the environment
         * 
         * @return builder
         * 
         */
        public Builder streamGovernance(@Nullable Output<EnvironmentStreamGovernanceArgs> streamGovernance) {
            $.streamGovernance = streamGovernance;
            return this;
        }

        /**
         * @param streamGovernance Stream Governance configurations for the environment
         * 
         * @return builder
         * 
         */
        public Builder streamGovernance(EnvironmentStreamGovernanceArgs streamGovernance) {
            return streamGovernance(Output.of(streamGovernance));
        }

        public EnvironmentState build() {
            return $;
        }
    }

}
