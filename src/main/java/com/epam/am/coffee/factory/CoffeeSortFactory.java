package com.epam.am.coffee.factory;

import com.epam.am.coffee.model.CoffeeSort;

import java.util.HashMap;
import java.util.Map;

public class CoffeeSortFactory {
    private static Map<String, CoffeeSort> sortMap = new HashMap<>();

    static {
        sortMap.put("Arabica", new CoffeeSort("Arabica", "Arabica description"));
        sortMap.put("Robusta", new CoffeeSort("Robusta", "Robusta description"));
    }

    private CoffeeSortFactory() {
    }

    public static CoffeeSort getSort(String id) {
        return sortMap.get(id);
    }
}
