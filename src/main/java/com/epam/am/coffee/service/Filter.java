package com.epam.am.coffee.service;

import com.epam.am.coffee.model.Drink;
import com.epam.am.coffee.model.Menu;
import org.joda.money.Money;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    private Filter() {
    }

    public static List<Drink> byPrice(List<Drink> drinkList, Money min, Money max) {
        return drinkList.stream()
                .filter(i -> {
                    Money totalPrice = i.getTotalPrice();
                    return totalPrice.isGreaterThan(min)&& totalPrice.isLessThan(max);
                })
                .collect(Collectors.toList());
    }

    public static List<Drink> byComponentCount(List<Drink> drinkList, int min, int max) {
        return drinkList.stream()
                .filter(i -> {
                    int size = i.getComponentList().size();
                    return size >= min && size <= max;
                })
                .collect(Collectors.toList());
    }
}
