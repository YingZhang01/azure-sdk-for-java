// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Base class for backup ProtectionIntent.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "protectionIntentItemType",
    defaultImpl = ProtectionIntent.class,
    visible = true)
@JsonTypeName("ProtectionIntent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "RecoveryServiceVaultItem", value = AzureRecoveryServiceVaultProtectionIntent.class),
    @JsonSubTypes.Type(name = "AzureResourceItem", value = AzureResourceProtectionIntent.class),
    @JsonSubTypes.Type(
        name = "AzureWorkloadContainerAutoProtectionIntent",
        value = AzureWorkloadContainerAutoProtectionIntent.class) })
@Fluent
public class ProtectionIntent {
    /*
     * backup protectionIntent type.
     */
    @JsonTypeId
    @JsonProperty(value = "protectionIntentItemType", required = true)
    private ProtectionIntentItemType protectionIntentItemType;

    /*
     * Type of backup management for the backed up item.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /*
     * ARM ID of the resource to be backed up.
     */
    @JsonProperty(value = "sourceResourceId")
    private String sourceResourceId;

    /*
     * ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
     */
    @JsonProperty(value = "itemId")
    private String itemId;

    /*
     * ID of the backup policy with which this item is backed up.
     */
    @JsonProperty(value = "policyId")
    private String policyId;

    /*
     * Backup state of this backup item.
     */
    @JsonProperty(value = "protectionState")
    private ProtectionStatus protectionState;

    /**
     * Creates an instance of ProtectionIntent class.
     */
    public ProtectionIntent() {
        this.protectionIntentItemType = ProtectionIntentItemType.fromString("ProtectionIntent");
    }

    /**
     * Get the protectionIntentItemType property: backup protectionIntent type.
     * 
     * @return the protectionIntentItemType value.
     */
    public ProtectionIntentItemType protectionIntentItemType() {
        return this.protectionIntentItemType;
    }

    /**
     * Get the backupManagementType property: Type of backup management for the backed up item.
     * 
     * @return the backupManagementType value.
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the backupManagementType property: Type of backup management for the backed up item.
     * 
     * @param backupManagementType the backupManagementType value to set.
     * @return the ProtectionIntent object itself.
     */
    public ProtectionIntent withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the sourceResourceId property: ARM ID of the resource to be backed up.
     * 
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set the sourceResourceId property: ARM ID of the resource to be backed up.
     * 
     * @param sourceResourceId the sourceResourceId value to set.
     * @return the ProtectionIntent object itself.
     */
    public ProtectionIntent withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get the itemId property: ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId.
     * 
     * @return the itemId value.
     */
    public String itemId() {
        return this.itemId;
    }

    /**
     * Set the itemId property: ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId.
     * 
     * @param itemId the itemId value to set.
     * @return the ProtectionIntent object itself.
     */
    public ProtectionIntent withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * Get the policyId property: ID of the backup policy with which this item is backed up.
     * 
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Set the policyId property: ID of the backup policy with which this item is backed up.
     * 
     * @param policyId the policyId value to set.
     * @return the ProtectionIntent object itself.
     */
    public ProtectionIntent withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get the protectionState property: Backup state of this backup item.
     * 
     * @return the protectionState value.
     */
    public ProtectionStatus protectionState() {
        return this.protectionState;
    }

    /**
     * Set the protectionState property: Backup state of this backup item.
     * 
     * @param protectionState the protectionState value to set.
     * @return the ProtectionIntent object itself.
     */
    public ProtectionIntent withProtectionState(ProtectionStatus protectionState) {
        this.protectionState = protectionState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
