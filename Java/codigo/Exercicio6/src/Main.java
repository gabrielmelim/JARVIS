import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);

        // 1. **Peça ao usuário para inserir os valores de A, B e C:**
        //    Armazene esses valores em variáveis apropriadas.

        double a,b,c;
        
        System.out.print("Informe o valor de A: ");
        a = leitor.nextDouble();
        System.out.print("Informe o valor de B: ");
        b = leitor.nextDouble();
        System.out.print("Informe o valor de C: ");
        c = leitor.nextDouble();
        
        // 2. **Calcule a área de cada figura:**
        //    - Triângulo retângulo: base A, altura C
        //    - Círculo: raio C
        //    - Trapézio: bases A e B, altura C
        //    - Quadrado: lado B
        //    - Retângulo: lados A e B
        //    Armazene o resultado de cada cálculo em uma variável.
        
        double areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo;
        
        areaTriangulo = (a * c) / 2;
        areaCirculo = Math.PI * Math.pow(c,2);
        areaTrapezio = (a+b)*c/2;
        areaQuadrado = Math.pow(b, 2);
        areaRetangulo = a*b;

        // 3. **Imprima na tela as áreas calculadas:**
        //    Utilize o método printf para formatar a saída com três casas decimais.

        System.out.printf("Triangulo: %.3f%n",areaTriangulo);
        System.out.printf("Circulo: %.3f%n",areaCirculo);
        System.out.printf("Trapezio: %.3f%n",areaTrapezio);
        System.out.printf("Quadrado: %.3f%n",areaQuadrado);
        System.out.printf("Retangulo: %.3f%n",areaRetangulo);
  
        
        leitor.close();
		
	}

}
