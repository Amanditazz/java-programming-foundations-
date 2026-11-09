package Etapa1;

import java.util.Scanner;

public class C06EX15 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int codigo, dias;
        double extras;

        System.out.println("Digite o código do pacote:");
        codigo = teclado.nextInt();

        System.out.println("Digite a quantidade de dias pay-per-view:");
        dias = teclado.nextInt();

        System.out.println("Digite o valor dos serviços extras:");
        extras = teclado.nextDouble();

        teclado.nextLine();

        System.out.println("Digite a cidade:");
        String cidade = teclado.nextLine();

        double valorFixo = 0;
        double valorPPP = 0;

        // Escolha do pacote
        if (codigo == 1) {
            valorFixo = 65.0;
            valorPPP = dias * 1.20;

            if (valorPPP > 65.0) {
                valorPPP = 65.0;
            }

        } else if (codigo == 2) {
            valorFixo = 104.0;
            valorPPP = dias * 2.10;

        } else if (codigo == 3) {
            valorFixo = 137.0;
            valorPPP = 0;
        }


        double totalBase = valorFixo + valorPPP + extras;
        double taxa = 0;

        if (cidade.equalsIgnoreCase("Belo Horizonte")) {
            taxa = 0;
        } else if (cidade.equalsIgnoreCase("São Paulo")) {
            taxa = 0.01;
        } else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
            taxa = 0.015;
        } else {
            taxa = 0.02;
        }

        double imposto = totalBase * taxa;

        double totalFinal = totalBase + imposto;

        System.out.println("Conta final: R$ " + totalFinal);
    }
}
