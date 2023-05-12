// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PeeringGcpArgs extends com.pulumi.resources.ResourceArgs {

    public static final PeeringGcpArgs Empty = new PeeringGcpArgs();

    /**
     * The Import Custom Routes option enables connectivity to a Confluent Cloud cluster in Google Cloud from customer premise or other clouds, such as AWS and Azure, through a customer VPC that is peered with Confluent Cloud in the same region. Defaults to `false`. Learn more about considerations / limitations of the Import Custom Routes option [here](https://docs.confluent.io/cloud/current/networking/peering/gcp-peering.html#import-custom-routes).
     * 
     * &gt; **Note:** Exactly one from the `aws`, `azure`, and `gcp` configuration blocks must be specified.
     * 
     * &gt; **Note:** Learn more about VPC Peering requirements on AWS [here](https://docs.confluent.io/cloud/current/networking/peering/aws-peering.html#vpc-peering-on-aws).
     * 
     * &gt; **Note:** Learn more about VNet Peering requirements on Azure [here](https://docs.confluent.io/cloud/current/networking/peering/azure-peering.html#vnet-peering-on-az).
     * 
     * &gt; **Note:** Learn more about VPC Peering requirements on Google Cloud Platform [here](https://docs.confluent.io/cloud/current/networking/peering/gcp-peering.html#vpc-peering-on-gcp).
     * 
     */
    @Import(name="importCustomRoutes")
    private @Nullable Output<Boolean> importCustomRoutes;

    /**
     * @return The Import Custom Routes option enables connectivity to a Confluent Cloud cluster in Google Cloud from customer premise or other clouds, such as AWS and Azure, through a customer VPC that is peered with Confluent Cloud in the same region. Defaults to `false`. Learn more about considerations / limitations of the Import Custom Routes option [here](https://docs.confluent.io/cloud/current/networking/peering/gcp-peering.html#import-custom-routes).
     * 
     * &gt; **Note:** Exactly one from the `aws`, `azure`, and `gcp` configuration blocks must be specified.
     * 
     * &gt; **Note:** Learn more about VPC Peering requirements on AWS [here](https://docs.confluent.io/cloud/current/networking/peering/aws-peering.html#vpc-peering-on-aws).
     * 
     * &gt; **Note:** Learn more about VNet Peering requirements on Azure [here](https://docs.confluent.io/cloud/current/networking/peering/azure-peering.html#vnet-peering-on-az).
     * 
     * &gt; **Note:** Learn more about VPC Peering requirements on Google Cloud Platform [here](https://docs.confluent.io/cloud/current/networking/peering/gcp-peering.html#vpc-peering-on-gcp).
     * 
     */
    public Optional<Output<Boolean>> importCustomRoutes() {
        return Optional.ofNullable(this.importCustomRoutes);
    }

    /**
     * The GCP Project ID. You can find your Google Cloud Project ID under **Project ID** section of your [Google Cloud Console dashboard](https://console.cloud.google.com/home/dashboard).
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The GCP Project ID. You can find your Google Cloud Project ID under **Project ID** section of your [Google Cloud Console dashboard](https://console.cloud.google.com/home/dashboard).
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * The VPC network name that you&#39;re peering to Confluent Cloud. You can find your VPC network name under **VPC Networks** section of your [Google Cloud Console](https://console.cloud.google.com/networking/networks/list).
     * 
     */
    @Import(name="vpcNetwork", required=true)
    private Output<String> vpcNetwork;

    /**
     * @return The VPC network name that you&#39;re peering to Confluent Cloud. You can find your VPC network name under **VPC Networks** section of your [Google Cloud Console](https://console.cloud.google.com/networking/networks/list).
     * 
     */
    public Output<String> vpcNetwork() {
        return this.vpcNetwork;
    }

    private PeeringGcpArgs() {}

    private PeeringGcpArgs(PeeringGcpArgs $) {
        this.importCustomRoutes = $.importCustomRoutes;
        this.project = $.project;
        this.vpcNetwork = $.vpcNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeeringGcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeeringGcpArgs $;

        public Builder() {
            $ = new PeeringGcpArgs();
        }

        public Builder(PeeringGcpArgs defaults) {
            $ = new PeeringGcpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param importCustomRoutes The Import Custom Routes option enables connectivity to a Confluent Cloud cluster in Google Cloud from customer premise or other clouds, such as AWS and Azure, through a customer VPC that is peered with Confluent Cloud in the same region. Defaults to `false`. Learn more about considerations / limitations of the Import Custom Routes option [here](https://docs.confluent.io/cloud/current/networking/peering/gcp-peering.html#import-custom-routes).
         * 
         * &gt; **Note:** Exactly one from the `aws`, `azure`, and `gcp` configuration blocks must be specified.
         * 
         * &gt; **Note:** Learn more about VPC Peering requirements on AWS [here](https://docs.confluent.io/cloud/current/networking/peering/aws-peering.html#vpc-peering-on-aws).
         * 
         * &gt; **Note:** Learn more about VNet Peering requirements on Azure [here](https://docs.confluent.io/cloud/current/networking/peering/azure-peering.html#vnet-peering-on-az).
         * 
         * &gt; **Note:** Learn more about VPC Peering requirements on Google Cloud Platform [here](https://docs.confluent.io/cloud/current/networking/peering/gcp-peering.html#vpc-peering-on-gcp).
         * 
         * @return builder
         * 
         */
        public Builder importCustomRoutes(@Nullable Output<Boolean> importCustomRoutes) {
            $.importCustomRoutes = importCustomRoutes;
            return this;
        }

        /**
         * @param importCustomRoutes The Import Custom Routes option enables connectivity to a Confluent Cloud cluster in Google Cloud from customer premise or other clouds, such as AWS and Azure, through a customer VPC that is peered with Confluent Cloud in the same region. Defaults to `false`. Learn more about considerations / limitations of the Import Custom Routes option [here](https://docs.confluent.io/cloud/current/networking/peering/gcp-peering.html#import-custom-routes).
         * 
         * &gt; **Note:** Exactly one from the `aws`, `azure`, and `gcp` configuration blocks must be specified.
         * 
         * &gt; **Note:** Learn more about VPC Peering requirements on AWS [here](https://docs.confluent.io/cloud/current/networking/peering/aws-peering.html#vpc-peering-on-aws).
         * 
         * &gt; **Note:** Learn more about VNet Peering requirements on Azure [here](https://docs.confluent.io/cloud/current/networking/peering/azure-peering.html#vnet-peering-on-az).
         * 
         * &gt; **Note:** Learn more about VPC Peering requirements on Google Cloud Platform [here](https://docs.confluent.io/cloud/current/networking/peering/gcp-peering.html#vpc-peering-on-gcp).
         * 
         * @return builder
         * 
         */
        public Builder importCustomRoutes(Boolean importCustomRoutes) {
            return importCustomRoutes(Output.of(importCustomRoutes));
        }

        /**
         * @param project The GCP Project ID. You can find your Google Cloud Project ID under **Project ID** section of your [Google Cloud Console dashboard](https://console.cloud.google.com/home/dashboard).
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The GCP Project ID. You can find your Google Cloud Project ID under **Project ID** section of your [Google Cloud Console dashboard](https://console.cloud.google.com/home/dashboard).
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param vpcNetwork The VPC network name that you&#39;re peering to Confluent Cloud. You can find your VPC network name under **VPC Networks** section of your [Google Cloud Console](https://console.cloud.google.com/networking/networks/list).
         * 
         * @return builder
         * 
         */
        public Builder vpcNetwork(Output<String> vpcNetwork) {
            $.vpcNetwork = vpcNetwork;
            return this;
        }

        /**
         * @param vpcNetwork The VPC network name that you&#39;re peering to Confluent Cloud. You can find your VPC network name under **VPC Networks** section of your [Google Cloud Console](https://console.cloud.google.com/networking/networks/list).
         * 
         * @return builder
         * 
         */
        public Builder vpcNetwork(String vpcNetwork) {
            return vpcNetwork(Output.of(vpcNetwork));
        }

        public PeeringGcpArgs build() {
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.vpcNetwork = Objects.requireNonNull($.vpcNetwork, "expected parameter 'vpcNetwork' to be non-null");
            return $;
        }
    }

}
