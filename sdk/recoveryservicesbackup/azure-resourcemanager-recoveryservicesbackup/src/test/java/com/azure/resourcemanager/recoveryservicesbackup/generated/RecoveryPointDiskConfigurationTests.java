// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DiskInformation;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointDiskConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPointDiskConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPointDiskConfiguration model = BinaryData.fromString(
            "{\"numberOfDisksIncludedInBackup\":1751850154,\"numberOfDisksAttachedToVm\":612007503,\"includedDiskList\":[{\"lun\":2132390446,\"name\":\"wgfmx\"},{\"lun\":641707757,\"name\":\"bjb\"}],\"excludedDiskList\":[{\"lun\":197594994,\"name\":\"dysna\"},{\"lun\":551280900,\"name\":\"qbctqha\"},{\"lun\":1692264859,\"name\":\"wdkqzeqy\"},{\"lun\":1179923211,\"name\":\"iunjxdf\"}]}")
            .toObject(RecoveryPointDiskConfiguration.class);
        Assertions.assertEquals(1751850154, model.numberOfDisksIncludedInBackup());
        Assertions.assertEquals(612007503, model.numberOfDisksAttachedToVm());
        Assertions.assertEquals(2132390446, model.includedDiskList().get(0).lun());
        Assertions.assertEquals("wgfmx", model.includedDiskList().get(0).name());
        Assertions.assertEquals(197594994, model.excludedDiskList().get(0).lun());
        Assertions.assertEquals("dysna", model.excludedDiskList().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPointDiskConfiguration model
            = new RecoveryPointDiskConfiguration().withNumberOfDisksIncludedInBackup(1751850154)
                .withNumberOfDisksAttachedToVm(612007503)
                .withIncludedDiskList(Arrays.asList(new DiskInformation().withLun(2132390446).withName("wgfmx"),
                    new DiskInformation().withLun(641707757).withName("bjb")))
                .withExcludedDiskList(Arrays.asList(new DiskInformation().withLun(197594994).withName("dysna"),
                    new DiskInformation().withLun(551280900).withName("qbctqha"),
                    new DiskInformation().withLun(1692264859).withName("wdkqzeqy"),
                    new DiskInformation().withLun(1179923211).withName("iunjxdf")));
        model = BinaryData.fromObject(model).toObject(RecoveryPointDiskConfiguration.class);
        Assertions.assertEquals(1751850154, model.numberOfDisksIncludedInBackup());
        Assertions.assertEquals(612007503, model.numberOfDisksAttachedToVm());
        Assertions.assertEquals(2132390446, model.includedDiskList().get(0).lun());
        Assertions.assertEquals("wgfmx", model.includedDiskList().get(0).name());
        Assertions.assertEquals(197594994, model.excludedDiskList().get(0).lun());
        Assertions.assertEquals("dysna", model.excludedDiskList().get(0).name());
    }
}
