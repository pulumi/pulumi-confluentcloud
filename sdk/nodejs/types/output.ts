// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface ApiKeyManagedResource {
    /**
     * The API group and version of the managed resource that the API Key associated with, for example, `cmk/v2`.
     */
    apiVersion: string;
    environment: outputs.ApiKeyManagedResourceEnvironment;
    /**
     * The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
     */
    id: string;
    /**
     * The kind of the managed resource that the API Key associated with, for example, `Cluster`.
     */
    kind: string;
}

export interface ApiKeyManagedResourceEnvironment {
    /**
     * The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
     */
    id: string;
}

export interface ApiKeyOwner {
    /**
     * The API group and version of the managed resource that the API Key associated with, for example, `cmk/v2`.
     */
    apiVersion: string;
    /**
     * The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
     */
    id: string;
    /**
     * The kind of the managed resource that the API Key associated with, for example, `Cluster`.
     */
    kind: string;
}

export interface ByokKeyAws {
    /**
     * The Amazon Resource Name (ARN) of an AWS KMS key.
     */
    keyArn: string;
    /**
     * (Optional List of Strings) The Amazon Resource Names (ARNs) of IAM Roles created for this key-environment
     */
    roles: string[];
}

export interface ByokKeyAzure {
    /**
     * (Optional String) The Application ID created for this key-environment combination.
     */
    applicationId: string;
    /**
     * The unique Key Object Identifier URL of an Azure Key Vault key.
     */
    keyIdentifier: string;
    /**
     * Key Vault ID containing the key.
     */
    keyVaultId: string;
    /**
     * Tenant ID (uuid) hosting the Key Vault containing the key.
     */
    tenantId: string;
}

export interface ClusterLinkDestinationKafkaCluster {
    /**
     * The bootstrap endpoint of the destination Kafka cluster, for example, `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092` or `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     */
    bootstrapEndpoint?: string;
    credentials?: outputs.ClusterLinkDestinationKafkaClusterCredentials;
    /**
     * The ID of the destination Kafka cluster, for example, `lkc-abc123`.
     */
    id: string;
    /**
     * The REST endpoint of the destination Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: string;
}

export interface ClusterLinkDestinationKafkaClusterCredentials {
    /**
     * The Kafka API Key.
     */
    key: string;
    /**
     * The Kafka API Secret.
     */
    secret: string;
}

export interface ClusterLinkSourceKafkaCluster {
    /**
     * The bootstrap endpoint of the destination Kafka cluster, for example, `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092` or `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
     */
    bootstrapEndpoint?: string;
    credentials?: outputs.ClusterLinkSourceKafkaClusterCredentials;
    /**
     * The ID of the destination Kafka cluster, for example, `lkc-abc123`.
     */
    id: string;
    /**
     * The REST endpoint of the destination Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: string;
}

export interface ClusterLinkSourceKafkaClusterCredentials {
    /**
     * The Kafka API Key.
     */
    key: string;
    /**
     * The Kafka API Secret.
     */
    secret: string;
}

export interface ConnectorEnvironment {
    /**
     * The ID of the Kafka cluster that the connector belongs to, for example, `lkc-abc123`.
     */
    id: string;
}

export interface ConnectorKafkaCluster {
    /**
     * The ID of the Kafka cluster that the connector belongs to, for example, `lkc-abc123`.
     */
    id: string;
}

export interface GetByokKeyAw {
    /**
     * (Required String) The Amazon Resource Name (ARN) of an AWS KMS key.
     */
    keyArn: string;
    /**
     * (Optional List of Strings) The Amazon Resource Names (ARNs) of IAM Roles created for this key-environment combination.
     */
    roles: string[];
}

