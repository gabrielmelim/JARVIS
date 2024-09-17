
# Exercícios de Java - Estrutura For

## Exercício 1: Laço "For" Básico
Escreva um programa que imprime os números de 1 a 10 usando um laço `for`.

```java
// Definir a classe principal
public class ExercicioFor1 {

    // Método principal que será o ponto de entrada do programa
    public static void main(String[] args) {
        
        // Criar um laço for que começa em 1 e vai até 10
        // A cada iteração, o valor deve ser incrementado de 1
        for (int i = 1; i <= 10; i++) {
            
            // Aqui você deve imprimir o valor de i
            // Dica: use System.out.println para exibir o valor no console
        }
    }
}
```

---

## Exercício 2: Soma de Números com Laço "For"
Escreva um programa que soma os números de 1 a 100 usando um laço `for`.

```java
// Definir a classe principal
public class ExercicioFor2 {

    // Método principal que será o ponto de entrada do programa
    public static void main(String[] args) {

        // Declarar uma variável para armazenar a soma
        int soma = 0;
        
        // Criar um laço for que começa em 1 e vai até 100
        // A cada iteração, você deve adicionar o valor de i à variável soma
        for (int i = 1; i <= 100; i++) {

            // Aqui você deve adicionar o valor de i à variável soma
        }

        // Após o laço, você deve imprimir o valor final da soma
        // Dica: use System.out.println para exibir o valor
    }
}
```

---

## Exercício 3: Números Pares com Laço "For"
Escreva um programa que imprime todos os números pares de 1 a 50 usando um laço `for`.

```java
// Definir a classe principal
public class ExercicioFor3 {

    // Método principal que será o ponto de entrada do programa
    public static void main(String[] args) {

        // Criar um laço for que começa em 1 e vai até 50
        // Dentro do laço, você precisa verificar se o número é par
        // Dica: use o operador % para verificar se o número é divisível por 2
        for (int i = 1; i <= 50; i++) {
            
            // Verifique se o número é par (divisível por 2)
            // Se for, imprima o número
        }
    }
}
```

---

## Exercício 4: Tabuada com Laço "For"
Escreva um programa que imprime a tabuada de um número fornecido pelo usuário usando um laço `for`.

```java
// Importar a classe Scanner para ler a entrada do usuário
import java.util.Scanner;

// Definir a classe principal
public class ExercicioFor4 {

    // Método principal que será o ponto de entrada do programa
    public static void main(String[] args) {

        // Criar um Scanner para capturar o número fornecido pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para inserir um número
        System.out.println("Digite um número para a tabuada:");

        // Capturar o número inserido pelo usuário
        int numero = scanner.nextInt();
        
        // Criar um laço for que começa em 1 e vai até 10
        // A cada iteração, você deve multiplicar o número pelo valor de i
        for (int i = 1; i <= 10; i++) {

            // Aqui você deve imprimir o resultado da multiplicação
            // Exemplo de saída: "2 x 1 = 2"
        }
        
        // Fechar o Scanner após o uso para evitar vazamento de recursos
        scanner.close();
    }
}
```

---

## Exercício 5: Fatorial com Laço "For"
Escreva um programa que calcula o fatorial de um número fornecido pelo usuário usando um laço `for`.

```java
// Importar a classe Scanner para ler a entrada do usuário
import java.util.Scanner;

// Definir a classe principal
public class ExercicioFor5 {

    // Método principal que será o ponto de entrada do programa
    public static void main(String[] args) {

        // Criar um Scanner para capturar o número fornecido pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para inserir um número
        System.out.println("Digite um número para calcular o fatorial:");

        // Capturar o número inserido pelo usuário
        int numero = scanner.nextInt();
        
        // Declarar uma variável para armazenar o resultado do fatorial
        int fatorial = 1;

        // Criar um laço for que começa em 1 e vai até o número fornecido
        // A cada iteração, você deve multiplicar o valor atual do fatorial pelo valor de i
        for (int i = 1; i <= numero; i++) {

            // Aqui você deve atualizar o valor da variável fatorial
        }

        // Após o laço, você deve imprimir o valor final do fatorial
        // Dica: use System.out.println para exibir o valor
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        
        // Fechar o Scanner após o uso para evitar vazamento de recursos
        scanner.close();
    }
}
```
