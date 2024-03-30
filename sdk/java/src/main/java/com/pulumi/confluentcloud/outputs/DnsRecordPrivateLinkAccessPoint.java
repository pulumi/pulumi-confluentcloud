// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DnsRecordPrivateLinkAccessPoint {
    /**
     * @return The ID of the Private Link access point to which the DNS Record is associated, for example `ap-123abc`.
     * 
     */
    private String id;

    private DnsRecordPrivateLinkAccessPoint() {}
    /**
     * @return The ID of the Private Link access point to which the DNS Record is associated, for example `ap-123abc`.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsRecordPrivateLinkAccessPoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(DnsRecordPrivateLinkAccessPoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("DnsRecordPrivateLinkAccessPoint", "id");
            }
            this.id = id;
            return this;
        }
        public DnsRecordPrivateLinkAccessPoint build() {
            final var _resultValue = new DnsRecordPrivateLinkAccessPoint();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
