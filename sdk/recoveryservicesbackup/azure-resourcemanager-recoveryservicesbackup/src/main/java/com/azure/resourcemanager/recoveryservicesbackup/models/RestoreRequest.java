// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Base class for restore request. Workload-specific restore requests are derived from this class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "objectType", defaultImpl = RestoreRequest.class, visible = true)
@JsonTypeName("RestoreRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureFileShareRestoreRequest", value = AzureFileShareRestoreRequest.class),
    @JsonSubTypes.Type(name = "AzureWorkloadRestoreRequest", value = AzureWorkloadRestoreRequest.class),
    @JsonSubTypes.Type(name = "IaasVMRestoreRequest", value = IaasVMRestoreRequest.class) })
@Fluent
public class RestoreRequest {
    /*
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     */
    @JsonTypeId
    @JsonProperty(value = "objectType", required = true)
    private String objectType;

    /*
     * ResourceGuardOperationRequests on which LAC check will be performed
     */
    @JsonProperty(value = "resourceGuardOperationRequests")
    private List<String> resourceGuardOperationRequests;

    /**
     * Creates an instance of RestoreRequest class.
     */
    public RestoreRequest() {
        this.objectType = "RestoreRequest";
    }

    /**
     * Get the objectType property: This property will be used as the discriminator for deciding the specific types in
     * the polymorphic chain of types.
     * 
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the resourceGuardOperationRequests property: ResourceGuardOperationRequests on which LAC check will be
     * performed.
     * 
     * @return the resourceGuardOperationRequests value.
     */
    public List<String> resourceGuardOperationRequests() {
        return this.resourceGuardOperationRequests;
    }

    /**
     * Set the resourceGuardOperationRequests property: ResourceGuardOperationRequests on which LAC check will be
     * performed.
     * 
     * @param resourceGuardOperationRequests the resourceGuardOperationRequests value to set.
     * @return the RestoreRequest object itself.
     */
    public RestoreRequest withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        this.resourceGuardOperationRequests = resourceGuardOperationRequests;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
