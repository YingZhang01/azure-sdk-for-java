// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.SubscriptionState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Subscription details. */
@Fluent
public final class SubscriptionContractInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubscriptionContractInner.class);

    /*
     * Subscription contract properties.
     */
    @JsonProperty(value = "properties")
    private SubscriptionContractProperties innerProperties;

    /**
     * Get the innerProperties property: Subscription contract properties.
     *
     * @return the innerProperties value.
     */
    private SubscriptionContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the ownerId property: The user resource identifier of the subscription owner. The value is a valid relative
     * URL in the format of /users/{userId} where {userId} is a user identifier.
     *
     * @return the ownerId value.
     */
    public String ownerId() {
        return this.innerProperties() == null ? null : this.innerProperties().ownerId();
    }

    /**
     * Set the ownerId property: The user resource identifier of the subscription owner. The value is a valid relative
     * URL in the format of /users/{userId} where {userId} is a user identifier.
     *
     * @param ownerId the ownerId value to set.
     * @return the SubscriptionContractInner object itself.
     */
    public SubscriptionContractInner withOwnerId(String ownerId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionContractProperties();
        }
        this.innerProperties().withOwnerId(ownerId);
        return this;
    }

    /**
     * Get the scope property: Scope like /products/{productId} or /apis or /apis/{apiId}.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: Scope like /products/{productId} or /apis or /apis/{apiId}.
     *
     * @param scope the scope value to set.
     * @return the SubscriptionContractInner object itself.
     */
    public SubscriptionContractInner withScope(String scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionContractProperties();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Get the displayName property: The name of the subscription, or null if the subscription has no name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The name of the subscription, or null if the subscription has no name.
     *
     * @param displayName the displayName value to set.
     * @return the SubscriptionContractInner object itself.
     */
    public SubscriptionContractInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionContractProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the state property: Subscription state. Possible states are * active – the subscription is active, *
     * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted –
     * the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected –
     * the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled
     * by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated.
     *
     * @return the state value.
     */
    public SubscriptionState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Subscription state. Possible states are * active – the subscription is active, *
     * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted –
     * the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected –
     * the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled
     * by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated.
     *
     * @param state the state value to set.
     * @return the SubscriptionContractInner object itself.
     */
    public SubscriptionContractInner withState(SubscriptionState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionContractProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the createdDate property: Subscription creation date. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDate();
    }

    /**
     * Get the startDate property: Subscription activation date. The setting is for audit purposes only and the
     * subscription is not automatically activated. The subscription lifecycle can be managed by using the `state`
     * property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.innerProperties() == null ? null : this.innerProperties().startDate();
    }

    /**
     * Set the startDate property: Subscription activation date. The setting is for audit purposes only and the
     * subscription is not automatically activated. The subscription lifecycle can be managed by using the `state`
     * property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @param startDate the startDate value to set.
     * @return the SubscriptionContractInner object itself.
     */
    public SubscriptionContractInner withStartDate(OffsetDateTime startDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionContractProperties();
        }
        this.innerProperties().withStartDate(startDate);
        return this;
    }

    /**
     * Get the expirationDate property: Subscription expiration date. The setting is for audit purposes only and the
     * subscription is not automatically expired. The subscription lifecycle can be managed by using the `state`
     * property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationDate();
    }

    /**
     * Set the expirationDate property: Subscription expiration date. The setting is for audit purposes only and the
     * subscription is not automatically expired. The subscription lifecycle can be managed by using the `state`
     * property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @param expirationDate the expirationDate value to set.
     * @return the SubscriptionContractInner object itself.
     */
    public SubscriptionContractInner withExpirationDate(OffsetDateTime expirationDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionContractProperties();
        }
        this.innerProperties().withExpirationDate(expirationDate);
        return this;
    }

    /**
     * Get the endDate property: Date when subscription was cancelled or expired. The setting is for audit purposes only
     * and the subscription is not automatically cancelled. The subscription lifecycle can be managed by using the
     * `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @return the endDate value.
     */
    public OffsetDateTime endDate() {
        return this.innerProperties() == null ? null : this.innerProperties().endDate();
    }

    /**
     * Set the endDate property: Date when subscription was cancelled or expired. The setting is for audit purposes only
     * and the subscription is not automatically cancelled. The subscription lifecycle can be managed by using the
     * `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     *
     * @param endDate the endDate value to set.
     * @return the SubscriptionContractInner object itself.
     */
    public SubscriptionContractInner withEndDate(OffsetDateTime endDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionContractProperties();
        }
        this.innerProperties().withEndDate(endDate);
        return this;
    }

    /**
     * Get the notificationDate property: Upcoming subscription expiration notification date. The date conforms to the
     * following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the notificationDate value.
     */
    public OffsetDateTime notificationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().notificationDate();
    }

    /**
     * Set the notificationDate property: Upcoming subscription expiration notification date. The date conforms to the
     * following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param notificationDate the notificationDate value to set.
     * @return the SubscriptionContractInner object itself.
     */
    public SubscriptionContractInner withNotificationDate(OffsetDateTime notificationDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionContractProperties();
        }
        this.innerProperties().withNotificationDate(notificationDate);
        return this;
    }

    /**
     * Get the primaryKey property: Subscription primary key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.innerProperties() == null ? null : this.innerProperties().primaryKey();
    }

    /**
     * Set the primaryKey property: Subscription primary key. This property will not be filled on 'GET' operations! Use
     * '/listSecrets' POST request to get the value.
     *
     * @param primaryKey the primaryKey value to set.
     * @return the SubscriptionContractInner object itself.
     */
    public SubscriptionContractInner withPrimaryKey(String primaryKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionContractProperties();
        }
        this.innerProperties().withPrimaryKey(primaryKey);
        return this;
    }

    /**
     * Get the secondaryKey property: Subscription secondary key. This property will not be filled on 'GET' operations!
     * Use '/listSecrets' POST request to get the value.
     *
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.innerProperties() == null ? null : this.innerProperties().secondaryKey();
    }

    /**
     * Set the secondaryKey property: Subscription secondary key. This property will not be filled on 'GET' operations!
     * Use '/listSecrets' POST request to get the value.
     *
     * @param secondaryKey the secondaryKey value to set.
     * @return the SubscriptionContractInner object itself.
     */
    public SubscriptionContractInner withSecondaryKey(String secondaryKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionContractProperties();
        }
        this.innerProperties().withSecondaryKey(secondaryKey);
        return this;
    }

    /**
     * Get the stateComment property: Optional subscription comment added by an administrator when the state is changed
     * to the 'rejected'.
     *
     * @return the stateComment value.
     */
    public String stateComment() {
        return this.innerProperties() == null ? null : this.innerProperties().stateComment();
    }

    /**
     * Set the stateComment property: Optional subscription comment added by an administrator when the state is changed
     * to the 'rejected'.
     *
     * @param stateComment the stateComment value to set.
     * @return the SubscriptionContractInner object itself.
     */
    public SubscriptionContractInner withStateComment(String stateComment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionContractProperties();
        }
        this.innerProperties().withStateComment(stateComment);
        return this;
    }

    /**
     * Get the allowTracing property: Determines whether tracing is enabled.
     *
     * @return the allowTracing value.
     */
    public Boolean allowTracing() {
        return this.innerProperties() == null ? null : this.innerProperties().allowTracing();
    }

    /**
     * Set the allowTracing property: Determines whether tracing is enabled.
     *
     * @param allowTracing the allowTracing value to set.
     * @return the SubscriptionContractInner object itself.
     */
    public SubscriptionContractInner withAllowTracing(Boolean allowTracing) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionContractProperties();
        }
        this.innerProperties().withAllowTracing(allowTracing);
        return this;
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
