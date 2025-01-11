package com.sysdesign.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

public abstract class Gate {
    private String location;
    private Operator operator;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

}
