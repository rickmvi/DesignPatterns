package com.github.rickmvi.strategy.tax;

import java.math.BigDecimal;

@FunctionalInterface
public interface InterfaceTaxType {
    BigDecimal calculate(BigDecimal amount);
}
