// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.Name;
import org.junit.jupiter.api.Assertions;

public final class NameTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Name model =
            BinaryData
                .fromString("{\"value\":\"nduhavhqlkthum\",\"localizedValue\":\"olbgycduiertgccy\"}")
                .toObject(Name.class);
        Assertions.assertEquals("nduhavhqlkthum", model.value());
        Assertions.assertEquals("olbgycduiertgccy", model.localizedValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Name model = new Name().withValue("nduhavhqlkthum").withLocalizedValue("olbgycduiertgccy");
        model = BinaryData.fromObject(model).toObject(Name.class);
        Assertions.assertEquals("nduhavhqlkthum", model.value());
        Assertions.assertEquals("olbgycduiertgccy", model.localizedValue());
    }
}
