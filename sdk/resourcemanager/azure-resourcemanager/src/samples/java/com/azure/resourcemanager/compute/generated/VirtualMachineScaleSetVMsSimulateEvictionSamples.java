// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for VirtualMachineScaleSetVMs SimulateEviction.
 */
public final class VirtualMachineScaleSetVMsSimulateEvictionSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSetVM_SimulateEviction.json
     */
    /**
     * Sample code: Simulate Eviction a virtual machine.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void simulateEvictionAVirtualMachine(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSetVMs()
            .simulateEvictionWithResponse("ResourceGroup", "VmScaleSetName", "InstanceId",
                com.azure.core.util.Context.NONE);
    }
}