export interface GetByokKeyAzure {
    /**
     * (Optional String) The Application ID created for this key-environment combination.
     */
    applicationId: string;
    /**
     * (Required String) The unique Key Object Identifier URL of an Azure Key Vault key.
     */
    keyIdentifier: string;
    /**
     * (Required String) Key Vault ID containing the key.
     */
    keyVaultId: string;
    /**
     * (Required String) Tenant ID (uuid) hosting the Key Vault containing the key.
     */
    tenantId: string;
}

export interface GetIdentityPoolIdentityProvider {
    /**
     * The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
     */
    id: string;
}

export interface GetInvitationCreator {
    /**
     * The ID of the Invitation, for example, `i-zyw30`.
     */
    id: string;
}

export interface GetInvitationUser {
    /**
     * The ID of the Invitation, for example, `i-zyw30`.
     */
    id: string;
}

export interface GetKafkaClientQuotaEnvironment {
    /**
     * The ID of the Kafka Client Quota (for example, `cq-abc123`).
     */
    id: string;
}

export interface GetKafkaClientQuotaKafkaCluster {
    /**
     * The ID of the Kafka Client Quota (for example, `cq-abc123`).
     */
    id: string;
}

export interface GetKafkaClientQuotaThroughput {
    /**
     * (Required String) The egress throughput limit in bytes per second.
     */
    egressByteRate: string;
    /**
     * (Required String) The ingress throughput limit in bytes per second.
     */
    ingressByteRate: string;
}

export interface GetKafkaClusterBasic {
}

export interface GetKafkaClusterByokKey {
    /**
     * The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetKafkaClusterDedicated {
    /**
     * (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have more than `2` CKUs.
     */
    cku: number;
    encryptionKey: string;
    /**
     * (Required List of String) The list of zones the cluster is in.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     */
    zones: string[];
}

export interface GetKafkaClusterEnvironment {
    /**
     * The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetKafkaClusterNetwork {
    /**
     * The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetKafkaClusterStandard {
}

export interface GetKafkaTopicCredentials {
    /**
     * The Kafka API Key.
     */
    key: string;
    /**
     * The Kafka API Secret.
     */
    secret: string;
}

export interface GetKafkaTopicKafkaCluster {
    /**
     * The ID of the Kafka cluster, for example, `lkc-abc123`.
     */
    id: string;
}

export interface GetKsqlClusterCredentialIdentity {
    /**
     * The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetKsqlClusterEnvironment {
    /**
     * The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetKsqlClusterKafkaCluster {
    /**
     * The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetNetworkAw {
    /**
     * (Required String) The AWS account ID associated with the Confluent Cloud VPC.
     */
    account: string;
    /**
     * (Optional String) The endpoint service of the Confluent Cloud VPC (used for PrivateLink) if available.
     */
    privateLinkEndpointService: string;
    /**
     * (Required String) The Confluent Cloud VPC ID.
     */
    vpc: string;
}

export interface GetNetworkAzure {
    /**
     * (Optional Map) The mapping of zones to Private Link Service Aliases if available. Keys are zones and values are [Azure Private Link Service Aliases](https://docs.microsoft.com/en-us/azure/private-link/private-link-service-overview#share-your-service).
     */
    privateLinkServiceAliases: {[key: string]: string};
}

export interface GetNetworkDnsConfig {
    /**
     * (Required String) Network DNS resolution.
     * When resolution is `CHASED_PRIVATE`, clusters in this network require both public and private DNS to resolve cluster endpoints.
     * When resolution is `PRIVATE`, clusters in this network only require private DNS to resolve cluster endpoints.
     */
    resolution: string;
}

export interface GetNetworkEnvironment {
    /**
     * The ID of the Environment that the Network belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetNetworkGcp {
    /**
     * (Optional Map) The mapping of zones to Private Service Connect Service Attachments if available. Keys are zones and values are [GCP Private Service Connect service attachment](https://cloud.google.com/vpc/docs/configure-private-service-connect-producer#api_7).
     */
    privateServiceConnectServiceAttachments: {[key: string]: string};
    /**
     * (Required String) The GCP Project ID associated with the Confluent Cloud VPC.
     */
    project: string;
    /**
     * (Required String) The network name of the Confluent Cloud VPC.
     */
    vpcNetwork: string;
}

