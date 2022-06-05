import * as pulumi from "@pulumi/pulumi";
import * as random from "@pulumi/random";
import * as confluent from "@pulumi/confluentcloud";

const petName = new random.RandomPet("environment-name")

const env = new confluent.Environment("ts-env", {
    displayName: petName.id,
})
