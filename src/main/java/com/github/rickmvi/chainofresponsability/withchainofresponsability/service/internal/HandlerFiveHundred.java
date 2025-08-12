package com.github.rickmvi.chainofresponsability.withchainofresponsability.service.internal;

import com.github.rickmvi.chainofresponsability.withchainofresponsability.service.DiscountHandler;

public class HandlerFiveHundred extends DiscountHandler {

    @Override
    public double calculate(double amount) {
        if (amount > 500) return amount * 0.05;

        return next(amount);
    }
}
