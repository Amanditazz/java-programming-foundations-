package Etapa3;

import java.util.Scanner;

public class C12EX21 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
int tamanho=20;
       int vetor[]= new int[tamanho];

        //preenche o vetor inteiro com os números do usuário
        System.out.println("Digite os " + tamanho + " números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição [" + i + "]: ");
            vetor[i] = teclado.nextInt();
        }

        System.out.println("\n=== RESULTADO DA IMPRESSÃO ===");

        // impares
        System.out.print("Valores nos índices ímpares: ");
        for (int i = 1; i < vetor.length; i = i + 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(); // quebra de linha

        // indices pares
        System.out.print("Valores nos índices pares: ");
        for (int i = 0; i < vetor.length; i = i + 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        teclado.close();
    }
}
