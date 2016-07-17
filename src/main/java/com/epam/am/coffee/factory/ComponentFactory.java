package com.epam.am.coffee.factory;

import com.epam.am.coffee.model.Coffee;
import com.epam.am.coffee.model.Component;
import com.epam.am.coffee.model.QuantityUnit;
import com.epam.am.coffee.model.Unit;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.util.HashMap;
import java.util.Map;

public class ComponentFactory {
    private static Map<String, Component> componentMap = new HashMap<>();

    static {
        CurrencyUnit kzt = CurrencyUnit.getInstance("KZT");
        componentMap.put("Espresso", new Coffee("Espresso", Money.of(kzt, 100), new QuantityUnit(50, Unit.MILLILITER), CoffeeSortFactory.getSort("Arabica")));
        componentMap.put("Milk Foam", new Component("Milk Foam", Money.of(kzt, 30), new QuantityUnit(10, Unit.MILLILITER)));
        componentMap.put("Whipped Cream", new Component("Whipped Cream", Money.of(kzt, 30), new QuantityUnit(10, Unit.MILLILITER)));
        componentMap.put("Steamed Milk", new Component("Steamed Milk", Money.of(kzt, 50), new QuantityUnit(70, Unit.MILLILITER)));
        componentMap.put("Hot Water", new Component("Hot Water", Money.of(kzt, 10), new QuantityUnit(70, Unit.MILLILITER)));
        componentMap.put("Milk", new Component("Milk", Money.of(kzt, 20), new QuantityUnit(60, Unit.MILLILITER)));
        componentMap.put("Sugar", new Component("Sugar", Money.of(kzt, 5), new QuantityUnit(10, Unit.GRAM)));
        componentMap.put("Chocolate Syrup", new Component("Chocolate Syrup", Money.of(kzt, 25), new QuantityUnit(30, Unit.MILLILITER)));
    }

    private ComponentFactory() {
    }

    public static Component getComponent(String id) {
        return componentMap.get(id);
    }
}
