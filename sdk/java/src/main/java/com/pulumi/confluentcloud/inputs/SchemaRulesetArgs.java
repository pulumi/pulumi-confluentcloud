// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.confluentcloud.inputs.SchemaRulesetDomainRuleArgs;
import com.pulumi.confluentcloud.inputs.SchemaRulesetMigrationRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchemaRulesetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaRulesetArgs Empty = new SchemaRulesetArgs();

    @Import(name="domainRules")
    private @Nullable Output<List<SchemaRulesetDomainRuleArgs>> domainRules;

    public Optional<Output<List<SchemaRulesetDomainRuleArgs>>> domainRules() {
        return Optional.ofNullable(this.domainRules);
    }

    @Import(name="migrationRules")
    private @Nullable Output<List<SchemaRulesetMigrationRuleArgs>> migrationRules;

    public Optional<Output<List<SchemaRulesetMigrationRuleArgs>>> migrationRules() {
        return Optional.ofNullable(this.migrationRules);
    }

    private SchemaRulesetArgs() {}

    private SchemaRulesetArgs(SchemaRulesetArgs $) {
        this.domainRules = $.domainRules;
        this.migrationRules = $.migrationRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaRulesetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaRulesetArgs $;

        public Builder() {
            $ = new SchemaRulesetArgs();
        }

        public Builder(SchemaRulesetArgs defaults) {
            $ = new SchemaRulesetArgs(Objects.requireNonNull(defaults));
        }

        public Builder domainRules(@Nullable Output<List<SchemaRulesetDomainRuleArgs>> domainRules) {
            $.domainRules = domainRules;
            return this;
        }

        public Builder domainRules(List<SchemaRulesetDomainRuleArgs> domainRules) {
            return domainRules(Output.of(domainRules));
        }

        public Builder domainRules(SchemaRulesetDomainRuleArgs... domainRules) {
            return domainRules(List.of(domainRules));
        }

        public Builder migrationRules(@Nullable Output<List<SchemaRulesetMigrationRuleArgs>> migrationRules) {
            $.migrationRules = migrationRules;
            return this;
        }

        public Builder migrationRules(List<SchemaRulesetMigrationRuleArgs> migrationRules) {
            return migrationRules(Output.of(migrationRules));
        }

        public Builder migrationRules(SchemaRulesetMigrationRuleArgs... migrationRules) {
            return migrationRules(List.of(migrationRules));
        }

        public SchemaRulesetArgs build() {
            return $;
        }
    }

}
