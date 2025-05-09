// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentAwArgs;
import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentAzureArgs;
import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentEnvironmentArgs;
import com.pulumi.confluentcloud.inputs.PrivateLinkAttachmentGcpArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkAttachmentState Empty = new PrivateLinkAttachmentState();

    /**
     * (Optional Configuration Block) supports the following:
     * 
     */
    @Import(name="aws")
    private @Nullable Output<List<PrivateLinkAttachmentAwArgs>> aws;

    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public Optional<Output<List<PrivateLinkAttachmentAwArgs>>> aws() {
        return Optional.ofNullable(this.aws);
    }

    /**
     * (Optional Configuration Block) supports the following:
     * - ` private_link_service_alias  ` - (Required String) Azure Private Link service alias for the availability zone.
     * 
     */
    @Import(name="azures")
    private @Nullable Output<List<PrivateLinkAttachmentAzureArgs>> azures;

    /**
     * @return (Optional Configuration Block) supports the following:
     * - ` private_link_service_alias  ` - (Required String) Azure Private Link service alias for the availability zone.
     * 
     */
    public Optional<Output<List<PrivateLinkAttachmentAzureArgs>>> azures() {
        return Optional.ofNullable(this.azures);
    }

    /**
     * The cloud service provider that hosts the resources to access with the Private Link Attachment.
     * 
     */
    @Import(name="cloud")
    private @Nullable Output<String> cloud;

    /**
     * @return The cloud service provider that hosts the resources to access with the Private Link Attachment.
     * 
     */
    public Optional<Output<String>> cloud() {
        return Optional.ofNullable(this.cloud);
    }

    /**
     * The name of the Private Link Attachment.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of the Private Link Attachment.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.cloud`.
     * 
     */
    @Import(name="dnsDomain")
    private @Nullable Output<String> dnsDomain;

    /**
     * @return (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.cloud`.
     * 
     */
    public Optional<Output<String>> dnsDomain() {
        return Optional.ofNullable(this.dnsDomain);
    }

    /**
     * Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<PrivateLinkAttachmentEnvironmentArgs> environment;

    /**
     * @return Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
     * 
     */
    public Optional<Output<PrivateLinkAttachmentEnvironmentArgs>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * (Optional Configuration Block) supports the following:
     * 
     */
    @Import(name="gcps")
    private @Nullable Output<List<PrivateLinkAttachmentGcpArgs>> gcps;

    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public Optional<Output<List<PrivateLinkAttachmentGcpArgs>>> gcps() {
        return Optional.ofNullable(this.gcps);
    }

    /**
     * The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    private PrivateLinkAttachmentState() {}

    private PrivateLinkAttachmentState(PrivateLinkAttachmentState $) {
        this.aws = $.aws;
        this.azures = $.azures;
        this.cloud = $.cloud;
        this.displayName = $.displayName;
        this.dnsDomain = $.dnsDomain;
        this.environment = $.environment;
        this.gcps = $.gcps;
        this.region = $.region;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkAttachmentState $;

        public Builder() {
            $ = new PrivateLinkAttachmentState();
        }

        public Builder(PrivateLinkAttachmentState defaults) {
            $ = new PrivateLinkAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aws (Optional Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder aws(@Nullable Output<List<PrivateLinkAttachmentAwArgs>> aws) {
            $.aws = aws;
            return this;
        }

        /**
         * @param aws (Optional Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder aws(List<PrivateLinkAttachmentAwArgs> aws) {
            return aws(Output.of(aws));
        }

        /**
         * @param aws (Optional Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder aws(PrivateLinkAttachmentAwArgs... aws) {
            return aws(List.of(aws));
        }

        /**
         * @param azures (Optional Configuration Block) supports the following:
         * - ` private_link_service_alias  ` - (Required String) Azure Private Link service alias for the availability zone.
         * 
         * @return builder
         * 
         */
        public Builder azures(@Nullable Output<List<PrivateLinkAttachmentAzureArgs>> azures) {
            $.azures = azures;
            return this;
        }

        /**
         * @param azures (Optional Configuration Block) supports the following:
         * - ` private_link_service_alias  ` - (Required String) Azure Private Link service alias for the availability zone.
         * 
         * @return builder
         * 
         */
        public Builder azures(List<PrivateLinkAttachmentAzureArgs> azures) {
            return azures(Output.of(azures));
        }

        /**
         * @param azures (Optional Configuration Block) supports the following:
         * - ` private_link_service_alias  ` - (Required String) Azure Private Link service alias for the availability zone.
         * 
         * @return builder
         * 
         */
        public Builder azures(PrivateLinkAttachmentAzureArgs... azures) {
            return azures(List.of(azures));
        }

        /**
         * @param cloud The cloud service provider that hosts the resources to access with the Private Link Attachment.
         * 
         * @return builder
         * 
         */
        public Builder cloud(@Nullable Output<String> cloud) {
            $.cloud = cloud;
            return this;
        }

        /**
         * @param cloud The cloud service provider that hosts the resources to access with the Private Link Attachment.
         * 
         * @return builder
         * 
         */
        public Builder cloud(String cloud) {
            return cloud(Output.of(cloud));
        }

        /**
         * @param displayName The name of the Private Link Attachment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Private Link Attachment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param dnsDomain (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.cloud`.
         * 
         * @return builder
         * 
         */
        public Builder dnsDomain(@Nullable Output<String> dnsDomain) {
            $.dnsDomain = dnsDomain;
            return this;
        }

        /**
         * @param dnsDomain (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.cloud`.
         * 
         * @return builder
         * 
         */
        public Builder dnsDomain(String dnsDomain) {
            return dnsDomain(Output.of(dnsDomain));
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<PrivateLinkAttachmentEnvironmentArgs> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
         * 
         * @return builder
         * 
         */
        public Builder environment(PrivateLinkAttachmentEnvironmentArgs environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param gcps (Optional Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder gcps(@Nullable Output<List<PrivateLinkAttachmentGcpArgs>> gcps) {
            $.gcps = gcps;
            return this;
        }

        /**
         * @param gcps (Optional Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder gcps(List<PrivateLinkAttachmentGcpArgs> gcps) {
            return gcps(Output.of(gcps));
        }

        /**
         * @param gcps (Optional Configuration Block) supports the following:
         * 
         * @return builder
         * 
         */
        public Builder gcps(PrivateLinkAttachmentGcpArgs... gcps) {
            return gcps(List.of(gcps));
        }

        /**
         * @param region The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param resourceName (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public PrivateLinkAttachmentState build() {
            return $;
        }
    }

}
