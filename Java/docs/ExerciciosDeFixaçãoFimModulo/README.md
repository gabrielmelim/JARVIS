#### [Clique aqui para voltar ao repositório EstruturaSequencial](https://github.com/gabrielmelim/JAVA/tree/EstruturaSequencial)

# Listão de Exercícios do Módulo Estrutura Sequencial

## Exercício 1

#### Descrição do Exercício:

O exercício solicita que você crie um programa em Java que:

1. **Leia dois números inteiros:**
   - O programa deve pedir ao usuário para digitar dois números inteiros quaisquer.

2. **Calcule a soma:**
   - Após ler os dois números, o programa deve realizar a operação de soma entre eles.

3. **Mostre o resultado:**
   - O resultado da soma deve ser exibido na tela, junto com uma mensagem explicativa, indicando que aquele valor é a soma dos dois números digitados.

### Exemplo de Funcionamento

Se o usuário digitar os números `10` e `30`, o programa deve mostrar a seguinte saída:

```Java
SOMA = 40
```

### Dicas para resolver:

1. **Utilize a classe `Scanner`:**
   - Essa classe permite que você leia dados que o usuário digita no console.

2. **Declare variáveis:**
   - Você precisará de três variáveis do tipo inteiro: uma para cada número digitado e outra para armazenar o resultado da soma.

3. **Realize a operação de soma:**
   - Use o operador `+` para somar os dois números e armazene o resultado em uma variável.

4. **Imprima o resultado:**
   - Use `System.out.println()` para mostrar o resultado na tela, junto com a mensagem desejada.

### Esqueleto do Código:

Aqui está um esqueleto básico do código Java para te ajudar a começar:

```java
import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner leitor = new Scanner(System.in);

        // Peça para o usuário digitar os números
        System.out.print("Digite o primeiro número: ");
        // Leia o primeiro número e armazene em uma variável
        
        System.out.print("Digite o segundo número: ");
        // Leia o segundo número e armazene em uma variável

        // Calcule a soma e armazene em uma variável

        // Imprima o resultado na tela
        System.out.println("SOMA = " + );
    }
}
```

Preencha as partes faltantes do código e teste seu programa!

## Exercício 2

Crie um programa em Java que:

1. **Peça ao usuário para inserir o raio de um círculo.**
2. **Calcule a área desse círculo** utilizando a fórmula: área = π * raio².
3. **Mostre na tela o resultado da área**, arredondado para quatro casas decimais.

### Considerações

- **Valor de pi:** Utilize o valor de pi como 3.14159.

### Exemplo:

Se o usuário inserir um raio de `2.00`, o programa deve mostrar na tela:

```Java
A = 12.5664
```

### O que o exercício está pedindo?

O exercício te desafia a criar um programa que resolva um problema matemático básico: calcular a área de um círculo. Para isso, você precisará:

1. **Ler um valor do usuário:** O raio do círculo.
2. **Realizar um cálculo:** Aplicar a fórmula da área do círculo.
3. **Formatar a saída:** Mostrar o resultado com um número específico de casas decimais.

### Dicas para resolver:

- **Importar a classe `Scanner`:** Para ler a entrada do usuário.
- **Declarar variáveis:** Uma para o raio, outra para pi e outra para a área.
- **Utilizar a classe `Math`:** Para calcular a potência (raio ao quadrado).
- **Formatar a saída:** Usar `System.out.printf()` para controlar o número de casas decimais.

### Esqueleto do código:

```java
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        // 1. Crie um objeto Scanner para ler a entrada do usuário
        Scanner leitor = new Scanner(System.in);

        // 2. Peça ao usuário para inserir o raio do círculo
        System.out.print("Digite o raio do círculo: ");

        // 3. Leia o valor digitado pelo usuário e armazene na variável raio
        //    Lembre-se que o raio é um número decimal, então use nextDouble()
        double raio = ;

        // 4. Defina o valor de pi (uma constante matemática)
        double pi = ; // Substitua pelo valor de pi

        // 5. Calcule a área do círculo utilizando a fórmula área = pi * raio^2
        //    Utilize Math.pow para calcular a potência
        double area = ;

        // 6. Imprima o resultado formatado com 4 casas decimais após o ponto
        //    Use System.out.printf() para formatar a saída
        System.out.printf("A área do círculo é: %.4f", );
    }
}
```

### O que cada parte faz

