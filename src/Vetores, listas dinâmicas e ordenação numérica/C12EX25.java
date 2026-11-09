package Etapa3;

import java.util.Scanner;

public class C12EX25 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String frase;
        String[] palavras;

        // Leitura da frase completa
        System.out.println("Digite uma frase curta:");
        frase = teclado.nextLine();

        // Divide a frase onde tem espaço e guarda no vetor
        palavras = frase.split(" ");

        System.out.println("\nImpressão:");

        // Loop para printar cada palavra em uma linha
        for (int i = 0; i < palavras.length; i++) {
            System.out.println(palavras[i]);
        }

        teclado.close();
    }
}