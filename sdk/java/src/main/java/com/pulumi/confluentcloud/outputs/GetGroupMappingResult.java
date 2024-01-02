// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupMappingResult {
    /**
     * @return (Required String) A description explaining the purpose and use of the group mapping.
     * 
     */
    private String description;
    /**
     * @return (Required String) The name of the Group Mapping.
     * 
     */
    private String displayName;
    /**
     * @return (Required String) A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
     * 
     */
    private String filter;
    /**
     * @return (Required String) The ID of the Group Mapping (for example, `group-abc123`).
     * 
     */
    private String id;

    private GetGroupMappingResult() {}
    /**
     * @return (Required String) A description explaining the purpose and use of the group mapping.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return (Required String) The name of the Group Mapping.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return (Required String) A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
     * 
     */
    public String filter() {
        return this.filter;
    }
    /**
     * @return (Required String) The ID of the Group Mapping (for example, `group-abc123`).
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupMappingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String displayName;
        private String filter;
        private String id;
        public Builder() {}
        public Builder(GetGroupMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetGroupMappingResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetGroupMappingResult", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder filter(String filter) {
            if (filter == null) {
              throw new MissingRequiredPropertyException("GetGroupMappingResult", "filter");
            }
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGroupMappingResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetGroupMappingResult build() {
            final var _resultValue = new GetGroupMappingResult();
            _resultValue.description = description;
            _resultValue.displayName = displayName;
            _resultValue.filter = filter;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
