import java.util.Scanner;

public class SomarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro N:");
        int N = scanner.nextInt();
        int soma = 0;
        int contador = 1;

        while (contador <= N) {
            soma += contador;
            contador++;
        }

        System.out.println("A soma dos números de 1 até " + N + " é: " + soma);
    }
}
