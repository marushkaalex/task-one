package com.epam.am.coffee.model;

import java.util.List;

public class Drink extends BaseModel {
    private String name;
    private List<Component> componentList = null;

    public Drink() {
    }

    public Drink(String name, List<Component> componentList) {
        this.name = name;
        this.componentList = componentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Component> componentList) {
        this.componentList = componentList;
    }

    public double getTotalPrice() {
        return componentList.stream()
                .map(Component::getPrice)
                .reduce((total, price) -> total + price)
                .orElse(0D);
    }

    public double getTotalAmount() {
        return componentList.stream()
                .map(Component::getAmount)
                .reduce((total, amount) -> total + amount)
                .orElse(0D);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", componentList=" + componentList +
                '}';
    }
}
