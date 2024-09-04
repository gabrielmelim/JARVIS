import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1. Crie um objeto Scanner para ler a entrada do usuário.
		Scanner leitor = new Scanner(System.in);

		int numeroFuncionario;
		double horasTrabalhadas, valorHora, salarioTotal;

		// 2. Peça ao usuário para inserir o número do funcionário, as horas trabalhadas
		// e o valor por hora.
		// Armazene esses valores em variáveis apropriadas.
		System.out.print("Informe o número do funcionário: ");
		numeroFuncionario = leitor.nextInt();

		System.out.print("Informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = leitor.nextDouble();

		System.out.println("Informe o valor por hora: ");
		valorHora = leitor.nextDouble();

		// 3. Calcule o salário total do funcionário.
		// Multiplique as horas trabalhadas pelo valor por hora e armazene o resultado
		// em uma variável.
		salarioTotal = horasTrabalhadas * valorHora;

		// 4. Imprima na tela o número do funcionário e o salário calculado, formatado
		// com duas casas decimais.
		// Utilize o método printf para formatar a saída.
		System.out.printf("Numero do funcionário: %d%nSalario: %.2f", numeroFuncionario, salarioTotal);

		// 5. Feche o objeto Scanner.
		leitor.close();

	}

}
