// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Describes a virtual machine scale set virtual machine profile.
 */
@Fluent
public final class VirtualMachineScaleSetVMProfile implements JsonSerializable<VirtualMachineScaleSetVMProfile> {
    /*
     * Specifies the operating system settings for the virtual machines in the scale set.
     */
    private VirtualMachineScaleSetOSProfile osProfile;

    /*
     * Specifies the storage settings for the virtual machine disks.
     */
    private VirtualMachineScaleSetStorageProfile storageProfile;

    /*
     * Specifies properties of the network interfaces of the virtual machines in the scale set.
     */
    private VirtualMachineScaleSetNetworkProfile networkProfile;

    /*
     * Specifies the Security related profile settings for the virtual machines in the scale set.
     */
    private SecurityProfile securityProfile;

    /*
     * Specifies the boot diagnostic settings state. Minimum api-version: 2015-06-15.
     */
    private DiagnosticsProfile diagnosticsProfile;

    /*
     * Specifies a collection of settings for extensions installed on virtual machines in the scale set.
     */
    private VirtualMachineScaleSetExtensionProfile extensionProfile;

    /*
     * Specifies that the image or disk that is being used was licensed on-premises. <br><br> Possible values for
     * Windows Server operating system are: <br><br> Windows_Client <br><br> Windows_Server <br><br> Possible values for
     * Linux Server operating system are: <br><br> RHEL_BYOS (for RHEL) <br><br> SLES_BYOS (for SUSE) <br><br> For more
     * information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) <br><br> [Azure
     * Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) <br><br> Minimum
     * api-version: 2015-06-15
     */
    private String licenseType;

    /*
     * Specifies the priority for the virtual machines in the scale set. Minimum api-version: 2017-10-30-preview.
     */
    private VirtualMachinePriorityTypes priority;

    /*
     * Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. For Azure Spot virtual
     * machines, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2019-03-01. For Azure Spot
     * scale sets, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     */
    private VirtualMachineEvictionPolicyTypes evictionPolicy;

    /*
     * Specifies the billing related details of a Azure Spot VMSS. Minimum api-version: 2019-03-01.
     */
    private BillingProfile billingProfile;

    /*
     * Specifies Scheduled Event related configurations.
     */
    private ScheduledEventsProfile scheduledEventsProfile;

    /*
     * UserData for the virtual machines in the scale set, which must be base-64 encoded. Customer should not pass any
     * secrets in here. Minimum api-version: 2021-03-01.
     */
    private String userData;

    /*
     * Specifies the capacity reservation related details of a scale set. Minimum api-version: 2021-04-01.
     */
    private CapacityReservationProfile capacityReservation;

    /*
     * Specifies the gallery applications that should be made available to the VM/VMSS
     */
    private ApplicationProfile applicationProfile;

    /*
     * Specifies the hardware profile related details of a scale set. Minimum api-version: 2021-11-01.
     */
    private VirtualMachineScaleSetHardwareProfile hardwareProfile;

    /*
     * Specifies the service artifact reference id used to set same image version for all virtual machines in the scale
     * set when using 'latest' image version. Minimum api-version: 2022-11-01
     */
    private ServiceArtifactReference serviceArtifactReference;

    /*
     * Specifies the security posture to be used in the scale set. Minimum api-version: 2023-03-01
     */
    private SecurityPostureReference securityPostureReference;

    /*
     * Specifies the time in which this VM profile for the Virtual Machine Scale Set was created. This value will be
     * added to VMSS Flex VM tags when creating/updating the VMSS VM Profile. Minimum API version for this property is
     * 2023-09-01.
     */
    private OffsetDateTime timeCreated;

    /**
     * Creates an instance of VirtualMachineScaleSetVMProfile class.
     */
    public VirtualMachineScaleSetVMProfile() {
    }

