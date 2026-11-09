package Etapa1;

import java.util.Scanner;

public class C07EX01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do apostador: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a quantidade de acertos (0 a 13): ");
        int acertos = leitor.nextInt();

        System.out.println("\nApostador: " + nome);
        System.out.print("Resultado: ");



        switch (acertos) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Nenhum prêmio.");
                break;

            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Ganhou outro cartão para apostar.");
                break;

            case 11:
                System.out.println("Ganhou R$ 100,00.");
                break;

            case 12:
                System.out.println("Ganhou R$ 1.000,00.");
                break;

            case 13:
                System.out.println("Ganhou R$ 50.000,00!");
                break;

            default:
                // Caso o usuário digite um número fora de 0-13
                System.out.println("Quantidade de acertos inválida.");
                break;
        }

        leitor.close();
    }
}
