#### [Clique aqui para voltar ao repositório principal](https://github.com/gabrielmelim/JAVA)
# Overview Programação em Java


Java é uma linguagem de programação orientada a objetos amplamente utilizada em diversas áreas, desde desenvolvimento de aplicativos móveis até grandes sistemas corporativos. Sua popularidade se dá pela portabilidade (multiplataforma), robustez, segurança e vasto ecossistema de bibliotecas. Neste curso, abordaremos os conceitos fundamentais da linguagem, desde estruturas sequenciais até tópicos avançados como funções e orientação a objetos.

---

## Seção 1: Conceitos de Programação

### 1.1. Variáveis e Tipos de Dados

Uma **variável** é uma área da memória que guarda valores que podem ser alterados ao longo da execução do programa. Em Java, toda variável precisa ter um **tipo de dado** explícito. 

Tipos de dados comuns:
- `int`: Números inteiros.
- `double`: Números decimais (ponto flutuante).
- `String`: Sequência de caracteres (texto).
- `boolean`: Valores lógicos (verdadeiro ou falso).

Exemplo:

```java
int idade = 25;
double salario = 3000.50;
String nome = "Carlos";
boolean ativo = true;
```

> **Nota**: Escolher o tipo de dado correto é fundamental para garantir o bom uso da memória e eficiência do código.

### 1.2. Operadores

Java oferece diversos operadores que podem ser utilizados em variáveis e expressões, divididos em categorias:

- **Aritméticos**: Soma (+), subtração (-), multiplicação (*), divisão (/), módulo (%).
  
  Exemplo:
  ```java
  int a = 10;
  int b = 5;
  int soma = a + b; // Resultado: 15
  ```

- **Relacionais**: Igual (==), diferente (!=), maior que (>), menor que (<), maior ou igual (>=), menor ou igual (<=).

- **Lógicos**: E (&&), ou (||), negação (!).

> **Dica**: Operadores relacionais e lógicos são comumente utilizados em estruturas de controle como `if` e `while`.

---

## Seção 2: Introdução à Linguagem Java

### 2.1. O que é Java?

Java é uma linguagem **orientada a objetos**, o que significa que ela utiliza o conceito de objetos e classes para organizar o código. Além disso, ela é multiplataforma: um programa Java pode ser executado em qualquer sistema operacional que tenha a JVM (Java Virtual Machine) instalada, sem a necessidade de recompilação.

### 2.2. Estrutura básica de um programa em Java

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Explicação**:
- `public class HelloWorld`: Define uma classe chamada `HelloWorld`, que é o bloco principal do programa.
- `public static void main(String[] args)`: O método `main` é o ponto de entrada do programa, onde a execução começa.
- `System.out.println("Hello, World!")`: Imprime uma mensagem no console.

> **Dica**: Todo programa Java começa sua execução a partir do método `main`.

---

## Seção 3: Estrutura Sequencial

Em uma **estrutura sequencial**, as instruções são executadas uma após a outra, na ordem em que aparecem no código.

Exemplo:

```java
public class Sequencial {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int resultado = a + b;
        System.out.println("Resultado: " + resultado); // Resultado: 30
    }
}
```

Aqui, o programa realiza as operações na sequência: primeiro, declara as variáveis `a` e `b`, depois faz a soma, e por fim exibe o resultado.

---

## Seção 4: Estruturas Condicionais

Estruturas condicionais permitem tomar decisões no código com base em condições, utilizando blocos como `if`, `else if` e `else`.

Exemplo:

```java
public class Condicional {
    public static void main(String[] args) {
        int idade = 18;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
```

**Explicação**:
- O bloco `if` será executado se a condição (idade >= 18) for verdadeira.
- O bloco `else` será executado caso contrário.

> **Nota**: Estruturas condicionais são fundamentais para implementar lógicas dinâmicas e flexíveis no código.

---

## Seção 5: Estruturas Repetitivas

As estruturas de repetição permitem executar um bloco de código várias vezes, com base em uma condição.

### 5.1. Exemplo de laço `for`:

```java
public class Repeticao {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contagem: " + i);
        }
    }
}
```

- O laço `for` executa o bloco enquanto a condição `i <= 5` for verdadeira.
- A variável `i` é incrementada a cada iteração.

### 5.2. Exemplo de laço `while`:

```java
public class WhileLoop {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Contagem: " + contador);
            contador++;
        }
    }
}
```

> **Dica**: Use `for` quando souber exatamente quantas vezes o laço será repetido, e `while` quando a condição for dinâmica.

---

## Seção 6: Funções e Métodos

Em Java, **métodos** são blocos de código que podem ser chamados para realizar uma tarefa específica, tornando o código modular e reutilizável.

### Exemplo:

```java
public class Metodos {
    public static void main(String[] args) {
        saudacao("João");
    }

    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome);
    }
}
```

**Explicação**:
- O método `saudacao` recebe um parâmetro do tipo `String` e exibe uma mensagem personalizada.
- Ele é chamado dentro do método `main`, passando o argumento necessário.

> **Dica**: Métodos ajudam a evitar repetição de código e permitem a divisão de responsabilidades dentro do programa.


