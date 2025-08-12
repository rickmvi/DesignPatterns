package com.github.rickmvi.strategy.withstrategy.tax;

import java.math.BigDecimal;

public class CalculateTax {

    @lombok.Setter(value = lombok.AccessLevel.PUBLIC)
    private InterfaceTaxType taxType;

    public BigDecimal calculate(BigDecimal amount) {
        return taxType.calculate(amount);
    }
}
