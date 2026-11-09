package Etapa3;

import java.util.Scanner;

public class C12EX23 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int tamanho = 10;
        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];

        int contadorVetor2 = 0; // indice pra controlar as posições preenchidas no Vetor2

        // preenche
        System.out.println("Digite os " + tamanho + " números inteiros do Vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Posição [" + i + "]: ");
            vetor1[i] = teclado.nextInt();
        }

        // Varre o Vetor 1 procurando os múltiplos de 3
        for (int i = 0; i < vetor1.length; i++) {
            // Se o resto da divisão por 3 for zero, o número é divisível por 3
            if (vetor1[i] % 3 == 0) {
                // Guarda o número na posição atual do contador do Vetor 2
                vetor2[contadorVetor2] = vetor1[i];

                // Avança o contador do Vetor 2 para a próxima casa vazia
                contadorVetor2 = contadorVetor2 + 1;
            }
        }


        System.out.println("\n=== RESULTADO DO VETOR 2 ===");
        System.out.print("Vetor 2 (Apenas os divisíveis por 3): ");

        //
        for (int i = 0; i < contadorVetor2; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();

        teclado.close();
    }
}