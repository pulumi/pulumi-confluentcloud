import * as pulumi from "@pulumi/pulumi";
import * as confluent from "@pulumi/confluentcloud";

const env = new confluent.Environment("ts-env");

const kfCluster = new confluent.KafkaCluster("kfCluster", {
  cloud: "AWS",
  region: "us-west-2",
  availability: "SINGLE_ZONE",
  environment: {
    id: env.id,
  },
});

const kfTopic = new confluent.KafkaTopic("kfTopic", {
  topicName: "test-topic",
  kafkaCluster: {
    id: kfCluster.id,
  },
  // Deprecated field which we are still supporting.
  httpEndpoint: kfCluster.restEndpoint,
});

const res = kfCluster.restEndpoint.apply((endPt) => {
  const res = confluent.getKafkaTopic({
    topicName: "test-topic",
    restEndpoint: endPt,
  });

  return res;
});
