// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrivateLinkAccessAw {
    /**
     * @return (Required String) The AWS account ID to enable for the Private Link Access. You can find your AWS account ID [here](https://console.aws.amazon.com/billing/home?#/account) under **My Account** in your AWS Management Console. Must be a **12 character string**.
     * 
     */
    private final String account;

    @CustomType.Constructor
    private GetPrivateLinkAccessAw(@CustomType.Parameter("account") String account) {
        this.account = account;
    }

    /**
     * @return (Required String) The AWS account ID to enable for the Private Link Access. You can find your AWS account ID [here](https://console.aws.amazon.com/billing/home?#/account) under **My Account** in your AWS Management Console. Must be a **12 character string**.
     * 
     */
    public String account() {
        return this.account;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkAccessAw defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String account;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateLinkAccessAw defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
        }

        public Builder account(String account) {
            this.account = Objects.requireNonNull(account);
            return this;
        }        public GetPrivateLinkAccessAw build() {
            return new GetPrivateLinkAccessAw(account);
        }
    }
}
