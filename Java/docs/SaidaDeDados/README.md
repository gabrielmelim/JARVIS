#### [Clique aqui para voltar ao repositório EstruturaSequencial](https://github.com/gabrielmelim/JAVA/tree/EstruturaSequencial)

# Saída de Dados
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/Saida%20de%20dados.png" alt="java" width="50%">
</div>

A imagem representa de forma simples o processo de saída de dados em um computador. Imagine que um computador é como um cérebro que pensa e um computador. Quando você pede para ele fazer algo, como calcular um valor ou mostrar uma imagem, ele "pensa" e depois te mostra o resultado.

Vamos entender cada parte da imagem:

- **Programa:** É como a "mente" do computador. Ele tem instruções que dizem o que o computador deve fazer.
- **Usuário:** É você! A pessoa que usa o computador e quer ver os resultados.
- **Saída de Dados:** É a informação que o computador te mostra, como um número, uma imagem ou um texto.
- **Dispositivo de Saída:** É o lugar onde você vê a saída de dados. Na imagem, é um monitor, mas pode ser também uma impressora, um alto-falante, etc.
- **Seu saldo: $3500.00:** É um exemplo de saída de dados. O programa calculou o seu saldo e mostrou o resultado na tela.

### Em resumo:

A imagem mostra que o computador, através de um programa, realiza um cálculo (no caso, o saldo) e mostra o resultado para o usuário em um dispositivo de saída, como um monitor. Esse processo é chamado de saída de dados ou escrita.

É como se o computador estivesse te "contando" o resultado de um cálculo ou te mostrando uma informação que você pediu.

### Exemplo:

Imagine que você pede para o computador somar dois números. O computador faz o cálculo e mostra o resultado na tela. Essa é uma saída de dados!

# Imprimindo na Tela 
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/TextoQualquer.png" alt="java" width="50%">
</div>

A imagem apresenta um código simples em Java, uma linguagem de programação muito utilizada para criar diversos tipos de aplicativos. O código demonstra como imprimir um texto na tela, com e sem quebra de linha.

Para entender melhor, vamos analisar cada parte:

### `System.out.print("Bom dia!");`

- **`System.out`:** Representa a saída padrão do sistema, que geralmente é o console (terminal) do seu computador.
- **`print()`:** É um método que serve para imprimir algo na tela.
- **`"Bom dia!"`:** É a mensagem que você quer imprimir. As aspas duplas indicam que `"Bom dia!"` é uma string (texto).
- **`;`**: É o ponto e vírgula, que indica o fim da instrução.

#### O que acontece quando você executa essa linha de código?

A frase `"Bom dia!"` será exibida na tela, mas o cursor permanecerá na mesma linha, pronto para imprimir algo a seguir.

### `System.out.println("Bom dia!");`

A única diferença em relação à linha anterior é o `ln` no final de `print`.

- **`println()`:** Significa "print line", ou seja, imprimir e pular uma linha.

#### O que acontece quando você executa essa linha de código?

A frase `"Bom dia!"` será exibida na tela e o cursor irá para a próxima linha.

### Em resumo:

- **`print()`:** Imprime na tela sem pular linha.
- **`println()`:** Imprime na tela e pula para a próxima linha.

### Exemplo prático:

Imagine que você quer escrever um poema na tela. Você poderia usar `println()` para que cada verso comece em uma nova linha.

```java
System.out.println("O céu está azul,");
System.out.println("As nuvens, algodão.");
System.out.println("Que dia lindo!");
```
### Em outras palavras:

- **`print()`:** É como escrever em uma folha de papel sem pular linha.
- **`println()`:** É como escrever em uma folha de papel e pular para a próxima linha.

### Observações:

- Esse é um exemplo básico de como utilizar a saída padrão em Java.
- Existem outras formas de formatar a saída, como utilizar caracteres especiais para criar tabelas ou ajustar a fonte.
- A linguagem Java oferece muitas outras funcionalidades além da impressão de textos na tela.

### Exemplos de Saida No Eclipse:

#### Sem quebra de linha:
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/SemQuebraDeLinha.png" alt="java" width="50%">
</div>

#### Com quebra de linha:
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/QuebraDeLinha.png" alt="java" width="50%">
</div>
<br>

### Saida de dados com variaveis:

<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/VariavelTipoBasicoApr.png" alt="java" width="50%">
</div>
<br>