export interface GetNetworkZoneInfo {
    /**
     * (Required String) The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
     */
    cidr: string;
    /**
     * (Required String) Cloud provider zone ID.
     */
    zoneId: string;
}

export interface GetPeeringAw {
    /**
     * (Required String) The AWS Account ID of the peer VPC owner. You can find your AWS Account ID [here](https://console.aws.amazon.com/billing/home?#/account) under **My Account** section of the AWS Management Console. Must be a **12 character string**.
     */
    account: string;
    /**
     * (Required String) The region of the Azure peer VNet.
     */
    customerRegion: string;
    /**
     * (Required String) The AWS VPC CIDR blocks or subsets. This must be from the supported CIDR blocks and must not overlap with your Confluent Cloud CIDR block or any other network peering connection VPC CIDR (learn more about the requirements [here](https://docs.confluent.io/cloud/current/networking/peering/aws-peering.html#vpc-peering-on-aws)). You can find AWS VPC CIDR [here](https://console.aws.amazon.com/vpc/) under **Your VPCs > Target VPC > Details** section of the AWS Management Console.
     */
    routes: string[];
    /**
     * (Required String) The AWS VPC ID of the peer VPC that you're peering with Confluent Cloud. You can find your AWS VPC ID [here](https://console.aws.amazon.com/vpc/) under **Your VPCs** section of the AWS Management Console. Must start with `vpc-`.
     */
    vpc: string;
}

export interface GetPeeringAzure {
    /**
     * (Required String) The region of the Azure peer VNet.
     */
    customerRegion: string;
    /**
     * (Required String) The Tenant ID that represents an organization in Azure Active Directory. You can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
     */
    tenant: string;
    /**
     * (Required String) The resource (composite) ID of the peer Virtual Network that you're peering with Confluent Cloud, in the format `/subscriptions/<Subscription ID>/resourceGroups/<Resource Group Name>/providers/Microsoft.Network/virtualNetworks/<VNet name>`. You can find Subscription ID, Resource Group Name and your VNet name under **Virtual Networks > Target VNet > Essentials** section of your [Microsoft Azure Portal](https://portal.azure.com/).
     */
    vnet: string;
}

export interface GetPeeringEnvironment {
    /**
     * The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetPeeringGcp {
    /**
     * (Optional Boolean) The Import Custom Routes option enables connectivity to a Confluent Cloud cluster in Google Cloud from customer premise or other clouds, such as AWS and Azure, through a customer VPC that is peered with Confluent Cloud in the same region. Defaults to `false`. Learn more about considerations / limitations of the Import Custom Routes option [here](https://docs.confluent.io/cloud/current/networking/peering/gcp-peering.html#import-custom-routes).
     */
    importCustomRoutes: boolean;
    /**
     * (Required String) The GCP Project ID. You can find your Google Cloud Project ID under **Project ID** section of your [Google Cloud Console dashboard](https://console.cloud.google.com/home/dashboard).
     */
    project: string;
    /**
     * (Required String) The VPC network name that you're peering to Confluent Cloud. You can find your VPC network name under **VPC Networks** section of your [Google Cloud Console](https://console.cloud.google.com/networking/networks/list).
     */
    vpcNetwork: string;
}

export interface GetPeeringNetwork {
    /**
     * The ID of the Environment that the Peering belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetPrivateLinkAccessAw {
    /**
     * (Required String) The AWS account ID to enable for the Private Link Access. You can find your AWS account ID [here](https://console.aws.amazon.com/billing/home?#/account) under **My Account** in your AWS Management Console. Must be a **12 character string**.
     */
    account: string;
}

