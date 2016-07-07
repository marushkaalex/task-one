package com.epam.am.coffee.factory;

import com.epam.am.coffee.model.Coffee;
import com.epam.am.coffee.model.Component;
import com.epam.am.coffee.model.Quantity;

import java.util.HashMap;
import java.util.Map;

public class ComponentFactory {
    private static Map<String, Component> componentMap = new HashMap<>();

    static {
        componentMap.put("Espresso", new Coffee("Espresso", 100, 50, Quantity.MILLILITER, CoffeeSortFactory.getSort("Arabica")));
        componentMap.put("Milk Foam", new Component("Milk Foam", 30, 10, Quantity.MILLILITER));
        componentMap.put("Whipped Cream", new Component("Whipped Cream", 30, 10, Quantity.MILLILITER));
        componentMap.put("Steamed Milk", new Component("Steamed Milk", 50, 70, Quantity.MILLILITER));
        componentMap.put("Hot Water", new Component("Hot Water", 10, 70, Quantity.MILLILITER));
        componentMap.put("Milk", new Component("Milk", 20, 60, Quantity.MILLILITER));
        componentMap.put("Sugar", new Component("Sugar", 5, 10, Quantity.GRAM));
        componentMap.put("Chocolate Syrup", new Component("Chocolate Syrup", 25, 30, Quantity.MILLILITER));
    }

    private ComponentFactory() {
    }

    public static Component getComponent(String id) {
        return componentMap.get(id);
    }
}
