package com.github.rickmvi.strategy.withstrategy;

import com.github.rickmvi.strategy.withstrategy.tax.InterfaceTaxType;
import com.github.rickmvi.strategy.withstrategy.tax.internal.ICMS;
import com.github.rickmvi.strategy.withstrategy.tax.internal.INSS;
import com.github.rickmvi.strategy.withstrategy.tax.internal.IPI;
import com.github.rickmvi.strategy.withstrategy.tax.internal.ISS;

import java.util.Map;
import java.util.function.Supplier;

public class TaxFactory {
    private static final Map<Integer, Supplier<InterfaceTaxType>> texType =
            Map.of(
                    1, INSS::new,
                    2, ISS::new,
                    3, IPI::new,
                    4, ICMS::new
            );

    public static InterfaceTaxType getTaxType(int type) {
        Supplier<InterfaceTaxType> supplier = texType.get(type);
        if (supplier == null)
            throw new IllegalArgumentException("Invalid payment method");

        return supplier.get();
    }
}
