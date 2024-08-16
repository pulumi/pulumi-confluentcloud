// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "confluentcloud:index/accessPoint:AccessPoint":
		r = &AccessPoint{}
	case "confluentcloud:index/apiKey:ApiKey":
		r = &ApiKey{}
	case "confluentcloud:index/businessMetadata:BusinessMetadata":
		r = &BusinessMetadata{}
	case "confluentcloud:index/businessMetadataBinding:BusinessMetadataBinding":
		r = &BusinessMetadataBinding{}
	case "confluentcloud:index/byokKey:ByokKey":
		r = &ByokKey{}
	case "confluentcloud:index/catalogEntityAttributes:CatalogEntityAttributes":
		r = &CatalogEntityAttributes{}
	case "confluentcloud:index/clusterLink:ClusterLink":
		r = &ClusterLink{}
	case "confluentcloud:index/connector:Connector":
		r = &Connector{}
	case "confluentcloud:index/customConnectorPlugin:CustomConnectorPlugin":
		r = &CustomConnectorPlugin{}
	case "confluentcloud:index/dnsForwarder:DnsForwarder":
		r = &DnsForwarder{}
	case "confluentcloud:index/dnsRecord:DnsRecord":
		r = &DnsRecord{}
	case "confluentcloud:index/environment:Environment":
		r = &Environment{}
	case "confluentcloud:index/flinkComputePool:FlinkComputePool":
		r = &FlinkComputePool{}
	case "confluentcloud:index/flinkStatement:FlinkStatement":
		r = &FlinkStatement{}
	case "confluentcloud:index/groupMapping:GroupMapping":
		r = &GroupMapping{}
	case "confluentcloud:index/identityPool:IdentityPool":
		r = &IdentityPool{}
	case "confluentcloud:index/identityProvider:IdentityProvider":
		r = &IdentityProvider{}
	case "confluentcloud:index/invitation:Invitation":
		r = &Invitation{}
	case "confluentcloud:index/kafkaAcl:KafkaAcl":
		r = &KafkaAcl{}
	case "confluentcloud:index/kafkaClientQuota:KafkaClientQuota":
		r = &KafkaClientQuota{}
	case "confluentcloud:index/kafkaCluster:KafkaCluster":
		r = &KafkaCluster{}
	case "confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig":
		r = &KafkaClusterConfig{}
	case "confluentcloud:index/kafkaMirrorTopic:KafkaMirrorTopic":
		r = &KafkaMirrorTopic{}
	case "confluentcloud:index/kafkaTopic:KafkaTopic":
		r = &KafkaTopic{}
	case "confluentcloud:index/ksqlCluster:KsqlCluster":
		r = &KsqlCluster{}
	case "confluentcloud:index/network:Network":
		r = &Network{}
	case "confluentcloud:index/networkLinkEndpoint:NetworkLinkEndpoint":
		r = &NetworkLinkEndpoint{}
	case "confluentcloud:index/networkLinkService:NetworkLinkService":
		r = &NetworkLinkService{}
	case "confluentcloud:index/peering:Peering":
		r = &Peering{}
	case "confluentcloud:index/privateLinkAccess:PrivateLinkAccess":
		r = &PrivateLinkAccess{}
	case "confluentcloud:index/privateLinkAttachment:PrivateLinkAttachment":
		r = &PrivateLinkAttachment{}
	case "confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection":
		r = &PrivateLinkAttachmentConnection{}
	case "confluentcloud:index/roleBinding:RoleBinding":
		r = &RoleBinding{}
	case "confluentcloud:index/schema:Schema":
		r = &Schema{}
	case "confluentcloud:index/schemaExporter:SchemaExporter":
		r = &SchemaExporter{}
	case "confluentcloud:index/schemaRegistryClusterConfig:SchemaRegistryClusterConfig":
		r = &SchemaRegistryClusterConfig{}
	case "confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode":
		r = &SchemaRegistryClusterMode{}
	case "confluentcloud:index/schemaRegistryDek:SchemaRegistryDek":
		r = &SchemaRegistryDek{}
	case "confluentcloud:index/schemaRegistryKek:SchemaRegistryKek":
		r = &SchemaRegistryKek{}
	case "confluentcloud:index/serviceAccount:ServiceAccount":
		r = &ServiceAccount{}
	case "confluentcloud:index/subjectConfig:SubjectConfig":
		r = &SubjectConfig{}
	case "confluentcloud:index/subjectMode:SubjectMode":
		r = &SubjectMode{}
	case "confluentcloud:index/tag:Tag":
		r = &Tag{}
	case "confluentcloud:index/tagBinding:TagBinding":
		r = &TagBinding{}
	case "confluentcloud:index/tfImporter:TfImporter":
		r = &TfImporter{}
	case "confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment":
		r = &TransitGatewayAttachment{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:confluentcloud" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/accessPoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/apiKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/businessMetadata",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/businessMetadataBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/byokKey",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/catalogEntityAttributes",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/clusterLink",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/connector",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/customConnectorPlugin",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/dnsForwarder",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/dnsRecord",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/environment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/flinkComputePool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/flinkStatement",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/groupMapping",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/identityPool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/identityProvider",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/invitation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/kafkaAcl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/kafkaClientQuota",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/kafkaCluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/kafkaClusterConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/kafkaMirrorTopic",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/kafkaTopic",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/ksqlCluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/network",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/networkLinkEndpoint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/networkLinkService",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/peering",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/privateLinkAccess",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/privateLinkAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/privateLinkAttachmentConnection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/roleBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/schema",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/schemaExporter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/schemaRegistryClusterConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/schemaRegistryClusterMode",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/schemaRegistryDek",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/schemaRegistryKek",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/serviceAccount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/subjectConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/subjectMode",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/tag",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/tagBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/tfImporter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"confluentcloud",
		"index/transitGatewayAttachment",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"confluentcloud",
		&pkg{version},
	)
}
