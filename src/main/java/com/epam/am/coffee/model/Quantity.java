package com.epam.am.coffee.model;

public enum Quantity {
    GRAM("g."), MILLILITER("ml.");

    private String name;

    Quantity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
