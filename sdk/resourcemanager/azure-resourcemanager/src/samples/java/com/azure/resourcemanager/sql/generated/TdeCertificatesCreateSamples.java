// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.resourcemanager.sql.models.TdeCertificate;

/**
 * Samples for TdeCertificates Create.
 */
public final class TdeCertificatesCreateSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/SqlTdeCertificateCreate.json
     */
    /**
     * Sample code: Upload a TDE certificate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void uploadATDECertificate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getTdeCertificates()
            .create("testtdecert", "testtdecert", new TdeCertificate().withPrivateBlob("MIIXXXXXXXX"),
                com.azure.core.util.Context.NONE);
    }
}
