package com.github.rickmvi.strategy.challenge.business.internal;

import com.github.rickmvi.strategy.challenge.business.PaymentStrategy;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * A concrete implementation of the {@link PaymentStrategy} interface that processes payments using a credit card.
 * This strategy applies a transaction fee of 5% to the calculated amount.
 * <p>
 * The {@code calculate} method is responsible for performing the payment calculation,
 * applying a reduction equivalent to 5% of the original amount as a fee.
 * <p>
 * This class outputs a processing message to indicate that the credit card payment method is being used.
 */
public class CreditCard implements PaymentStrategy {
    @Override
    public BigDecimal calculate(@NotNull BigDecimal amount) {
        System.out.println("Processing credit card payment...");
        return amount.subtract(amount.multiply(new BigDecimal("0.05")));
    }
}
