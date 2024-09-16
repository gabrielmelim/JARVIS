
# Estrutura de Repetição `while` em Java

<div align="left">
  <img src="" alt="java" width="50%">
</div>

## Introdução

Nesta aula, vamos aprender sobre a estrutura de repetição `while` em Java. A estrutura `while` permite que um bloco de código seja executado repetidamente, enquanto uma condição for verdadeira. É amplamente utilizada quando não se sabe o número exato de repetições que o programa deve realizar.

## Sintaxe Básica

<div align="left">
  <img src="" alt="java" width="50%">
</div>

A sintaxe da estrutura `while` é simples e segue o seguinte formato:

```java
while (condição) {
    // Código a ser executado repetidamente
}
```

- **condição**: Uma expressão booleana que será avaliada antes de cada iteração. Enquanto a condição for verdadeira, o bloco de código dentro do `while` será executado.
- **bloco de código**: Instruções que serão repetidas enquanto a condição for verdadeira.

## Exemplo Simples

Vamos ver um exemplo prático que imprime números de 1 a 5.

```java
public class ExemploWhile {
    public static void main(String[] args) {
        int contador = 1;
        
        // Estrutura while
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++; // Incremento para evitar loop infinito
        }
    }
}
```

### Explicação do Código

1. **Variável contador**: Inicializamos a variável `contador` com valor 1.
2. **Condição `contador <= 5`**: O laço `while` continuará executando enquanto a condição for verdadeira (enquanto `contador` for menor ou igual a 5).
3. **Incremento `contador++`**: A cada iteração, incrementamos o valor de `contador`. Isso é crucial para evitar loops infinitos.

## Cuidados com o `while`

Ao usar o `while`, é importante garantir que a condição de parada seja alcançada em algum momento, caso contrário, o programa entrará em um **loop infinito**, ou seja, a repetição nunca terminará.

Exemplo de loop infinito:

```java
int contador = 1;
while (contador <= 5) {
    System.out.println("Contador: " + contador);
    // Esquecemos de incrementar o contador, resultando em loop infinito
}
```

## Exemplo Prático 2: Soma de Números Positivos

Agora, vamos ver um exemplo mais avançado: um programa que soma números positivos até que o usuário insira um número negativo.

```java
import java.util.Scanner;

public class SomaPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        // Loop while que continua até que um número negativo seja inserido
        while (true) {
            System.out.println("Digite um número (negativo para sair): ");
            numero = scanner.nextInt();
            
            if (numero < 0) {
                break; // Interrompe o loop se o número for negativo
            }
            soma += numero; // Adiciona o número à soma
        }

        System.out.println("A soma dos números positivos é: " + soma);
    }
}
```

### Explicação do Código

1. **Loop Infinito**: Utilizamos `while (true)` para criar um loop infinito. Este será interrompido pela instrução `break` quando um número negativo for inserido.
2. **Entrada do Usuário**: O usuário insere números repetidamente até inserir um número negativo.
3. **Instrução `break`**: Se o número inserido for negativo, o loop é interrompido.
4. **Soma dos Números**: A cada iteração, o número inserido é adicionado à variável `soma`.

## Conclusão

A estrutura de repetição `while` é uma ferramenta essencial em Java, permitindo executar blocos de código repetidamente até que uma condição seja satisfeita. Certifique-se sempre de que a condição seja bem formulada para evitar loops infinitos.

Pratique criando seus próprios exemplos para reforçar o entendimento.

---
