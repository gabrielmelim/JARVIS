#### [Clique aqui para voltar ao repositório EstruturaSequencial](https://github.com/gabrielmelim/JAVA/tree/EstruturaSequencial)

# Comando de Atribuição em Processamento de Dados
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/processamentoDados.png" alt="java" width="50%">
</div>

A imagem apresenta um conceito fundamental na programação: o comando de atribuição.

### O que ele faz?

Imagine que você tem uma caixa (a variável) e quer colocar algo dentro dela (o valor). O comando de atribuição serve justamente para isso: pegar um valor e colocá-lo dentro de uma variável.

### Como funciona na prática?

**Sintaxe:** A imagem mostra a estrutura básica desse comando, que é: `<variável> = <expressão>;`.

- **<variável>:** É o nome da caixa onde você vai guardar o valor.
- **=** É o sinal de igual, mas aqui ele não significa "igual a", e sim "recebe". Ou seja, a variável está "recebendo" um valor.
- **<expressão>:** É o valor que você quer guardar na variável. Pode ser um número, uma palavra ou até mesmo o resultado de um cálculo.
- **;** É o ponto e vírgula, que indica o fim da instrução.

### Regra

A imagem também explica como o comando funciona em duas etapas:

1. **Cálculo:** Primeiro, o computador calcula o valor da expressão.
2. **Armazenamento:** Depois, o resultado desse cálculo é guardado na variável.

### Exemplo:

```Java
idade = 30;
```

Nesse exemplo:

- **idade** é a variável.
- **=** significa "recebe".
- **30** é o valor que está sendo atribuído à variável.

### O que isso significa?

Criamos uma caixa chamada **"idade"** e colocamos o número **30** dentro dela. Agora, sempre que usarmos a palavra **"idade"** no nosso programa, o computador vai entender que estamos falando sobre o número **30**.

### Em resumo:

O comando de atribuição é uma ferramenta essencial na programação, pois permite que você manipule dados de forma organizada e eficiente. É como criar etiquetas para suas caixas e saber exatamente o que tem dentro de cada uma.

# Passo a Passo 
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/ProcessamentoDadosEx1.png" alt="java" width="50%">
</div>

A imagem apresenta um pequeno trecho de código em Java, especificamente um exemplo de como utilizar variáveis e realizar operações simples.

### Vamos decompor o código linha por linha:

```Java
int x, y;
```

### Declaração de Variáveis

Essa linha cria duas variáveis chamadas **x** e **y**.

### Tipo de Dado

Ambas as variáveis são do tipo **int**, o que significa que elas podem armazenar números inteiros (sem casas decimais).


```Java
x = 5;
```
### Atribuição de Valor

Aqui, atribuímos o valor **5** à variável **x**. Em outras palavras, estamos dizendo que a partir deste ponto, a letra **x** representará o número **5** dentro do nosso programa.


```Java
y = 2 * x;
```
### Cálculo e Atribuição

Nesta linha, realizamos uma operação matemática: multiplicamos o valor atual de **x** (que é **5**) por **2**. O resultado dessa operação (**10**) é então atribuído à variável **y**.

```Java
System.out.println(x);
```
### Impressão na Tela

Essa linha faz com que o programa exiba o valor atual da variável **x** na tela. Portanto, será impresso o número **5**.

```Java
System.out.println(y);
```

### Impressão na Tela

De forma similar à linha anterior, esta linha imprime o valor atual da variável **y**, que é **10**.

## Em Resumo

O código cria duas variáveis, atribui um valor a uma delas, realiza um cálculo simples e, por fim, mostra os valores finais das duas variáveis na tela.

### O que o Programa Faz

1. **Cria duas caixas:** Imaginemos que **x** e **y** são duas caixas.
2. **Coloca um número 5 na caixa x:** A caixa **x** agora contém o número **5**.
3. **Multiplica o número na caixa x por 2 e coloca o resultado na caixa y:** A caixa **y** agora contém o resultado da multiplicação, que é **10**.
4. **Mostra o conteúdo das duas caixas na tela:** O programa exibe os números **5** e **10** na tela.

### Conceitos Importantes

- **Variáveis:** São como rótulos para guardar valores na memória do computador.
- **Tipos de Dados:** Indicam o tipo de valor que uma variável pode armazenar (inteiros, números com casas decimais, texto, etc.).
- **Atribuição:** É o ato de dar um valor a uma variável.
- **Operações:** São cálculos que podem ser realizados com os valores armazenados nas variáveis.
- **Saída:** É a forma como o programa mostra os resultados para o usuário, geralmente na tela.

Este é um exemplo básico, mas demonstra os fundamentos da programação: declarar variáveis, realizar cálculos e exibir resultados. A partir daqui, você pode construir programas mais complexos e realizar tarefas mais sofisticadas.

# Conversão de Tipos (Cast)
### O que é Cast?

**Cast** é o processo de converter um valor de um tipo de dado para outro tipo. Isso é útil quando você precisa trabalhar com diferentes tipos de dados e garantir que as operações sejam realizadas corretamente. Em Java, você pode realizar cast de diferentes formas, dependendo do contexto.

### Como Funciona o Cast?
**Cast Implícito**:

Ocorre automaticamente quando você atribui um valor de um tipo menor para um tipo maior. Por exemplo, ao atribuir um `int` a um `double`, a conversão é feita automaticamente:
```java
int inteiro = 10;
double decimal = inteiro; // Cast implícito de int para double
```` 

**Cast Explícito**

Quando você precisa converter um tipo maior para um tipo menor, você deve fazer isso explicitamente. Em Java, isso é feito colocando o tipo desejado entre parênteses antes da variável:
```java
double decimal = 9.78;
int inteiro = (int) decimal; // Cast explícito de double para int
```

**Quando Usar Cast?**

- **Precisão de Dados**: Ao realizar operações que envolvem diferentes tipos de dados, como cálculos entre inteiros e decimais.
- **Armazenamento**: Quando você precisa armazenar um valor em uma variável que não pode conter o tipo original do valor.
- **Interoperabilidade**: Ao lidar com bibliotecas ou APIs que requerem tipos específicos.

**Exemplos de Cast**

- **Exemplo de Cast Implícito**:
  ```java
  double d = 3.14;
  int i = 7;
  double resultado = d + i; // Cast implícito de int para double
  System.out.println(resultado); // Saída: 10.14
  ````
- **Exemplo de Cast Explícito:**

  ```java
  double d = 3.99;
  int i = (int) d; // Cast explícito de double para int
  System.out.println(i); // Saída: 3
  ```

**Em Resumo**

O cast é uma técnica fundamental para manipular e converter dados entre diferentes tipos. Entender como e quando usar o cast é crucial para garantir que seu programa funcione corretamente e que os dados sejam manipulados da maneira desejada.

#### [Clique aqui para voltar ao repositório EstruturaSequencial](https://github.com/gabrielmelim/JAVA/tree/EstruturaSequencial)