A imagem mostra como pegar um número guardado em uma caixinha (a variável) e mostrar esse número na tela do computador. se você estiver confuso pode dar uma lida na documentação 📁 [Variáveis](https://github.com/gabrielmelim/JAVA/tree/EstruturaSequencial/Java/docs/TiposBasicosVariaveis)

### Exemplo:

<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/AprVariavel.png" alt="java" width="50%">
</div>
<br>


# Imprimindo Números com Ponto Flutuante

<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/VarPontoFlutuante.png" alt="java" width="50%">
</div>

A imagem apresenta diferentes formas de imprimir o valor de uma variável do tipo `double` (número com ponto flutuante) em Java. Ela demonstra como controlar o número de casas decimais exibidas e como lidar com diferentes configurações regionais (locales).

## Explicando passo a passo:

### Declaração da variável:

```java
double x = 10.35784;
```

### Trabalhando com Variáveis do Tipo `double` em Java

### Declaração da Variável

Crie uma variável chamada `x` do tipo `double` e atribua a ela o valor `10.35784`:

```java
double x = 10.35784;
```

### Imprimindo o Valor Completo

Para imprimir o valor completo da variável `x`, incluindo todas as casas decimais, use o método `println()`:

```java
System.out.println(x);
```

Isso exibirá o valor completo da variável `x`, incluindo todas as casas decimais.

### Formatando a Saída com Duas Casas Decimais

Para formatar a saída e exibir o valor com duas casas decimais, use o método `printf()`:

```java
System.out.print("%.2f%n", x);
```

- **`printf`** é um método mais flexível para formatar a saída.
- **`%.2f`** indica que queremos imprimir um número de ponto flutuante (`f`) com duas casas decimais (`.2`).
- **`%n`** insere uma quebra de linha após a saída.

### Formatando a Saída com Quatro Casas Decimais

Para formatar a saída e exibir o valor com quatro casas decimais, use o método `printf()`:

```java
System.out.printf("%.4f%n", x);
```
Isso é similar ao exemplo anterior, mas agora com quatro casas decimais.

### O que significa cada parte?

- **`double`:** Tipo de dado que representa números com ponto flutuante (números reais).
- **`System.out.println()`:** Método para imprimir uma linha de texto na tela.
- **`System.out.printf()`:** Método para imprimir uma linha de texto formatada.
- **`%.2f`:** Especificador de formato para números de ponto flutuante com duas casas decimais.
- **`%n`:** Insere uma quebra de linha.
- **`\n`:** Insere uma quebra de linha.

### Por que usar `printf`?

- **Flexibilidade:** Permite controlar a formatação da saída de forma precisa.
- **Personalização:** Você pode definir a largura do campo, alinhamento, preenchimento e outros detalhes.

### Atenção à Configuração Regional

- **`Locale.setDefault(Locale.US);`**: Define a configuração regional como "Estados Unidos". Isso garante que o separador decimal seja sempre o ponto (`.`), independentemente das configurações do sistema.

### Em resumo

A imagem mostra como controlar a forma como um número com ponto flutuante é exibido na tela em Java. Ao usar `printf`, você pode personalizar a saída de acordo com suas necessidades, definindo o número de casas decimais, o formato e outros detalhes.

### Exemplo prático

Imagine que você quer calcular o valor de uma compra com desconto e mostrar o resultado formatado com duas casas decimais:

```java
double preco = 100.50;
double desconto = 10;
double valorFinal = preco - (preco * desconto / 100);
System.out.printf("O valor final é: R$ %.2f%n", valorFinal);
```
Isso imprimiria algo como: `O valor final é: R$ 90.45`

### Exemplos no Eclipse:
#### Duas Casas Decimais:
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/pontoFlutanteExamplePrint.png" alt="java" width="50%">
</div>


#### Quatro Casas Decimais:
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/QuatroCasasDec.png" alt="java" width="50%">
</div>

Nestes exemplos podemos ver o print de uma variavel como um todo dentro do `println` e print de uma variavel com `printf` formatada de forma personalizada.

### Comportamento Padrão do `printf` e Configuração Regional

Por padrão, o método `printf` segue o formato regional do computador onde está sendo executado. Por exemplo, se o seu computador está configurado para o idioma Português do Brasil, o `printf` usará a vírgula como separador decimal, que é o padrão para essa configuração regional.

Para garantir que a saída siga um formato específico, independentemente das configurações regionais do sistema, você pode definir explicitamente o padrão regional que deseja usar. Para forçar o uso do ponto como separador decimal, que é o padrão dos Estados Unidos, você pode configurar o `Locale` do seu programa da seguinte forma:

```java
Locale.setDefault(Locale.US);
```

Essa configuração garante que o printf utilize o formato dos Estados Unidos para a saída, com o ponto (`.`) como separador decimal, ao invés da vírgula (`,`) que pode ser o padrão em outras regiões.

Ao definir o `Locale` para `Locale.US`, você assegura que a formatação dos números no seu programa será consistente, independentemente das configurações regionais do sistema onde o código está sendo executado.

### Exemplos no Eclipse:
Perceba que ao escrever Locale.setDeFault(Locale.) quando vc escreve o ponto ele recomenda alguns formatos.
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/Locale.png" alt="java" width="50%">
</div>

### Após definir o locale reparem a saida:
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/LocaleUS.png" alt="java" width="50%">
</div>

# Concatenando Elementos em Java

### Após definir o locale reparem a saida:
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/Concatenar.png" alt="java" width="50%">
</div>

A imagem apresenta uma forma simples e direta de concatenar (juntar) diferentes elementos em uma única linha de código, utilizando a linguagem de programação Java.

### O que significa concatenar?

Concatenar é como "colar" diferentes partes para formar uma única unidade. Por exemplo, se você quer criar uma frase completa a partir de palavras soltas, a concatenação une essas palavras para formar uma frase coesa.

### Como a imagem explica a concatenação em Java

Regra geral: A imagem estabelece uma regra geral para os comandos `print` e `println`: você pode juntar diversos elementos usando o operador `+`.

### Exemplo de Concatenação

Em Java, você pode usar o operador `+` para concatenar strings e outros tipos de dados. Aqui está um exemplo simples:

```java
String nome = "João";
int idade = 25;
System.out.println("Nome: " + nome + ", Idade: " + idade);
```

Neste exemplo, o operador `+` é usado para unir a string `"Nome: "` com a variável `nome` e, em seguida, unir isso com a string `", Idade: "` e a variável `idade`. A saída será:

```Java
Nome: João, Idade: 25
```

### Exemplo Prático

```java
System.out.println("RESULTADO = " + x + " METROS");
```` 
- `"RESULTADO = "` é uma string (texto).
- `x` é uma variável que pode conter um número, por exemplo.
- `" METROS"` é outra string.

Ao usar o operador `+`, esses três elementos são concatenados, formando a frase completa: 
```Java
"RESULTADO = [valor de x] METROS"
```

### Em resumo

Para concatenar elementos em Java, basta colocá-los um após o outro, separados pelo operador `+`. O resultado será a junção de todos esses elementos em uma única string.

### Exemplo mais detalhado

Suponha que a variável `x` tenha o valor `10`. Ao executar o código:

```java
int x = 10;
System.out.println("RESULTADO = " + x + " METROS");
```

A saída será:

```Java
RESULTADO = 10 METROS
```

Neste exemplo, `"RESULTADO = "` é uma string, `x` é a variável cujo valor é `10`, e `"METROS"` é outra string. O operador `+` concatena esses elementos, resultando na frase completa `"RESULTADO = 10 METROS"`.

### Por que usar a concatenação?

- **Criar mensagens personalizadas:** Você pode criar mensagens dinâmicas incluindo valores de variáveis em textos. Por exemplo, você pode exibir o resultado de um cálculo ou uma informação específica para o usuário.

- **Montar strings complexas:** É possível construir strings mais longas a partir de partes menores. Isso é útil quando você precisa combinar diferentes fragmentos de texto para formar uma mensagem completa.

- **Formatar a saída:** Você pode controlar a aparência da saída inserindo espaços, quebras de linha e outros caracteres especiais. Isso ajuda a tornar a saída mais legível e organizada.

A concatenação permite que você junte diferentes partes em uma única string, facilitando a criação de mensagens e a formatação da saída no seu programa Java.

### Exemplo no Eclipse Utilizando Println:

<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/ExemploConcatPrintln.png" alt="java" width="50%">
</div>

### Exemplo no Eclipse Utilizando Printf:

<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/ExemploConcatPrintf.png" alt="java" width="50%">
</div>

O código a seguir utiliza o método `printf` para formatar a saída de uma variável em Java:

```java
System.out.printf("Resultado = %.2f Metros\n", x);
```` 
O método `printf` é da classe `PrintStream` e é usado para imprimir texto formatado. Diferente do método `println`, que apenas imprime o texto na tela, `printf` permite a formatação detalhada da saída.

### `"Resultado = %.2f Metros\n"`

Este é o template de formatação que define como o texto será exibido. Vamos quebrar cada parte:

- **`Resultado = `**: Texto literal que será impresso exatamente como está.
- **`%.2f`**: Especificador de formato que indica como a variável deve ser colocada e formatada:
  - **`%`**: Início do especificador de formato.
  - **`.2`**: Indica que queremos mostrar o número com duas casas decimais.
  - **`f`**: Indica que a variável é um número de ponto flutuante (float ou double).
- **`Metros`**: Texto literal que será impresso após o valor da variável.
- **`\n`**: Caractere de nova linha, que move o cursor para a linha seguinte após a impressão.

### `x`

- **`x`** é a variável cujo valor será formatado e inserido no lugar do especificador `%f`. O valor de `x` será exibido com duas casas decimais, seguido pelo texto literal.

Este código `System.out.printf("Resultado = %.2f Metros\n", x);` formata a saída de maneira que o valor da variável `x` seja exibido com duas casas decimais, precedido pelo texto `"Resultado = "` e seguido pelo texto `" Metros"`, com uma quebra de linha ao final.

## Concatenando Elementos em Java com `printf` e Diversos Elementos

<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/VariosElementosConcat.png" alt="java" width="50%">
</div>

A imagem apresenta uma forma eficiente de combinar diferentes tipos de dados (texto, números inteiros e números com casas decimais) em uma única linha de saída, utilizando o comando `printf` em Java.

### Como Funciona

- **`printf`**: É um método mais versátil que `println` para formatar a saída. Ele permite especificar exatamente como cada valor deve ser exibido.

- **Especificadores de Formato**: Os caracteres `%d`, `%f` e `%s` são usados para indicar o tipo de dado que será inserido naquela posição:
  - **`%d`**: Número inteiro
  - **`%f`**: Número de ponto flutuante (com casas decimais)
  - **`%s`**: String (texto)
  - **`%n`**: Quebra de linha

- **Argumentos**: Após a string de formato, você lista as variáveis que serão inseridas nas posições indicadas pelos especificadores. A ordem dos argumentos deve corresponder à ordem dos especificadores.

### Exemplo Prático

Aqui está um exemplo de como você pode usar `printf` para concatenar diferentes tipos de dados:

```java
int idade = 25;
double altura = 1.75;
String nome = "João";

System.out.printf("Nome: %s, Idade: %d anos, Altura: %.2f metros%n", nome, idade, altura);
```

### Explicação

- **`Nome: %s`**: Substitui `%s` pelo valor da variável `nome`.
- **`Idade: %d anos`**: Substitui `%d` pelo valor da variável `idade`.
- **`Altura: %.2f metros`**: Substitui `%f` pelo valor da variável `altura`, formatado com duas casas decimais.
- **`%n`**: Adiciona uma quebra de linha após a saída.

### Exemplo de Saída

O comando `printf` com o exemplo fornecido imprimirá:

```Java
Nome: João, Idade: 25 anos, Altura: 1.75 metros
``` 

### Resumo
O método `printf` é ideal para criar saídas formatadas que combinam diferentes tipos de dados. Os especificadores de formato permitem controlar a exibição precisa de números e textos, enquanto os argumentos fornecem os valores a serem inseridos nas posições indicadas.

### Exercício de Fixação:

<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/Exercicio%20Saida%20Dados%201.png" alt="java" width="50%">
</div>

### Exercício de Fixação Concluido:

📘 [Exercício de Fixação Saida de Dados](https://github.com/gabrielmelim/JAVA/blob/EstruturaSequencial/Java/codigo/ExercicioFixacaoSaidaDados/src/Main.java)

### Obs:
Vocês podem encontrar o código na pasta Java/Codigo na branch 🌳 [EstruturaSequencial](https://github.com/gabrielmelim/JAVA/tree/EstruturaSequencial/Java/codigo)

