#### [Clique aqui para voltar ao repositório EstruturaSequencial](https://github.com/gabrielmelim/JAVA/tree/EstruturaSequencial)

# Criando um Objeto Scanner em Java
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/EntradaDeDados.png" alt="java" width="50%">
</div>

### O que a imagem mostra:

A imagem apresenta um código em Java, especificamente um trecho que demonstra como criar um objeto do tipo `Scanner`. Esse objeto é fundamental para permitir que um programa interaja com o usuário, ou seja, para que o usuário possa digitar dados que serão utilizados pelo programa.

### Explicando o código:

```java
Scanner sc = new Scanner(System.in);
```

- **`Scanner sc`**: Declara uma variável chamada `sc` do tipo `Scanner`. Essa variável irá armazenar o objeto que estamos criando.
- **`new Scanner(System.in)`**: Cria um novo objeto `Scanner`. O argumento `System.in` indica que o `Scanner` irá ler dados da entrada padrão, que no caso dos programas em console, é o teclado.
- **`import java.util.Scanner;`**: Essa linha importa a classe `Scanner` do pacote `java.util`. Isso é necessário para que possamos utilizar a classe `Scanner` em nosso código.

- **`import java.util.Scanner;`**: Essa linha importa a classe `Scanner` do pacote `java.util`. Isso é necessário para que possamos utilizar a classe `Scanner` em nosso código.

### Em resumo:

A linha de código `Scanner sc = new Scanner(System.in);` cria um objeto que permite ao programa ler dados digitados pelo usuário no teclado. Esse objeto é uma ferramenta essencial para criar programas interativos em Java.

### Para que serve:

Imagine um programa que pede para o usuário digitar seu nome. Para capturar essa informação, o programa utilizaria o objeto `Scanner`. O usuário digitaria o nome no teclado, e o programa usaria o `Scanner` para armazenar esse nome em uma variável.

### Observação:

É importante fechar o `Scanner` quando ele não for mais necessário, utilizando o método `sc.close()`. Isso libera os recursos utilizados pelo objeto.

### Em poucas palavras:

A imagem mostra como fazer com que um programa em Java "ouça" o que o usuário digita no teclado.

# Lendo uma Palavra com Scanner em Java
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/EntradaDeDadosEx1.png" alt="java" width="50%">
</div>

### O que a imagem mostra:

A imagem ilustra de forma visual como o método `next()` da classe `Scanner` é utilizado em Java para ler uma única palavra (ou seja, uma sequência de caracteres sem espaços) digitada pelo usuário e armazená-la em uma variável do tipo `String`.


#### Declaração da variável:

- A linha `String x;` declara uma variável chamada `x` do tipo `String`. Essa variável será usada para armazenar a palavra que o usuário digitar.

#### Lendo a palavra:

- A linha `x = sc.next();` faz com que o programa espere o usuário digitar uma palavra no teclado e a armazene na variável `x`.
  - **`sc`**: É o objeto `Scanner` que já deve ter sido criado anteriormente para ler a entrada do usuário.
  - **`next()`**: É um método do objeto `Scanner` que lê a próxima palavra (token) da entrada.

#### Armazenando na memória:

- A parte da imagem que representa a memória RAM mostra como a palavra "Maria" (por exemplo) é armazenada na variável `x`. A variável `x` passa a referenciar a posição na memória onde a palavra está armazenada.

### Em resumo:

A imagem demonstra o processo de:

1. **Declaração**: Criar uma variável para guardar a palavra.
2. **Leitura**: Usar o método `next()` do `Scanner` para ler a palavra digitada pelo usuário.
3. **Armazenamento**: Guardar a palavra na variável declarada.

Análise da Imagem: Lendo uma Palavra com Scanner em Java
O que a imagem mostra:

A imagem ilustra de forma visual como o método next() da classe Scanner é utilizado em Java para ler uma única palavra (ou seja, uma sequência de caracteres sem espaços) digitada pelo usuário e armazená-la em uma variável do tipo String.

Explicando a imagem:

Declaração da variável:

A linha String x; declara uma variável chamada x do tipo String. Essa variável será usada para armazenar a palavra que o usuário digitar.
Lendo a palavra:

A linha `x = sc.next();` faz com que o programa espere o usuário digitar uma palavra no teclado e a armazene na variável `x`.
`sc:` É o objeto Scanner que já deve ter sido criado anteriormente para ler a entrada do usuário.
`next()`: É um método do objeto Scanner que lê a próxima palavra (token) da entrada.
Armazenando na memória:

A parte da imagem que representa a memória RAM mostra como a palavra "Maria" (por exemplo) é armazenada na variável x. A variável x passa a referenciar a posição na memória onde a palavra está armazenada.
Em resumo:

A imagem demonstra o processo de:

Declaração: Criar uma variável para guardar a palavra.
Leitura: Usar o método next() do Scanner para ler a palavra digitada pelo usuário.
Armazenamento: Guardar a palavra na variável declarada.
Exemplo em código completo:

```Java
import java.util.Scanner;

public class LerPalavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String nome = sc.next();
        
        System.out.println("Você digitou: " + nome);
        
        sc.close();
    }
}
```

### Para que serve:

