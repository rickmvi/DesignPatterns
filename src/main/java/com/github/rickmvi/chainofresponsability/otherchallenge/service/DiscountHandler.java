package com.github.rickmvi.chainofresponsability.otherchallenge.service;

import java.math.BigDecimal;

public abstract class DiscountHandler implements DiscountInterface {
    private DiscountInterface next;

    @Override
    public DiscountInterface setNext(DiscountInterface next) {
        this.next = next;
        return next;
    }

    protected BigDecimal next(BigDecimal amount) {
        if (amount == null) return new BigDecimal("0.0");

        return next.calculate(amount);
    }
}
