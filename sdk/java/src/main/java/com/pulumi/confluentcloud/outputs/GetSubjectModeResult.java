// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.confluentcloud.outputs.GetSubjectModeCredentials;
import com.pulumi.confluentcloud.outputs.GetSubjectModeSchemaRegistryCluster;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSubjectModeResult {
    private @Nullable GetSubjectModeCredentials credentials;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Required String) The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
     * 
     */
    private String mode;
    private @Nullable String restEndpoint;
    private @Nullable GetSubjectModeSchemaRegistryCluster schemaRegistryCluster;
    private String subjectName;

    private GetSubjectModeResult() {}
    public Optional<GetSubjectModeCredentials> credentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Required String) The mode of the specified subject. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
     * 
     */
    public String mode() {
        return this.mode;
    }
    public Optional<String> restEndpoint() {
        return Optional.ofNullable(this.restEndpoint);
    }
    public Optional<GetSubjectModeSchemaRegistryCluster> schemaRegistryCluster() {
        return Optional.ofNullable(this.schemaRegistryCluster);
    }
    public String subjectName() {
        return this.subjectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubjectModeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetSubjectModeCredentials credentials;
        private String id;
        private String mode;
        private @Nullable String restEndpoint;
        private @Nullable GetSubjectModeSchemaRegistryCluster schemaRegistryCluster;
        private String subjectName;
        public Builder() {}
        public Builder(GetSubjectModeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.id = defaults.id;
    	      this.mode = defaults.mode;
    	      this.restEndpoint = defaults.restEndpoint;
    	      this.schemaRegistryCluster = defaults.schemaRegistryCluster;
    	      this.subjectName = defaults.subjectName;
        }

        @CustomType.Setter
        public Builder credentials(@Nullable GetSubjectModeCredentials credentials) {

            this.credentials = credentials;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSubjectModeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("GetSubjectModeResult", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder restEndpoint(@Nullable String restEndpoint) {

            this.restEndpoint = restEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder schemaRegistryCluster(@Nullable GetSubjectModeSchemaRegistryCluster schemaRegistryCluster) {

            this.schemaRegistryCluster = schemaRegistryCluster;
            return this;
        }
        @CustomType.Setter
        public Builder subjectName(String subjectName) {
            if (subjectName == null) {
              throw new MissingRequiredPropertyException("GetSubjectModeResult", "subjectName");
            }
            this.subjectName = subjectName;
            return this;
        }
        public GetSubjectModeResult build() {
            final var _resultValue = new GetSubjectModeResult();
            _resultValue.credentials = credentials;
            _resultValue.id = id;
            _resultValue.mode = mode;
            _resultValue.restEndpoint = restEndpoint;
            _resultValue.schemaRegistryCluster = schemaRegistryCluster;
            _resultValue.subjectName = subjectName;
            return _resultValue;
        }
    }
}