Esse mecanismo é fundamental para criar programas que interagem com o usuário, permitindo que o programa receba dados digitados pelo usuário e os utilize para realizar cálculos, tomar decisões ou gerar resultados.

### Importante:

- O método `next()` lê apenas até o próximo delimitador (por padrão, um espaço em branco). Se você quiser ler uma linha completa, incluindo espaços, use `nextLine()`.
- Lembre-se de fechar o `Scanner` após o uso, utilizando `sc.close()`, para liberar os recursos.

### Em poucas palavras:

A imagem mostra como fazer com que um programa em Java leia uma palavra digitada pelo usuário e a guarde para ser usada depois.

# Lendo Números Inteiro com Scanner em Java
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/EntradaDeDadosInt.png" alt="java" width="50%">
</div>

### O que a imagem mostra:

A imagem ilustra de forma simples como ler um número inteiro digitado pelo usuário em um programa Java e armazená-lo em uma variável.

### Explicando a imagem:

#### Declaração da variável:

- **`int x;`**: Essa linha declara uma variável chamada `x` do tipo `int`. Variáveis do tipo `int` são utilizadas para armazenar números inteiros (sem casas decimais).

#### Lendo o número:

- **`x = sc.nextInt();`**: Essa linha faz com que o programa espere o usuário digitar um número inteiro no teclado e o armazene na variável `x`.
  - **`sc`**: É o objeto `Scanner` que já deve ter sido criado anteriormente para ler a entrada do usuário.
  - **`nextInt()`**: É um método do objeto `Scanner` específico para ler números inteiros.

#### Armazenando na memória:

- A parte da imagem que representa a memória RAM mostra como o número 10 (por exemplo) é armazenado na variável `x`. A variável `x` passa a referenciar a posição na memória onde o número está armazenado.

### Em resumo:

A imagem demonstra o processo de:

1. **Declaração**: Criar uma variável para guardar o número inteiro.
2. **Leitura**: Usar o método `nextInt()` do `Scanner` para ler o número digitado pelo usuário.
3. **Armazenamento**: Guardar o número na variável declarada.

```Java
import java.util.Scanner;

public class LerNumeroInteiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   


        System.out.print("Digite um número inteiro: ");
        int idade = sc.nextInt();

        System.out.println("Você digitou: " + idade);

        sc.close();
    }
}
```

### Para que serve:

Esse mecanismo é fundamental para criar programas que trabalham com números inteiros, como por exemplo:

- Calculadoras simples
- Jogos que envolvem pontuações
- Programas que realizam contagens

### Em poucas palavras:

A imagem mostra como fazer com que um programa em Java leia um número inteiro digitado pelo usuário e o guarde para ser usado depois.


# Lendo Números de Ponto Flutuante com Scanner em Java
<div align="left">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/EntradaDeDadosExPontoFloat.png" alt="java" width="50%">
</div>

### O que a imagem mostra:

A imagem apresenta um trecho de código Java que demonstra como ler um número de ponto flutuante (um número com casas decimais) digitado pelo usuário e armazená-lo em uma variável.

### Explicando o código:

- **`double x;`**:
  - Declara uma variável chamada `x` do tipo `double`. O tipo `double` é usado para representar números de ponto flutuante em Java.

- **`x = sc.nextDouble();`**:
  - **`sc.nextDouble()`**: Lê o próximo número de ponto flutuante da entrada e o armazena na variável `x`.
  - **`sc`**: É o objeto `Scanner` que já deve ter sido criado anteriormente para ler a entrada do usuário.
  - **`nextDouble()`**: É um método específico do `Scanner` para ler números de ponto flutuante.

### Atenção à Localidade:

A imagem destaca um ponto importante: a configuração da localidade. Em algumas localidades, o separador decimal é uma vírgula (`,`), enquanto em outras é um ponto (`.`). Para garantir que o programa interprete corretamente o número digitado pelo usuário, independentemente da configuração local do sistema, é recomendado usar:

- **`Locale.setDefault(Locale.US);`**: 
  - Essa linha define a localidade padrão como sendo a dos Estados Unidos, onde o separador decimal é o ponto. Essa configuração deve ser feita antes de criar o objeto `Scanner`.

### Em resumo:

A imagem mostra como:

1. **Declarar**: Uma variável do tipo `double` para armazenar o número.
2. **Ler**: Utilizar o método `nextDouble()` do `Scanner` para ler o número digitado pelo usuário.
3. **Configurar a localidade**: Garantir que o programa entenda o formato do número, independentemente da configuração local do sistema.

### Exemplo em código completo:
```Java
import java.util.Locale;
import java.util.Scanner;

public class LerNumero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define a localidade como US

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de ponto flutuante: ");
        double numero = sc.nextDouble();

        System.out.println("Você digitou: " + numero);

        sc.close();
    }
}
```

### Para que serve:

Esse mecanismo é essencial para criar programas que realizam cálculos com números reais, como por exemplo, calculadoras, simulações e jogos.

### Em poucas palavras:

A imagem mostra como fazer com que um programa em Java leia um número com casas decimais digitado pelo usuário e o guarde para ser usado em cálculos.


#### [Clique aqui para voltar ao repositório EstruturaSequencial](https://github.com/gabrielmelim/JAVA/tree/EstruturaSequencial)

