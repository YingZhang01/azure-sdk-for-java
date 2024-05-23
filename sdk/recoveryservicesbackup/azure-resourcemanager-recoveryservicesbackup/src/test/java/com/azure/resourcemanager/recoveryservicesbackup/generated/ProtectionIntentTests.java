// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionIntent;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class ProtectionIntentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProtectionIntent model = BinaryData.fromString(
            "{\"protectionIntentItemType\":\"ProtectionIntent\",\"backupManagementType\":\"AzureSql\",\"sourceResourceId\":\"kvnipjoxz\",\"itemId\":\"chgejspodm\",\"policyId\":\"lzydehojwyahux\",\"protectionState\":\"ProtectionFailed\"}")
            .toObject(ProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.AZURE_SQL, model.backupManagementType());
        Assertions.assertEquals("kvnipjoxz", model.sourceResourceId());
        Assertions.assertEquals("chgejspodm", model.itemId());
        Assertions.assertEquals("lzydehojwyahux", model.policyId());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED, model.protectionState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProtectionIntent model = new ProtectionIntent().withBackupManagementType(BackupManagementType.AZURE_SQL)
            .withSourceResourceId("kvnipjoxz")
            .withItemId("chgejspodm")
            .withPolicyId("lzydehojwyahux")
            .withProtectionState(ProtectionStatus.PROTECTION_FAILED);
        model = BinaryData.fromObject(model).toObject(ProtectionIntent.class);
        Assertions.assertEquals(BackupManagementType.AZURE_SQL, model.backupManagementType());
        Assertions.assertEquals("kvnipjoxz", model.sourceResourceId());
        Assertions.assertEquals("chgejspodm", model.itemId());
        Assertions.assertEquals("lzydehojwyahux", model.policyId());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED, model.protectionState());
    }
}
