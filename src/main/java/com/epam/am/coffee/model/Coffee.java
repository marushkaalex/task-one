package com.epam.am.coffee.model;

import org.joda.money.Money;

public class Coffee extends Component {
    private CoffeeSort sort;

    public Coffee() {
    }

    public Coffee(String name, Money price, QuantityUnit quantityUnit, CoffeeSort sort) {
        super(name, price, quantityUnit);
        this.sort = sort;
    }

    public CoffeeSort getSort() {
        return sort;
    }

    public void setSort(CoffeeSort sort) {
        this.sort = sort;
    }
}