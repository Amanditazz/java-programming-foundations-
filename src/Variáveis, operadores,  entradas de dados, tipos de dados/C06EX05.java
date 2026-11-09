package Etapa1;

import java.util.Scanner;

public class C06EX05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Insira um número inteiro: ");
        numero = teclado.nextInt();

        if (numero % 7 == 0 && numero % 5 == 0) {
            System.out.println(" Este número é divisível ao mesmo tempo por 5 e 7!");
        } else {
            System.out.println("Este número não é divisível ao mesmo tempo por 5 e 7 :(");
        }

        teclado.close();

    }
}
