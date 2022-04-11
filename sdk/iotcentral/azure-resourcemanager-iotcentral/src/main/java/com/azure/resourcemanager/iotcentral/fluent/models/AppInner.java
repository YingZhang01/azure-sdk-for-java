// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iotcentral.models.AppSkuInfo;
import com.azure.resourcemanager.iotcentral.models.AppState;
import com.azure.resourcemanager.iotcentral.models.NetworkRuleSets;
import com.azure.resourcemanager.iotcentral.models.ProvisioningState;
import com.azure.resourcemanager.iotcentral.models.PublicNetworkAccess;
import com.azure.resourcemanager.iotcentral.models.SystemAssignedServiceIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The IoT Central application. */
@Fluent
public final class AppInner extends Resource {
    /*
     * The common properties of an IoT Central application.
     */
    @JsonProperty(value = "properties")
    private AppProperties innerProperties;

    /*
     * A valid instance SKU.
     */
    @JsonProperty(value = "sku", required = true)
    private AppSkuInfo sku;

    /*
     * The managed identities for the IoT Central application.
     */
    @JsonProperty(value = "identity")
    private SystemAssignedServiceIdentity identity;

    /**
     * Get the innerProperties property: The common properties of an IoT Central application.
     *
     * @return the innerProperties value.
     */
    private AppProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: A valid instance SKU.
     *
     * @return the sku value.
     */
    public AppSkuInfo sku() {
        return this.sku;
    }

    /**
     * Set the sku property: A valid instance SKU.
     *
     * @param sku the sku value to set.
     * @return the AppInner object itself.
     */
    public AppInner withSku(AppSkuInfo sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: The managed identities for the IoT Central application.
     *
     * @return the identity value.
     */
    public SystemAssignedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identities for the IoT Central application.
     *
     * @param identity the identity value to set.
     * @return the AppInner object itself.
     */
    public AppInner withIdentity(SystemAssignedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the application.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the applicationId property: The ID of the application.
     *
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationId();
    }

    /**
     * Get the displayName property: The display name of the application.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the application.
     *
     * @param displayName the displayName value to set.
     * @return the AppInner object itself.
     */
    public AppInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the subdomain property: The subdomain of the application.
     *
     * @return the subdomain value.
     */
    public String subdomain() {
        return this.innerProperties() == null ? null : this.innerProperties().subdomain();
    }

    /**
     * Set the subdomain property: The subdomain of the application.
     *
     * @param subdomain the subdomain value to set.
     * @return the AppInner object itself.
     */
    public AppInner withSubdomain(String subdomain) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppProperties();
        }
        this.innerProperties().withSubdomain(subdomain);
        return this;
    }

    /**
     * Get the template property: The ID of the application template, which is a blueprint that defines the
     * characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and
     * allows the application to be defined from scratch.
     *
     * @return the template value.
     */
    public String template() {
        return this.innerProperties() == null ? null : this.innerProperties().template();
    }

    /**
     * Set the template property: The ID of the application template, which is a blueprint that defines the
     * characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and
     * allows the application to be defined from scratch.
     *
     * @param template the template value to set.
     * @return the AppInner object itself.
     */
    public AppInner withTemplate(String template) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppProperties();
        }
        this.innerProperties().withTemplate(template);
        return this;
    }

    /**
     * Get the state property: The current state of the application.
     *
     * @return the state value.
     */
    public AppState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from the public network are allowed.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Whether requests from the public network are allowed.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the AppInner object itself.
     */
    public AppInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the networkRuleSets property: Network Rule Set Properties of this IoT Central application.
     *
     * @return the networkRuleSets value.
     */
    public NetworkRuleSets networkRuleSets() {
        return this.innerProperties() == null ? null : this.innerProperties().networkRuleSets();
    }

    /**
     * Set the networkRuleSets property: Network Rule Set Properties of this IoT Central application.
     *
     * @param networkRuleSets the networkRuleSets value to set.
     * @return the AppInner object itself.
     */
    public AppInner withNetworkRuleSets(NetworkRuleSets networkRuleSets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppProperties();
        }
        this.innerProperties().withNetworkRuleSets(networkRuleSets);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: Private endpoint connections created on this IoT Central
     * application.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
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
        if (sku() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property sku in model AppInner"));
        } else {
            sku().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AppInner.class);
}
