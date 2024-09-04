import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   
		// 4. Defina o valor de pi (uma constante matemática)
		double pi = 3.14159;
		double raio;
		double area;
	

	    // 1. Crie um objeto Scanner para ler a entrada do usuário
	    Scanner leitor = new Scanner(System.in);
	    
	    // 2. Peça ao usuário para inserir o raio do círculo
	    System.out.print("Digite o raio do círculo: ");
	    
	    // 3. Leia o valor digitado pelo usuário e armazene na variável raio
	    //    Lembre-se que o raio é um número decimal, então use nextDouble()
	    raio = leitor.nextDouble();
	    
	    // 5. Calcule a área do círculo utilizando a fórmula área = pi * raio^2
	    //    Utilize Math.pow para calcular a potência
	    
	    area = pi * Math.pow(raio, 2);

	    // 6. Imprima o resultado formatado com 4 casas decimais após o ponto
	    //    Use System.out.printf() para formatar a saída
		System.out.printf("A área do círculo é: %.4f", area);

		leitor.close();

	}
}
