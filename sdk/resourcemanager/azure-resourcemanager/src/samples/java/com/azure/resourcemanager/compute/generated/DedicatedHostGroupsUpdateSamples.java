// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.DedicatedHostGroupUpdate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DedicatedHostGroups Update.
 */
public final class DedicatedHostGroupsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * dedicatedHostExamples/DedicatedHostGroup_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHostGroup_Update_MaximumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dedicatedHostGroupUpdateMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHostGroups()
            .updateWithResponse("rgcompute", "aaaa",
                new DedicatedHostGroupUpdate().withTags(mapOf("key9921", "fakeTokenPlaceholder"))
                    .withZones(Arrays.asList("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"))
                    .withPlatformFaultDomainCount(3)
                    .withSupportAutomaticPlacement(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * dedicatedHostExamples/DedicatedHostGroup_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: DedicatedHostGroup_Update_MinimumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dedicatedHostGroupUpdateMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHostGroups()
            .updateWithResponse("rgcompute", "aaaaaaaaaaa", new DedicatedHostGroupUpdate(),
                com.azure.core.util.Context.NONE);
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
