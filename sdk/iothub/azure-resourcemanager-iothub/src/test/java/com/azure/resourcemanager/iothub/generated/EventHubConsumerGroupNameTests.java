// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.EventHubConsumerGroupName;
import org.junit.jupiter.api.Assertions;

public final class EventHubConsumerGroupNameTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EventHubConsumerGroupName model =
            BinaryData.fromString("{\"name\":\"nftguvriuhpr\"}").toObject(EventHubConsumerGroupName.class);
        Assertions.assertEquals("nftguvriuhpr", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EventHubConsumerGroupName model = new EventHubConsumerGroupName().withName("nftguvriuhpr");
        model = BinaryData.fromObject(model).toObject(EventHubConsumerGroupName.class);
        Assertions.assertEquals("nftguvriuhpr", model.name());
    }
}
