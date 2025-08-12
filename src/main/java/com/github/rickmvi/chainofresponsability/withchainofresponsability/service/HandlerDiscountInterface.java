package com.github.rickmvi.chainofresponsability.withchainofresponsability.service;

import org.jetbrains.annotations.NotNull;

public interface HandlerDiscountInterface {
    double calculate(double amount);
    HandlerDiscountInterface setNext(@NotNull HandlerDiscountInterface next);
}
