package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA


import java.util.Scanner;

public class C04EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String ateX1, multadeY1_X3, entreX1, entreX2, multadeY2_X4, acimadeX2, multadeZ1_X5;

        String linhamaiorsuperior = "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━";
        String linhafinadomeio = "―――――――――――――――――――――――――――――――――――――――――";

        System.out.print("Até X1 reais: (Digite o valor de X1): ");
        ateX1 = teclado.nextLine();

        entreX1 = ateX1;

        System.out.print("Multa de Y1 reais: (Digite o valor de Y1 referente a X1): ");
        multadeY1_X3 = teclado.nextLine();

        System.out.print("Entre " + entreX1 + " e X2 reais: (Digite o valor de X2): ");
        entreX2 = teclado.nextLine();

        acimadeX2 = entreX2;

        System.out.print("Multa de Y2 reais: (Digite o valor de Y2 referente a X2 = " + entreX2 + " ): ");
        multadeY2_X4 = teclado.nextLine();

        System.out.print("Acima de " + acimadeX2 + " reais multa de R$ Z1 reais (Digite o valor de Z1): ");
        multadeZ1_X5 = teclado.nextLine();


// Tabela construída


        System.out.println(linhamaiorsuperior);

        System.out.println("          Quantidade de Poluente Emitido x Valor da Multa");
        System.out.println(linhafinadomeio);

        System.out.println(" Até " + ateX1 + " multa de R$" + multadeY1_X3 + " por poluente emitido");
        System.out.println(linhafinadomeio);

        System.out.println(" Acima de " + entreX1 + " até " + entreX2 + " multa de R$" + multadeY2_X4 + " por poluente emitido");
        System.out.println(linhafinadomeio);

        System.out.println(" Acima de " + acimadeX2 + " multa de R$" + multadeZ1_X5 + " por poluente emitido");
        System.out.println(linhamaiorsuperior);

        teclado.close();
    }
}