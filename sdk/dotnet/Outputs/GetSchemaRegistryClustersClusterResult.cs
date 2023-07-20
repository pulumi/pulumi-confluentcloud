// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Outputs
{

    [OutputType]
    public sealed class GetSchemaRegistryClustersClusterResult
    {
        /// <summary>
        /// (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `stream-governance/v2`.
        /// </summary>
        public readonly string ApiVersion;
        /// <summary>
        /// (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// (Required Object) exports the following attributes:
        /// </summary>
        public readonly Outputs.GetSchemaRegistryClustersClusterEnvironmentResult Environment;
        /// <summary>
        /// (Required String) The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See Schema Registry Regions.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
        /// </summary>
        public readonly string Package;
        /// <summary>
        /// (Required Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSchemaRegistryClustersClusterRegionResult> Regions;
        /// <summary>
        /// (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
        /// </summary>
        public readonly string ResourceName;
        /// <summary>
        /// (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
        /// </summary>
        public readonly string RestEndpoint;

        [OutputConstructor]
        private GetSchemaRegistryClustersClusterResult(
            string apiVersion,

            string displayName,

            Outputs.GetSchemaRegistryClustersClusterEnvironmentResult environment,

            string id,

            string kind,

            string package,

            ImmutableArray<Outputs.GetSchemaRegistryClustersClusterRegionResult> regions,

            string resourceName,

            string restEndpoint)
        {
            ApiVersion = apiVersion;
            DisplayName = displayName;
            Environment = environment;
            Id = id;
            Kind = kind;
            Package = package;
            Regions = regions;
            ResourceName = resourceName;
            RestEndpoint = restEndpoint;
        }
    }
}
