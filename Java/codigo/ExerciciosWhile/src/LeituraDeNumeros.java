import java.util.Scanner;

public class LeituraDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um número (negativo para encerrar):");
            numero = scanner.nextInt();
            if (numero >= 0) {
                System.out.println("Número lido: " + numero);
            }
        } while (numero >= 0);

        System.out.println("Programa encerrado.");
    }
}
