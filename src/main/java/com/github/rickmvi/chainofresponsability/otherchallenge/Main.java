package com.github.rickmvi.chainofresponsability.otherchallenge;

import com.github.rickmvi.chainofresponsability.otherchallenge.service.DiscountInterface;
import com.github.rickmvi.chainofresponsability.otherchallenge.service.internal.CEODiscount;
import com.github.rickmvi.chainofresponsability.otherchallenge.service.internal.DirectorDiscount;
import com.github.rickmvi.chainofresponsability.otherchallenge.service.internal.ManagerDiscount;
import com.github.rickmvi.chainofresponsability.otherchallenge.service.internal.RejectedHandler;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        DiscountInterface discountInterface = new ManagerDiscount();
        discountInterface.setNext(new DirectorDiscount())
                .setNext(new CEODiscount())
                .setNext(new RejectedHandler());

        System.out.println("Discount: " + discountInterface.calculate(BigDecimal.valueOf(999)));
    }
}
