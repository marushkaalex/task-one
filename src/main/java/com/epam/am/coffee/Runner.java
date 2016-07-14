package com.epam.am.coffee;

import com.epam.am.coffee.model.Drink;
import com.epam.am.coffee.model.Menu;
import com.epam.am.coffee.service.Filter;
import com.epam.am.coffee.service.Sorter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Runner {
    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        Menu menu = Menu.createMockMenu();
        logger.info("Created menu: {}", menu);
        Sorter.sort(menu.getDrinkList(), Sorter.BY_NAME);
        logger.info("Sorted by name: {}", menu);
        Sorter.sort(menu.getDrinkList(), Sorter.BY_PRICE);
        logger.info("Sorted by price: {}", menu);
        Sorter.sort(menu.getDrinkList(), Sorter.BY_AMOUNT);
        logger.info("Sorted by amount: {}", menu);

        List<Drink> tmpDrinkList = Filter.byPrice(menu.getDrinkList(), 50, 200);
        logger.info("Filtered by price: {}", tmpDrinkList);
        tmpDrinkList = Filter.byComponentCount(menu.getDrinkList(), 3, 4);
        logger.info("Filtered by component count: {}", tmpDrinkList);
    }
}