export interface GetPrivateLinkAccessAzure {
    /**
     * (Required String) The Azure subscription ID to enable for the Private Link Access. You can find your Azure subscription ID in the subscription section of your [Microsoft Azure Portal](https://portal.azure.com/#blade/Microsoft_Azure_Billing/SubscriptionsBlade). Must be a valid **32 character UUID string**.
     */
    subscription: string;
}

export interface GetPrivateLinkAccessEnvironment {
    /**
     * The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetPrivateLinkAccessGcp {
    /**
     * (Required String) The GCP project ID to allow for Private Service Connect access. You can find your Google Cloud Project ID under **Project ID** section of your [Google Cloud Console dashboard](https://console.cloud.google.com/home/dashboard).
     */
    project: string;
}

export interface GetPrivateLinkAccessNetwork {
    /**
     * The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetSchemaCredentials {
    /**
     * The Schema Registry API Key.
     */
    key: string;
    /**
     * The Schema Registry API Secret.
     */
    secret: string;
}

export interface GetSchemaRegistryClusterConfigCredentials {
    /**
     * The Schema Registry API Key.
     */
    key: string;
    /**
     * The Schema Registry API Secret.
     */
    secret: string;
}

export interface GetSchemaRegistryClusterConfigSchemaRegistryCluster {
    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     */
    id: string;
}

export interface GetSchemaRegistryClusterEnvironment {
    /**
     * The ID of the Environment that the Schema Registry cluster belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetSchemaRegistryClusterModeCredentials {
    /**
     * The Schema Registry API Key.
     */
    key: string;
    /**
     * The Schema Registry API Secret.
     */
    secret: string;
}

export interface GetSchemaRegistryClusterModeSchemaRegistryCluster {
    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     */
    id: string;
}

export interface GetSchemaRegistryClusterRegion {
    /**
     * The ID of the Environment that the Schema Registry cluster belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetSchemaSchemaReference {
    /**
     * (Required String) The name of the subject, representing the subject under which the referenced schema is registered.
     */
    name: string;
    /**
     * The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
     */
    subjectName: string;
    /**
     * (Required Integer) The version of the Schema, for example, `4`.
     */
    version: number;
}

export interface GetSchemaSchemaRegistryCluster {
    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     */
    id: string;
}

export interface GetSchemasCredentials {
    /**
     * The Schema Registry API Key.
     */
    key: string;
    /**
     * The Schema Registry API Secret.
     */
    secret: string;
}

export interface GetSchemasFilter {
    /**
     * The boolean flag to control whether to return soft deleted schemas. Defaults to `false`.
     */
    deleted?: boolean;
    /**
     * The boolean flag to control whether to return latest schema versions only for each matching subject. Defaults to `false`.
     */
    latestOnly?: boolean;
    /**
     * The prefix of the subjects (in other words, the namespaces), representing the subjects under which the schemas are registered.
     */
    subjectPrefix?: string;
}

export interface GetSchemasSchema {
    /**
     * (Required String) The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
     */
    format: string;
    /**
     * (Required String) The schema string.
     */
    schema: string;
    /**
     * (Required String) The ID of the Schema, for example: `lsrc-abc123/test-subject/100003`.
     */
    schemaIdentifier: number;
    /**
     * (Optional List) The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
     */
    schemaReferences: outputs.GetSchemasSchemaSchemaReference[];
    /**
     * (Required String) The name for the reference. (For Avro Schema, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf Schema, it is the name of another Protobuf file.)
     */
    subjectName: string;
    /**
     * (Required Integer) The version of the Schema, for example, `4`.
     */
    version: number;
}

export interface GetSchemasSchemaRegistryCluster {
    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     */
    id: string;
}

export interface GetSchemasSchemaSchemaReference {
    /**
     * (Required String) The name of the subject, representing the subject under which the referenced schema is registered.
     */
    name: string;
    /**
     * (Required String) The name for the reference. (For Avro Schema, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf Schema, it is the name of another Protobuf file.)
     */
    subjectName: string;
    /**
     * (Required Integer) The version of the Schema, for example, `4`.
     */
    version: number;
}

