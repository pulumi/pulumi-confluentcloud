// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetNetworkLinkServiceAccept extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkLinkServiceAccept Empty = new GetNetworkLinkServiceAccept();

    /**
     * (Optional List of Strings) List of environments ids from which connections can be accepted. All networks within the list of environment will be allowed.
     * 
     */
    @Import(name="environments", required=true)
    private List<String> environments;

    /**
     * @return (Optional List of Strings) List of environments ids from which connections can be accepted. All networks within the list of environment will be allowed.
     * 
     */
    public List<String> environments() {
        return this.environments;
    }

    /**
     * (Optional List of Strings) List of network ids from which connections can be accepted.
     * 
     */
    @Import(name="networks", required=true)
    private List<String> networks;

    /**
     * @return (Optional List of Strings) List of network ids from which connections can be accepted.
     * 
     */
    public List<String> networks() {
        return this.networks;
    }

    private GetNetworkLinkServiceAccept() {}

    private GetNetworkLinkServiceAccept(GetNetworkLinkServiceAccept $) {
        this.environments = $.environments;
        this.networks = $.networks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkLinkServiceAccept defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkLinkServiceAccept $;

        public Builder() {
            $ = new GetNetworkLinkServiceAccept();
        }

        public Builder(GetNetworkLinkServiceAccept defaults) {
            $ = new GetNetworkLinkServiceAccept(Objects.requireNonNull(defaults));
        }

        /**
         * @param environments (Optional List of Strings) List of environments ids from which connections can be accepted. All networks within the list of environment will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder environments(List<String> environments) {
            $.environments = environments;
            return this;
        }

        /**
         * @param environments (Optional List of Strings) List of environments ids from which connections can be accepted. All networks within the list of environment will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder environments(String... environments) {
            return environments(List.of(environments));
        }

        /**
         * @param networks (Optional List of Strings) List of network ids from which connections can be accepted.
         * 
         * @return builder
         * 
         */
        public Builder networks(List<String> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks (Optional List of Strings) List of network ids from which connections can be accepted.
         * 
         * @return builder
         * 
         */
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }

        public GetNetworkLinkServiceAccept build() {
            if ($.environments == null) {
                throw new MissingRequiredPropertyException("GetNetworkLinkServiceAccept", "environments");
            }
            if ($.networks == null) {
                throw new MissingRequiredPropertyException("GetNetworkLinkServiceAccept", "networks");
            }
            return $;
        }
    }

}
