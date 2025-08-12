package com.github.rickmvi.strategy.withstrategy.tax;

import java.math.BigDecimal;

@FunctionalInterface
public interface InterfaceTaxType {
    BigDecimal calculate(BigDecimal amount);
}
