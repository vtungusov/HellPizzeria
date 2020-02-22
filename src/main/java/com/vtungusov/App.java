package com.vtungusov;

import com.vtungusov.domain.Product;
import com.vtungusov.domain.pie.PieType;
import com.vtungusov.domain.pizza.PizzaSize;
import com.vtungusov.domain.pizza.PizzaType;
import com.vtungusov.store.SimpleStore;
import com.vtungusov.store.Store;
import com.vtungusov.store.order.Order;
import com.vtungusov.store.order.PieOrder;
import com.vtungusov.store.order.PizzaOrder;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Store store = new SimpleStore();
        Order order = new Order(Arrays.asList(
                new PizzaOrder(PizzaType.CHEESE, PizzaSize.LARGE),
                new PizzaOrder(PizzaType.PEPPERONI, PizzaSize.MEDIUM),
                new PizzaOrder(PizzaType.PEPPERONI, PizzaSize.SMALL),
                new PieOrder(PieType.MEAT),
                new PieOrder(PieType.FISH)
        ));

        List<Product> products = store.makeOrder(order);
        printResult(products);
    }

    private static void printResult(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
