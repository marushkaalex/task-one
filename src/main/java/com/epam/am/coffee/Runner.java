package com.epam.am.coffee;

import com.epam.am.coffee.model.Drink;
import com.epam.am.coffee.model.Menu;
import com.epam.am.coffee.service.Filter;
import com.epam.am.coffee.service.Sorter;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Menu menu = Menu.createMockMenu();
        System.out.println(menu);
        Sorter.sort(menu.getDrinkList(), Sorter.BY_NAME);
        System.out.println(menu);
        Sorter.sort(menu.getDrinkList(), Sorter.BY_PRICE);
        System.out.println(menu);
        Sorter.sort(menu.getDrinkList(), Sorter.BY_AMOUNT);
        System.out.println(menu);

        List<Drink> tmpDrinkList = Filter.byPrice(menu.getDrinkList(), 50, 200);
        System.out.println(tmpDrinkList);
        tmpDrinkList = Filter.byComponentCount(menu.getDrinkList(), 3, 4);
        System.out.println(tmpDrinkList);
    }
}
