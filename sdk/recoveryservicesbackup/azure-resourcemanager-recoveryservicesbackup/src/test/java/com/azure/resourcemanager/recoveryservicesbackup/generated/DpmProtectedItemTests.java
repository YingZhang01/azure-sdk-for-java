// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.CreateMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmProtectedItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmProtectedItemExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectedItemState;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DpmProtectedItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DpmProtectedItem model = BinaryData.fromString(
            "{\"protectedItemType\":\"DPMProtectedItem\",\"friendlyName\":\"dpizq\",\"backupEngineName\":\"lnapxbiygn\",\"protectionState\":\"IRPending\",\"extendedInfo\":{\"protectableObjectLoadPath\":{\"oiquvrehmrnjhvs\":\"smfcttuxuuyilfl\",\"w\":\"jztczytqj\",\"mr\":\"auunfprnjletlx\",\"amowaziynknlqwzd\":\"ddoui\"},\"protected\":true,\"isPresentOnCloud\":true,\"lastBackupStatus\":\"qszdtmaajquhuxyl\",\"lastRefreshedAt\":\"2021-10-25T23:02:29Z\",\"oldestRecoveryPoint\":\"2021-06-06T18:03:06Z\",\"recoveryPointCount\":202362209,\"onPremiseOldestRecoveryPoint\":\"2021-06-24T06:43:33Z\",\"onPremiseLatestRecoveryPoint\":\"2021-03-27T05:29:46Z\",\"onPremiseRecoveryPointCount\":417013973,\"isCollocated\":false,\"protectionGroupName\":\"p\",\"diskStorageUsedInBytes\":\"c\",\"totalDiskStorageSizeInBytes\":\"kyjpmspbps\"},\"backupManagementType\":\"AzureStorage\",\"workloadType\":\"Client\",\"containerName\":\"ogtieyujtvczkcny\",\"sourceResourceId\":\"x\",\"policyId\":\"njdxvglnkvxl\",\"lastRecoveryPoint\":\"2021-11-26T09:48:43Z\",\"backupSetName\":\"lqivbgkcv\",\"createMode\":\"Default\",\"deferredDeleteTimeInUTC\":\"2020-12-28T02:44:39Z\",\"isScheduledForDeferredDelete\":false,\"deferredDeleteTimeRemaining\":\"fl\",\"isDeferredDeleteScheduleUpcoming\":true,\"isRehydrate\":false,\"resourceGuardOperationRequests\":[\"pubcpzgpxtivhjk\",\"idibgqjxgpn\",\"hgovfgp\"],\"isArchiveEnabled\":false,\"policyName\":\"hh\",\"softDeleteRetentionPeriodInDays\":1307435225,\"vaultId\":\"rmzvupo\"}")
            .toObject(DpmProtectedItem.class);
        Assertions.assertEquals("ogtieyujtvczkcny", model.containerName());
        Assertions.assertEquals("x", model.sourceResourceId());
        Assertions.assertEquals("njdxvglnkvxl", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-26T09:48:43Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("lqivbgkcv", model.backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-28T02:44:39Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(false, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("fl", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("pubcpzgpxtivhjk", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("hh", model.policyName());
        Assertions.assertEquals(1307435225, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("dpizq", model.friendlyName());
        Assertions.assertEquals("lnapxbiygn", model.backupEngineName());
        Assertions.assertEquals(ProtectedItemState.IRPENDING, model.protectionState());
        Assertions.assertEquals("smfcttuxuuyilfl",
            model.extendedInfo().protectableObjectLoadPath().get("oiquvrehmrnjhvs"));
        Assertions.assertEquals(true, model.extendedInfo().protectedProperty());
        Assertions.assertEquals(true, model.extendedInfo().isPresentOnCloud());
        Assertions.assertEquals("qszdtmaajquhuxyl", model.extendedInfo().lastBackupStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-25T23:02:29Z"), model.extendedInfo().lastRefreshedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-06T18:03:06Z"),
            model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(202362209, model.extendedInfo().recoveryPointCount());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-24T06:43:33Z"),
            model.extendedInfo().onPremiseOldestRecoveryPoint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-27T05:29:46Z"),
            model.extendedInfo().onPremiseLatestRecoveryPoint());
        Assertions.assertEquals(417013973, model.extendedInfo().onPremiseRecoveryPointCount());
        Assertions.assertEquals(false, model.extendedInfo().isCollocated());
        Assertions.assertEquals("p", model.extendedInfo().protectionGroupName());
        Assertions.assertEquals("c", model.extendedInfo().diskStorageUsedInBytes());
        Assertions.assertEquals("kyjpmspbps", model.extendedInfo().totalDiskStorageSizeInBytes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DpmProtectedItem model = new DpmProtectedItem().withContainerName("ogtieyujtvczkcny")
            .withSourceResourceId("x")
            .withPolicyId("njdxvglnkvxl")
            .withLastRecoveryPoint(OffsetDateTime.parse("2021-11-26T09:48:43Z"))
            .withBackupSetName("lqivbgkcv")
            .withCreateMode(CreateMode.DEFAULT)
            .withDeferredDeleteTimeInUtc(OffsetDateTime.parse("2020-12-28T02:44:39Z"))
            .withIsScheduledForDeferredDelete(false)
            .withDeferredDeleteTimeRemaining("fl")
            .withIsDeferredDeleteScheduleUpcoming(true)
            .withIsRehydrate(false)
            .withResourceGuardOperationRequests(Arrays.asList("pubcpzgpxtivhjk", "idibgqjxgpn", "hgovfgp"))
            .withIsArchiveEnabled(false)
            .withPolicyName("hh")
            .withSoftDeleteRetentionPeriod(1307435225)
            .withFriendlyName("dpizq")
            .withBackupEngineName("lnapxbiygn")
            .withProtectionState(ProtectedItemState.IRPENDING)
            .withExtendedInfo(new DpmProtectedItemExtendedInfo()
                .withProtectableObjectLoadPath(mapOf("oiquvrehmrnjhvs", "smfcttuxuuyilfl", "w", "jztczytqj", "mr",
                    "auunfprnjletlx", "amowaziynknlqwzd", "ddoui"))
                .withProtectedProperty(true)
                .withIsPresentOnCloud(true)
                .withLastBackupStatus("qszdtmaajquhuxyl")
                .withLastRefreshedAt(OffsetDateTime.parse("2021-10-25T23:02:29Z"))
                .withOldestRecoveryPoint(OffsetDateTime.parse("2021-06-06T18:03:06Z"))
                .withRecoveryPointCount(202362209)
                .withOnPremiseOldestRecoveryPoint(OffsetDateTime.parse("2021-06-24T06:43:33Z"))
                .withOnPremiseLatestRecoveryPoint(OffsetDateTime.parse("2021-03-27T05:29:46Z"))
                .withOnPremiseRecoveryPointCount(417013973)
                .withIsCollocated(false)
                .withProtectionGroupName("p")
                .withDiskStorageUsedInBytes("c")
                .withTotalDiskStorageSizeInBytes("kyjpmspbps"));
        model = BinaryData.fromObject(model).toObject(DpmProtectedItem.class);
        Assertions.assertEquals("ogtieyujtvczkcny", model.containerName());
        Assertions.assertEquals("x", model.sourceResourceId());
        Assertions.assertEquals("njdxvglnkvxl", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-26T09:48:43Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("lqivbgkcv", model.backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-28T02:44:39Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(false, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("fl", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(true, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("pubcpzgpxtivhjk", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("hh", model.policyName());
        Assertions.assertEquals(1307435225, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("dpizq", model.friendlyName());
        Assertions.assertEquals("lnapxbiygn", model.backupEngineName());
        Assertions.assertEquals(ProtectedItemState.IRPENDING, model.protectionState());
        Assertions.assertEquals("smfcttuxuuyilfl",
            model.extendedInfo().protectableObjectLoadPath().get("oiquvrehmrnjhvs"));
        Assertions.assertEquals(true, model.extendedInfo().protectedProperty());
        Assertions.assertEquals(true, model.extendedInfo().isPresentOnCloud());
        Assertions.assertEquals("qszdtmaajquhuxyl", model.extendedInfo().lastBackupStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-25T23:02:29Z"), model.extendedInfo().lastRefreshedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-06T18:03:06Z"),
            model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(202362209, model.extendedInfo().recoveryPointCount());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-24T06:43:33Z"),
            model.extendedInfo().onPremiseOldestRecoveryPoint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-27T05:29:46Z"),
            model.extendedInfo().onPremiseLatestRecoveryPoint());
        Assertions.assertEquals(417013973, model.extendedInfo().onPremiseRecoveryPointCount());
        Assertions.assertEquals(false, model.extendedInfo().isCollocated());
        Assertions.assertEquals("p", model.extendedInfo().protectionGroupName());
        Assertions.assertEquals("c", model.extendedInfo().diskStorageUsedInBytes());
        Assertions.assertEquals("kyjpmspbps", model.extendedInfo().totalDiskStorageSizeInBytes());
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
