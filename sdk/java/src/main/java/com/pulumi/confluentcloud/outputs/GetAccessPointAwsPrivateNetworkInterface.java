// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccessPointAwsPrivateNetworkInterface {
    /**
     * @return (Required String) The AWS account ID associated with the ENIs you are using for the Confluent Private Network Interface, for example: `000000000000`.
     * 
     */
    private String account;
    /**
     * @return (Required List of Strings) List of the IDs of the Elastic Network Interfaces, for example: `[&#34;eni-00000000000000000&#34;, &#34;eni-00000000000000001&#34;, &#34;eni-00000000000000002&#34;, &#34;eni-00000000000000003&#34;, &#34;eni-00000000000000004&#34;, &#34;eni-00000000000000005&#34;]`
     * 
     */
    private List<String> networkInterfaces;

    private GetAccessPointAwsPrivateNetworkInterface() {}
    /**
     * @return (Required String) The AWS account ID associated with the ENIs you are using for the Confluent Private Network Interface, for example: `000000000000`.
     * 
     */
    public String account() {
        return this.account;
    }
    /**
     * @return (Required List of Strings) List of the IDs of the Elastic Network Interfaces, for example: `[&#34;eni-00000000000000000&#34;, &#34;eni-00000000000000001&#34;, &#34;eni-00000000000000002&#34;, &#34;eni-00000000000000003&#34;, &#34;eni-00000000000000004&#34;, &#34;eni-00000000000000005&#34;]`
     * 
     */
    public List<String> networkInterfaces() {
        return this.networkInterfaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointAwsPrivateNetworkInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String account;
        private List<String> networkInterfaces;
        public Builder() {}
        public Builder(GetAccessPointAwsPrivateNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.networkInterfaces = defaults.networkInterfaces;
        }

        @CustomType.Setter
        public Builder account(String account) {
            if (account == null) {
              throw new MissingRequiredPropertyException("GetAccessPointAwsPrivateNetworkInterface", "account");
            }
            this.account = account;
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaces(List<String> networkInterfaces) {
            if (networkInterfaces == null) {
              throw new MissingRequiredPropertyException("GetAccessPointAwsPrivateNetworkInterface", "networkInterfaces");
            }
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(String... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public GetAccessPointAwsPrivateNetworkInterface build() {
            final var _resultValue = new GetAccessPointAwsPrivateNetworkInterface();
            _resultValue.account = account;
            _resultValue.networkInterfaces = networkInterfaces;
            return _resultValue;
        }
    }
}