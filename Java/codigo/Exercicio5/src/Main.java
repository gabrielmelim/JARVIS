import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		// 1. **Peça ao usuário para inserir os dados da primeira peça:**
		// - Código da peça
		// - Quantidade da peça
		// - Valor unitário da peça
		// Armazene esses valores em variáveis apropriadas.
		
		int codigoPeca1,codigoPeca2, quantidadePeca1,quantidadePeca2;
		double valorUnitarioPeca1,valorUnitarioPeca2;

		System.out.print("Insira o codigo da peça: ");
		codigoPeca1 = leitor.nextInt();
		
		System.out.print("Insira a quantidade de peça: ");
		quantidadePeca1 = leitor.nextInt();
		
		System.out.print("Insira o valor unitário da peça: ");
		valorUnitarioPeca1 = leitor.nextDouble();
		
		// 2. **Peça ao usuário para inserir os dados da segunda peça:**
		// - Código da peça
		// - Quantidade da peça
		// - Valor unitário da peça
		// Armazene esses valores em variáveis apropriadas.
		
		System.out.print("Insira o codigo da peça: ");
		codigoPeca2 = leitor.nextInt();
		
		System.out.print("Insira a quantidade de peça: ");
		quantidadePeca2 = leitor.nextInt();
		
		System.out.print("Insira o valor unitário da peça: ");
		valorUnitarioPeca2 = leitor.nextDouble();

		// 3. **Calcule o valor total da compra:**
		// - Multiplique a quantidade de cada peça pelo seu valor unitário.
		// - Some os valores totais das duas peças.
		// Armazene o resultado em uma variável.
		
		//conversão implícita... de int para double.
		double valorTotalCompra = quantidadePeca1 * valorUnitarioPeca1 + quantidadePeca2 * valorUnitarioPeca2;

		// 4. **Imprima na tela o valor total a ser pago:**
		// Utilize o método printf para formatar a saída com duas casas decimais.

		System.out.print("Valor total da compra: " + valorTotalCompra);
		
		leitor.close();

	}

}
