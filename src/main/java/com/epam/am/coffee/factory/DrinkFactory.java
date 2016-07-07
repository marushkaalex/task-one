package com.epam.am.coffee.factory;

import com.epam.am.coffee.model.Drink;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DrinkFactory {
    private static Map<String, Drink> drinkMap = new HashMap<>();

    static {
        drinkMap.put("Espresso", new Drink("Espresso", Arrays.asList(ComponentFactory.getComponent("Espresso"))));
        drinkMap.put("Espresso Macchiato", new Drink("Espresso Macchiato", Arrays.asList(
                ComponentFactory.getComponent("Milk Foam"),
                ComponentFactory.getComponent("Espresso")
        )));
        drinkMap.put("Latte", new Drink("Latte", Arrays.asList(
                ComponentFactory.getComponent("Milk Foam"),
                ComponentFactory.getComponent("Steamed Milk"),
                ComponentFactory.getComponent("Espresso")
        )));
        drinkMap.put("Flat White", new Drink("Flat White", Arrays.asList(
                ComponentFactory.getComponent("Steamed Milk"),
                ComponentFactory.getComponent("Espresso")
        )));
        drinkMap.put("Mocha", new Drink("Mocha", Arrays.asList(
                ComponentFactory.getComponent("Whipped Cream"),
                ComponentFactory.getComponent("Steamed Milk"),
                ComponentFactory.getComponent("Chocolate Syrup"),
                ComponentFactory.getComponent("Espresso")
        )));
    }

    private DrinkFactory() {
    }

    public static Drink getDrink(String id) {
        return drinkMap.get(id);
    }
}
