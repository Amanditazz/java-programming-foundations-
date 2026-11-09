package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C11EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número entre 1 e 9: ");
        numero = teclado.nextInt();

        if (numero >= 1 && numero <= 9) {

            // FOR Principal: Controla as linhas
            for (int linha = 1; linha <= numero; linha++) {

                // Primeiro FOR Interno: Imprime os números subindo (1 até o valor da linha)
                for (int sobe = 1; sobe <= linha; sobe++) {
                    System.out.print(sobe);
                }

                // Segundo FOR Interno: Imprime os números descendo (valor da linha-1 até 1)
                for (int desce = linha - 1; desce >= 1; desce--) {
                    System.out.print(desce);
                }

                // Pula para a próxima linha
                System.out.println();
            }

        } else {
            System.out.println("Número inválido.");
        }

        teclado.close();
    }
}
