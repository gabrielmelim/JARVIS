import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int primeiroNumero;
		int segundoNumero;
		int soma;

		// Crie um objeto Scanner para ler a entrada do usuário
		Scanner leitor = new Scanner(System.in);

		// Peça para o usuário digitar os números
		System.out.print("Digite o primeiro número: ");
		
		// Leia o primeiro número e armazene em uma variável
		primeiroNumero = leitor.nextInt();

		System.out.print("Digite o segundo número: ");
		// Leia o segundo número e armazene em uma variável
		segundoNumero = leitor.nextInt();
		
		// Calcule a soma e armazene em uma variável
		soma = primeiroNumero + segundoNumero;
		
		// Imprima o resultado na tela
        System.out.println("SOMA = " + soma);
        
        leitor.close();

	}

}
