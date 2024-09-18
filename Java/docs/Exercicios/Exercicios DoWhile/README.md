#### [Clique aqui para voltar ao repositório EstruturaRepetitiva Exercicios](https://github.com/gabrielmelim/JAVA/tree/EstruturaRepetitiva/Java/docs/Exercicios)
# Exercício 1: Criar um loop que pergunte ao usuário por um número até que ele insira um número maior que 100

---

```java
// Classe principal do programa
public class LoopDoWhileExercicio {

    // Método principal onde o programa será executado
    public static void main(String[] args) {

        // Declarar uma variável para armazenar o número digitado pelo usuário
        int numero;

        // Aqui, você deve criar um objeto da classe Scanner para capturar a entrada do usuário
        // Exemplo:
        // Scanner input = new Scanner(System.in);

        // Início do loop do-while
        do {
            // Exibir uma mensagem para o usuário solicitando que ele insira um número
            // Exemplo: "Digite um número: "

            // Ler o número digitado pelo usuário e armazená-lo na variável "numero"

            // Lembre-se de que aqui o código será executado pelo menos uma vez,
            // pois é isso que a estrutura do "do-while" garante.

        // Condição do loop: o laço deve continuar enquanto o número for menor ou igual a 100
        } while (numero <= 100);

        // Quando o laço terminar, exiba uma mensagem informando que o número inserido é maior que 100
        // Exemplo: "Número maior que 100 inserido. Fim do programa."

        // Não esqueça de fechar o objeto Scanner para evitar vazamentos de recursos
        // Exemplo: input.close();
    }
}
```

## Explicação passo a passo:

1. **Criar uma classe e um método principal**: Toda aplicação Java deve ter uma classe principal e o método `main` que será o ponto de partida da execução.
2. **Declarar variáveis**: Você precisará de uma variável `int` para armazenar o número que o usuário digitar.
3. **Usar a classe Scanner**: Para capturar a entrada do usuário, você precisará instanciar a classe `Scanner`.
4. **Criar o loop `do-while`**: No bloco `do`, você pedirá ao usuário que insira um número, e na condição do `while`, o laço continuará enquanto o número for menor ou igual a 100.
5. **Finalizar o programa**: Após sair do laço, exiba uma mensagem indicando o término do programa.
<br>
✅ [Correção Exercicio](https://github.com/gabrielmelim/JAVA/blob/EstruturaRepetitiva/Java/codigo/ExerciciosDoWhile/LoopDoWhileExercicio.java)

#### [Clique aqui para voltar ao repositório EstruturaRepetitiva Exercicios](https://github.com/gabrielmelim/JAVA/tree/EstruturaRepetitiva/Java/docs/Exercicios)
