package com.github.rickmvi.strategy.challenge.business.internal;

import com.github.rickmvi.strategy.challenge.business.PaymentStrategy;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * A concrete implementation of the {@link PaymentStrategy} interface that processes payments using the boleto method.
 * This strategy applies a transaction fee of 2% to the calculated amount.
 * <p>
 * The {@code calculate} method performs the payment calculation by reducing 2% of the original amount as a transaction fee.
 * <p>
 * This class outputs a processing message to indicate that the boleto payment method is being used.
 */
public class Boleto implements PaymentStrategy {
    @Override
    public BigDecimal calculate(@NotNull BigDecimal amount) {
        System.out.println("Processing boleto payment...");
        return amount.subtract(amount.multiply(new BigDecimal("0.02")));
    }
}
