package com.github.rickmvi.chainofresponsability.otherchallenge.service.internal;

import com.github.rickmvi.chainofresponsability.otherchallenge.service.DiscountHandler;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class CEODiscount extends DiscountHandler {
    @Override
    public BigDecimal calculate(@NotNull BigDecimal amount) {
        if (amount.compareTo(new BigDecimal("100000")) > 0) {
            return amount.multiply(new BigDecimal("0.25"));
        }

        return next(amount);
    }
}