- **Cria um objeto `Scanner`:** Prepara o programa para ler a entrada do usuário.
- **Pede o raio:** Exibe uma mensagem na tela solicitando o valor do raio.
- **Lê o raio:** Armazena o valor digitado pelo usuário na variável `raio`.
- **Define pi:** Atribui o valor de pi à variável `pi`.
- **Calcula a área:** Utiliza a fórmula da área do círculo e o método `Math.pow` para calcular o raio ao quadrado.
- **Imprime o resultado:** Mostra na tela a mensagem "A área do círculo com raio X é Y," seguida do valor da área formatado com 4 casas decimais.

### Seu desafio

1. **Completar as linhas em branco:** Preencha as partes faltantes do código com as expressões corretas.
2. **Entender cada etapa:** Certifique-se de compreender o propósito de cada linha de código.
3. **Experimentar:** Tente modificar o código para calcular outras coisas, como o volume de uma esfera ou a área de um triângulo.

### Dicas

- **Pesquise:** Se tiver dúvidas sobre algum comando ou função, procure na documentação do Java ou em tutoriais online.
- **Pratique:** Quanto mais você praticar, mais familiarizado você se tornará com a linguagem Java e com a resolução de problemas de programação.


## Exercício 3

Crie um programa em Java que:

1. **Peça ao usuário para inserir quatro números inteiros:** A, B, C e D.
2. **Calcule a diferença** entre o produto de A e B, e o produto de C e D.
3. **Mostre na tela o resultado desta diferença**, seguindo a fórmula: `DIFERENÇA = (A * B) - (C * D)`.

### O que o exercício está pedindo?

O exercício te desafia a criar um programa que realize operações matemáticas básicas com números inteiros. Para isso, você precisará:

1. **Ler quatro valores do usuário:** Os números A, B, C e D.
2. **Realizar cálculos:** Multiplicar A por B e C por D, e depois subtrair os resultados.
3. **Mostrar o resultado:** Exibir na tela a diferença calculada.

### Dicas para resolver:

- **Importar a classe `Scanner`:** Para ler a entrada do usuário.
- **Declarar variáveis:** Quatro variáveis inteiras para armazenar os valores A, B, C e D.
- **Realizar as operações:** Multiplicar A por B e C por D, e depois subtrair os resultados.
- **Armazenar o resultado:** Armazenar o resultado da subtração em uma nova variável.
- **Imprimir o resultado:** Exibir na tela o valor da variável que armazena o resultado.


### Esqueleto do código:

```java
import java.util.Scanner;

public class CalculadoraDiferenca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // 1. Peça ao usuário para inserir os valores de A, B, C e D
        System.out.print("Digite o valor de A: ");
        int A = leitor.nextInt();
        // ... (repita o mesmo para B, C e D)

        // 2. Calcule a diferença entre os produtos de A*B e C*D
        //    Armazene o resultado em uma variável chamada 'diferenca'
        int diferenca = ;

        // 3. Imprima o resultado na tela
        System.out.println("DIFERENCA = " + diferenca);
    }
}
```

### Explicando o Código

1. **Leitura dos valores:** 
   - O código pede ao usuário para digitar os valores de A, B, C e D, armazenando cada um em uma variável separada.

2. **Cálculo da diferença:** 
   - Aqui, você precisa escrever a expressão matemática para calcular a diferença entre o produto de A e B e o produto de C e D. O resultado desse cálculo deve ser armazenado na variável `diferenca`.

3. **Impressão do resultado:** 
   - A mensagem `"DIFERENCA = "` é concatenada com o valor da variável `diferenca` e exibida na tela.

### O que você precisa fazer

- **Completar a linha onde tem a variável diferenca:** 
   - Escreva a expressão matemática completa para calcular a diferença, utilizando os operadores de multiplicação (`*`) e subtração (`-`), e as variáveis `A`, `B`, `C` e `D`.

### Dicas

- **Siga a fórmula:** A fórmula para calcular a diferença é `(A * B) - (C * D)`.
- **Use parênteses:** Os parênteses são importantes para garantir que as operações sejam realizadas na ordem correta.
- **Armazene o resultado:** O resultado do cálculo deve ser armazenado na variável `diferenca`.

## Exercício 4
```Java
import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        // 1. Crie um objeto Scanner para ler a entrada do usuário.
        Scanner scanner = new Scanner(System.in);

        // 2. Peça ao usuário para inserir o número do funcionário, as horas trabalhadas e o valor por hora.
        //    Armazene esses valores em variáveis apropriadas.

        // 3. Calcule o salário total do funcionário.
        //    Multiplique as horas trabalhadas pelo valor por hora e armazene o resultado em uma variável.

        // 4. Imprima na tela o número do funcionário e o salário calculado, formatado com duas casas decimais.
        //    Utilize o método printf para formatar a saída.

        // 5. Feche o objeto Scanner.
        scanner.close();
    }
}
```

