// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.fluent.models.IotHubNameAvailabilityInfoInner;
import org.junit.jupiter.api.Assertions;

public final class IotHubNameAvailabilityInfoInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IotHubNameAvailabilityInfoInner model =
            BinaryData
                .fromString("{\"nameAvailable\":false,\"reason\":\"Invalid\",\"message\":\"r\"}")
                .toObject(IotHubNameAvailabilityInfoInner.class);
        Assertions.assertEquals("r", model.message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IotHubNameAvailabilityInfoInner model = new IotHubNameAvailabilityInfoInner().withMessage("r");
        model = BinaryData.fromObject(model).toObject(IotHubNameAvailabilityInfoInner.class);
        Assertions.assertEquals("r", model.message());
    }
}