export interface GetSubjectConfigCredentials {
    /**
     * The Schema Registry API Key.
     */
    key: string;
    /**
     * The Schema Registry API Secret.
     */
    secret: string;
}

export interface GetSubjectConfigSchemaRegistryCluster {
    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     */
    id: string;
}

export interface GetSubjectModeCredentials {
    /**
     * The Schema Registry API Key.
     */
    key: string;
    /**
     * The Schema Registry API Secret.
     */
    secret: string;
}

export interface GetSubjectModeSchemaRegistryCluster {
    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     */
    id: string;
}

export interface GetTransitGatewayAttachmentAw {
    /**
     * (Required String) The Amazon Resource Name (ARN) of the Resource Access Manager (RAM) Resource Share of the transit gateway your Confluent Cloud network attaches to.
     */
    ramResourceShareArn: string;
    /**
     * (Required List of String) List of destination routes for traffic from Confluent VPC to customer VPC via Transit Gateway.
     */
    routes: string[];
    /**
     * (Required String) The ID of the AWS Transit Gateway VPC Attachment that attaches Confluent VPC to Transit Gateway.
     */
    transitGatewayAttachmentId: string;
    /**
     * (Required String) The ID of the AWS Transit Gateway that you want Confluent CLoud to be attached to. Must start with `tgw-`.
     */
    transitGatewayId: string;
}

export interface GetTransitGatewayAttachmentEnvironment {
    /**
     * The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetTransitGatewayAttachmentNetwork {
    /**
     * The ID of the Environment that the Transit Gateway Attachment belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface IdentityPoolIdentityProvider {
    /**
     * The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
     */
    id: string;
}

export interface InvitationCreator {
    /**
     * (Required String) The id of invitation creator.
     */
    id: string;
}

export interface InvitationUser {
    /**
     * (Required String) The id of invitation creator.
     */
    id: string;
}

export interface KafkaAclCredentials {
    /**
     * The Kafka API Key.
     */
    key: string;
    /**
     * The Kafka API Secret.
     */
    secret: string;
}

export interface KafkaAclKafkaCluster {
    /**
     * The ID of the Kafka cluster, for example, `lkc-abc123`.
     */
    id: string;
}

export interface KafkaClientQuotaEnvironment {
    /**
     * The ID of the Environment that the corresponding Kafka Cluster belongs to, for example, `env-abc123`.
     */
    id: string;
}

export interface KafkaClientQuotaKafkaCluster {
    /**
     * The ID of the Environment that the corresponding Kafka Cluster belongs to, for example, `env-abc123`.
     */
    id: string;
}

export interface KafkaClientQuotaThroughput {
    /**
     * The egress throughput limit in bytes per second.
     */
    egressByteRate: string;
    /**
     * The ingress throughput limit in bytes per second.
     */
    ingressByteRate: string;
}

export interface KafkaClusterBasic {
}

export interface KafkaClusterByokKey {
    /**
     * The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
     */
    id: string;
}

export interface KafkaClusterConfigCredentials {
    /**
     * The Kafka API Key.
     */
    key: string;
    /**
     * The Kafka API Secret.
     */
    secret: string;
}

export interface KafkaClusterConfigKafkaCluster {
    /**
     * The ID of the Dedicated Kafka cluster, for example, `lkc-abc123`.
     */
    id: string;
}

export interface KafkaClusterDedicated {
    /**
     * The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have more than `2` CKUs.
     */
    cku: number;
    encryptionKey?: string;
    /**
     * (Required List of String) The list of zones the cluster is in.
     * On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
     * On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
     * On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
     */
    zones: string[];
}

export interface KafkaClusterEnvironment {
    /**
     * The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
     */
    id: string;
}

export interface KafkaClusterNetwork {
    /**
     * The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
     */
    id: string;
}

export interface KafkaClusterStandard {
}

