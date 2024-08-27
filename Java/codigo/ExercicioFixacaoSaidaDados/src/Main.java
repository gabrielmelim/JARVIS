import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String product1 = "Computador";
		String product2 = "Mesa de escritório";

		int idade = 30;
		int codigo = 5290;
		char genero = 'F';

		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;

		System.out.printf("Produtos:\nComputador, cujo preço é R$%.2f\nMesa de escritório, cujo preço é R$%.2f\n", preco1, preco2);

		System.out.printf("\nRegistro: %d anos, código %d e gênero %s\n", idade, codigo, genero);

		System.out.printf("\nMedida com oito casas decimais: %f\nArredondada (três casas decimais): %.3f", medida, medida);

		Locale.setDefault(Locale.US);
		System.out.printf("\nPonto decimal dos EUA: %.3f", medida);
	}
}
