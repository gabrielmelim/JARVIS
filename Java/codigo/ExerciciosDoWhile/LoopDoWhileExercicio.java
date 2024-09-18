
// Classe principal do programa
import java.util.Scanner;

public class LoopDoWhileExercicio {

    public static void main(String[] args) {

        // Criar o scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);
        int numero;

        // Início do loop do-while
        do {
            // Solicitar ao usuário que insira um número
            System.out.print("Digite um número: ");
            numero = input.nextInt();
        } while (numero <= 100); // O loop continua enquanto o número for menor ou igual a 100

        // Mensagem final
        System.out.println("Você inseriu um número maior que 100! Fim do programa.");
    }
}
