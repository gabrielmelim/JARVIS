#### [Clique aqui para voltar ao repositório EstruturaSequencial](https://github.com/gabrielmelim/JAVA/tree/EstruturaSequencial)

# Variáveis
<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/variaveisJava.png" alt="java" width="100%">
</div>

### O que é uma variável?

Uma variável é como um recipiente na memória do computador onde você armazena dados, como números, textos ou outros valores.  
Imagine uma caixa: você dá um nome para ela (o nome da variável) e coloca algo dentro (o valor da variável).

### Como declarar uma variável?

A sintaxe geral para declarar uma variável é:

```cpp
<tipo> <nome> = <valor inicial>;
```

- **Tipo**: Indica o tipo de dado que a variável irá armazenar (por exemplo, inteiro, decimal, caractere).
- **Nome**: É o nome que você escolhe para a variável, que servirá para identificá-la no seu programa.
- **Valor inicial**: (opcional) É o valor que você atribui à variável no momento da declaração.

**Exemplo:**

```cpp
int idade = 25;
```

**int**: Indica que a variável armazenará um número inteiro.  
**idade**: É o nome da variável.  
**25**: É o valor inicial da variável, ou seja, a idade será 25.

**O que a imagem mostra:**

- **Parte de cima**: Apresenta a sintaxe geral para declarar uma variável.
- **Parte do meio**: Mostra exemplos de declaração de variáveis com diferentes tipos de dados (inteiro, decimal e caractere).
- **Parte de baixo**: Explica que uma variável possui um nome, um tipo, um valor e um endereço de memória.
- **Diagrama**: Representa a memória do computador, onde cada variável ocupa um espaço e armazena seu valor.

**Em resumo:**

A imagem explica de forma clara e concisa como declarar variáveis em programação. As variáveis são essenciais para armazenar dados que serão utilizados durante a execução de um programa.

**Para que servem as variáveis?**

- **Armazenar dados**: Como números, textos, resultados de cálculos, etc.
- **Manipular dados**: Você pode realizar operações com as variáveis, como somar, subtrair, comparar, etc.
- **Controlar o fluxo de um programa**: As variáveis podem ser usadas para tomar decisões e repetir ações dentro de um programa.

Em outras palavras, as variáveis são os blocos de construção básicos de qualquer programa.

# Tipos de Dados Primitivos em Java
<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/TiposPrimitivos.png" alt="java" width="100%">
</div>

A imagem apresenta uma tabela que resume os tipos de dados primitivos utilizados na linguagem de programação Java. Esses tipos são os blocos básicos para construir qualquer programa em Java, e cada um deles possui características específicas.

### O que significa "tipo de dado primitivo"?

Imagine que você quer guardar um número em seu programa. Você precisa dizer ao computador qual tipo de número é esse: um número inteiro pequeno, um número grande, um número com casas decimais, etc. É aí que entram os tipos de dados primitivos. Eles definem o tipo de valor que uma variável pode armazenar e o tamanho de espaço que essa variável ocupará na memória do computador.

### Explicando a tabela:

- **Descrição**: Explica brevemente para que serve cada tipo de dado.
- **Tipo**: É o nome curto do tipo de dado (por exemplo, `int`, `double`).
- **Tamanho**: Indica quantos bits são utilizados para armazenar um valor desse tipo. Quanto maior o número de bits, maior o intervalo de valores que podem ser representados.
- **Valores**: Mostra o intervalo de valores que cada tipo pode armazenar.
- **Valor padrão**: É o valor que uma variável desse tipo assume quando é declarada, mas não é inicializada com um valor específico.

### Tipos numéricos inteiros:

- **byte**: Números inteiros pequenos.
- **short**: Números inteiros um pouco maiores que `byte`.
- **int**: Números inteiros mais comuns, utilizados para a maioria dos cálculos.
- **long**: Números inteiros muito grandes.

### Tipos numéricos com ponto flutuante:

- **float**: Números com casas decimais, utilizados para valores aproximados.
- **double**: Números com casas decimais de maior precisão.

### Outros tipos:

- **char**: Um único caractere (letra, número ou símbolo).
- **boolean**: Um valor lógico, que pode ser verdadeiro (`true`) ou falso (`false`).

### O tipo String:

Embora não seja um tipo primitivo, o `String` é muito importante e merece destaque. Ele representa uma sequência de caracteres, ou seja, palavras ou textos.

### Em resumo:

A tabela apresenta os tipos de dados básicos que você utilizará em seus programas Java. Ao escolher o tipo de dado correto para cada variável, você garante que seus programas sejam eficientes e evitem erros de cálculo.

### Exemplo:

Se você precisa armazenar a idade de uma pessoa, o tipo `int` seria adequado, pois a idade é um número inteiro. Se você precisa armazenar a altura de uma pessoa, o tipo `double` seria mais adequado, pois a altura pode ter casas decimais.

# Nomes de Variáveis
<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/NomeVariavel.png" alt="java" width="100%">
</div>

A imagem apresenta as regras básicas para a criação de nomes de variáveis em programação, utilizando a linguagem Java como exemplo.

### O que é uma variável?

Imagine uma caixa onde você guarda informações. Em programação, essa caixa é chamada de variável.  
Cada caixa precisa de um nome para que você possa encontrá-la e utilizar a informação que está dentro dela.

### Regras para dar nomes às variáveis:

A imagem destaca as seguintes regras:

- **Não pode começar com número**: O nome da variável deve começar com uma letra (maiúscula ou minúscula) ou com o símbolo de sublinhado (`_`).
- **Não pode ter espaço**: Use apenas letras, números e o sublinhado para formar o nome.
- **Não use acentos ou til**: Estes caracteres não são permitidos em nomes de variáveis.
- **Sugestão: use o padrão "camel case"**: Essa é uma convenção muito utilizada em programação. Nela, a primeira letra da primeira palavra é minúscula e a primeira letra de cada palavra subsequente é maiúscula (ex: `salarioDoFuncionario`).

### Por que essas regras?

- **Clareza**: Nomes de variáveis claros facilitam a leitura e a compreensão do código.
- **Evitar erros**: Seguir essas regras ajuda a evitar erros de compilação e torna o código mais robusto.
- **Convenção**: O uso de um padrão como o "camel case" facilita a colaboração entre programadores.

### Exemplos:

| Errado                   | Correto               |
|--------------------------|------------------------|
| `int 5minutos;`          | `int _5minutos;`       |
| `int salário;`           | `int salario;`         |
| `int salário do funcionario;` | `int salarioDoFuncionario;` |

### O que significa "camel case"?

É uma forma de escrever palavras concatenadas sem espaços, iniciando cada nova palavra com uma letra maiúscula.  
Por exemplo: `salarioDoFuncionario`.

### Em resumo:

A imagem mostra que a escolha de nomes para variáveis é importante para escrever um código limpo, organizado e fácil de entender. Ao seguir as regras apresentadas, você contribui para a qualidade do seu código e facilita a vida de outros programadores que possam trabalhar com ele no futuro.

### Dica:

Use nomes de variáveis que reflitam o propósito da variável. Por exemplo, ao invés de usar a variável `x`, use `idade` se ela armazena a idade de uma pessoa. Isso torna o código mais autoexplicativo.



