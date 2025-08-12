package com.github.rickmvi.chainofresponsability.otherchallenge.service.internal;

import com.github.rickmvi.chainofresponsability.otherchallenge.service.DiscountHandler;

import java.math.BigDecimal;

public class RejectedHandler extends DiscountHandler {
    @Override
    public BigDecimal calculate(BigDecimal amount) {
        if (amount == null) return new BigDecimal("0.0");

        return BigDecimal.ZERO;
    }
}
