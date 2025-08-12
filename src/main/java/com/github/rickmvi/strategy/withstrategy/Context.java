package com.github.rickmvi.strategy.withstrategy;

import com.github.rickmvi.strategy.withstrategy.tax.CalculateTax;
import com.github.rickmvi.strategy.withstrategy.tax.internal.ICMS;
import com.github.rickmvi.strategy.withstrategy.tax.internal.INSS;
import com.github.rickmvi.strategy.withstrategy.tax.internal.IPI;
import com.github.rickmvi.strategy.withstrategy.tax.internal.ISS;

import java.math.BigDecimal;

public class Context {
    public static void main(String[] args) {
        CalculateTax calculateTax = new CalculateTax();
        var paymentMethod = 1;

        var taxType = switch (paymentMethod) {
          case 1 -> new INSS();
          case 2 -> new ISS();
          case 3 -> new IPI();
          case 4 -> new ICMS();
          default -> throw new IllegalArgumentException("Invalid payment method");
        };

        calculateTax.setTaxType(taxType);
        BigDecimal result = calculateTax.calculate(new BigDecimal("1000"));

        System.out.println(result);
    }
}
