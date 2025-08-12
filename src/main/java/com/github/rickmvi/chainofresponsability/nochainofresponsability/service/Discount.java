package com.github.rickmvi.chainofresponsability.nochainofresponsability.service;

public class Discount {

    public double calculate(double amount) {
        if (amount > 1000) {
            return amount * 0.10; // 10% de desconto
        } else if (amount > 500) {
            return amount * 0.05; // 5% de desconto
        } else if (amount > 100) {
            return amount * 0.02; // 2% de desconto
        } else {
            return 0.0; // sem desconto
        }
    }
}
