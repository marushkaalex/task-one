package com.epam.am.coffee.service;

import com.epam.am.coffee.model.Drink;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {
    public static final Comparator<Drink> BY_NAME = (lhs, rhs) -> lhs.getName().compareTo(rhs.getName());

//    public static final Comparator<Drink> BY_PRICE =
//            (lhs, rhs) -> Double.compare(lhs.getTotalPrice(), rhs.getTotalPrice());

    public static final Comparator<Drink> BY_PRICE =
            (lhs, rhs) -> lhs.getTotalPrice().compareTo(rhs.getTotalPrice());

    public static final Comparator<Drink> BY_AMOUNT =
            (lhs, rhs) -> Double.compare(lhs.getTotalAmount(), rhs.getTotalAmount());

    private Sorter() {
    }

    public static void sort(List<Drink> drinkList, Comparator<Drink> comparator) {
        Collections.sort(drinkList, comparator);
    }
}
