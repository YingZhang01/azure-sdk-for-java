// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure VM workload-specific workload item representing SQL Database.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "workloadItemType",
    defaultImpl = AzureVmWorkloadSqlDatabaseWorkloadItem.class,
    visible = true)
@JsonTypeName("SQLDataBase")
@Fluent
public final class AzureVmWorkloadSqlDatabaseWorkloadItem extends AzureVmWorkloadItem {
    /*
     * Type of the backup item.
     */
    @JsonTypeId
    @JsonProperty(value = "workloadItemType", required = true)
    private String workloadItemType = "SQLDataBase";

    /**
     * Creates an instance of AzureVmWorkloadSqlDatabaseWorkloadItem class.
     */
    public AzureVmWorkloadSqlDatabaseWorkloadItem() {
    }

    /**
     * Get the workloadItemType property: Type of the backup item.
     * 
     * @return the workloadItemType value.
     */
    @Override
    public String workloadItemType() {
        return this.workloadItemType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseWorkloadItem withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseWorkloadItem withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseWorkloadItem withIsAutoProtectable(Boolean isAutoProtectable) {
        super.withIsAutoProtectable(isAutoProtectable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseWorkloadItem withSubinquireditemcount(Integer subinquireditemcount) {
        super.withSubinquireditemcount(subinquireditemcount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseWorkloadItem withSubWorkloadItemCount(Integer subWorkloadItemCount) {
        super.withSubWorkloadItemCount(subWorkloadItemCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseWorkloadItem withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseWorkloadItem withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseWorkloadItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseWorkloadItem withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
