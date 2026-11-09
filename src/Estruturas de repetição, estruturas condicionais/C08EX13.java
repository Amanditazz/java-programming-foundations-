package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA

import java.util.Scanner;
import java.io.File;

public class C08EX13 {
    public static void main(String[] args) throws Exception {
        // Preparando a leitura do arquivo txt mencionado na imagem
        Scanner arquivo = new Scanner(new File("c08ex13.txt"));

        // Variáveis de controle e contagem
        int cidadesMais1Milhao = 0; // Item c
        int cidadesMaisMulheres = 0; // Item d

        String nomeCidadeMenorPop = "";
        int menorPopulacao = Integer.MAX_VALUE; // Item e

        // O laço FOR deve rodar 858 vezes conforme o enunciado
        for (int i = 1; i <= 858; i++) {
            // Leitura dos dados de cada cidade
            String nome = arquivo.next();
            int populacao = arquivo.nextInt();
            int eleitores = arquivo.nextInt();
            int homens = arquivo.nextInt();
            int mulheres = arquivo.nextInt();

            // a) Verificar se soma de homens e mulheres difere da população
            if ((homens + mulheres) != populacao) {
                System.out.println("Cidade " + nome + ": Soma de H+M diverge da população total.");
            }

            // b) Percentual de eleitores em relação à população
            double percEleitores = (eleitores * 100.0) / populacao;
            System.out.println("Cidade: " + nome + " | Percentual de Eleitores: " + percEleitores + "%");

            // c) Cidades com mais de 1 milhão de habitantes
            if (populacao > 1000000) {
                cidadesMais1Milhao++;
            }

            // d) Cidades onde a população tem mais mulheres
            if (mulheres > homens) {
                cidadesMaisMulheres++;
            }

            // e) Encontrar a cidade de menor população
            if (populacao < menorPopulacao) {
                menorPopulacao = populacao;
                nomeCidadeMenorPop = nome;
            }
        }

        // Impressão dos resultados acumulados ao final do programa
        System.out.println("\n======= RESULTADOS FINAIS =======");
        System.out.println("c) Total de cidades com mais de 1 milhão de habitantes: " + cidadesMais1Milhao);
        System.out.println("d) Total de cidades com mais mulheres que homens: " + cidadesMaisMulheres);
        System.out.println("e) Cidade com a menor população: " + nomeCidadeMenorPop + " (" + menorPopulacao + " habitantes)");

        arquivo.close();
    }
}
