
# Expressões Lógicas em Java

<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/ExpressoesLogicas.png" alt="java" width="70%">
</div>


### Introdução

Em programação, expressões lógicas são usadas para tomar decisões com base em condições. No Java, assim como em outras linguagens, essas expressões retornam valores booleanos, ou seja, `true` ou `false`. Estas expressões são essenciais para controle de fluxo, como em estruturas condicionais e laços.

## Operadores Lógicos

Java fornece diversos operadores lógicos que podem ser usados para criar expressões mais complexas. Abaixo estão os operadores mais comuns:

### Operadores Lógicos:

| Operador | Descrição                                        | Exemplo                    |
|----------|--------------------------------------------------|----------------------------|
| `&&`     | Operador "E lógico" (AND), retorna `true` se ambas as expressões forem verdadeiras | `a > b && a < c`           |
| `\|\|`     | Operador "OU lógico" (OR), retorna `true` se pelo menos uma das expressões for verdadeira | `a > b \|\| a < c`           |
| `!`      | Operador "Não lógico" (NOT), inverte o valor lógico da expressão | `!(a > b)`                 |

### Tabela Verdade para Operadores Lógicos

#### Operador `&&` (E)

| Expressão 1 | Expressão 2 | Resultado |
|-------------|-------------|-----------|
| `true`      | `true`      | `true`    |
| `true`      | `false`     | `false`   |
| `false`     | `true`      | `false`   |
| `false`     | `false`     | `false`   |

#### Operador `||` (OU)

| Expressão 1 | Expressão 2 | Resultado |
|-------------|-------------|-----------|
| `true`      | `true`      | `true`    |
| `true`      | `false`     | `true`    |
| `false`     | `true`      | `true`    |
| `false`     | `false`     | `false`   |

#### Operador `!` (NÃO)

| Expressão  | Resultado |
|------------|-----------|
| `true`     | `false`   |
| `false`    | `true`    |

## Exemplos Práticos

### Exemplo 1: Comparação Simples

```java
int a = 10;
int b = 20;

if (a < b) {
    System.out.println("a é menor que b");
}
```

Neste exemplo, a condição `a < b` é avaliada. Como `a` (10) é de fato menor que `b` (20), a expressão retorna `true` e a mensagem "a é menor que b" será exibida.

### Exemplo 2: Combinação de Condições com `&&`

```java
int a = 10;
int b = 20;
int c = 30;

if (a < b && b < c) {
    System.out.println("a é menor que b e b é menor que c");
}
```

Aqui, a condição só será verdadeira se as duas comparações (`a < b` e `b < c`) forem verdadeiras.

### Exemplo 3: Condição com `||`

```java
int a = 10;
int b = 20;

if (a == 10 || b == 10) {
    System.out.println("Pelo menos uma das variáveis é igual a 10");
}
```

Neste caso, o código imprimirá a mensagem se uma das duas condições for verdadeira.

## Conclusão

Expressões lógicas são fundamentais para controle de fluxo em Java. Elas permitem a criação de condições que determinam o comportamento do programa com base em valores booleanos. Dominar esses operadores facilita a implementação de tomadas de decisão complexas em seus códigos.
