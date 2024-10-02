#### [Clique aqui para voltar ao repositório Orientacao Objeto](https://github.com/gabrielmelim/JAVA/tree/OrientacaoObjeto)
# Revisão à Programação em Java - Sem Orientação a Objetos

### Objetivo
 vamos aprender como resolver um problema de cálculo de área de triângulos sem utilizar o conceito de Orientação a Objetos (OOP). 

## Problema Exemplo
Fazer um programa para ler as medidas dos lados de dois triângulos **X** e **Y** (suponha que as medidas são válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual deles possui a maior área.

### Fórmula
A fórmula para calcular a área de um triângulo a partir das medidas dos seus lados \(a\), \(b\) e \(c\) é a **fórmula de Heron**. Primeiro, você calcula o semi-perímetro \(p\), que é metade da soma dos lados:

\[
p = \frac{a + b + c}{2}
\]

Agora, usando \(p\), a área \(A\) do triângulo é calculada assim:

\[
A = \sqrt{p(p - a)(p - b)(p - c)}
\]

Onde:
- \(a\), \(b\), e \(c\) são os comprimentos dos lados do triângulo.
- \(p\) é o semi-perímetro, ou seja, metade da soma dos lados.


### Exemplo de Entrada e Saída

**Entrada:**
```
Digite as medidas do triângulo X:
3.00
4.00
5.00

Digite as medidas do triângulo Y:
7.50
4.58
4.02
```

**Saída Esperada:**
```
Área do triângulo X: 6.0000
Área do triângulo Y: 7.5638
Maior área: Y
```

## Código Java (Sem Orientação a Objetos)

Aqui está a solução completa para o problema utilizando apenas programação estruturada:

```java
package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double xA, xB, xC, yA, yB, yC;
        
        // Entrada de dados para o triângulo X
        System.out.println("Digite as medidas do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        
        // Entrada de dados para o triângulo Y
        System.out.println("Digite as medidas do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        
        // Cálculo da área do triângulo X
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        
        // Cálculo da área do triângulo Y
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        
        // Exibição dos resultados
        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);
        
        // Comparação das áreas
        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }
        
        sc.close();
    }
}
```

## Explicação do Código

1. **Entrada de Dados:** Utilizamos o `Scanner` para capturar as medidas dos lados dos triângulos.
2. **Cálculo das Áreas:** Aplicamos a fórmula de Heron para calcular a área de cada triângulo.
3. **Comparação:** Após calcular as áreas, comparamos os valores e mostramos qual triângulo tem a maior área.

---

## Conclusão

Este exemplo mostra uma abordagem sem Orientação a Objetos, onde o código está centrado na função principal e nas operações diretas. Na próxima aula, vamos evoluir este exemplo utilizando conceitos de Orientação a Objetos para melhorar a organização e a reutilização de código.

#### [Clique aqui para voltar ao repositório Orientacao Objeto](https://github.com/gabrielmelim/JAVA/tree/OrientacaoObjeto)
