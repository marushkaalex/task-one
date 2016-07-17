package com.epam.am.coffee.model;

public enum Unit {
    GRAM("g."), MILLILITER("ml.");

    private String name;

    Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
