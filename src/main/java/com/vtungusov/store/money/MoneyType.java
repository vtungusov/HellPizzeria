package com.vtungusov.store.money;

import java.math.BigInteger;

public enum MoneyType {
    EUR(BigInteger.valueOf(69)),
    USD(BigInteger.valueOf(64)),
    RUB(BigInteger.valueOf(1));

    private BigInteger rate;

    public BigInteger getRate() {
        return rate;
    }

    MoneyType(BigInteger rate) {
        this.rate = rate;
    }
}
