// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * IaaS VM workload-specific backup policy.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "backupManagementType",
    defaultImpl = AzureIaaSvmProtectionPolicy.class,
    visible = true)
@JsonTypeName("AzureIaasVM")
@Fluent
public final class AzureIaaSvmProtectionPolicy extends ProtectionPolicy {
    /*
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     */
    @JsonTypeId
    @JsonProperty(value = "backupManagementType", required = true)
    private String backupManagementType = "AzureIaasVM";

    /*
     * The instantRPDetails property.
     */
    @JsonProperty(value = "instantRPDetails")
    private InstantRPAdditionalDetails instantRPDetails;

    /*
     * Backup schedule specified as part of backup policy.
     */
    @JsonProperty(value = "schedulePolicy")
    private SchedulePolicy schedulePolicy;

    /*
     * Retention policy with the details on backup copy retention ranges.
     */
    @JsonProperty(value = "retentionPolicy")
    private RetentionPolicy retentionPolicy;

    /*
     * Tiering policy to automatically move RPs to another tier
     * Key is Target Tier, defined in RecoveryPointTierType enum.
     * Tiering policy specifies the criteria to move RP to the target tier.
     */
    @JsonProperty(value = "tieringPolicy")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, TieringPolicy> tieringPolicy;

    /*
     * Instant RP retention policy range in days
     */
    @JsonProperty(value = "instantRpRetentionRangeInDays")
    private Integer instantRpRetentionRangeInDays;

    /*
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /*
     * The policyType property.
     */
    @JsonProperty(value = "policyType")
    private IaasvmPolicyType policyType;

    /*
     * The snapshotConsistencyType property.
     */
    @JsonProperty(value = "snapshotConsistencyType")
    private IaasVMSnapshotConsistencyType snapshotConsistencyType;

    /**
     * Creates an instance of AzureIaaSvmProtectionPolicy class.
     */
    public AzureIaaSvmProtectionPolicy() {
    }

    /**
     * Get the backupManagementType property: This property will be used as the discriminator for deciding the specific
     * types in the polymorphic chain of types.
     * 
     * @return the backupManagementType value.
     */
    @Override
    public String backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Get the instantRPDetails property: The instantRPDetails property.
     * 
     * @return the instantRPDetails value.
     */
    public InstantRPAdditionalDetails instantRPDetails() {
        return this.instantRPDetails;
    }

    /**
     * Set the instantRPDetails property: The instantRPDetails property.
     * 
     * @param instantRPDetails the instantRPDetails value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy withInstantRPDetails(InstantRPAdditionalDetails instantRPDetails) {
        this.instantRPDetails = instantRPDetails;
        return this;
    }

    /**
     * Get the schedulePolicy property: Backup schedule specified as part of backup policy.
     * 
     * @return the schedulePolicy value.
     */
    public SchedulePolicy schedulePolicy() {
        return this.schedulePolicy;
    }

    /**
     * Set the schedulePolicy property: Backup schedule specified as part of backup policy.
     * 
     * @param schedulePolicy the schedulePolicy value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy withSchedulePolicy(SchedulePolicy schedulePolicy) {
        this.schedulePolicy = schedulePolicy;
        return this;
    }

    /**
     * Get the retentionPolicy property: Retention policy with the details on backup copy retention ranges.
     * 
     * @return the retentionPolicy value.
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: Retention policy with the details on backup copy retention ranges.
     * 
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Get the tieringPolicy property: Tiering policy to automatically move RPs to another tier
     * Key is Target Tier, defined in RecoveryPointTierType enum.
     * Tiering policy specifies the criteria to move RP to the target tier.
     * 
     * @return the tieringPolicy value.
     */
    public Map<String, TieringPolicy> tieringPolicy() {
        return this.tieringPolicy;
    }

    /**
     * Set the tieringPolicy property: Tiering policy to automatically move RPs to another tier
     * Key is Target Tier, defined in RecoveryPointTierType enum.
     * Tiering policy specifies the criteria to move RP to the target tier.
     * 
     * @param tieringPolicy the tieringPolicy value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy withTieringPolicy(Map<String, TieringPolicy> tieringPolicy) {
        this.tieringPolicy = tieringPolicy;
        return this;
    }

    /**
     * Get the instantRpRetentionRangeInDays property: Instant RP retention policy range in days.
     * 
     * @return the instantRpRetentionRangeInDays value.
     */
    public Integer instantRpRetentionRangeInDays() {
        return this.instantRpRetentionRangeInDays;
    }

    /**
     * Set the instantRpRetentionRangeInDays property: Instant RP retention policy range in days.
     * 
     * @param instantRpRetentionRangeInDays the instantRpRetentionRangeInDays value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy withInstantRpRetentionRangeInDays(Integer instantRpRetentionRangeInDays) {
        this.instantRpRetentionRangeInDays = instantRpRetentionRangeInDays;
        return this;
    }

    /**
     * Get the timeZone property: TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     * @param timeZone the timeZone value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the policyType property: The policyType property.
     * 
     * @return the policyType value.
     */
    public IaasvmPolicyType policyType() {
        return this.policyType;
    }

    /**
     * Set the policyType property: The policyType property.
     * 
     * @param policyType the policyType value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy withPolicyType(IaasvmPolicyType policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get the snapshotConsistencyType property: The snapshotConsistencyType property.
     * 
     * @return the snapshotConsistencyType value.
     */
    public IaasVMSnapshotConsistencyType snapshotConsistencyType() {
        return this.snapshotConsistencyType;
    }

    /**
     * Set the snapshotConsistencyType property: The snapshotConsistencyType property.
     * 
     * @param snapshotConsistencyType the snapshotConsistencyType value to set.
     * @return the AzureIaaSvmProtectionPolicy object itself.
     */
    public AzureIaaSvmProtectionPolicy
        withSnapshotConsistencyType(IaasVMSnapshotConsistencyType snapshotConsistencyType) {
        this.snapshotConsistencyType = snapshotConsistencyType;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSvmProtectionPolicy withProtectedItemsCount(Integer protectedItemsCount) {
        super.withProtectedItemsCount(protectedItemsCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureIaaSvmProtectionPolicy withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
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
        if (instantRPDetails() != null) {
            instantRPDetails().validate();
        }
        if (schedulePolicy() != null) {
            schedulePolicy().validate();
        }
        if (retentionPolicy() != null) {
            retentionPolicy().validate();
        }
        if (tieringPolicy() != null) {
            tieringPolicy().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }
}
