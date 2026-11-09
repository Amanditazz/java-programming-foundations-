package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA

import java.sql.SQLOutput;
import java.util.Scanner;

public class C08EX18 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int numeroInt = teclado.nextInt();
        System.out.println("Tabuada de " + numeroInt + " =");


        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroInt + " x " + i + " = " + numeroInt * i);

        }
    }
}
