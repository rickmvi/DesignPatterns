package com.github.rickmvi.chainofresponsability.withchainofresponsability.service.internal;

import com.github.rickmvi.chainofresponsability.withchainofresponsability.service.DiscountHandler;

public class HandlerOneHundred extends DiscountHandler {

    @Override
    public double calculate(double amount) {
        if (amount > 100) return amount * 0.10;

        return next(amount);
    }
}
