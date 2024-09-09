
# Exercícios de Estrutura Condicional em Java

## Exercício 01: Verificar se um número é negativo

```java
public class Exercicio01 {
    public static void main(String[] args) {
        // Leia um número inteiro do usuário
        int numero = /* Código para ler o número do usuário */;
        
        // Verifique se o número é negativo
        if (/* Condição para verificar se o número é menor que 0 */) {
            // Exiba "NEGATIVO" se a condição for verdadeira
        } else {
            // Exiba "NAO NEGATIVO" caso contrário
        }
    }
}
```

## Exercício 02: Verificar se um número é par ou ímpar

```java
public class Exercicio02 {
    public static void main(String[] args) {
        // Leia um número inteiro do usuário
        int numero = /* Código para ler o número do usuário */;
        
        // Verifique se o número é par ou ímpar usando o operador %
        if (/* Condição para verificar se o número é divisível por 2 */) {
            // Exiba "PAR" se a condição for verdadeira
        } else {
            // Exiba "IMPAR" caso contrário
        }
    }
}
```

## Exercício 03: Verificar se dois números são múltiplos

```java
public class Exercicio03 {
    public static void main(String[] args) {
        // Leia dois números inteiros do usuário
        int A = /* Código para ler o primeiro número */;
        int B = /* Código para ler o segundo número */;
        
        // Verifique se os números são múltiplos
        if (/* Condição para verificar se A é múltiplo de B ou vice-versa */) {
            // Exiba "Sao Multiplos" se a condição for verdadeira
        } else {
            // Exiba "Nao sao Multiplos" caso contrário
        }
    }
}
```

## Exercício 04: Calcular a duração de um jogo

```java
public class Exercicio04 {
    public static void main(String[] args) {
        // Leia a hora inicial e final do jogo
        int horaInicial = /* Código para ler a hora inicial */;
        int horaFinal = /* Código para ler a hora final */;
        
        // Calcule a duração do jogo considerando que pode durar até 24 horas
        int duracao = /* Lógica para calcular a duração, considerando a virada do dia */;
        
        // Exiba o resultado da duração
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
```

## Exercício 05: Calcular o valor total de uma conta com base em um item e sua quantidade

```java
public class Exercicio05 {
    public static void main(String[] args) {
        // Leia o código do item e a quantidade
        int codigo = /* Código para ler o código do item */;
        int quantidade = /* Código para ler a quantidade */;
        
        // Utilize uma estrutura de seleção para calcular o valor total baseado no código
        double total = /* Lógica para calcular o total baseado no item escolhido */;
        
        // Exiba o valor total
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
```

## Exercício 06: Verificar em qual intervalo um valor se encontra

```java
public class Exercicio06 {
    public static void main(String[] args) {
        // Leia um valor decimal do usuário
        double valor = /* Código para ler o valor */;
        
        // Verifique em qual intervalo o valor está
        if (/* Intervalo [0,25] */) {
            // Exiba "Intervalo [0,25]"
        } else if (/* Intervalo (25,50] */) {
            // Exiba "Intervalo (25,50]"
        } else if (/* Intervalo (50,75] */) {
            // Exiba "Intervalo (50,75]"
        } else if (/* Intervalo (75,100] */) {
            // Exiba "Intervalo (75,100]"
        } else {
            // Exiba "Fora de intervalo"
        }
    }
}
```

## Exercício 07: Determinar o quadrante de um ponto no plano cartesiano

```java
public class Exercicio07 {
    public static void main(String[] args) {
        // Leia as coordenadas X e Y do ponto
        double x = /* Código para ler o valor de X */;
        double y = /* Código para ler o valor de Y */;
        
        // Determine o quadrante ou se está sobre os eixos ou na origem
        if (/* Condição para verificar se está na origem */) {
            // Exiba "Origem"
        } else if (/* Condição para verificar se está no eixo X */) {
            // Exiba "Eixo X"
        } else if (/* Condição para verificar se está no eixo Y */) {
            // Exiba "Eixo Y"
        } else if (/* Condição para verificar o quadrante 1 */) {
            // Exiba "Q1"
        } else if (/* Condição para verificar o quadrante 2 */) {
            // Exiba "Q2"
        } else if (/* Condição para verificar o quadrante 3 */) {
            // Exiba "Q3"
        } else if (/* Condição para verificar o quadrante 4 */) {
            // Exiba "Q4"
        }
    }
}
```

## Exercício 08: Calcular o imposto de renda

```java
public class Exercicio08 {
    public static void main(String[] args) {
        // Leia o salário do usuário
        double salario = /* Código para ler o valor do salário */;
        
        // Calcule o imposto de acordo com as faixas de renda
        double imposto = /* Lógica para calcular o imposto baseado no salário */;
        
        // Exiba o valor do imposto ou "Isento" se for o caso
        if (/* Condição para isenção */) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
```
