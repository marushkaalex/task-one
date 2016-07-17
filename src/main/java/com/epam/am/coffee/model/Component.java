package com.epam.am.coffee.model;

import org.joda.money.Money;

public class Component extends BaseModel {
    private String name;
    private Money price;
    private QuantityUnit quantityUnit;

    public Component() {
    }

    public Component(String name, Money price, QuantityUnit quantityUnit) {
        this.name = name;
        this.price = price;
        this.quantityUnit = quantityUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public QuantityUnit getQuantityUnit() {
        return quantityUnit;
    }

    public void setQuantityUnit(QuantityUnit quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityUnit=" + quantityUnit +
                '}';
    }
}