### Explicando Cada Parte do Código

1. **Import:**
   - A linha `import java.util.Scanner;` importa a classe `Scanner` da biblioteca `java.util`, que é essencial para ler a entrada do usuário.

2. **Classe:**
   - A classe `CalculoSalario` é o ponto de entrada do programa. Em Java, toda aplicação precisa de uma classe principal para começar a execução.

3. **Método `main`:**
   - O método `main` é o ponto de partida da execução do programa. É onde o código começa a ser executado.

4. **Objeto `Scanner`:**
   - Um objeto `Scanner` é criado para ler a entrada do usuário a partir do teclado. Este objeto será usado para capturar dados inseridos pelo usuário.

5. **Leitura de dados:**
   - Nas linhas comentadas com o número 2, você deverá usar métodos como `nextInt()`, `nextDouble()` do objeto `Scanner` para ler os valores inseridos pelo usuário e armazená-los em variáveis adequadas (por exemplo, `int numeroFuncionario`, `double horasTrabalhadas`, `double valorPorHora`).

6. **Cálculo do salário:**
   - Na linha comentada com o número 3, você realizará o cálculo do salário multiplicando as horas trabalhadas pelo valor por hora e armazenando o resultado em uma variável (por exemplo, `double salario`).

7. **Saída formatada:**
   - Na linha comentada com o número 4, você utilizará o método `printf` para imprimir o resultado na tela de forma formatada. O método `printf` permite especificar como os valores serão exibidos, incluindo o número de casas decimais.

8. **Fechar `Scanner`:**
   - É importante fechar o objeto `Scanner` após o uso, utilizando o método `close()`, para liberar os recursos associados a ele.

### Próximos Passos

1. **Complete o código:**
   - Preencha as linhas comentadas com o código Java necessário para realizar as tarefas descritas.

2. **Compile e execute:**
   - Utilize um compilador Java para compilar o código e, em seguida, execute o programa para testar a sua solução.

### Lembre-se:

- **Escolha nomes de variáveis significativos:** Isso torna o código mais fácil de entender.
- **Utilize comentários:** Explique o propósito de cada parte do código para facilitar a manutenção e a colaboração.
- **Teste seu código:** Execute o programa com diferentes entradas para verificar se ele funciona corretamente.

### Dicas:

- **Formatação:** Utilize indentação e espaçamento adequados para melhorar a legibilidade do código.

## Exercício 5
```Java
import java.util.Scanner;

public class CalculoValorTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. **Peça ao usuário para inserir os dados da primeira peça:**
        //    - Código da peça
        //    - Quantidade da peça
        //    - Valor unitário da peça
        //    Armazene esses valores em variáveis apropriadas.

        // 2. **Peça ao usuário para inserir os dados da segunda peça:**
        //    - Código da peça
        //    - Quantidade da peça
        //    - Valor unitário da peça
        //    Armazene esses valores em variáveis apropriadas.

        // 3. **Calcule o valor total da compra:**
        //    - Multiplique a quantidade de cada peça pelo seu valor unitário.
        //    - Some os valores totais das duas peças.
        //    Armazene o resultado em uma variável.

        // 4. **Imprima na tela o valor total a ser pago:**
        //    Utilize o método printf para formatar a saída com duas casas decimais.

        scanner.close();
    }
}
```

### Explicando Cada Parte do Código

1. **Import:**
   - Importamos a classe `Scanner` para ler os dados digitados pelo usuário.

2. **Classe:**
   - A classe `CalculoValorTotal` é o ponto de entrada do programa.

3. **Método `main`:**
   - O método `main` é onde o código principal será executado.

4. **Objeto `Scanner`:**
   - Criamos um objeto `Scanner` para ler a entrada do usuário.

5. **Leitura dos dados:**
   - Nas linhas comentadas com o número 1 e 2, você deverá usar métodos como `nextInt()` e `nextDouble()` do objeto `Scanner` para ler os valores inseridos pelo usuário e armazená-los em variáveis adequadas (por exemplo, `int codigoPeca1`, `int quantidadePeca1`, `double valorUnitarioPeca1`).

6. **Cálculo do valor total:**
   - Na linha comentada com o número 3, você realizará o cálculo do valor total multiplicando a quantidade de cada peça pelo seu valor unitário e somando os resultados. Armazene o valor total em uma variável (por exemplo, `double valorTotal`).

