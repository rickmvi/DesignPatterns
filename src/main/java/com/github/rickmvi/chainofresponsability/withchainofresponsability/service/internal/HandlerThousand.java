package com.github.rickmvi.chainofresponsability.withchainofresponsability.service.internal;

import com.github.rickmvi.chainofresponsability.withchainofresponsability.service.DiscountHandler;

public class HandlerThousand extends DiscountHandler {

    @Override
    public double calculate(double amount) {
        if (amount > 1000) return amount * 0.10;

        return next(amount);
    }
}
