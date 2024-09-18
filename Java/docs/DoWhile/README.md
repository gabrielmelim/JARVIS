#### [Clique aqui para voltar ao repositório EstruturaRepetitiva](https://github.com/gabrielmelim/JAVA/tree/EstruturaRepetitiva)
# Estrutura de Repetição: Do-While em Java

## Introdução

Em Java, a estrutura de repetição **do-while** é usada quando queremos que um bloco de código seja executado **ao menos uma vez**, independentemente da condição de controle. Após a primeira execução, a condição é verificada para determinar se o laço continua ou termina.

### Sintaxe do Do-While
<div align="left">
  <img src="" alt="java" width="50%">
</div>

A sintaxe básica de um laço `do-while` é a seguinte:

```java
do {
    // Código a ser executado
} while (condição);
```

## Funcionamento
1. **Executa o bloco de código**: O código dentro do bloco `do` será executado **pelo menos uma vez**, mesmo que a condição seja falsa.
2. **Avaliação da condição**: Após a execução do bloco, a condição é verificada.
3. **Repetição ou término**: Se a condição for **verdadeira**, o laço repete. Se for **falsa**, o laço termina e o programa continua com a próxima instrução após o laço.

### Exemplo de uso:
```java
public class ExemploDoWhile {
    public static void main(String[] args) {
        int contador = 1;

        do {
            System.out.println("Contagem: " + contador);
            contador++;
        } while (contador <= 5);
    }
}
```

### Explicação:
- O programa imprime os números de 1 a 5 na tela.
- A variável `contador` começa em 1.
- O bloco `do` executa a impressão do valor atual de `contador`, depois incrementa seu valor.
- A condição `contador <= 5` é verificada após a execução do bloco. Se a condição for verdadeira, o laço repete.

### Diferença entre `while` e `do-while`:
- **`while`**: A condição é verificada **antes** da execução do bloco de código.
- **`do-while`**: O bloco de código é executado **antes** da condição ser verificada.

### Quando usar `do-while`?
Use o laço `do-while` quando você quiser garantir que o bloco de código seja executado **pelo menos uma vez**, independentemente da condição.

## Exercício Prático

Implemente um programa que leia números do usuário e calcule a soma de todos eles até que o usuário insira um número negativo. O programa deve exibir a soma final.

### Sugestão de Solução:
```java
import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número (negativo para parar): ");
            numero = scanner.nextInt();
            
            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("A soma dos números inseridos é: " + soma);
    }
}
```

### Explicação do exercício:
- O programa utiliza um laço `do-while` para ler números do usuário.
- A soma só é atualizada se o número for positivo ou zero.
- O laço continua até que o usuário insira um número negativo.

## Conclusão
A estrutura `do-while` é útil em situações onde o bloco de código precisa ser executado ao menos uma vez antes de qualquer verificação de condição. Essa estrutura é uma alternativa ao laço `while`, com uma pequena diferença na ordem de execução e verificação de condição.

---

#### [Clique aqui para voltar ao repositório EstruturaRepetitiva](https://github.com/gabrielmelim/JAVA/tree/EstruturaRepetitiva)