7. **Saída formatada:**
   - Na linha comentada com o número 4, você utilizará o método `printf` para imprimir o resultado na tela de forma formatada. O método `printf` permite especificar como os valores serão exibidos, incluindo o número de casas decimais.

8. **Fechar `Scanner`:**
   - É importante fechar o objeto `Scanner` após o uso, utilizando o método `close()`.

### Próximos Passos

1. **Complete o código:**
   - Preencha as linhas comentadas com o código Java necessário para realizar as tarefas descritas.

2. **Compile e execute:**
   - Utilize um compilador Java para compilar o código e, em seguida, execute o programa para testar a sua solução.

### Lembre-se:

- **Escolha nomes de variáveis significativos:** Isso torna o código mais fácil de entender.
- **Utilize comentários:** Explique o propósito de cada parte do código para facilitar a manutenção e a colaboração.
- **Teste seu código:** Execute o programa com diferentes entradas para verificar se ele funciona corretamente.

### Dicas:

- **Formatação:** Utilize indentação e espaçamento adequados para melhorar a legibilidade do código.

## Exercício 6

```Java
import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. **Peça ao usuário para inserir os valores de A, B e C:**
        //    Armazene esses valores em variáveis apropriadas.

        // 2. **Calcule a área de cada figura:**
        //    - Triângulo retângulo: base A, altura C
        //    - Círculo: raio C
        //    - Trapézio: bases A e B, altura C
        //    - Quadrado: lado B
        //    - Retângulo: lados A e B
        //    Armazene o resultado de cada cálculo em uma variável.

        // 3. **Imprima na tela as áreas calculadas:**
        //    Utilize o método printf para formatar a saída com três casas decimais.

        scanner.close();
    }
}
```

### Explicando Cada Parte do Código

1. **Import:**
   - Importamos a classe `Scanner` para ler os dados digitados pelo usuário.

2. **Classe:**
   - A classe `CalculoAreas` é o ponto de entrada do programa.

3. **Método `main`:**
   - O método `main` é onde o código principal será executado.

4. **Objeto `Scanner`:**
   - Criamos um objeto `Scanner` para ler a entrada do usuário.

5. **Leitura dos dados:**
   - Nas linhas comentadas com o número 1, você deverá usar o método `nextDouble()` do objeto `Scanner` para ler os valores inseridos pelo usuário e armazená-los em variáveis adequadas (por exemplo, `double A`, `double B`, `double C`).

6. **Cálculo das áreas:**
   - Nas linhas comentadas com o número 2, você realizará os cálculos das áreas utilizando as fórmulas matemáticas correspondentes a cada figura. Armazene o resultado de cada cálculo em uma variável (por exemplo, `double areaTriangulo`, `double areaCirculo`).

7. **Saída formatada:**
   - Nas linhas comentadas com o número 3, você utilizará o método `printf` para imprimir os resultados na tela de forma formatada. O método `printf` permite especificar como os valores serão exibidos, incluindo o número de casas decimais.

8. **Fechar `Scanner`:**
   - É importante fechar o objeto `Scanner` após o uso, utilizando o método `close()`.

### Próximos Passos

1. **Complete o código:**
   - Preencha as linhas comentadas com o código Java necessário para realizar as tarefas descritas.

2. **Compile e execute:**
   - Utilize um compilador Java para compilar o código e, em seguida, execute o programa para testar a sua solução.

   
### Fórmulas para o Cálculo das Áreas

Para te ajudar a completar o código, vamos relembrar as fórmulas para calcular as áreas das figuras geométricas que você precisa:

1. **Triângulo Retângulo:**
 - **Fórmula:** `areaTriangulo = (base * altura) / 2`


2. **Círculo:**
   - **Fórmula:** `areaCirculo = π * raio²`

3. **Trapézio:**
   - **Fórmula:** `areaTrapezio = (baseMaior + baseMenor) * altura / 2;`


4. **Quadrado:**
   - **Fórmula:** `areaQuadrado = lado²`

5. **Retângulo:**
   - **Fórmula:** `areaRetangulo = base * altura`



### Lembre-se:

- **Utilize a constante pi:** Para calcular a área do círculo, você precisará usar a constante pi. Em Java, você pode utilizar `Math.PI`.
- **Formatação:** Utilize `%.3f` no `printf` para formatar as áreas com três casas decimais, como especificado no exercício.
- **Comentários:** Adicione comentários para explicar o propósito de cada parte do código e facilitar a compreensão.


#### [Clique aqui para voltar ao repositório EstruturaSequencial](https://github.com/gabrielmelim/JAVA/tree/EstruturaSequencial)

