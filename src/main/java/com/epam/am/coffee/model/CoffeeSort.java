package com.epam.am.coffee.model;

public class CoffeeSort {
    private String name;
    private String description;

    public CoffeeSort() {
    }

    public CoffeeSort(String name, String description) {
        this.name = name;
        this.description = description;
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
}
