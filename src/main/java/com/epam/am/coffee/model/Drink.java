package com.epam.am.coffee.model;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

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

    public Money getTotalPrice() {
        return componentList.stream()
                .map(Component::getPrice)
                .reduce(Money::plus)
                .orElse(Money.zero(CurrencyUnit.of("KZT")));
    }

    public double getTotalAmount() {
        return componentList.stream()
                .map(i -> i.getQuantityUnit().getAmount())
                .reduce((total, amount) -> total + amount)
                .orElse(0D);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", totalPrice=" + getTotalPrice() +
                ", componentCount=" + componentList.size() +
                '}';
    }
}
