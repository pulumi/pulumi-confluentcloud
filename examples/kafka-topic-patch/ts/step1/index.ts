import * as pulumi from "@pulumi/pulumi";
import * as confluent from "@pulumi/confluentcloud";

const env = new confluent.Environment("ts-env");

// Create test Kafka cluster.
const kfCluster = new confluent.KafkaCluster("kfCluster", {
  cloud: "AWS",
  region: "us-west-2",
  availability: "SINGLE_ZONE",
  environment: {
    id: env.id,
  },
  basic: {},
});

// Create necessary resources/access to manage the Kafka cluster.
const kfSA = new confluent.ServiceAccount("kfSA", {
  description: "SA to manage Kafka cluster",
});

const roleBinding = new confluent.RoleBinding("roleBinding", {
  roleName: "CloudClusterAdmin",
  crnPattern: kfCluster.rbacCrn,
  principal: pulumi.interpolate`User:${kfSA.id}`,
});

const clusterAPIKey = new confluent.ApiKey(
  "clusterAPIKey",
  {
    owner: {
      apiVersion: kfSA.apiVersion,
      id: kfSA.id,
      kind: kfSA.kind,
    },
    managedResource: {
      apiVersion: kfCluster.apiVersion,
      id: kfCluster.id,
      kind: kfCluster.kind,
      environment: {
        id: env.id,
      },
    },
  },
  { dependsOn: [roleBinding] }
);

// Create the Kafka topic.
const kfTopic = new confluent.KafkaTopic("kfTopic", {
  topicName: "test-topic",

  kafkaCluster: {
    id: kfCluster.id,
  },
  // Deprecated field which we are still supporting.
  httpEndpoint: kfCluster.restEndpoint,
  credentials: {
    key: clusterAPIKey.id,
    secret: clusterAPIKey.secret,
  },
});
