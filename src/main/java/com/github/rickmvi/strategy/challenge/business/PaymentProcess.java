package com.github.rickmvi.strategy.challenge.business;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * Represents a payment processing mechanism that utilizes a strategy pattern.
 * A {@link PaymentStrategy} must be set to define how the payment amount should be calculated.
 */
@lombok.NoArgsConstructor(access = lombok.AccessLevel.PUBLIC)
public class PaymentProcess {
    @lombok.Setter(value = lombok.AccessLevel.PUBLIC)
    private PaymentStrategy paymentStrategy;

    public BigDecimal calculate(@NotNull BigDecimal amount) {
        return paymentStrategy.calculate(amount);
    }
}
