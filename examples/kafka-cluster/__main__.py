import pulumi

import pulumi_confluentcloud as confluent


SANDBOX_ENV_NAME = "sandbox"

sandbox_env = confluent.Environment(SANDBOX_ENV_NAME)

example = confluent.get_schema_registry_region(
    cloud="AWS", region="us-east-2", package="ESSENTIALS"
)
essentials = confluent.SchemaRegistryCluster(
    "essentials",
    package=example.package,
    environment=confluent.SchemaRegistryClusterEnvironmentArgs(
        id=sandbox_env.id,
    ),
    region=confluent.SchemaRegistryClusterRegionArgs(
        id=example.id,
    ),
)

dev_cluster = confluent.KafkaCluster(
    "dev-cluster",
    display_name="Shared Dev Cluster",
    availability="SINGLE_ZONE",
    cloud="AWS",
    region="us-east-1",
    basic=confluent.KafkaClusterBasicArgs(),
    environment=confluent.KafkaClusterEnvironmentArgs(id=sandbox_env.id),
)
