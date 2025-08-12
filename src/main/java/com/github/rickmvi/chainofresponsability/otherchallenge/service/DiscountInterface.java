package com.github.rickmvi.chainofresponsability.otherchallenge.service;

import java.math.BigDecimal;

public interface DiscountInterface {
    BigDecimal calculate(BigDecimal amount);
    DiscountInterface setNext(DiscountInterface next);
}