export interface KafkaMirrorTopicClusterLink {
    /**
     * The name of the cluster link to attach to the mirror topic, for example, `my-cluster-link`.
     */
    linkName: string;
}

export interface KafkaMirrorTopicKafkaCluster {
    credentials?: outputs.KafkaMirrorTopicKafkaClusterCredentials;
    /**
     * The ID of the destination Kafka cluster, for example, `lkc-abc123`.
     */
    id: string;
    /**
     * The REST endpoint of the destination Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
     */
    restEndpoint?: string;
}

export interface KafkaMirrorTopicKafkaClusterCredentials {
    /**
     * The Kafka API Key.
     */
    key: string;
    /**
     * The Kafka API Secret.
     */
    secret: string;
}

export interface KafkaMirrorTopicSourceKafkaTopic {
    /**
     * The name of the topic on the source cluster to be mirrored over the cluster link, for example, `orders`. A topic with the exact same name must exist on the source cluster, and no topic with this name should exist on the destination cluster.
     */
    topicName: string;
}

export interface KafkaTopicCredentials {
    /**
     * The Kafka API Key.
     */
    key: string;
    /**
     * The Kafka API Secret.
     */
    secret: string;
}

export interface KafkaTopicKafkaCluster {
    /**
     * The ID of the Kafka cluster, for example, `lkc-abc123`.
     */
    id: string;
}

export interface KsqlClusterCredentialIdentity {
    /**
     * The ID of the associated service or user account, for example, `sa-abc123`.
     */
    id: string;
}

export interface KsqlClusterEnvironment {
    /**
     * The ID of the associated service or user account, for example, `sa-abc123`.
     */
    id: string;
}

export interface KsqlClusterKafkaCluster {
    /**
     * The ID of the associated service or user account, for example, `sa-abc123`.
     */
    id: string;
}

export interface NetworkAw {
    /**
     * (Required String) The AWS account ID associated with the Confluent Cloud VPC.
     */
    account: string;
    /**
     * (Optional String) The endpoint service of the Confluent Cloud VPC (used for PrivateLink) if available.
     */
    privateLinkEndpointService: string;
    /**
     * (Required String) The Confluent Cloud VPC ID.
     */
    vpc: string;
}

export interface NetworkAzure {
    /**
     * (Optional Map) The mapping of zones to Private Link Service Aliases if available. Keys are zone names, for example, `1` and values are [Azure Private Link Service Aliases](https://docs.microsoft.com/en-us/azure/private-link/private-link-service-overview#share-your-service), for example, `s-nk99e-privatelink-1.8c43dcd0-695c-1234-bc35-11fe6abb303a.centralus.azure.privatelinkservice`.
     */
    privateLinkServiceAliases: {[key: string]: string};
}

export interface NetworkDnsConfig {
    /**
     * Network DNS resolution.
     * When resolution is `CHASED_PRIVATE`, clusters in this network require both public and private DNS to resolve cluster endpoints.
     * When resolution is `PRIVATE`, clusters in this network only require private DNS to resolve cluster endpoints.
     */
    resolution: string;
}

export interface NetworkEnvironment {
    /**
     * The ID of the Environment that the Network belongs to, for example, `env-abc123`.
     */
    id: string;
}

export interface NetworkGcp {
    /**
     * (Optional Map) The mapping of zones to Private Service Connect Service Attachments if available. Keys are zones and values are [GCP Private Service Connect service attachment](https://cloud.google.com/vpc/docs/configure-private-service-connect-producer#api_7).
     */
    privateServiceConnectServiceAttachments: {[key: string]: string};
    /**
     * (Required String) The GCP Project ID associated with the Confluent Cloud VPC.
     */
    project: string;
    /**
     * (Required String) The network name of the Confluent Cloud VPC.
     */
    vpcNetwork: string;
}

