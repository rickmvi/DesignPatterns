package com.github.rickmvi.strategy.tax.internal;

import com.github.rickmvi.strategy.tax.InterfaceTaxType;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class ISS implements InterfaceTaxType {
    @Override
    public BigDecimal calculate(@NotNull BigDecimal amount) {
        return amount.multiply(new BigDecimal("0.06"));
    }
}
