package Etapa1;

import java.util.Scanner;

public class C06EX14 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro de 4 dígitos:");
        numero = teclado.nextInt();


        if (numero >= 1000 && numero <= 9999) {

            int d1, d2, d3, d4;

            d1 = numero % 10;

            d2 = numero % 100 / 10;

            d3 = numero % 1000 / 100;

            d4 = numero / 1000;


            System.out.printf("Número invertido: %d%d%d%d", d1, d2, d3, d4);

        } else {
            System.out.println("NÚMERO TEM QUE TER 4 DÍGITOS");
        }
    }
}