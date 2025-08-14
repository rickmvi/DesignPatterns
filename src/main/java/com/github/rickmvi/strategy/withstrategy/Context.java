package com.github.rickmvi.strategy.withstrategy;

import com.github.rickmvi.strategy.withstrategy.tax.CalculateTax;

import java.math.BigDecimal;

public class Context {
    public static void main(String[] args) {
        CalculateTax calculateTax = new CalculateTax();
        int paymentMethod = 1;

        var taxType = TaxFactory.getTaxType(paymentMethod);

        calculateTax.setTaxType(taxType);
        BigDecimal result = calculateTax.calculate(new BigDecimal("1000"));

        System.out.println(result);
    }
}
