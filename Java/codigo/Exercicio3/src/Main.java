import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int a, b, c, d;
		int diferenca;

		// 1. Peça ao usuário para inserir os valores de A, B, C e D
		System.out.print("Digite o valor de A: ");
		a = leitor.nextInt();
		System.out.print("Digite o valor de B: ");
		b = leitor.nextInt();
		System.out.print("Digite o valor de C: ");
		c = leitor.nextInt();
		System.out.print("Digite o valor de D: ");
		d = leitor.nextInt();

		// 2. Calcule a diferença entre os produtos de A*B e C*D
		// Armazene o resultado em uma variável chamada 'diferenca'
		diferenca = a * b - c * d;

		// 3. Imprima o resultado na tela
		System.out.println("DIFERENCA = " + diferenca);

		leitor.close();
	}

}
