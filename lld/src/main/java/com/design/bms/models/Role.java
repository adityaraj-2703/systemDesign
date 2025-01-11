package com.lld.sysdesign.bms.models;

import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "ROLES")
public class Role extends Auditable {

    private String name;
    private String description;

}
