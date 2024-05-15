// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An API collection as represented by Microsoft Defender for APIs.
 */
@Immutable
public final class ApiCollectionInner extends ProxyResource {
    /*
     * Describes the properties of an API collection.
     */
    @JsonProperty(value = "properties")
    private ApiCollectionProperties innerProperties;

    /**
     * Creates an instance of ApiCollectionInner class.
     */
    public ApiCollectionInner() {
    }

    /**
     * Get the innerProperties property: Describes the properties of an API collection.
     * 
     * @return the innerProperties value.
     */
    private ApiCollectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the API collection.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the displayName property: The display name of the API collection.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the discoveredVia property: The resource Id of the resource from where this API collection was discovered.
     * 
     * @return the discoveredVia value.
     */
    public String discoveredVia() {
        return this.innerProperties() == null ? null : this.innerProperties().discoveredVia();
    }

    /**
     * Get the baseUrl property: The base URI for this API collection. All endpoints of this API collection extend this
     * base URI.
     * 
     * @return the baseUrl value.
     */
    public String baseUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().baseUrl();
    }

    /**
     * Get the numberOfApiEndpoints property: The number of API endpoints discovered in this API collection.
     * 
     * @return the numberOfApiEndpoints value.
     */
    public Long numberOfApiEndpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfApiEndpoints();
    }

    /**
     * Get the numberOfInactiveApiEndpoints property: The number of API endpoints in this API collection that have not
     * received any API traffic in the last 30 days.
     * 
     * @return the numberOfInactiveApiEndpoints value.
     */
    public Long numberOfInactiveApiEndpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfInactiveApiEndpoints();
    }

    /**
     * Get the numberOfUnauthenticatedApiEndpoints property: The number of API endpoints in this API collection that are
     * unauthenticated.
     * 
     * @return the numberOfUnauthenticatedApiEndpoints value.
     */
    public Long numberOfUnauthenticatedApiEndpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfUnauthenticatedApiEndpoints();
    }

    /**
     * Get the numberOfExternalApiEndpoints property: The number of API endpoints in this API collection for which API
     * traffic from the internet was observed.
     * 
     * @return the numberOfExternalApiEndpoints value.
     */
    public Long numberOfExternalApiEndpoints() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfExternalApiEndpoints();
    }

    /**
     * Get the numberOfApiEndpointsWithSensitiveDataExposed property: The number of API endpoints in this API collection
     * which are exposing sensitive data in their requests and/or responses.
     * 
     * @return the numberOfApiEndpointsWithSensitiveDataExposed value.
     */
    public Long numberOfApiEndpointsWithSensitiveDataExposed() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().numberOfApiEndpointsWithSensitiveDataExposed();
    }

    /**
     * Get the sensitivityLabel property: The highest priority sensitivity label from Microsoft Purview in this API
     * collection.
     * 
     * @return the sensitivityLabel value.
     */
    public String sensitivityLabel() {
        return this.innerProperties() == null ? null : this.innerProperties().sensitivityLabel();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
