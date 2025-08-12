package com.github.rickmvi.strategy.challenge;

import com.github.rickmvi.strategy.challenge.business.PaymentProcess;
import com.github.rickmvi.strategy.challenge.business.PaymentStrategy;
import com.github.rickmvi.strategy.challenge.business.internal.Boleto;
import com.github.rickmvi.strategy.challenge.business.internal.CreditCard;
import com.github.rickmvi.strategy.challenge.business.internal.Pix;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcess paymentProcess = new PaymentProcess();

        System.out.println("Enter with payment amount: ");
        BigDecimal amount = scanner.nextBigDecimal();

        menu();
        int paymentMethod = scanner.nextInt();
        scanner.nextLine();

        var payment = processPayment(paymentMethod);
        paymentProcess.setPaymentStrategy(payment);

        BigDecimal result = paymentProcess.calculate(amount);
        System.out.println("Payment result: " + result);
    }

    private static @NotNull PaymentStrategy processPayment(int paymentMethod) {
        return switch (paymentMethod) {
            case 1 -> new CreditCard();
            case 2 -> new Boleto();
            case 3 -> new Pix();
            default -> throw new IllegalArgumentException("Invalid payment method");
        };
    }

    private static void menu() {
        System.out.println("""
                Choice payment method:
                1- Credit Card
                2- Boleto
                3- Pix
                """);
    }
}
