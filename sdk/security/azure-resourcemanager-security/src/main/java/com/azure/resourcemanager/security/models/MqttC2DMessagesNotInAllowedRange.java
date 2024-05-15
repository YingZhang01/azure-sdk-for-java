// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;

/**
 * Number of cloud to device messages (MQTT protocol) is not in allowed range.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "ruleType",
    defaultImpl = MqttC2DMessagesNotInAllowedRange.class,
    visible = true)
@JsonTypeName("MqttC2DMessagesNotInAllowedRange")
@Fluent
public final class MqttC2DMessagesNotInAllowedRange extends TimeWindowCustomAlertRule {
    /*
     * The type of the custom alert rule.
     */
    @JsonTypeId
    @JsonProperty(value = "ruleType", required = true)
    private String ruleType = "MqttC2DMessagesNotInAllowedRange";

    /**
     * Creates an instance of MqttC2DMessagesNotInAllowedRange class.
     */
    public MqttC2DMessagesNotInAllowedRange() {
    }

    /**
     * Get the ruleType property: The type of the custom alert rule.
     * 
     * @return the ruleType value.
     */
    @Override
    public String ruleType() {
        return this.ruleType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MqttC2DMessagesNotInAllowedRange withTimeWindowSize(Duration timeWindowSize) {
        super.withTimeWindowSize(timeWindowSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MqttC2DMessagesNotInAllowedRange withMinThreshold(int minThreshold) {
        super.withMinThreshold(minThreshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MqttC2DMessagesNotInAllowedRange withMaxThreshold(int maxThreshold) {
        super.withMaxThreshold(maxThreshold);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MqttC2DMessagesNotInAllowedRange withIsEnabled(boolean isEnabled) {
        super.withIsEnabled(isEnabled);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
