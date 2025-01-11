package com.design.designPatterns.builderPattern.secondSolution;

public enum ParameterValues {
    NAME("name"),
    ADDRESS("address"),
    EMAIL("email"),
    PHONE("phone"),
    PASS("pass"),
    AGE("age");

    private final String val;

    ParameterValues(String val) {
        this.val = val;
    }

    public String getValue() {
        return val;
    }

}
