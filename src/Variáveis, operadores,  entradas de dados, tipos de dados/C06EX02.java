package Etapa1;
//Amanda Aparecida Freitasda Silva

import java.util.Scanner;

public class C06EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double poluentes, valorMulta;

        System.out.print("Insira a quantidade de pluentes emitida em [mg/(tm^2)]: ");

        poluentes = teclado.nextDouble();

        if (poluentes <= 1500) {
            valorMulta = 0;
        } else if (poluentes > 1500 && poluentes <= 3500) {
            valorMulta = 3000;
        } else {
            valorMulta = 5000 * poluentes;
        }
        System.out.println("O valor da multa a ser pago= R$ " + valorMulta);

    }
}
