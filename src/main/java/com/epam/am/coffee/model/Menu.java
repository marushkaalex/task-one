package com.epam.am.coffee.model;

import java.util.List;

public class Menu extends BaseModel {
    private List<Drink> drinkList;

    public Menu() {
    }

    public Menu(List<Drink> drinkList) {
        this.drinkList = drinkList;
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
