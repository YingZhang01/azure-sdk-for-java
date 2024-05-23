// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupManagementUsageInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.NameInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.UsagesUnit;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class BackupManagementUsageInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupManagementUsageInner model = BinaryData.fromString(
            "{\"unit\":\"Count\",\"quotaPeriod\":\"dvkaozw\",\"nextResetTime\":\"2021-02-22T11:39:16Z\",\"currentValue\":4625530429549295340,\"limit\":4205096906528038378,\"name\":{\"value\":\"k\",\"localizedValue\":\"yxolniwp\"}}")
            .toObject(BackupManagementUsageInner.class);
        Assertions.assertEquals(UsagesUnit.COUNT, model.unit());
        Assertions.assertEquals("dvkaozw", model.quotaPeriod());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-22T11:39:16Z"), model.nextResetTime());
        Assertions.assertEquals(4625530429549295340L, model.currentValue());
        Assertions.assertEquals(4205096906528038378L, model.limit());
        Assertions.assertEquals("k", model.name().value());
        Assertions.assertEquals("yxolniwp", model.name().localizedValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupManagementUsageInner model = new BackupManagementUsageInner().withUnit(UsagesUnit.COUNT)
            .withQuotaPeriod("dvkaozw")
            .withNextResetTime(OffsetDateTime.parse("2021-02-22T11:39:16Z"))
            .withCurrentValue(4625530429549295340L)
            .withLimit(4205096906528038378L)
            .withName(new NameInfo().withValue("k").withLocalizedValue("yxolniwp"));
        model = BinaryData.fromObject(model).toObject(BackupManagementUsageInner.class);
        Assertions.assertEquals(UsagesUnit.COUNT, model.unit());
        Assertions.assertEquals("dvkaozw", model.quotaPeriod());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-22T11:39:16Z"), model.nextResetTime());
        Assertions.assertEquals(4625530429549295340L, model.currentValue());
        Assertions.assertEquals(4205096906528038378L, model.limit());
        Assertions.assertEquals("k", model.name().value());
        Assertions.assertEquals("yxolniwp", model.name().localizedValue());
    }
}
