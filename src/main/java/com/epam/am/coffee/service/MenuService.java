package com.epam.am.coffee.service;

import com.epam.am.coffee.model.Drink;
import org.joda.money.Money;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MenuService {
    public List<Drink> filterByPrice(List<Drink> drinkList, Money min, Money max) {
        return drinkList.stream()
                .filter(i -> {
                    Money totalPrice = i.getTotalPrice();
                    return totalPrice.isGreaterThan(min)&& totalPrice.isLessThan(max);
                })
                .collect(Collectors.toList());
    }

    public List<Drink> filterByComponentCount(List<Drink> drinkList, int min, int max) {
        return drinkList.stream()
                .filter(i -> {
                    int size = i.getComponentList().size();
                    return size >= min && size <= max;
                })
                .collect(Collectors.toList());
    }

    public void sort(List<Drink> drinkList, Comparator<Drink> comparator) {
        Collections.sort(drinkList, comparator);
    }

    public static class ComparingBy {
        public static final Comparator<Drink> NAME = (lhs, rhs) -> lhs.getName().compareTo(rhs.getName());

        public static final Comparator<Drink> PRICE =
                (lhs, rhs) -> lhs.getTotalPrice().compareTo(rhs.getTotalPrice());

        public static final Comparator<Drink> AMOUNT =
                (lhs, rhs) -> Double.compare(lhs.getTotalAmount(), rhs.getTotalAmount());
    }
}
