# 💻 Desafio – Refatorando para Strategy Pattern
___
### Código inicial (antes da refatoração):

```java
package com.example.payment;

import java.math.BigDecimal;

public class PaymentProcessor {

    public BigDecimal processPayment(BigDecimal amount, String method) {
        if ("PIX".equalsIgnoreCase(method)) {
            System.out.println("Processing PIX payment...");
            return amount.subtract(amount.multiply(new BigDecimal("0.00"))); // Sem taxa
        } else if ("CREDIT_CARD".equalsIgnoreCase(method)) {
            System.out.println("Processing Credit Card payment...");
            return amount.subtract(amount.multiply(new BigDecimal("0.05"))); // 5% de taxa
        } else if ("BOLETO".equalsIgnoreCase(method)) {
            System.out.println("Processing Boleto payment...");
            return amount.subtract(amount.multiply(new BigDecimal("0.02"))); // 2% de taxa
        } else {
            throw new IllegalArgumentException("Invalid payment method");
        }
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        BigDecimal finalAmount = processor.processPayment(new BigDecimal("1000"), "CREDIT_CARD");
        System.out.println("Final amount: " + finalAmount);
    }
}
```
___
### 🎯 Objetivo da refatoração

1. Criar uma **interface** `PaymentStrategy` com o método:

```java
BigDecimal pay(BigDecimal amount);
```

2. Criar **uma classe para cada forma de pagamento** (`PixPayment`, `CreditCardPayment`, `BoletoPayment`), cada uma implementando a lógica de desconto/taxa.

3. Criar uma classe `PaymentProcessor` que recebe a strategy e executa o pagamento.

4. No main, escolher a implementação de forma flexível.
___
### 📝 Regras

- O código final **não pode** ter `if` ou `switch` na lógica principal.

- Cada forma de pagamento deve estar em **sua própria classe**.

- O código deve permitir **adicionar novas formas de pagamento** sem alterar as classes existentes.