## Seção 7: Introdução à Programação Orientada a Objetos

A **Programação Orientada a Objetos (POO)** é o paradigma central no desenvolvimento com Java. Ela permite que você modele seu código baseado em objetos do mundo real, proporcionando modularidade e reutilização.

### Principais conceitos:
- **Classe**: Estrutura que define o comportamento e as propriedades de um objeto. É como um molde.
- **Objeto**: Instância de uma classe, representando um elemento do mundo real.
- **Encapsulamento**: Protege os dados dentro de uma classe, permitindo que sejam acessados apenas por métodos específicos.
- **Herança**: Permite que uma classe herde características de outra, promovendo reuso de código.
- **Polimorfismo**: Habilidade de um objeto se comportar de maneiras diferentes, dependendo de como é referenciado.

Exemplo:

```java
class Carro {
    String modelo;
    int ano;

    void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}
```

Aqui, `Carro` é uma classe, e seus atributos `modelo` e `ano` são propriedades que descrevem o carro.

---

## Seção 8: Construtores, palavra `this`, sobrecarga, encapsulamento

### 8.1. Construtores e `this`
Construtores são usados para inicializar objetos, atribuindo valores iniciais aos seus atributos. A palavra `this` é utilizada para se referir ao próprio objeto dentro de seu contexto, permitindo resolver ambiguidades entre variáveis de instância e parâmetros.

Exemplo:

```java
class Carro {
    String modelo;
    int ano;

    Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
}
```

Aqui, `this.modelo` se refere à variável de instância da classe, enquanto `modelo` é o parâmetro passado ao construtor.

### 8.2. Sobrecarga de métodos
A sobrecarga de métodos permite que uma classe tenha múltiplos métodos com o mesmo nome, desde que tenham assinaturas diferentes (número ou tipo de parâmetros).

Exemplo:

```java
class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }

    int somar(int a, int b, int c) {
        return a + b + c;
    }
}
```

Aqui, o método `somar` foi sobrecarregado para funcionar com dois ou três parâmetros.

---

## Seção 9: Comportamento de memória, arrays e listas

### 9.1. Comportamento de memória
Os objetos em Java são armazenados no **Heap**, e as variáveis de referência ficam na **Stack**. A memória é gerenciada automaticamente pelo **Garbage Collector**.

### 9.2. Arrays
Arrays são estruturas de dados fixas que armazenam múltiplos valores do mesmo tipo.

Exemplo:

```java
int[] numeros = {1, 2, 3, 4, 5};
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

### 9.3. Listas
Listas, ao contrário dos arrays, têm tamanho dinâmico e fazem parte das **coleções** do Java.

Exemplo:

```java
import java.util.ArrayList;

ArrayList<String> nomes = new ArrayList<>();
nomes.add("João");
nomes.add("Maria");

for (String nome : nomes) {
    System.out.println(nome);
}
```

---

## Seção 10: Trabalhando com Data-Hora

Java oferece uma API robusta para manipulação de datas e horas, que foi melhorada na versão Java 8.

Exemplo:

```java
import java.time.LocalDate;
import java.time.LocalDateTime;

LocalDate dataAtual = LocalDate.now();
LocalDateTime dataHoraAtual = LocalDateTime.now();

