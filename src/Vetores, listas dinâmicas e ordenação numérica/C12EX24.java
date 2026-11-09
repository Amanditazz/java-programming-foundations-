package Etapa3;

import java.util.Scanner;

public class C12EX24 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int tamanho = 3; // MUDAR PARA 20 NO TRABALHO FINAL
        String[] times = new String[tamanho];
        int[] pontos = new int[tamanho];

        // Leitura dos dados
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Nome do time " + (i + 1) + ": ");
            times[i] = teclado.nextLine();
            System.out.print("Pontuação final: ");
            pontos[i] = teclado.nextInt();
            teclado.nextLine(); // limpa o buffer
        }

        // Ordenação Decrescente (Bubble Sort)
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (pontos[j] < pontos[j + 1]) {
                    // Troca os pontos de lugar
                    int tempPontos = pontos[j];
                    pontos[j] = pontos[j + 1];
                    pontos[j + 1] = tempPontos;

                    // Troca os nomes juntos para não embaralhar
                    String tempTime = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = tempTime;
                }
            }
        }

        // Pesquisa do time
        System.out.print("\nDigite o nome de um time para pesquisar: ");
        String busca = teclado.nextLine();

        int indiceEncontrado = -1;
        for (int i = 0; i < tamanho; i++) {
            if (busca.equalsIgnoreCase(times[i])) {
                indiceEncontrado = i;
                break;
            }
        }

        // Exibição dos resultados
        if (indiceEncontrado != -1) {
            // Posição real na tabela é o índice + 1
            int posicao = indiceEncontrado + 1;
            String situacao = "";

            // Regra da tabela
            if (posicao >= 1 && posicao <= 4) {
                situacao = "Copa Libertadores";
            } else if (posicao >= 5 && posicao <= 12) {
                situacao = "Copa Sul-americana";
            } else if (posicao >= 17 && posicao <= 20) {
                situacao = "Rebaixada";
            } else {
                situacao = "Série A";
            }

            System.out.println("\nResultado da busca:");
            System.out.println("Posição: " + posicao + "º lugar");
            System.out.println("Situação: " + situacao);
        } else {
            System.out.println("\nTime não encontrado no campeonato.");
        }

        teclado.close();
    }
}