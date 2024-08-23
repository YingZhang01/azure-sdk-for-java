// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetReimageParameters;
import java.util.Arrays;

/**
 * Samples for VirtualMachineScaleSets Reimage.
 */
public final class VirtualMachineScaleSetsReimageSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSet_Reimage_MinimumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSet_Reimage_MinimumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        virtualMachineScaleSetReimageMinimumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .reimage("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * virtualMachineScaleSetExamples/VirtualMachineScaleSet_Reimage_MaximumSet_Gen.json
     */
    /**
     * Sample code: VirtualMachineScaleSet_Reimage_MaximumSet_Gen.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        virtualMachineScaleSetReimageMaximumSetGen(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineScaleSets()
            .reimage("rgcompute", "aaaaaaaaaaaaaaaaaaaaaaaaaa",
                new VirtualMachineScaleSetReimageParameters().withTempDisk(true)
                    .withForceUpdateOSDiskForEphemeral(true)
                    .withInstanceIds(Arrays.asList("aaaaaaaaaa")),
                com.azure.core.util.Context.NONE);
    }
}
