// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadItem;
import org.junit.jupiter.api.Assertions;

public final class WorkloadItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadItem model = BinaryData.fromString(
            "{\"workloadItemType\":\"WorkloadItem\",\"backupManagementType\":\"gxsds\",\"workloadType\":\"e\",\"friendlyName\":\"sbzkf\",\"protectionState\":\"Protecting\"}")
            .toObject(WorkloadItem.class);
        Assertions.assertEquals("gxsds", model.backupManagementType());
        Assertions.assertEquals("e", model.workloadType());
        Assertions.assertEquals("sbzkf", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTING, model.protectionState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadItem model = new WorkloadItem().withBackupManagementType("gxsds")
            .withWorkloadType("e")
            .withFriendlyName("sbzkf")
            .withProtectionState(ProtectionStatus.PROTECTING);
        model = BinaryData.fromObject(model).toObject(WorkloadItem.class);
        Assertions.assertEquals("gxsds", model.backupManagementType());
        Assertions.assertEquals("e", model.workloadType());
        Assertions.assertEquals("sbzkf", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTING, model.protectionState());
    }
}
