package com.github.rickmvi.chainofresponsability.nochainofresponsability;

import com.github.rickmvi.chainofresponsability.nochainofresponsability.service.Discount;

public class Main {
    public static void main(String[] args) {
        Discount calculator = new Discount();

        double discount1 = calculator.calculate(1200);
        double discount2 = calculator.calculate(600);
        double discount3 = calculator.calculate(80);

        System.out.println("Desconto 1: " + discount1);
        System.out.println("Desconto 2: " + discount2);
        System.out.println("Desconto 3: " + discount3);
    }
}
