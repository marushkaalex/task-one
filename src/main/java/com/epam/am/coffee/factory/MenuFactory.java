package com.epam.am.coffee.factory;

import com.epam.am.coffee.model.Drink;
import com.epam.am.coffee.model.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuFactory {
    public static Menu createMockMenu() {
        Menu result = new Menu();

        List<Drink> drinkList = new ArrayList<>();
        drinkList.add(DrinkFactory.getDrink("Espresso"));
        drinkList.add(DrinkFactory.getDrink("Espresso Macchiato"));
        drinkList.add(DrinkFactory.getDrink("Latte"));
        drinkList.add(DrinkFactory.getDrink("Flat White"));
        drinkList.add(DrinkFactory.getDrink("Mocha"));

        result.setDrinkList(drinkList);
        return result;
    }
}
