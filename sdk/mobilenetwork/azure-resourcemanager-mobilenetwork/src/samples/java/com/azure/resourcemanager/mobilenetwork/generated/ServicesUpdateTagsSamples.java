// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.resourcemanager.mobilenetwork.models.Service;
import java.util.HashMap;
import java.util.Map;

/** Samples for Services UpdateTags. */
public final class ServicesUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2023-09-01/examples/ServiceUpdateTags.json
     */
    /**
     * Sample code: Update service tags.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void updateServiceTags(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        Service resource =
            manager
                .services()
                .getWithResponse("rg1", "testMobileNetwork", "TestService", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
