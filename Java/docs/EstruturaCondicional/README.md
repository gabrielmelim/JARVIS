
# Estruturas Condicionais 

<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/EstruturaCondicional.png" alt="java" width="70%">
</div>

## Introdução

As **estruturas condicionais** são fundamentais na programação, permitindo que diferentes blocos de código sejam executados com base em determinadas condições. Em Java, utilizamos as seguintes estruturas para controle de fluxo:

- `if`
- `else`
- `else if`
- `switch`

### 1. Condicional `if`

A estrutura `if` é usada para verificar se uma condição é verdadeira e, nesse caso, executa o bloco de código associado. Caso contrário, o bloco é ignorado.

#### Sintaxe

```java
if (condicao) {
    // Código a ser executado se a condição for verdadeira
}
```

#### Exemplo

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Você é maior de idade.");
}
```

Neste exemplo, a mensagem "Você é maior de idade." será exibida somente se a variável `idade` for maior ou igual a 18.

### 2. Condicional `else`

A estrutura `else` complementa o `if`. Quando a condição do `if` é falsa, o bloco `else` será executado.

#### Sintaxe

```java
if (condicao) {
    // Código a ser executado se a condição for verdadeira
} else {
    // Código a ser executado se a condição for falsa
}
```

#### Exemplo

```java
int idade = 16;

if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}
```

Neste caso, a mensagem "Você é menor de idade." será exibida, já que a condição do `if` é falsa.

### 3. Condicional `else if`

Usamos o `else if` para verificar múltiplas condições. Após o `if` inicial, podemos testar outras condições antes de usar um `else` final.

#### Sintaxe

```java
if (condicao1) {
    // Código a ser executado se condicao1 for verdadeira
} else if (condicao2) {
    // Código a ser executado se condicao2 for verdadeira
} else {
    // Código a ser executado se nenhuma condição anterior for verdadeira
}
```

#### Exemplo

```java
int idade = 20;

if (idade < 18) {
    System.out.println("Você é menor de idade.");
} else if (idade == 18) {
    System.out.println("Você acabou de atingir a maioridade.");
} else {
    System.out.println("Você é maior de idade.");
}
```

Neste exemplo, diferentes mensagens serão exibidas dependendo da idade.

### 4. Condicional `switch`

O `switch` é utilizado quando precisamos comparar o valor de uma variável com diversos valores possíveis de forma mais limpa e legível do que vários `else if`.

#### Sintaxe

```java
switch (variavel) {
    case valor1:
        // Código a ser executado se variavel == valor1
        break;
    case valor2:
        // Código a ser executado se variavel == valor2
        break;
    default:
        // Código a ser executado se nenhum caso anterior for verdadeiro
}
```

#### Exemplo

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    default:
        System.out.println("Dia inválido");
        break;
}
```

Neste exemplo, será exibida a mensagem "Terça-feira", pois o valor da variável `dia` é 3.

## Conclusão

As estruturas condicionais são essenciais para a tomada de decisões em programas Java. Elas permitem executar diferentes blocos de código com base nas condições que ocorrem durante a execução do programa.

Pratique usando diferentes cenários e combinações de `if`, `else if`, `else`, e `switch` para dominar o controle de fluxo em Java.
