package com.github.rickmvi.strategy.withstrategy.tax.internal;

import com.github.rickmvi.strategy.withstrategy.tax.InterfaceTaxType;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class INSS implements InterfaceTaxType {
    @Override
    public BigDecimal calculate(@NotNull BigDecimal amount) {
        return amount.multiply(new BigDecimal("0.10"));
    }
}
