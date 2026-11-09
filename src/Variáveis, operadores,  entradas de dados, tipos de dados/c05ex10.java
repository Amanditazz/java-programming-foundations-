package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA
//Faça um programa que leia um número inteiro de 5 dígitos e o imprima na vertical.


import java.util.Scanner;

public class c05ex10 {
    public static void main(String[] args) {
        int decomposicaoA, decomposicaoB, decomposicaoC, decomposicaoD, decomposicaoE, numeroInteiro;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o número inteiro de 5 dígitos a ser decomposto: ");
        numeroInteiro = teclado.nextInt();


        decomposicaoA = numeroInteiro / 10000;
        decomposicaoB = numeroInteiro / 1000 % 10;
        decomposicaoC = numeroInteiro % 1000 / 100;
        decomposicaoD = numeroInteiro % 100 / 10;
        decomposicaoE = numeroInteiro % 10;
        System.out.println(decomposicaoA + "\n" + decomposicaoB + "\n" + decomposicaoC
                + "\n" + decomposicaoD + "\n" + decomposicaoE);
    }
}
