package com.github.rickmvi.strategy.challenge.business;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * Defines a functional interface for implementing various payment calculation strategies.
 * <p>
 * Implementers of this interface are responsible for defining the logic used to calculate
 * the payment amount based on a given input amount. This allows for the decoupling
 * of payment calculation logic, enabling flexible use of different strategies.
 * <p>
 * The primary method, {@link #calculate(BigDecimal)}, takes a non-null amount as input
 * and returns the calculated amount based on the rules defined in the implementing class.
 */
@FunctionalInterface
public interface PaymentStrategy {
    BigDecimal calculate(@NotNull BigDecimal amount);
}