export interface NetworkZoneInfo {
    /**
     * The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
     */
    cidr: string;
    /**
     * Cloud provider zone ID.
     */
    zoneId: string;
}

export interface PeeringAws {
    /**
     * The AWS Account ID of the peer VPC owner. You can find your AWS Account ID [here](https://console.aws.amazon.com/billing/home?#/account) under **My Account** section of the AWS Management Console. Must be a **12 character string**.
     */
    account: string;
    /**
     * The region of the Azure peer VNet.
     */
    customerRegion: string;
    /**
     * The AWS VPC CIDR blocks or subsets. This must be from the supported CIDR blocks and must not overlap with your Confluent Cloud CIDR block or any other network peering connection VPC CIDR (learn more about the requirements [here](https://docs.confluent.io/cloud/current/networking/peering/aws-peering.html#vpc-peering-on-aws)). You can find AWS VPC CIDR [here](https://console.aws.amazon.com/vpc/) under **Your VPCs > Target VPC > Details** section of the AWS Management Console.
     */
    routes: string[];
    /**
     * The AWS VPC ID of the peer VPC that you're peering with Confluent Cloud. You can find your AWS VPC ID [here](https://console.aws.amazon.com/vpc/) under **Your VPCs** section of the AWS Management Console. Must start with `vpc-`.
     */
    vpc: string;
}

export interface PeeringAzure {
    /**
     * The region of the Azure peer VNet.
     */
    customerRegion: string;
    /**
     * The Tenant ID that represents an organization in Azure Active Directory. You can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
     */
    tenant: string;
    /**
     * The resource (composite) ID of the peer Virtual Network that you're peering with Confluent Cloud, in the format `/subscriptions/<Subscription ID>/resourceGroups/<Resource Group Name>/providers/Microsoft.Network/virtualNetworks/<VNet name>`. You can find Subscription ID, Resource Group Name and your VNet name under **Virtual Networks > Target VNet > Essentials** section of your [Microsoft Azure Portal](https://portal.azure.com/).
     */
    vnet: string;
}

export interface PeeringEnvironment {
    /**
     * The ID of the Network that the Peering belongs to, for example, `n-abc123`.
     */
    id: string;
}

export interface PeeringGcp {
    /**
     * The Import Custom Routes option enables connectivity to a Confluent Cloud cluster in Google Cloud from customer premise or other clouds, such as AWS and Azure, through a customer VPC that is peered with Confluent Cloud in the same region. Defaults to `false`. Learn more about considerations / limitations of the Import Custom Routes option [here](https://docs.confluent.io/cloud/current/networking/peering/gcp-peering.html#import-custom-routes).
     */
    importCustomRoutes?: boolean;
    /**
     * The GCP Project ID. You can find your Google Cloud Project ID under **Project ID** section of your [Google Cloud Console dashboard](https://console.cloud.google.com/home/dashboard).
     */
    project: string;
    /**
     * The VPC network name that you're peering to Confluent Cloud. You can find your VPC network name under **VPC Networks** section of your [Google Cloud Console](https://console.cloud.google.com/networking/networks/list).
     */
    vpcNetwork: string;
}

export interface PeeringNetwork {
    /**
     * The ID of the Network that the Peering belongs to, for example, `n-abc123`.
     */
    id: string;
}

export interface PrivateLinkAccessAws {
    /**
     * The AWS account ID to enable for the Private Link Access. You can find your AWS account ID [here] (https://console.aws.amazon.com/billing/home?#/account) under **My Account** in your AWS Management Console. Must be a **12 character string**.
     */
    account: string;
}

export interface PrivateLinkAccessAzure {
    /**
     * The Azure subscription ID to enable for the Private Link Access. You can find your Azure subscription ID in the subscription section of your [Microsoft Azure Portal] (https://portal.azure.com/#blade/Microsoft_Azure_Billing/SubscriptionsBlade). Must be a valid **32 character UUID string**.
     */
    subscription: string;
}