    /**
     * Get the osProfile property: Specifies the operating system settings for the virtual machines in the scale set.
     * 
     * @return the osProfile value.
     */
    public VirtualMachineScaleSetOSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Specifies the operating system settings for the virtual machines in the scale set.
     * 
     * @param osProfile the osProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withOsProfile(VirtualMachineScaleSetOSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the storageProfile property: Specifies the storage settings for the virtual machine disks.
     * 
     * @return the storageProfile value.
     */
    public VirtualMachineScaleSetStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Specifies the storage settings for the virtual machine disks.
     * 
     * @param storageProfile the storageProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withStorageProfile(VirtualMachineScaleSetStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the networkProfile property: Specifies properties of the network interfaces of the virtual machines in the
     * scale set.
     * 
     * @return the networkProfile value.
     */
    public VirtualMachineScaleSetNetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Specifies properties of the network interfaces of the virtual machines in the
     * scale set.
     * 
     * @param networkProfile the networkProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withNetworkProfile(VirtualMachineScaleSetNetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the securityProfile property: Specifies the Security related profile settings for the virtual machines in the
     * scale set.
     * 
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: Specifies the Security related profile settings for the virtual machines in the
     * scale set.
     * 
     * @param securityProfile the securityProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withSecurityProfile(SecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Get the diagnosticsProfile property: Specifies the boot diagnostic settings state. Minimum api-version:
     * 2015-06-15.
     * 
     * @return the diagnosticsProfile value.
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set the diagnosticsProfile property: Specifies the boot diagnostic settings state. Minimum api-version:
     * 2015-06-15.
     * 
     * @param diagnosticsProfile the diagnosticsProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Get the extensionProfile property: Specifies a collection of settings for extensions installed on virtual
     * machines in the scale set.
     * 
     * @return the extensionProfile value.
     */
    public VirtualMachineScaleSetExtensionProfile extensionProfile() {
        return this.extensionProfile;
    }

    /**
     * Set the extensionProfile property: Specifies a collection of settings for extensions installed on virtual
     * machines in the scale set.
     * 
     * @param extensionProfile the extensionProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile
        withExtensionProfile(VirtualMachineScaleSetExtensionProfile extensionProfile) {
        this.extensionProfile = extensionProfile;
        return this;
    }

    /**
     * Get the licenseType property: Specifies that the image or disk that is being used was licensed on-premises.
     * &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client
     * &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are:
     * &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more
     * information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     * 
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: Specifies that the image or disk that is being used was licensed on-premises.
     * &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client
     * &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are:
     * &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more
     * information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     * 
     * @param licenseType the licenseType value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the priority property: Specifies the priority for the virtual machines in the scale set. Minimum api-version:
     * 2017-10-30-preview.
     * 
     * @return the priority value.
     */
    public VirtualMachinePriorityTypes priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Specifies the priority for the virtual machines in the scale set. Minimum api-version:
     * 2017-10-30-preview.
     * 
     * @param priority the priority value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withPriority(VirtualMachinePriorityTypes priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the evictionPolicy property: Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot
     * scale set. For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and the minimum
     * api-version is 2019-03-01. For Azure Spot scale sets, both 'Deallocate' and 'Delete' are supported and the
     * minimum api-version is 2017-10-30-preview.
     * 
     * @return the evictionPolicy value.
     */
    public VirtualMachineEvictionPolicyTypes evictionPolicy() {
        return this.evictionPolicy;
    }

    /**
     * Set the evictionPolicy property: Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot
     * scale set. For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and the minimum
     * api-version is 2019-03-01. For Azure Spot scale sets, both 'Deallocate' and 'Delete' are supported and the
     * minimum api-version is 2017-10-30-preview.
     * 
     * @param evictionPolicy the evictionPolicy value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withEvictionPolicy(VirtualMachineEvictionPolicyTypes evictionPolicy) {
        this.evictionPolicy = evictionPolicy;
        return this;
    }

    /**
     * Get the billingProfile property: Specifies the billing related details of a Azure Spot VMSS. Minimum api-version:
     * 2019-03-01.
     * 
     * @return the billingProfile value.
     */
    public BillingProfile billingProfile() {
        return this.billingProfile;
    }

    /**
     * Set the billingProfile property: Specifies the billing related details of a Azure Spot VMSS. Minimum api-version:
     * 2019-03-01.
     * 
     * @param billingProfile the billingProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withBillingProfile(BillingProfile billingProfile) {
        this.billingProfile = billingProfile;
        return this;
    }

    /**
     * Get the scheduledEventsProfile property: Specifies Scheduled Event related configurations.
     * 
     * @return the scheduledEventsProfile value.
     */
    public ScheduledEventsProfile scheduledEventsProfile() {
        return this.scheduledEventsProfile;
    }

    /**
     * Set the scheduledEventsProfile property: Specifies Scheduled Event related configurations.
     * 
     * @param scheduledEventsProfile the scheduledEventsProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withScheduledEventsProfile(ScheduledEventsProfile scheduledEventsProfile) {
        this.scheduledEventsProfile = scheduledEventsProfile;
        return this;
    }

    /**
     * Get the userData property: UserData for the virtual machines in the scale set, which must be base-64 encoded.
     * Customer should not pass any secrets in here. Minimum api-version: 2021-03-01.
     * 
     * @return the userData value.
     */
    public String userData() {
        return this.userData;
    }

    /**
     * Set the userData property: UserData for the virtual machines in the scale set, which must be base-64 encoded.
     * Customer should not pass any secrets in here. Minimum api-version: 2021-03-01.
     * 
     * @param userData the userData value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Get the capacityReservation property: Specifies the capacity reservation related details of a scale set. Minimum
     * api-version: 2021-04-01.
     * 
     * @return the capacityReservation value.
     */
    public CapacityReservationProfile capacityReservation() {
        return this.capacityReservation;
    }

    /**
     * Set the capacityReservation property: Specifies the capacity reservation related details of a scale set. Minimum
     * api-version: 2021-04-01.
     * 
     * @param capacityReservation the capacityReservation value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withCapacityReservation(CapacityReservationProfile capacityReservation) {
        this.capacityReservation = capacityReservation;
        return this;
    }

    /**
     * Get the applicationProfile property: Specifies the gallery applications that should be made available to the
     * VM/VMSS.
     * 
     * @return the applicationProfile value.
     */
    public ApplicationProfile applicationProfile() {
        return this.applicationProfile;
    }

    /**
     * Set the applicationProfile property: Specifies the gallery applications that should be made available to the
     * VM/VMSS.
     * 
     * @param applicationProfile the applicationProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withApplicationProfile(ApplicationProfile applicationProfile) {
        this.applicationProfile = applicationProfile;
        return this;
    }

    /**
     * Get the hardwareProfile property: Specifies the hardware profile related details of a scale set. Minimum
     * api-version: 2021-11-01.
     * 
     * @return the hardwareProfile value.
     */
    public VirtualMachineScaleSetHardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set the hardwareProfile property: Specifies the hardware profile related details of a scale set. Minimum
     * api-version: 2021-11-01.
     * 
     * @param hardwareProfile the hardwareProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withHardwareProfile(VirtualMachineScaleSetHardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
        return this;
    }

    /**
     * Get the serviceArtifactReference property: Specifies the service artifact reference id used to set same image
     * version for all virtual machines in the scale set when using 'latest' image version. Minimum api-version:
     * 2022-11-01.
     * 
     * @return the serviceArtifactReference value.
     */
    public ServiceArtifactReference serviceArtifactReference() {
        return this.serviceArtifactReference;
    }

    /**
     * Set the serviceArtifactReference property: Specifies the service artifact reference id used to set same image
     * version for all virtual machines in the scale set when using 'latest' image version. Minimum api-version:
     * 2022-11-01.
     * 
     * @param serviceArtifactReference the serviceArtifactReference value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile
        withServiceArtifactReference(ServiceArtifactReference serviceArtifactReference) {
        this.serviceArtifactReference = serviceArtifactReference;
        return this;
    }

    /**
     * Get the securityPostureReference property: Specifies the security posture to be used in the scale set. Minimum
     * api-version: 2023-03-01.
     * 
     * @return the securityPostureReference value.
     */
    public SecurityPostureReference securityPostureReference() {
        return this.securityPostureReference;
    }

    /**
     * Set the securityPostureReference property: Specifies the security posture to be used in the scale set. Minimum
     * api-version: 2023-03-01.
     * 
     * @param securityPostureReference the securityPostureReference value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile
        withSecurityPostureReference(SecurityPostureReference securityPostureReference) {
        this.securityPostureReference = securityPostureReference;
        return this;
    }

    /**
     * Get the timeCreated property: Specifies the time in which this VM profile for the Virtual Machine Scale Set was
     * created. This value will be added to VMSS Flex VM tags when creating/updating the VMSS VM Profile. Minimum API
     * version for this property is 2023-09-01.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
        if (diagnosticsProfile() != null) {
            diagnosticsProfile().validate();
        }
        if (extensionProfile() != null) {
            extensionProfile().validate();
        }
        if (billingProfile() != null) {
            billingProfile().validate();
        }
        if (scheduledEventsProfile() != null) {
            scheduledEventsProfile().validate();
        }
        if (capacityReservation() != null) {
            capacityReservation().validate();
        }
        if (applicationProfile() != null) {
            applicationProfile().validate();
        }
        if (hardwareProfile() != null) {
            hardwareProfile().validate();
        }
        if (serviceArtifactReference() != null) {
            serviceArtifactReference().validate();
        }
        if (securityPostureReference() != null) {
            securityPostureReference().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("osProfile", this.osProfile);
        jsonWriter.writeJsonField("storageProfile", this.storageProfile);
        jsonWriter.writeJsonField("networkProfile", this.networkProfile);
        jsonWriter.writeJsonField("securityProfile", this.securityProfile);
        jsonWriter.writeJsonField("diagnosticsProfile", this.diagnosticsProfile);
        jsonWriter.writeJsonField("extensionProfile", this.extensionProfile);
        jsonWriter.writeStringField("licenseType", this.licenseType);
        jsonWriter.writeStringField("priority", this.priority == null ? null : this.priority.toString());
        jsonWriter.writeStringField("evictionPolicy",
            this.evictionPolicy == null ? null : this.evictionPolicy.toString());
        jsonWriter.writeJsonField("billingProfile", this.billingProfile);
        jsonWriter.writeJsonField("scheduledEventsProfile", this.scheduledEventsProfile);
        jsonWriter.writeStringField("userData", this.userData);
        jsonWriter.writeJsonField("capacityReservation", this.capacityReservation);
        jsonWriter.writeJsonField("applicationProfile", this.applicationProfile);
        jsonWriter.writeJsonField("hardwareProfile", this.hardwareProfile);
        jsonWriter.writeJsonField("serviceArtifactReference", this.serviceArtifactReference);
        jsonWriter.writeJsonField("securityPostureReference", this.securityPostureReference);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetVMProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetVMProfile if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetVMProfile.
     */
    public static VirtualMachineScaleSetVMProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetVMProfile deserializedVirtualMachineScaleSetVMProfile
                = new VirtualMachineScaleSetVMProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("osProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.osProfile
                        = VirtualMachineScaleSetOSProfile.fromJson(reader);
                } else if ("storageProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.storageProfile
                        = VirtualMachineScaleSetStorageProfile.fromJson(reader);
                } else if ("networkProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.networkProfile
                        = VirtualMachineScaleSetNetworkProfile.fromJson(reader);
                } else if ("securityProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.securityProfile = SecurityProfile.fromJson(reader);
                } else if ("diagnosticsProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.diagnosticsProfile
                        = DiagnosticsProfile.fromJson(reader);
                } else if ("extensionProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.extensionProfile
                        = VirtualMachineScaleSetExtensionProfile.fromJson(reader);
                } else if ("licenseType".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.licenseType = reader.getString();
                } else if ("priority".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.priority
                        = VirtualMachinePriorityTypes.fromString(reader.getString());
                } else if ("evictionPolicy".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.evictionPolicy
                        = VirtualMachineEvictionPolicyTypes.fromString(reader.getString());
                } else if ("billingProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.billingProfile = BillingProfile.fromJson(reader);
                } else if ("scheduledEventsProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.scheduledEventsProfile
                        = ScheduledEventsProfile.fromJson(reader);
                } else if ("userData".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.userData = reader.getString();
                } else if ("capacityReservation".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.capacityReservation
                        = CapacityReservationProfile.fromJson(reader);
                } else if ("applicationProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.applicationProfile
                        = ApplicationProfile.fromJson(reader);
                } else if ("hardwareProfile".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.hardwareProfile
                        = VirtualMachineScaleSetHardwareProfile.fromJson(reader);
                } else if ("serviceArtifactReference".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.serviceArtifactReference
                        = ServiceArtifactReference.fromJson(reader);
                } else if ("securityPostureReference".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.securityPostureReference
                        = SecurityPostureReference.fromJson(reader);
                } else if ("timeCreated".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetVMProfile.timeCreated = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetVMProfile;
        });
    }
}
