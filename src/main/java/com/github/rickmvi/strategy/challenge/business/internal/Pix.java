package com.github.rickmvi.strategy.challenge.business.internal;

import com.github.rickmvi.strategy.challenge.business.PaymentStrategy;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * A concrete implementation of the {@link PaymentStrategy} interface that processes payments using the Pix method.
 * In the context of this strategy, no transaction fee is applied to the calculated amount.
 *
 * The {@code calculate} method is responsible for performing the calculation of the payment amount by applying
 * the specific rules of the Pix payment method.
 *
 * This class outputs a processing message to indicate that the Pix payment method is being used.
 */
public class Pix implements PaymentStrategy {
    @Override
    public BigDecimal calculate(@NotNull BigDecimal amount) {
        System.out.println("Processing pix payment...");
        return amount.subtract(amount.multiply(new BigDecimal("0.00")));
    }
}
