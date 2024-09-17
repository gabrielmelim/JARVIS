#### [Clique aqui para voltar ao repositório EstruturaRepetitiva](https://github.com/gabrielmelim/JAVA/tree/EstruturaRepetitiva)

# Aula de Laço `for` em Java

## Introdução

Nesta aula, abordaremos a estrutura de repetição `for` em Java. Este laço é amplamente utilizado para executar um bloco de código várias vezes, especialmente quando o número de iterações é conhecido.

### Sintaxe Básica do `for`

A estrutura básica de um laço `for` é a seguinte:

```java
for (inicialização; condição; incremento/decremento) {
    // Código a ser executado
}
```

#### Componentes do `for`:
1. **Inicialização**: Executada uma única vez no início do laço. Geralmente usada para declarar e inicializar uma variável de controle.
2. **Condição**: Avaliada antes de cada iteração. O laço continua enquanto a condição for verdadeira.
3. **Incremento/Decremento**: Executado ao final de cada iteração. Geralmente usado para alterar o valor da variável de controle.

### Exemplo Simples

Um exemplo básico de uso do `for` para imprimir números de 1 a 5:

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
```

Neste exemplo:
- A variável `i` é inicializada com o valor 1.
- A condição do laço é `i <= 5`, ou seja, o laço continua enquanto `i` for menor ou igual a 5.
- O incremento `i++` aumenta o valor de `i` em 1 após cada iteração.

### Fluxo de Execução do Laço `for`

1. **Inicialização**: A variável `i` é inicializada com o valor 1.
2. **Verificação da Condição**: A condição `i <= 5` é avaliada. Se verdadeira, o bloco de código dentro do `for` é executado.
3. **Execução do Bloco de Código**: O `System.out.println(i)` imprime o valor atual de `i`.
4. **Incremento**: Após a execução do bloco, o valor de `i` é incrementado.
5. **Repetição**: O processo retorna à verificação da condição, e o ciclo se repete até que a condição seja falsa.

### Outro Exemplo

Agora, um exemplo que itera um array de strings:

```java
public class Main {
    public static void main(String[] args) {
        String[] frutas = {"Maçã", "Banana", "Laranja"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }
    }
}
```

Neste exemplo:
- A variável de controle `i` é usada para acessar os elementos do array `frutas`.
- O laço percorre todos os elementos do array e imprime seus valores.

### Conclusão

O laço `for` é uma estrutura fundamental em Java que facilita a repetição de um bloco de código. Compreender sua sintaxe e funcionamento é essencial para construir algoritmos eficientes.
#### [Clique aqui para voltar ao repositório EstruturaRepetitiva](https://github.com/gabrielmelim/JAVA/tree/EstruturaRepetitiva)

