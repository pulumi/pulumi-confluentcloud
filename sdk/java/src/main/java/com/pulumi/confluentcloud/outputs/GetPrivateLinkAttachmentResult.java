// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetPrivateLinkAttachmentAw;
import com.pulumi.confluentcloud.outputs.GetPrivateLinkAttachmentAzure;
import com.pulumi.confluentcloud.outputs.GetPrivateLinkAttachmentEnvironment;
import com.pulumi.confluentcloud.outputs.GetPrivateLinkAttachmentGcp;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPrivateLinkAttachmentResult {
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    private List<GetPrivateLinkAttachmentAw> aws;
    /**
     * @return (Optional Configuration Block) supports the following:
     * - ` private_link_service_alias  ` - (Required String) Azure Private Link service alias for the availability zone.
     * 
     */
    private List<GetPrivateLinkAttachmentAzure> azures;
    /**
     * @return (Optional String) The cloud service provider that hosts the resources to access with the Private Link Attachment.
     * 
     */
    private String cloud;
    /**
     * @return (Optional String) The name of the Private Link Attachment.
     * 
     */
    private String displayName;
    /**
     * @return (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.cloud`.
     * 
     */
    private String dnsDomain;
    private GetPrivateLinkAttachmentEnvironment environment;
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    private List<GetPrivateLinkAttachmentGcp> gcps;
    private String id;
    /**
     * @return (Optional String) The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
     * 
     */
    private String region;
    /**
     * @return (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
     * 
     */
    private String resourceName;

    private GetPrivateLinkAttachmentResult() {}
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public List<GetPrivateLinkAttachmentAw> aws() {
        return this.aws;
    }
    /**
     * @return (Optional Configuration Block) supports the following:
     * - ` private_link_service_alias  ` - (Required String) Azure Private Link service alias for the availability zone.
     * 
     */
    public List<GetPrivateLinkAttachmentAzure> azures() {
        return this.azures;
    }
    /**
     * @return (Optional String) The cloud service provider that hosts the resources to access with the Private Link Attachment.
     * 
     */
    public String cloud() {
        return this.cloud;
    }
    /**
     * @return (Optional String) The name of the Private Link Attachment.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.cloud`.
     * 
     */
    public String dnsDomain() {
        return this.dnsDomain;
    }
    public GetPrivateLinkAttachmentEnvironment environment() {
        return this.environment;
    }
    /**
     * @return (Optional Configuration Block) supports the following:
     * 
     */
    public List<GetPrivateLinkAttachmentGcp> gcps() {
        return this.gcps;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return (Optional String) The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkAttachmentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPrivateLinkAttachmentAw> aws;
        private List<GetPrivateLinkAttachmentAzure> azures;
        private String cloud;
        private String displayName;
        private String dnsDomain;
        private GetPrivateLinkAttachmentEnvironment environment;
        private List<GetPrivateLinkAttachmentGcp> gcps;
        private String id;
        private String region;
        private String resourceName;
        public Builder() {}
        public Builder(GetPrivateLinkAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
    	      this.azures = defaults.azures;
    	      this.cloud = defaults.cloud;
    	      this.displayName = defaults.displayName;
    	      this.dnsDomain = defaults.dnsDomain;
    	      this.environment = defaults.environment;
    	      this.gcps = defaults.gcps;
    	      this.id = defaults.id;
    	      this.region = defaults.region;
    	      this.resourceName = defaults.resourceName;
        }

        @CustomType.Setter
        public Builder aws(List<GetPrivateLinkAttachmentAw> aws) {
            if (aws == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentResult", "aws");
            }
            this.aws = aws;
            return this;
        }
        public Builder aws(GetPrivateLinkAttachmentAw... aws) {
            return aws(List.of(aws));
        }
        @CustomType.Setter
        public Builder azures(List<GetPrivateLinkAttachmentAzure> azures) {
            if (azures == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentResult", "azures");
            }
            this.azures = azures;
            return this;
        }
        public Builder azures(GetPrivateLinkAttachmentAzure... azures) {
            return azures(List.of(azures));
        }
        @CustomType.Setter
        public Builder cloud(String cloud) {
            if (cloud == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentResult", "cloud");
            }
            this.cloud = cloud;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentResult", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder dnsDomain(String dnsDomain) {
            if (dnsDomain == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentResult", "dnsDomain");
            }
            this.dnsDomain = dnsDomain;
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetPrivateLinkAttachmentEnvironment environment) {
            if (environment == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentResult", "environment");
            }
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder gcps(List<GetPrivateLinkAttachmentGcp> gcps) {
            if (gcps == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentResult", "gcps");
            }
            this.gcps = gcps;
            return this;
        }
        public Builder gcps(GetPrivateLinkAttachmentGcp... gcps) {
            return gcps(List.of(gcps));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentResult", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder resourceName(String resourceName) {
            if (resourceName == null) {
              throw new MissingRequiredPropertyException("GetPrivateLinkAttachmentResult", "resourceName");
            }
            this.resourceName = resourceName;
            return this;
        }
        public GetPrivateLinkAttachmentResult build() {
            final var _resultValue = new GetPrivateLinkAttachmentResult();
            _resultValue.aws = aws;
            _resultValue.azures = azures;
            _resultValue.cloud = cloud;
            _resultValue.displayName = displayName;
            _resultValue.dnsDomain = dnsDomain;
            _resultValue.environment = environment;
            _resultValue.gcps = gcps;
            _resultValue.id = id;
            _resultValue.region = region;
            _resultValue.resourceName = resourceName;
            return _resultValue;
        }
    }
}
