package com.epam.am.coffee.model;

public class QuantityUnit {
    private double amount;
    private Unit unit;

    public QuantityUnit(double amount, Unit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public double getAmount() {
        return amount;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "QuantityUnit{" +
                "amount=" + amount +
                ", unit=" + unit +
                '}';
    }
}
