package com.vtungusov.store.money;

import com.vtungusov.domain.pie.PieType;
import com.vtungusov.domain.pizza.PizzaSize;
import com.vtungusov.domain.pizza.PizzaType;
import com.vtungusov.store.order.Order;
import com.vtungusov.store.order.PieOrder;
import com.vtungusov.store.order.PizzaOrder;
import com.vtungusov.store.order.ProductOrder;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CashBox {
    Map<ProductOrder, BigInteger> prices;
    Money money;

    public CashBox(MoneyType moneyType) {
        money = new Money(moneyType);

        prices = new HashMap<>();
        prices.put(new PieOrder(PieType.FISH), BigInteger.valueOf(450));
        prices.put(new PieOrder(PieType.MEAT), BigInteger.valueOf(420));
        prices.put(new PizzaOrder(PizzaType.PEPPERONI, PizzaSize.LARGE), BigInteger.valueOf(400));
        prices.put(new PizzaOrder(PizzaType.CHEESE, PizzaSize.LARGE), BigInteger.valueOf(350));
    }

    public void addPrice(ProductOrder productOrder, BigInteger price) {
        prices.put(productOrder, price);
    }

    public Money getInvoice(Order order) {
        List<ProductOrder> productOrders = order.getProductOrders();

        for (ProductOrder productOrder : productOrders) {
            money.add(prices.getOrDefault(productOrder, BigInteger.valueOf(0)));
        }
        return money;
    }
}
