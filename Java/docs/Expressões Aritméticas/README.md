#### [Clique aqui para voltar ao repositório EstruturaSequencial](https://github.com/gabrielmelim/JAVA/tree/EstruturaSequencial)

### Expressões Aritméticas
<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/ExpressaoAritimetica.png" alt="java" width="100%">
</div>

Uma expressão aritmética é um cálculo matemático, como uma soma, subtração, multiplicação ou divisão. O resultado desse cálculo é conhecido como valor numérico.

**Exemplo:**

Considere a expressão: `4 + 5`

- **Expressão aritmética:** `4 + 5`
- **Cálculo:** Soma
- **Resultado:** `9`
- **Valor numérico:** `9`

**Resumo:**

- Uma expressão aritmética é um cálculo matemático.
- O resultado desse cálculo é o valor numérico da expressão.

Em outras palavras, a expressão `4 + 5` resulta em `9`, e `9` é o valor numérico da expressão.


### Operadores Aritiméticos em Java

<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/Operadores%20Aritimeticos.png" alt="java" width="100%">
</div>

A imagem apresenta os principais operadores aritméticos utilizados na linguagem de programação Java. Estes operadores são usados para realizar operações básicas como adição, subtração, multiplicação, divisão e cálculo do resto da divisão.

#### Operadores Aritméticos:

- **Adição (`+`):** Soma dois valores.
- **Subtração (`-`):** Subtrai um valor de outro.
- **Multiplicação (`*`):** Multiplica dois valores.
- **Divisão (`/`):** Divide um valor por outro.
- **Resto da Divisão (`%`):** Calcula o resto da divisão de um valor por outro.

#### Ordem de Precedência:

A tabela também explica a ordem em que essas operações são realizadas quando há várias operações em uma mesma expressão. A precedência determina qual operação é realizada primeiro.

**Resumo:**

A tabela resume as "ferramentas matemáticas" básicas que você pode usar em Java para realizar cálculos. Compreender esses operadores e sua precedência é essencial para escrever código matemático correto e eficiente.

### Exemplos de Expresões Aritiméticas

<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/ExemploExpressaoArit.png" alt="java" width="100%">
</div>

A imagem apresenta vários exemplos de cálculos matemáticos simples, conhecidos como expressões aritméticas. Cada expressão utiliza números e os símbolos de operações básicas: multiplicação (`*`), divisão (`/`), e adição (`+`).

#### O que os exemplos mostram:

1. **A Importância da Ordem das Operações:**
   - A posição dos parênteses altera o resultado final, pois indica qual operação deve ser realizada primeiro.
   
2. **Como os Símbolos Funcionam:**
   - O asterisco (`*`) representa a multiplicação.
   - A barra (`/`) representa a divisão.

3. **Resultados Diferentes para Expressões Semelhantes:**
   - Pequenas mudanças na posição dos parênteses ou na ordem das operações podem levar a resultados completamente diferentes.

#### Exemplo:

Considere as seguintes expressões:

- **`60 / (3 + 2) * 4`**
- **`60 / ((3 + 2) * 4)`**

Embora as expressões sejam semelhantes, a posição dos parênteses faz com que os resultados sejam diferentes:

- **`60 / (3 + 2) * 4`** resulta em **48**.
- **`60 / ((3 + 2) * 4)`** resulta em **3**.

Isso acontece porque os parênteses indicam qual operação deve ser realizada primeiro.

#### Dica:

Sempre que tiver dúvidas sobre a ordem das operações, use parênteses para deixar a expressão mais clara e evitar erros de cálculo.


### Exemplos Com Operador Mod

<div align="center">
  <img src="https://raw.githubusercontent.com/gabrielmelim/imgs/main/java/ExemploOpMod.png" alt="java" width="100%">
</div>

A imagem apresenta dois exemplos de utilização do operador "mod" (ou módulo) em operações matemáticas. O operador "mod" retorna o resto da divisão inteira entre dois números.

#### Explicando os Exemplos

- **`14 % 3`:** Ao dividir 14 por 3, obtemos o quociente 4 e o resto 2. Portanto, `14 % 3` é igual a 2.
- **`19 % 5`:** Ao dividir 19 por 5, obtemos o quociente 3 e o resto 4. Logo, `19 % 5` é igual a 4.

#### Representação Visual

A imagem utiliza um diagrama para ilustrar o cálculo do resto da divisão. As bolinhas verdes representam os números que estão sendo divididos, e as linhas dividem esses números em grupos do tamanho do divisor. O número de elementos que sobra fora dos grupos é o resto da divisão, que é o resultado do operador "mod".

#### Em Resumo

A imagem demonstra de forma clara e concisa o conceito do operador "mod", mostrando como ele retorna o resto de uma divisão inteira. Essa operação é fundamental em diversas áreas da programação, como:

- **Verificação de Paridade:** Se o resto da divisão por 2 for 0, o número é par; caso contrário, é ímpar.
- **Cálculos Cíclicos:** Em aplicações como relógios digitais, o operador "mod" ajuda a garantir que valores como horas e minutos fiquem sempre dentro de um intervalo específico, por exemplo, entre 0 e 59.
- **Algoritmos de Criptografia:** O operador "mod" é utilizado em diversos algoritmos de criptografia para realizar cálculos sobre números grandes.

O operador "mod" é uma ferramenta essencial para resolver problemas matemáticos e computacionais que envolvem divisões e ciclos.
