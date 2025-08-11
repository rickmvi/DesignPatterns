# 📊 Calculadora de Impostos – Usando Strategy Pattern

Este projeto implementa uma **calculadora de impostos** em **Java** aplicando o *Design Pattern* **Strategy**, permitindo adicionar novos tipos de impostos sem modificar o código existente da lógica principal.

O código é uma evolução da versão [**No Strategy**](../nostrategy) e corrige problemas de **acoplamento** e **baixa extensibilidade**.

---

## 📂 Estrutura do Projeto

    com.github.rickmvi.strategy
    ├── Context.java # Classe principal de execução
    └── tax
    ├── CalculateTax.java # Classe que executa o cálculo usando a Strategy escolhida
    ├── InterfaceTaxType.java # Interface funcional que define o contrato de cálculo
    └── internal
    ├── INSS.java # Implementação do cálculo de INSS
    ├── ISS.java # Implementação do cálculo de ISS
    ├── ICMS.java # Implementação do cálculo de ICMS
    └── IPI.java # Implementação do cálculo de IPI


---

## 🚀 Como funciona

O **Strategy Pattern** permite definir uma **família de algoritmos** (neste caso, cálculos de impostos), encapsulá-los e torná-los intercambiáveis em tempo de execução.

Fluxo:
1. O usuário escolhe um *método de pagamento* ou tipo de imposto.
2. O `Context` instancia a implementação correta de `InterfaceTaxType`.
3. A classe `CalculateTax` executa o cálculo chamando o método `calculate()` da Strategy escolhida.

---

### Exemplo de Uso

```java
CalculateTax calculateTax = new CalculateTax();
var paymentMethod = 1;

var taxType = switch (paymentMethod) {
  case 1 -> new INSS();
  case 2 -> new ISS();
  case 3 -> new IPI();
  case 4 -> new ICMS();
  default -> throw new IllegalArgumentException("Invalid payment method");
};

calculateTax.setTaxType(taxType);
BigDecimal result = calculateTax.calculate(new BigDecimal("1000"));

System.out.println(result);
```

Saída esperada (para `ISS`):

    60.00
___
### 🛠 Adicionando um Novo Imposto

Para adicionar um novo imposto:

1. Criar uma nova classe que implemente `InterfaceTaxType`.

2. Implementar o método `calculate` com a fórmula do imposto.

3. Atualizar o `switch` no `Context` para incluir a nova opção.

Exemplo:

```java
import org.jetbrains.annotations.NotNull;

public class PIS implements InterfaceTaxType {
    @Override
    public BigDecimal calculate(@NotNull BigDecimal amount) {
        return amount.multiply(new BigDecimal("0.0165")); // 1,65%
    }
}
```
___
### 📌 Vantagens do Strategy Pattern

* **Baixo acoplamento**: cada imposto tem sua própria classe.

* **Alta extensibilidade**: novos impostos podem ser adicionados sem alterar código existente.

* **Código mais limpo**: elimina `switch` ou `if-else` gigantescos.
___
### 🖥 Execução

1. Compile o projeto:

        javac -d out $(find src -name "*.java")

2. Execute a classe principal:

        java -cp out com.github.rickmvi.strategy.Context
___
### 📚 Comparação com a versão "No Strategy"
| Critério            | No Strategy | Strategy Pattern |
|---------------------|-------------|------------------|
| Acoplamento         | Alto        | Baixo            |
| Extensibilidade     | Baixa       | Alta             |
| Facilidade de teste | Baixa       | Alta             |
| Reuso de código     | Baixo       | Alto             |