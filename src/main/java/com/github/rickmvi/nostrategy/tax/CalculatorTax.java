package com.github.rickmvi.nostrategy.tax;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class CalculatorTax {

    public BigDecimal calculateTax(BigDecimal amount, @NotNull String taxType) {
        switch (taxType.toUpperCase()) {
            case "INSS" -> {
                return amount.multiply(new BigDecimal("0.10")); // 10%
            }
            case "ISS" -> {
                return amount.multiply(new BigDecimal("0.06")); // 6%
            }
            case "ICMS" -> {
                return amount.multiply(new BigDecimal("0.18")); // 18%
            }
            case "IPI" -> {
                return amount.multiply(new BigDecimal("0.15")); // 15%
            }
            default -> {
                return BigDecimal.ZERO;
            }
        }
    }
}