package com.epam.am.coffee.model;

public class Component {
    private String name;
    private double price;
    private double amount;
    private Quantity quantity;

    public Component() {
    }

    public Component(String name, double price, double amount, Quantity quantity) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", quantity=" + quantity +
                '}';
    }
}
