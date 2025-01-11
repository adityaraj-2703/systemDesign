package com.lld.sysdesign.bms.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Cinema extends Auditable {

    private String name;
    private String address;

    @OneToMany(mappedBy = "cinema")
    private List<CinemaHall> halls = new ArrayList<>();
}
