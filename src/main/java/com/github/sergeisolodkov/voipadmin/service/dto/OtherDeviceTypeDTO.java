package com.github.sergeisolodkov.voipadmin.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.github.sergeisolodkov.voipadmin.domain.OtherDeviceType} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class OtherDeviceTypeDTO implements Serializable {

    private Long id;

    private String name;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OtherDeviceTypeDTO)) {
            return false;
        }

        OtherDeviceTypeDTO otherDeviceTypeDTO = (OtherDeviceTypeDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, otherDeviceTypeDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "OtherDeviceTypeDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }
}
