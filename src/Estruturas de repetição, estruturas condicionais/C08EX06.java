package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA

import java.util.Scanner;

public class C08EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroInteiro, soma4 = 0, contador3 = 0;

        for (int rep = 1; rep <= 10; rep++) {
            System.out.print("Insira um numero inteiro: ");
            numeroInteiro = teclado.nextInt();
            if (numeroInteiro % 2 == 0) {
                System.out.println("O número é par");
                if (numeroInteiro % 4 == 0) {
                    soma4 += numeroInteiro;
                }
                if (numeroInteiro % 3 == 0) {
                    contador3++;
                }
//NAO E PQ É PAR QUE É DIVISIVEL POR 4
                else {
                    System.out.println("O número é ímpar");


                }
            }

            System.out.println("A soma dos números divisiveis por 4 é:" + soma4);
            System.out.println("A quantidade de números divididos por 3 é: " +  contador3);


        }
    }}
