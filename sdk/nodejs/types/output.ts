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

export interface GetIdentityPoolIdentityProvider {
    /**
     * The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
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

export interface GetKafkaClusterDedicated {
    /**
     * (Required Number) The number of Confluent Kafka Units (CKUs) for Dedicated cluster types. The minimum number of CKUs for `SINGLE_ZONE` dedicated clusters is `1` whereas `MULTI_ZONE` dedicated clusters must have more than `2` CKUs.
     */
    cku: number;
    /**
     * (Optional String) The ID of the encryption key that is used to encrypt the data in the Kafka cluster, for example, `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` (key Amazon Resource Name) for AWS or `projects/my-test-project/locations/global/keyRings/test-byok/cryptoKeys/test` for GCP. Append required permissions to the key policy before creating a Kafka cluster, see [Encrypt Confluent Cloud Clusters using Self-Managed Keys](https://docs.confluent.io/cloud/current/clusters/byok/index.html) for more details. At the moment, self-managed encryption keys are only available for the Dedicated clusters on AWS or GCP.
     */
    encryptionKey: string;
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

export interface GetStreatGovernanceClusterEnvironment {
    /**
     * The ID of the Environment that the Stream Governance cluster belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetStreatGovernanceClusterRegion {
    /**
     * The ID of the Environment that the Stream Governance cluster belongs to, for example, `env-xyz456`.
     */
    id: string;
}

export interface GetTransitGatewayAttachmentAw {
    /**
     * (Required String) Enable custom destination routes in Confluent Cloud. Defaults to `false`.
     */
    enableCustomRoutes: boolean;
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
    /**
     * The ID of the encryption key that is used to encrypt the data in the Kafka cluster, for example, `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` (key Amazon Resource Name) for AWS or `projects/my-test-project/locations/global/keyRings/test-byok/cryptoKeys/test` for GCP. Append required permissions to the key policy before creating a Kafka cluster, see [Encrypt Confluent Cloud Clusters using Self-Managed Keys](https://docs.confluent.io/cloud/current/clusters/byok/index.html) for more details. At the moment, self-managed encryption keys are only available for the Dedicated clusters on AWS or GCP.
     */
    encryptionKey?: string;
}

export interface KafkaClusterEnvironment {
    /**
     * The ID of the Network that the Kafka cluster belongs to, for example, `n-abc123`.
     */
    id: string;
}

export interface KafkaClusterNetwork {
    /**
     * The ID of the Network that the Kafka cluster belongs to, for example, `n-abc123`.
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

export interface StreamGovernanceClusterEnvironment {
    /**
     * The ID of the Stream Governance region that the Stream Governance cluster belongs to, for example, `sgreg-1`. See [Stream Governance Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to find a corresponding region ID based on desired cloud provider region and types of the billing package.
     */
    id: string;
}

export interface StreamGovernanceClusterRegion {
    /**
     * The ID of the Stream Governance region that the Stream Governance cluster belongs to, for example, `sgreg-1`. See [Stream Governance Regions](https://docs.confluent.io/cloud/current/stream-governance/packages.html#stream-governance-regions) to find a corresponding region ID based on desired cloud provider region and types of the billing package.
     */
    id: string;
}

export interface TransitGatewayAttachmentAws {
    /**
     * Enable custom destination routes in Confluent Cloud. Defaults to `false`.
     */
    enableCustomRoutes?: boolean;
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
