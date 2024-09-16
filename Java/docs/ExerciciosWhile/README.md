
# Exercícios de Estrutura de Repetição `while` em Java

## Exemplo 1: Laço `while` para contar até 10

```java
public class ContarAteDez {
    public static void main(String[] args) {
        // Passo 1: Declarar uma variável inteira chamada "contador" e inicializá-la com o valor 1.

        // Passo 2: Iniciar a estrutura `while`. Coloque uma condição que mantenha o loop enquanto o contador for menor ou igual a 10.

        while (/* condição */) {
            // Passo 3: Dentro do bloco, imprima o valor atual do contador.

            // Passo 4: Incremente a variável contador para evitar um loop infinito.
        }
    }
}
```

---

## Exemplo 2: Somando números inteiros de 1 a N

```java
import java.util.Scanner;

public class SomarNumeros {
    public static void main(String[] args) {
        // Passo 1: Criar um Scanner para capturar a entrada do usuário, pedindo um número inteiro N.

        // Passo 2: Declarar as variáveis necessárias, como "soma" para armazenar o resultado, e "contador" para controlar o loop.

        // Passo 3: Iniciar a estrutura `while`, utilizando o valor de "contador" como base para a condição de repetição.

        while (/* condição */) {
            // Passo 4: Dentro do loop, adicione o valor atual de "contador" à variável "soma".

            // Passo 5: Não se esqueça de incrementar o contador a cada iteração.
        }

        // Passo 6: Ao final do loop, imprima o valor total da soma.
    }
}
```

---

## Exemplo 3: Lendo números até que um valor negativo seja inserido

```java
import java.util.Scanner;

public class LeituraDeNumeros {
    public static void main(String[] args) {
        // Passo 1: Criar um Scanner para capturar a entrada do usuário.

        // Passo 2: Declarar uma variável para armazenar o número inserido pelo usuário.

        // Passo 3: Iniciar o loop `while` com uma condição que permita que o loop continue até que um número negativo seja digitado.

        while (/* condição */) {
            // Passo 4: Dentro do loop, leia o número inserido pelo usuário.

            // Passo 5: Exiba o número lido.

            // Passo 6: Atualize a condição de repetição com o novo número inserido.
        }

        // Passo 7: Quando o loop encerrar, imprima uma mensagem indicando que o programa foi finalizado.
    }
}
```
