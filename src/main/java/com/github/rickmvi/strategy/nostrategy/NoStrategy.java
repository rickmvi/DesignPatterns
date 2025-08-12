package com.github.rickmvi.strategy.nostrategy;

import com.github.rickmvi.strategy.nostrategy.tax.CalculatorTax;

import java.math.BigDecimal;

public class NoStrategy {
    public static void main(String[] args) {
        System.out.println("No Strategy");
        var taxType = "ISS";

        CalculatorTax calculatorTax = new CalculatorTax();
        BigDecimal result = calculatorTax.calculateTax(new BigDecimal("1000"), taxType);
        System.out.println(result);
    }
}
