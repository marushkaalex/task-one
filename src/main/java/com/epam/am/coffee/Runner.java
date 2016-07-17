package com.epam.am.coffee;

import com.epam.am.coffee.model.Drink;
import com.epam.am.coffee.model.Menu;
import com.epam.am.coffee.service.MenuService;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.epam.am.coffee.service.MenuService.ComparingBy;

public class Runner {
    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        MenuService menuService = new MenuService();

        Menu menu = Menu.createMockMenu();
        logger.info("Created menu: {}", menu);
        menuService.sort(menu.getDrinkList(), ComparingBy.NAME);
        logger.info("Sorted by name: {}", menu);
        menuService.sort(menu.getDrinkList(), ComparingBy.PRICE);
        logger.info("Sorted by price: {}", menu);
        menuService.sort(menu.getDrinkList(), ComparingBy.AMOUNT);
        logger.info("Sorted by amount: {}", menu);

        CurrencyUnit kzt = CurrencyUnit.of("KZT");
        List<Drink> tmpDrinkList =
                menuService.filterByPrice(menu.getDrinkList(), Money.of(kzt, 50), Money.of(kzt, 200));
        logger.info("Filtered by price: {}", tmpDrinkList);
        tmpDrinkList = menuService.filterByComponentCount(menu.getDrinkList(), 3, 4);
        logger.info("Filtered by component count: {}", tmpDrinkList);
    }
}
