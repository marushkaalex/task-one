package com.epam.am.coffee.model;

import com.epam.am.coffee.factory.DrinkFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu extends BaseModel {
    private List<Drink> drinkList;

    public Menu() {
    }

    public Menu(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

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

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "drinkList=" + drinkList +
                '}';
    }
}
