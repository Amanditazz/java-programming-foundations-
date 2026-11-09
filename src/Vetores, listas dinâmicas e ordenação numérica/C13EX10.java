package Etapa3;

import java.util.Scanner;

public class C13EX10 {

    // método que recebe o nome, divide em palavras e imprime cada letra na vertical
    public static void imprimirVertical(String nomeCompleto) {

        // garante que todo o texto fique em maiúsculo logo de início
        nomeCompleto = nomeCompleto.toUpperCase();

        // quebra o texto em um vetor de palavras onde quer que haja um espaço em branco
        String[] palavras = nomeCompleto.split(" ");

        // loop para percorrer cada palavra do vetor
        for (int i = 0; i < palavras.length; i++) {
            String palavraAtual = palavras[i];

            // loop interno para pegar e imprimir letra por letra da palavra atual
            for (int j = 0; j < palavraAtual.length(); j++) {
                // o charAt(j) pega o caractere exato daquela posição
                System.out.println(palavraAtual.charAt(j));
            }

            // se não for a última palavra, imprime uma linha em branco para simular o espaço
            if (i < palavras.length - 1) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome;

        // leitura do nome completo informado pelo usuário
        System.out.println("Informe o nome completo de uma pessoa:");
        nome = teclado.nextLine();

        System.out.println("\nResultado na vertical:");

        // chama o método enviando o nome lido
        imprimirVertical(nome);

        teclado.close();
    }
}

/*

O split(" ") cria um vetor com 4 posições ["ANA", "MARIA", "DA", "SILVA"].

O primeiro loop pega a palavra "ANA". O segundo loop roda 3 vezes e printa:
a
n
a

O if percebe que tem mais palavra e dá um System.out.println() vazio. deixa um espaço em branc0*/