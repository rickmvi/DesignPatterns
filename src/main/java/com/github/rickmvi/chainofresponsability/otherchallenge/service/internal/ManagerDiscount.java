package com.github.rickmvi.chainofresponsability.otherchallenge.service.internal;


import com.github.rickmvi.chainofresponsability.otherchallenge.service.DiscountHandler;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class ManagerDiscount extends DiscountHandler {

    @Override
    public BigDecimal calculate(@NotNull BigDecimal amount) {
        if (amount.compareTo(new BigDecimal("1000")) >= 0) {
            return amount.multiply(new BigDecimal("0.05"));
        }

        return next(amount);
    }
}