export interface PrivateLinkAccessEnvironment {
    /**
     * The ID of the Network that the Private Link Access belongs to, for example, `n-abc123`.
     */
    id: string;
}

export interface PrivateLinkAccessGcp {
    /**
     * The GCP project ID to allow for Private Service Connect access. You can find your Google Cloud Project ID under **Project ID** section of your [Google Cloud Console dashboard](https://console.cloud.google.com/home/dashboard).
     */
    project: string;
}

export interface PrivateLinkAccessNetwork {
    /**
     * The ID of the Network that the Private Link Access belongs to, for example, `n-abc123`.
     */
    id: string;
}

export interface SchemaCredentials {
    /**
     * The Schema Registry API Key.
     */
    key: string;
    /**
     * The Schema Registry API Secret.
     */
    secret: string;
}

export interface SchemaRegistryClusterConfigCredentials {
    /**
     * The Schema Registry API Key.
     */
    key: string;
    /**
     * The Schema Registry API Secret.
     */
    secret: string;
}

export interface SchemaRegistryClusterConfigSchemaRegistryCluster {
    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     */
    id: string;
}

export interface SchemaRegistryClusterEnvironment {
    /**
     * The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to find a corresponding region ID based on desired cloud provider region and types of the billing package.
     */
    id: string;
}

export interface SchemaRegistryClusterModeCredentials {
    /**
     * The Schema Registry API Key.
     */
    key: string;
    /**
     * The Schema Registry API Secret.
     */
    secret: string;
}

export interface SchemaRegistryClusterModeSchemaRegistryCluster {
    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     */
    id: string;
}

export interface SchemaRegistryClusterRegion {
    /**
     * The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See [Schema Registry Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to find a corresponding region ID based on desired cloud provider region and types of the billing package.
     */
    id: string;
}

export interface SchemaSchemaReference {
    /**
     * The name of the subject, representing the subject under which the referenced schema is registered.
     */
    name: string;
    /**
     * The name for the reference. (For Avro Schema, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf Schema, it is the name of another Protobuf file.)
     */
    subjectName: string;
    /**
     * The version, representing the exact version of the schema under the registered subject.
     */
    version: number;
}

export interface SchemaSchemaRegistryCluster {
    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     */
    id: string;
}

export interface SubjectConfigCredentials {
    /**
     * The Schema Registry API Key.
     */
    key: string;
    /**
     * The Schema Registry API Secret.
     */
    secret: string;
}

export interface SubjectConfigSchemaRegistryCluster {
    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     */
    id: string;
}

export interface SubjectModeCredentials {
    /**
     * The Schema Registry API Key.
     */
    key: string;
    /**
     * The Schema Registry API Secret.
     */
    secret: string;
}

export interface SubjectModeSchemaRegistryCluster {
    /**
     * The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
     */
    id: string;
}

export interface TransitGatewayAttachmentAws {
    /**
     * The Amazon Resource Name (ARN) of the Resource Access Manager (RAM) Resource Share of the transit gateway your Confluent Cloud network attaches to.
     */
    ramResourceShareArn: string;
    /**
     * List of destination routes for traffic from Confluent VPC to customer VPC via Transit Gateway.
     */
    routes: string[];
    /**
     * (Required String) The ID of the AWS Transit Gateway VPC Attachment that attaches Confluent VPC to Transit Gateway.
     */
    transitGatewayAttachmentId: string;
    /**
     * The ID of the AWS Transit Gateway that you want Confluent CLoud to be attached to. Must start with `tgw-`.
     */
    transitGatewayId: string;
}

export interface TransitGatewayAttachmentEnvironment {
    /**
     * The ID of the Network that the Transit Gateway Attachment belongs to, for example, `n-abc123`.
     */
    id: string;
}

export interface TransitGatewayAttachmentNetwork {
    /**
     * The ID of the Network that the Transit Gateway Attachment belongs to, for example, `n-abc123`.
     */
    id: string;
}

