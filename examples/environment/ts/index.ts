import * as pulumi from "@pulumi/pulumi";
import * as confluent from "@pulumi/confluentcloud";

const env = new confluent.Environment("ts-env")
