package com.github.sergeisolodkov.voipadmin.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class DeviceAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDeviceAllPropertiesEquals(Device expected, Device actual) {
        assertDeviceAutoGeneratedPropertiesEquals(expected, actual);
        assertDeviceAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDeviceAllUpdatablePropertiesEquals(Device expected, Device actual) {
        assertDeviceUpdatableFieldsEquals(expected, actual);
        assertDeviceUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDeviceAutoGeneratedPropertiesEquals(Device expected, Device actual) {
        assertThat(expected)
            .as("Verify Device auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDeviceUpdatableFieldsEquals(Device expected, Device actual) {
        assertThat(expected)
            .as("Verify Device relevant properties")
            .satisfies(e -> assertThat(e.getMac()).as("check mac").isEqualTo(actual.getMac()))
            .satisfies(e -> assertThat(e.getInventoryId()).as("check inventoryId").isEqualTo(actual.getInventoryId()))
            .satisfies(e -> assertThat(e.getLocation()).as("check location").isEqualTo(actual.getLocation()))
            .satisfies(e -> assertThat(e.getHostname()).as("check hostname").isEqualTo(actual.getHostname()))
            .satisfies(e -> assertThat(e.getWebAccessLogin()).as("check webAccessLogin").isEqualTo(actual.getWebAccessLogin()))
            .satisfies(e ->
                assertThat(e.getWebAccessPasswordHash()).as("check webAccessPasswordHash").isEqualTo(actual.getWebAccessPasswordHash())
            )
            .satisfies(e -> assertThat(e.getDhcpEnabled()).as("check dhcpEnabled").isEqualTo(actual.getDhcpEnabled()))
            .satisfies(e -> assertThat(e.getIpAddress()).as("check ipAddress").isEqualTo(actual.getIpAddress()))
            .satisfies(e -> assertThat(e.getSubnetMask()).as("check subnetMask").isEqualTo(actual.getSubnetMask()))
            .satisfies(e -> assertThat(e.getDefaultGw()).as("check defaultGw").isEqualTo(actual.getDefaultGw()))
            .satisfies(e -> assertThat(e.getDns1()).as("check dns1").isEqualTo(actual.getDns1()))
            .satisfies(e -> assertThat(e.getDns2()).as("check dns2").isEqualTo(actual.getDns2()))
            .satisfies(e -> assertThat(e.getProvisioningMode()).as("check provisioningMode").isEqualTo(actual.getProvisioningMode()))
            .satisfies(e -> assertThat(e.getProvisioningUrl()).as("check provisioningUrl").isEqualTo(actual.getProvisioningUrl()))
            .satisfies(e -> assertThat(e.getNtp()).as("check ntp").isEqualTo(actual.getNtp()))
            .satisfies(e -> assertThat(e.getConfigPath()).as("check configPath").isEqualTo(actual.getConfigPath()))
            .satisfies(e -> assertThat(e.getNotes()).as("check notes").isEqualTo(actual.getNotes()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDeviceUpdatableRelationshipsEquals(Device expected, Device actual) {
        assertThat(expected)
            .as("Verify Device relationships")
            .satisfies(e -> assertThat(e.getModel()).as("check model").isEqualTo(actual.getModel()))
            .satisfies(e -> assertThat(e.getOwner()).as("check owner").isEqualTo(actual.getOwner()))
            .satisfies(e -> assertThat(e.getParent()).as("check parent").isEqualTo(actual.getParent()));
    }
}
