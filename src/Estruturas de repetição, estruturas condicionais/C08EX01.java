//Amanda Aparecida Freitas da Silva CC1MA
// igual a 3.1416. Á𝑟𝑒𝑎=𝜋𝑅^2


package Etapa2;

import java.util.Scanner;

public class C08EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double area, raio;


        for (int contador = 1; contador <= 10; contador++) {
            System.out.println("Informe o raio do círculo: ");
            raio = teclado.nextDouble();
            area = 3.1416 * Math.pow(raio, 2);
            System.out.printf("A área do círculo é: %1.2f", raio);
            System.out.println("\n");
        }
        teclado.close();
    }
}
