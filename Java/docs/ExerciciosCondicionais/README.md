
# Exercícios sobre Estrutura Condicional em Java

## Exercício 01

**Descrição**: Fazer um programa para ler um número inteiro e depois dizer se este número é negativo ou não.

```java
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        // Criação do scanner para leitura de dados
        Scanner sc = new Scanner(System.in);
        
        // Pedir ao usuário que insira um número inteiro
        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();
        
        // Aqui você deverá verificar se o número é negativo ou não
        // Dica: Utilize uma estrutura condicional if-else
        
        // Feche o scanner ao terminar
        sc.close();
    }
}
```

## Exercício 02

**Descrição**: Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

```java
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        // Criação do scanner para leitura de dados
        Scanner sc = new Scanner(System.in);
        
        // Solicitar ao usuário um número inteiro
        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();
        
        // Aqui você deverá verificar se o número é par ou ímpar
        // Dica: Use o operador de módulo (%) para determinar o resto da divisão
        
        // Feche o scanner ao terminar
        sc.close();
    }
}
```

## Exercício 03

**Descrição**: Leia dois valores inteiros (A e B) e verifique se são múltiplos.

```java
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        // Criação do scanner para leitura de dados
        Scanner sc = new Scanner(System.in);
        
        // Solicitar dois números inteiros do usuário
        System.out.println("Digite o primeiro número:");
        int A = sc.nextInt();
        
        System.out.println("Digite o segundo número:");
        int B = sc.nextInt();
        
        // Aqui você deverá verificar se os números são múltiplos entre si
        // Dica: Use o operador de módulo (%) para verificar a divisibilidade
        
        // Feche o scanner ao terminar
        sc.close();
    }
}
```

## Exercício 04

**Descrição**: Leia a hora inicial e a hora final de um jogo e calcule sua duração.

```java
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        // Criação do scanner para leitura de dados
        Scanner sc = new Scanner(System.in);
        
        // Solicitar ao usuário as horas inicial e final do jogo
        System.out.println("Digite a hora inicial do jogo:");
        int horaInicial = sc.nextInt();
        
        System.out.println("Digite a hora final do jogo:");
        int horaFinal = sc.nextInt();
        
        // Aqui você deverá calcular a duração do jogo
        // Dica: Considere os casos em que o jogo ultrapassa para o dia seguinte
        
        // Feche o scanner ao terminar
        sc.close();
    }
}
```

## Exercício 05

**Descrição**: Leia o código de um item e a quantidade, calcule o valor da conta a pagar com base em uma tabela de preços.

```java
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        // Criação do scanner para leitura de dados
        Scanner sc = new Scanner(System.in);
        
        // Solicitar ao usuário o código do item e a quantidade
        System.out.println("Digite o código do item:");
        int codigoItem = sc.nextInt();
        
        System.out.println("Digite a quantidade:");
        int quantidade = sc.nextInt();
        
        // Aqui você deverá calcular o valor total a pagar baseado na tabela fornecida
        // Dica: Use uma estrutura condicional para verificar o código do item e aplicar o preço correspondente
        
        // Feche o scanner ao terminar
        sc.close();
    }
}
```

## Exercício 06

**Descrição**: Leia um valor qualquer e apresente uma mensagem dizendo em qual dos intervalos ele se encontra.

```java
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        // Criação do scanner para leitura de dados
        Scanner sc = new Scanner(System.in);
        
        // Solicitar ao usuário um valor numérico
        System.out.println("Digite um valor:");
        double valor = sc.nextDouble();
        
        // Aqui você deverá verificar em qual dos intervalos o valor se encontra
        // Dica: Use estruturas condicionais aninhadas para comparar os intervalos
        
        // Feche o scanner ao terminar
        sc.close();
    }
}
```

## Exercício 07

**Descrição**: Leia dois valores (x e y) e determine em qual quadrante o ponto se encontra ou se está sobre um dos eixos.

```java
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        // Criação do scanner para leitura de dados
        Scanner sc = new Scanner(System.in);
        
        // Solicitar ao usuário as coordenadas x e y
        System.out.println("Digite a coordenada x:");
        double x = sc.nextDouble();
        
        System.out.println("Digite a coordenada y:");
        double y = sc.nextDouble();
        
        // Aqui você deverá determinar o quadrante ou se o ponto está em um dos eixos
        // Dica: Use estruturas condicionais para comparar os valores de x e y
        
        // Feche o scanner ao terminar
        sc.close();
    }
}
```

## Exercício 08

**Descrição**: Leia um valor equivalente ao salário e calcule o valor a pagar de Imposto de Renda com base em uma tabela.

```java
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        // Criação do scanner para leitura de dados
        Scanner sc = new Scanner(System.in);
        
        // Solicitar ao usuário o valor do salário
        System.out.println("Digite o valor do salário:");
        double salario = sc.nextDouble();
        
        // Aqui você deverá calcular o imposto a ser pago com base na tabela de faixas salariais
        // Dica: Verifique a faixa salarial e aplique as porcentagens correspondentes
        
        // Feche o scanner ao terminar
        sc.close();
    }
}
```
