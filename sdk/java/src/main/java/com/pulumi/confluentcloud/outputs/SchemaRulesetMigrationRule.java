// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SchemaRulesetMigrationRule {
    /**
     * @return The boolean flag to control whether the rule should be disabled. Defaults to `false`.
     * 
     */
    private @Nullable Boolean disabled;
    /**
     * @return An optional description of the rule. Defaults to &#34;&#34;.
     * 
     */
    private @Nullable String doc;
    /**
     * @return The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
     * 
     */
    private @Nullable String expr;
    /**
     * @return The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
     * 
     */
    private String kind;
    /**
     * @return The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
     * 
     */
    private String mode;
    private String name;
    /**
     * @return An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above. Defaults to `ERROR,ERROR`.
     * 
     */
    private @Nullable String onFailure;
    /**
     * @return An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`. Defaults to `NONE,NONE`.
     * 
     */
    private @Nullable String onSuccess;
    /**
     * @return A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
     * 
     * &gt; **Note:** Schema rules (`ruleset`) are only available with the [Stream Governance Advanced package](https://docs.confluent.io/cloud/current/stream-governance/packages.html#packages).
     * 
     * &gt; **Note:** The Confluent Cloud Console uses the following default values: `on_success = &#34;NONE&#34;` and `on_failure = &#34;ERROR&#34;`. However, the TF Provider sets its defaults to `on_success = &#34;NONE,NONE&#34;` and `on_failure = &#34;ERROR,ERROR&#34;`.
     * 
     */
    private @Nullable Map<String,String> params;
    /**
     * @return The tags to which the rule applies, if any.
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
     * 
     */
    private String type;

    private SchemaRulesetMigrationRule() {}
    /**
     * @return The boolean flag to control whether the rule should be disabled. Defaults to `false`.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return An optional description of the rule. Defaults to &#34;&#34;.
     * 
     */
    public Optional<String> doc() {
        return Optional.ofNullable(this.doc);
    }
    /**
     * @return The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
     * 
     */
    public Optional<String> expr() {
        return Optional.ofNullable(this.expr);
    }
    /**
     * @return The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
     * 
     */
    public String mode() {
        return this.mode;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above. Defaults to `ERROR,ERROR`.
     * 
     */
    public Optional<String> onFailure() {
        return Optional.ofNullable(this.onFailure);
    }
    /**
     * @return An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`. Defaults to `NONE,NONE`.
     * 
     */
    public Optional<String> onSuccess() {
        return Optional.ofNullable(this.onSuccess);
    }
    /**
     * @return A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
     * 
     * &gt; **Note:** Schema rules (`ruleset`) are only available with the [Stream Governance Advanced package](https://docs.confluent.io/cloud/current/stream-governance/packages.html#packages).
     * 
     * &gt; **Note:** The Confluent Cloud Console uses the following default values: `on_success = &#34;NONE&#34;` and `on_failure = &#34;ERROR&#34;`. However, the TF Provider sets its defaults to `on_success = &#34;NONE,NONE&#34;` and `on_failure = &#34;ERROR,ERROR&#34;`.
     * 
     */
    public Map<String,String> params() {
        return this.params == null ? Map.of() : this.params;
    }
    /**
     * @return The tags to which the rule applies, if any.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaRulesetMigrationRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disabled;
        private @Nullable String doc;
        private @Nullable String expr;
        private String kind;
        private String mode;
        private String name;
        private @Nullable String onFailure;
        private @Nullable String onSuccess;
        private @Nullable Map<String,String> params;
        private @Nullable List<String> tags;
        private String type;
        public Builder() {}
        public Builder(SchemaRulesetMigrationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.doc = defaults.doc;
    	      this.expr = defaults.expr;
    	      this.kind = defaults.kind;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.onFailure = defaults.onFailure;
    	      this.onSuccess = defaults.onSuccess;
    	      this.params = defaults.params;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {

            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder doc(@Nullable String doc) {

            this.doc = doc;
            return this;
        }
        @CustomType.Setter
        public Builder expr(@Nullable String expr) {

            this.expr = expr;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("SchemaRulesetMigrationRule", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("SchemaRulesetMigrationRule", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("SchemaRulesetMigrationRule", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder onFailure(@Nullable String onFailure) {

            this.onFailure = onFailure;
            return this;
        }
        @CustomType.Setter
        public Builder onSuccess(@Nullable String onSuccess) {

            this.onSuccess = onSuccess;
            return this;
        }
        @CustomType.Setter
        public Builder params(@Nullable Map<String,String> params) {

            this.params = params;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("SchemaRulesetMigrationRule", "type");
            }
            this.type = type;
            return this;
        }
        public SchemaRulesetMigrationRule build() {
            final var _resultValue = new SchemaRulesetMigrationRule();
            _resultValue.disabled = disabled;
            _resultValue.doc = doc;
            _resultValue.expr = expr;
            _resultValue.kind = kind;
            _resultValue.mode = mode;
            _resultValue.name = name;
            _resultValue.onFailure = onFailure;
            _resultValue.onSuccess = onSuccess;
            _resultValue.params = params;
            _resultValue.tags = tags;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