System.out.println("Data atual: " + dataAtual);
System.out.println("Data e Hora atual: " + dataHoraAtual);
```

> **Dica**: Sempre use a nova API (`java.time`) em vez das antigas (`java.util.Date`), pois é mais precisa e fácil de usar.

---

## Seção 11: Herança e Polimorfismo

A **herança** permite que uma classe (subclasse) herde as propriedades e métodos de outra classe (superclasse).

Exemplo:

```java
class Animal {
    void emitirSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {
    void emitirSom() {
        System.out.println("Latido");
    }
}
```

O **polimorfismo** permite que objetos de diferentes subclasses possam ser tratados como objetos da superclasse. O comportamento final é determinado pelo tipo real do objeto.

Exemplo:

```java
Animal meuAnimal = new Cachorro();
meuAnimal.emitirSom(); // Saída: Latido
```

---

## Seção 12: Tratamento de Exceções

O tratamento de exceções é crucial para construir programas robustos e prevenir erros críticos durante a execução.

Exemplo:

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro: Divisão por zero.");
}
```

Neste caso, o erro é capturado e tratado pelo bloco `catch`.

---

## Seção 13: Trabalhando com Arquivos

Java oferece várias classes para leitura e escrita de arquivos, como `File`, `Scanner`, e `PrintWriter`.

### Exemplo de leitura de arquivo:

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivo {
    public static void main(String[] args) {
        try {
            File arquivo = new File("dados.txt");
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}
```

---

## Seção 14: Interfaces

**Interfaces** são contratos que definem métodos que as classes concretas devem implementar.

Exemplo:

```java
interface Animal {
    void emitirSom();
}

class Gato implements Animal {
    public void emitirSom() {
        System.out.println("Miau");
    }
}

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.emitirSom(); // Saída: Miau
    }
}
```

## Seção 15: Generics, Set, Map

### 15.1. Generics
**Generics** permitem que classes e métodos em Java trabalhem com qualquer tipo de dado, proporcionando maior flexibilidade e reutilização.

Exemplo:

```java
public class Caixa<T> {
    private T objeto;

    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    public T abrir() {
        return objeto;
    }
}
```

Aqui, `Caixa` pode armazenar qualquer tipo de objeto, como `String`, `Integer` ou até outras classes.

### 15.2. Set
**Set** é uma coleção que não permite elementos duplicados. A implementação mais comum é o `HashSet`.

Exemplo:

```java
import java.util.HashSet;

HashSet<String> frutas = new HashSet<>();
frutas.add("Maçã");
frutas.add("Banana");
frutas.add("Laranja");

for (String fruta : frutas) {
    System.out.println(fruta);
}
```

### 15.3. Map
**Map** é uma estrutura de dados que armazena pares de chave-valor. Um exemplo é o `HashMap`.

Exemplo:

```java
import java.util.HashMap;

HashMap<String, Integer> idades = new HashMap<>();
idades.put("João", 30);
idades.put("Maria", 25);

for (String nome : idades.keySet()) {
    System.out.println(nome + " tem " + idades.get(nome) + " anos.");
}
```

---

## Seção 16: Programação funcional e expressões lambda

A **programação funcional** em Java permite passar funções como argumentos, tornando o código mais conciso. **Expressões lambda** são uma forma simplificada de implementar interfaces funcionais.

Exemplo de Lambda:

```java
import java.util.ArrayList;

ArrayList<Integer> numeros = new ArrayList<>();
numeros.add(1);
numeros.add(2);
numeros.add(3);
numeros.add(4);

numeros.forEach(n -> System.out.println(n));
```

Aqui, a expressão `n -> System.out.println(n)` é uma função lambda que imprime cada número.

---

## Seção 17: Acesso a banco de dados com JDBC

O **JDBC** (Java Database Connectivity) permite executar comandos SQL em um banco de dados a partir de um programa Java.

Exemplo de conexão JDBC:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConexaoJDBC {
    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meuBanco", "usuario", "senha");
            Statement stmt = conexao.createStatement();
            stmt.executeUpdate("INSERT INTO usuarios (nome, idade) VALUES ('Carlos', 30)");
            System.out.println("Dados inseridos com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

## Seção 18: Bônus: Threads e programação concorrente

Nesta seção, abordamos a criação de **threads**, permitindo que programas Java executem múltiplas tarefas em paralelo.

Exemplo de Thread:

```java
class MinhaThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread rodando: " + i);
        }
    }
}

public class TesteThread {
    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread();
        thread.start();
    }
}
```

---

## Seção 19: Projeto Spring Boot e banco MongoDB (Web Services + NoSQL)

Aqui, desenvolveremos um web service usando **Spring Boot** com **MongoDB**, um banco de dados NoSQL.

Exemplo de modelo MongoDB:

```java
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produtos")
public class Produto {
    @Id
    private String id;
    private String nome;
    private Double preco;

    // Getters e Setters
}
```

---

## Seção 20 (LEGADO): Interface gráfica com JavaFX (Projeto Java 11)

O **JavaFX** é usado para criar interfaces gráficas. Nesta seção, aprenderemos a construir uma interface gráfica simples.

Exemplo de JavaFX:

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, JavaFX!");
        Scene scene = new Scene(label, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
```

---
# Fundamentos Essenciais

### Orientação a Objetos
- Aplicação de princípios de **encapsulamento**, **herança** e **polimorfismo** para a construção de sistemas escaláveis e bem estruturados.

### Tratamento de Exceções
- Gerenciamento de **erros e exceções** de maneira controlada, garantindo maior robustez nas aplicações.

### Manipulação de Arquivos
- Leitura e escrita de arquivos utilizando as **bibliotecas padrão do Java** para gerenciar dados de maneira eficiente.

### Interfaces
- Criação de **contratos de código**, garantindo flexibilidade e extensibilidade nas aplicações.

<br>

# Fundamentos Avançados em Java

### Generics
- Uso de parâmetros de tipo para criar **classes**, **interfaces** e **métodos** genéricos, permitindo a reutilização de código de maneira segura e flexível.

### Programação Funcional
- Introdução a conceitos como **expressões lambda** e a utilização de **funções como primeira classe**, tornando o código mais conciso e expressivo.

### JDBC (Java Database Connectivity)
- Integração com bancos de dados relacionais utilizando JDBC, facilitando operações de **persistência de dados**.

### Spring Boot
- Desenvolvimento de **sistemas modernos** com Spring Boot, simplificando a configuração de projetos e facilitando a criação de APIs e microserviços.

### MongoDB
- Utilização de bancos de dados **NoSQL** com Spring Boot para aplicações que exigem alta performance e flexibilidade no armazenamento de dados.

### JavaFX
- Desenvolvimento de **interfaces gráficas** modernas e interativas para aplicações desktop.

---


#### [Clique aqui para voltar ao repositório principal](https://github.com/gabrielmelim/JAVA)
