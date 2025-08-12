package com.github.rickmvi.chainofresponsability.otherchallenge.service.internal;

import com.github.rickmvi.chainofresponsability.otherchallenge.service.DiscountHandler;

import java.math.BigDecimal;

public class DirectorDiscount extends DiscountHandler {
    @Override
    public BigDecimal calculate(BigDecimal amount) {
        if (amount.compareTo(new BigDecimal("10000")) > 0) {
            return amount.multiply(new BigDecimal("0.15"));
        }

        return next(amount);
    }
}
