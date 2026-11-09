//Amanda Aparecida Freitas da Silva CC1MA

package Etapa2;

import java.util.Scanner;

public class C08EX22 {
   public static void main(String[] args) {
        int numeroInteiro, contadorDivisores = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("insira um numero inteiro: ");
        numeroInteiro = teclado.nextInt();

        for (int rep = 1; rep <= numeroInteiro; rep++) {
            if (numeroInteiro % rep == 0) {
                contadorDivisores++;
            }


        }
        if (contadorDivisores == 2) {
            System.out.println("Esse número é um número primo");
        } else {
            System.out.println("Esse número não é primo");
        }
        teclado.close();
    }
}
