package com.epam.am.coffee.service;

import com.epam.am.coffee.model.Drink;
import com.epam.am.coffee.model.Menu;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    private Filter() {
    }

    public static List<Drink> byPrice(List<Drink> drinkList, double min, double max) {
        return drinkList.stream()
                .filter(i -> {
                    double totalPrice = i.getTotalPrice();
                    return totalPrice >= min && totalPrice <= max;
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
