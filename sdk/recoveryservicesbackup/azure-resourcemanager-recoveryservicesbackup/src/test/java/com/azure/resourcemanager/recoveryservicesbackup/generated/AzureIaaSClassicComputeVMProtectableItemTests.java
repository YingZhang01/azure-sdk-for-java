// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSClassicComputeVMProtectableItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class AzureIaaSClassicComputeVMProtectableItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureIaaSClassicComputeVMProtectableItem model = BinaryData.fromString(
            "{\"protectableItemType\":\"Microsoft.ClassicCompute/virtualMachines\",\"virtualMachineId\":\"rrleaesinuqt\",\"virtualMachineVersion\":\"qobbpihehcec\",\"resourceGroup\":\"mrqbrjbbmpxdlv\",\"backupManagementType\":\"frexcrseqw\",\"workloadType\":\"s\",\"friendlyName\":\"udgzhxogjgg\",\"protectionState\":\"NotProtected\"}")
            .toObject(AzureIaaSClassicComputeVMProtectableItem.class);
        Assertions.assertEquals("frexcrseqw", model.backupManagementType());
        Assertions.assertEquals("s", model.workloadType());
        Assertions.assertEquals("udgzhxogjgg", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.NOT_PROTECTED, model.protectionState());
        Assertions.assertEquals("rrleaesinuqt", model.virtualMachineId());
        Assertions.assertEquals("qobbpihehcec", model.virtualMachineVersion());
        Assertions.assertEquals("mrqbrjbbmpxdlv", model.resourceGroup());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureIaaSClassicComputeVMProtectableItem model
            = new AzureIaaSClassicComputeVMProtectableItem().withBackupManagementType("frexcrseqw")
                .withWorkloadType("s")
                .withFriendlyName("udgzhxogjgg")
                .withProtectionState(ProtectionStatus.NOT_PROTECTED)
                .withVirtualMachineId("rrleaesinuqt")
                .withVirtualMachineVersion("qobbpihehcec")
                .withResourceGroup("mrqbrjbbmpxdlv");
        model = BinaryData.fromObject(model).toObject(AzureIaaSClassicComputeVMProtectableItem.class);
        Assertions.assertEquals("frexcrseqw", model.backupManagementType());
        Assertions.assertEquals("s", model.workloadType());
        Assertions.assertEquals("udgzhxogjgg", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.NOT_PROTECTED, model.protectionState());
        Assertions.assertEquals("rrleaesinuqt", model.virtualMachineId());
        Assertions.assertEquals("qobbpihehcec", model.virtualMachineVersion());
        Assertions.assertEquals("mrqbrjbbmpxdlv", model.resourceGroup());
    }
}
