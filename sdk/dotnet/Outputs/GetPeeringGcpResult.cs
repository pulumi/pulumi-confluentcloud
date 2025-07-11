// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Outputs
{

    [OutputType]
    public sealed class GetPeeringGcpResult
    {
        /// <summary>
        /// (Optional Boolean) The Import Custom Routes option enables connectivity to a Confluent Cloud cluster in Google Cloud from customer premise or other clouds, such as AWS and Azure, through a customer VPC that is peered with Confluent Cloud in the same region. Defaults to `false`. Learn more about considerations / limitations of the Import Custom Routes option [here](https://docs.confluent.io/cloud/current/networking/peering/gcp-peering.html#import-custom-routes).
        /// </summary>
        public readonly bool ImportCustomRoutes;
        /// <summary>
        /// (Required String) The GCP Project ID. You can find your Google Cloud Project ID under **Project ID** section of your [Google Cloud Console dashboard](https://console.cloud.google.com/home/dashboard).
        /// </summary>
        public readonly string Project;
        /// <summary>
        /// (Required String) The VPC network name that you're peering to Confluent Cloud. You can find your VPC network name under **VPC Networks** section of your [Google Cloud Console](https://console.cloud.google.com/networking/networks/list).
        /// </summary>
        public readonly string VpcNetwork;

        [OutputConstructor]
        private GetPeeringGcpResult(
            bool importCustomRoutes,

            string project,

            string vpcNetwork)
        {
            ImportCustomRoutes = importCustomRoutes;
            Project = project;
            VpcNetwork = vpcNetwork;
        }
    }
}
