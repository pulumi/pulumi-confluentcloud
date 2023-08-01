// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetPrivateLinkAttachmentConnectionAw;
import com.pulumi.confluentcloud.outputs.GetPrivateLinkAttachmentConnectionAzure;
import com.pulumi.confluentcloud.outputs.GetPrivateLinkAttachmentConnectionEnvironment;
import com.pulumi.confluentcloud.outputs.GetPrivateLinkAttachmentConnectionGcp;
import com.pulumi.confluentcloud.outputs.GetPrivateLinkAttachmentConnectionPrivateLinkAttachment;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPrivateLinkAttachmentConnectionResult {
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    private List<GetPrivateLinkAttachmentConnectionAw> aws;
    private List<GetPrivateLinkAttachmentConnectionAzure> azures;
    /**
     * @return (Optional String) The name of the Private Link Attachment Connection.
     * 
     */
    private String displayName;
    private GetPrivateLinkAttachmentConnectionEnvironment environment;
    private List<GetPrivateLinkAttachmentConnectionGcp> gcps;
    /**
     * @return (Required String) The unique identifier for the private link attachment.
     * 
     */
    private String id;
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    private List<GetPrivateLinkAttachmentConnectionPrivateLinkAttachment> privateLinkAttachments;
    /**
     * @return (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
     * 
     */
    private String resourceName;

    private GetPrivateLinkAttachmentConnectionResult() {}
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public List<GetPrivateLinkAttachmentConnectionAw> aws() {
        return this.aws;
    }
    public List<GetPrivateLinkAttachmentConnectionAzure> azures() {
        return this.azures;
    }
    /**
     * @return (Optional String) The name of the Private Link Attachment Connection.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public GetPrivateLinkAttachmentConnectionEnvironment environment() {
        return this.environment;
    }
    public List<GetPrivateLinkAttachmentConnectionGcp> gcps() {
        return this.gcps;
    }
    /**
     * @return (Required String) The unique identifier for the private link attachment.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public List<GetPrivateLinkAttachmentConnectionPrivateLinkAttachment> privateLinkAttachments() {
        return this.privateLinkAttachments;
    }
    /**
     * @return (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkAttachmentConnectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPrivateLinkAttachmentConnectionAw> aws;
        private List<GetPrivateLinkAttachmentConnectionAzure> azures;
        private String displayName;
        private GetPrivateLinkAttachmentConnectionEnvironment environment;
        private List<GetPrivateLinkAttachmentConnectionGcp> gcps;
        private String id;
        private List<GetPrivateLinkAttachmentConnectionPrivateLinkAttachment> privateLinkAttachments;
        private String resourceName;
        public Builder() {}
        public Builder(GetPrivateLinkAttachmentConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
    	      this.azures = defaults.azures;
    	      this.displayName = defaults.displayName;
    	      this.environment = defaults.environment;
    	      this.gcps = defaults.gcps;
    	      this.id = defaults.id;
    	      this.privateLinkAttachments = defaults.privateLinkAttachments;
    	      this.resourceName = defaults.resourceName;
        }

        @CustomType.Setter
        public Builder aws(List<GetPrivateLinkAttachmentConnectionAw> aws) {
            this.aws = Objects.requireNonNull(aws);
            return this;
        }
        public Builder aws(GetPrivateLinkAttachmentConnectionAw... aws) {
            return aws(List.of(aws));
        }
        @CustomType.Setter
        public Builder azures(List<GetPrivateLinkAttachmentConnectionAzure> azures) {
            this.azures = Objects.requireNonNull(azures);
            return this;
        }
        public Builder azures(GetPrivateLinkAttachmentConnectionAzure... azures) {
            return azures(List.of(azures));
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetPrivateLinkAttachmentConnectionEnvironment environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        @CustomType.Setter
        public Builder gcps(List<GetPrivateLinkAttachmentConnectionGcp> gcps) {
            this.gcps = Objects.requireNonNull(gcps);
            return this;
        }
        public Builder gcps(GetPrivateLinkAttachmentConnectionGcp... gcps) {
            return gcps(List.of(gcps));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkAttachments(List<GetPrivateLinkAttachmentConnectionPrivateLinkAttachment> privateLinkAttachments) {
            this.privateLinkAttachments = Objects.requireNonNull(privateLinkAttachments);
            return this;
        }
        public Builder privateLinkAttachments(GetPrivateLinkAttachmentConnectionPrivateLinkAttachment... privateLinkAttachments) {
            return privateLinkAttachments(List.of(privateLinkAttachments));
        }
        @CustomType.Setter
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public GetPrivateLinkAttachmentConnectionResult build() {
            final var o = new GetPrivateLinkAttachmentConnectionResult();
            o.aws = aws;
            o.azures = azures;
            o.displayName = displayName;
            o.environment = environment;
            o.gcps = gcps;
            o.id = id;
            o.privateLinkAttachments = privateLinkAttachments;
            o.resourceName = resourceName;
            return o;
        }
    }
}