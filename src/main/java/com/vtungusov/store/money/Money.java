package com.vtungusov.store.money;

import java.math.BigInteger;

public class Money {
    MoneyType moneyType;
    BigInteger amount;

    public Money(MoneyType moneyType) {
        this.moneyType = moneyType;
        this.amount = BigInteger.valueOf(0);
    }

    void add(BigInteger amount) {
        if (!amount.equals(BigInteger.valueOf(0))) {
            BigInteger convert = amount.divide(moneyType.getRate());
            this.amount = this.amount.add(convert);
        }
    }

    @Override
    public String toString() {
        return "Money: " + amount + " " + moneyType;
    }
}
