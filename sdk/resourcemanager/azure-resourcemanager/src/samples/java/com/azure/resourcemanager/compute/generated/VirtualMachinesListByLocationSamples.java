// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for VirtualMachines ListByLocation.
 */
public final class VirtualMachinesListByLocationSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * virtualMachineExamples/VirtualMachine_ListBySubscription_ByLocation.json
     */
    /**
     * Sample code: Lists all the virtual machines under the specified subscription for the specified location.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listsAllTheVirtualMachinesUnderTheSpecifiedSubscriptionForTheSpecifiedLocation(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachines()
            .listByLocation("eastus", com.azure.core.util.Context.NONE);
    }
}
