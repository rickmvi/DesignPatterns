package com.github.rickmvi.chainofresponsability.withchainofresponsability.service;

import org.jetbrains.annotations.NotNull;

public abstract class DiscountHandler implements HandlerDiscountInterface{
    private HandlerDiscountInterface next;

    @Override
    public HandlerDiscountInterface setNext(@NotNull HandlerDiscountInterface next) {
        this.next = next;
        return next;
    }

    protected double next(double amount) {
        if (next == null) return 0.0;

        return next.calculate(amount);
    }
}
