package com.epam.am.coffee;

import com.epam.am.coffee.factory.DrinkFactory;
import com.epam.am.coffee.model.Drink;

public class Runner {
    public static void main(String[] args) {
        Drink drink = DrinkFactory.getDrink("Espresso Macchiato");
        System.out.println(drink);
    }
}
