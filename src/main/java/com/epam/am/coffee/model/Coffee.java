package com.epam.am.coffee.model;

public class Coffee extends Component {
    private CoffeeSort sort;

    public Coffee() {
    }

    public Coffee(String name, double price, double amount, Quantity quantity, CoffeeSort sort) {
        super(name, price, amount, quantity);
        this.sort = sort;
    }

    public CoffeeSort getSort() {
        return sort;
    }

    public void setSort(CoffeeSort sort) {
        this.sort = sort;
    }
}