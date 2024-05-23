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
 * Azure VM workload-specific protectable item representing SQL Database.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "protectableItemType",
    defaultImpl = AzureVmWorkloadSqlDatabaseProtectableItem.class,
    visible = true)
@JsonTypeName("SQLDataBase")
@Fluent
public final class AzureVmWorkloadSqlDatabaseProtectableItem extends AzureVmWorkloadProtectableItem {
    /*
     * Type of the backup item.
     */
    @JsonTypeId
    @JsonProperty(value = "protectableItemType", required = true)
    private String protectableItemType = "SQLDataBase";

    /**
     * Creates an instance of AzureVmWorkloadSqlDatabaseProtectableItem class.
     */
    public AzureVmWorkloadSqlDatabaseProtectableItem() {
    }

    /**
     * Get the protectableItemType property: Type of the backup item.
     * 
     * @return the protectableItemType value.
     */
    @Override
    public String protectableItemType() {
        return this.protectableItemType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withParentName(String parentName) {
        super.withParentName(parentName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withParentUniqueName(String parentUniqueName) {
        super.withParentUniqueName(parentUniqueName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withServerName(String serverName) {
        super.withServerName(serverName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withIsAutoProtectable(Boolean isAutoProtectable) {
        super.withIsAutoProtectable(isAutoProtectable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withIsAutoProtected(Boolean isAutoProtected) {
        super.withIsAutoProtected(isAutoProtected);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withSubinquireditemcount(Integer subinquireditemcount) {
        super.withSubinquireditemcount(subinquireditemcount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withSubprotectableitemcount(Integer subprotectableitemcount) {
        super.withSubprotectableitemcount(subprotectableitemcount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withPrebackupvalidation(PreBackupValidation prebackupvalidation) {
        super.withPrebackupvalidation(prebackupvalidation);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withIsProtectable(Boolean isProtectable) {
        super.withIsProtectable(isProtectable);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withBackupManagementType(String backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withWorkloadType(String workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVmWorkloadSqlDatabaseProtectableItem withProtectionState(ProtectionStatus protectionState) {
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
