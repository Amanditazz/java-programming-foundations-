package Etapa3;

import java.util.Scanner;

public class C12EX22 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int tamanho = 100;
        String[] vetorPlacas = new String[tamanho];
        String[] vetorDonos = new String[tamanho];
        String termoPesquisa;
        int vagaEncontrada = -1; // -1 indica que a vaga ainda não foi encontrada

        // 1. CADASTRO: Preenche os dois vetores paralelamente
        System.out.println("=== CADASTRO DE VAGAS DO EDIFÍCIO ===");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Vaga número " + i + ":");
            System.out.print("Informe a placa do carro: ");
            vetorPlacas[i] = teclado.nextLine();

            System.out.print("Informe o nome do dono da vaga: ");
            vetorDonos[i] = teclado.nextLine();
            System.out.println();
        }

        // 2. PESQUISA: Solicita o termo para busca
        System.out.println("=== PESQUISA DE VAGAS ===");
        System.out.println("Digite a placa de um carro OU o nome de um morador para pesquisar:");
        termoPesquisa = teclado.nextLine();

        // Varre os vetores procurando pelo termo digitado
        for (int i = 0; i < tamanho; i++) {
            if (termoPesquisa.equalsIgnoreCase(vetorPlacas[i]) || termoPesquisa.equalsIgnoreCase(vetorDonos[i])) {
                vagaEncontrada = i; // Guarda o índice (que é o número da vaga)
            }
        }


        if (vagaEncontrada != -1) {
            System.out.println("\nSucesso! O número da vaga correspondente é: " + vagaEncontrada);
            System.out.println("Morador: " + vetorDonos[vagaEncontrada] + " | Placa: " + vetorPlacas[vagaEncontrada]);
        }
        else {
            System.out.println("\nNenhum registro de vaga foi encontrado para: \"" + termoPesquisa + "\"");
        }

        teclado.close();
    }
}