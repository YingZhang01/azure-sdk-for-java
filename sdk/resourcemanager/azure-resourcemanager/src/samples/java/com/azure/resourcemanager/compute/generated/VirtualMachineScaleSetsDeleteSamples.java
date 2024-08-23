// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for VirtualMachineScaleSets Delete.
 */
public final class VirtualMachineScaleSetsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSet_Delete_Force.json
     */
    /**
     * Sample code: Force Delete a VM scale set.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void forceDeleteAVMScaleSet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .delete("myResourceGroup", "myvmScaleSet", true, com.azure.core.util.Context.NONE);
    }
}
