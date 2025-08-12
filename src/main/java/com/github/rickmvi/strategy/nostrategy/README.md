# 📊 Calculadora de Impostos – Sem Strategy

Este é um exemplo simples em **Java** que calcula o valor de um imposto com base em um tipo especificado, **sem** utilizar o *Design Pattern* **Strategy**.  
O objetivo é demonstrar um código acoplado e pouco flexível, servindo como base para comparação com uma futura implementação usando Strategy.

---

## 📂 Estrutura do Projeto

    com.github.rickmvi.nostrategy
    ├── NoStrategy.java # Classe principal para execução
    └── tax
    └── CalculatorTax.java # Lógica de cálculo de impostos usando switch-case


---

## 🚀 Como funciona

A classe `CalculatorTax` recebe um valor (`amount`) e o tipo do imposto (`taxType`), e retorna o **valor do imposto** calculado de acordo com uma alíquota pré-definida:

- **INSS** → 10%
- **ISS** → 6%
- **ICMS** → 18%
- **IPI** → 15%
- Qualquer outro → 0%

Exemplo de funcionamento:

```java
var taxType = "ISS"; // Tipo do imposto
CalculatorTax calculatorTax = new CalculatorTax();
BigDecimal result = calculatorTax.calculateTax(new BigDecimal("1000"), taxType);
System.out.println(result); // Saída: 60.00
```
---
**🖥 Execução**

1. Compile o projeto:

       javac -d out $(find src -name "*.java")

2. Execute a classe principal:

       java -cp out com.github.rickmvi.nostrategy.NoStrategy

Saída esperada:

    No Strategy
    60.00

___

**⚠ Limitações da Abordagem**

* **Alto acoplamento**: a lógica de cálculo de todos os impostos está centralizada em um único switch.

* **Baixa extensibilidade**: para adicionar um novo imposto, é preciso alterar o código da CalculatorTax.

* **Violação do Open/Closed Principle**: a classe não está aberta para extensão sem modificação.
