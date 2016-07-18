package com.epam.am.coffee.model;

public class QuantityUnit {
    private double amount;
    private Unit unit;

    public QuantityUnit(double amount, Unit unit) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be >= 0");
        }
        if (unit == null) {
            throw new IllegalArgumentException("Unit must not be null");
        }

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
