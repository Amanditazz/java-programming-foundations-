package Etapa3;

import java.util.Scanner;

public class C12EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[10];

        for (int rep = 0; rep < vet.length; rep++) {
            System.out.println("Informe um número inteiro");
            vet[rep] = teclado.nextInt();
        }
        for (int rep = 0; rep < vet.length; rep++) {
            System.out.println("Valor ao quadrado:" + (Math.pow(vet[rep], 2)));
        }
        teclado.close();
    }
}

