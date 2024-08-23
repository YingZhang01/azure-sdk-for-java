// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for AvailabilitySets ListAvailableSizes.
 */
public final class AvailabilitySetsListAvailableSizesSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * availabilitySetExamples/AvailabilitySet_ListAvailableSizes_MinimumSet_Gen.json
     */
    /**
     * Sample code: AvailabilitySet_ListAvailableSizes_MinimumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        availabilitySetListAvailableSizesMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getAvailabilitySets()
            .listAvailableSizes("rgcompute", "aa", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * availabilitySetExamples/AvailabilitySet_ListAvailableSizes_MaximumSet_Gen.json
     */
    /**
     * Sample code: AvailabilitySet_ListAvailableSizes_MaximumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        availabilitySetListAvailableSizesMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getAvailabilitySets()
            .listAvailableSizes("rgcompute", "aaaaaaaaaaaaaaaaaaaa", com.azure.core.util.Context.NONE);
    }
}
