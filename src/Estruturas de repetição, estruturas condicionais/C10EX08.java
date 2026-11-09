package Etapa2;

import java.util.Scanner;
import java.io.File;
//Amanda Aparecida Freitas da Silva CC1MA
public class C10EX08 {
    public static void main(String[] args) throws Exception {
        // Vinculando o arquivo conforme image_caf6b9.jpg
        Scanner arquivo = new Scanner(new File("c10ex08.txt"));

        // Variáveis de controle e soma
        int totalCidades = 0;
        long populacaoTotalEstado = 0;
        long totalEleitoresEstado = 0;
        long somaHomensTotal = 0;
        int cidadesMaisMulheres = 0;

        String nomeCidadeMenorPop = "";
        int menorPopulacao = Integer.MAX_VALUE;

        String nome;

        // Estrutura DO-WHILE para processar até o flag "Zimbabue de Minas"
        do {
            // Leitura dos dados de cada cidade (image_caf6b9.jpg)
            nome = arquivo.nextLine();
            int populacao = Integer.parseInt(arquivo.nextLine());
            int eleitores = Integer.parseInt(arquivo.nextLine());
            int mulheres = Integer.parseInt(arquivo.nextLine());
            int homens = Integer.parseInt(arquivo.nextLine());

            totalCidades++; // Item b
            populacaoTotalEstado += populacao; // Item c
            totalEleitoresEstado += eleitores; // Para o cálculo do item d
            somaHomensTotal += homens; // Para o cálculo do item f

            // a) Verificar se soma de H + M difere da população
            if ((homens + mulheres) != populacao) {
                System.out.println("Alerta: Em " + nome + ", a soma de H+M não bate com a população.");
            }

            // e) Quantidade de cidades com mais mulheres que homens
            if (mulheres > homens) {
                cidadesMaisMulheres++;
            }

            // g) Encontrar a cidade de menor população
            if (populacao < menorPopulacao) {
                menorPopulacao = populacao;
                nomeCidadeMenorPop = nome;
            }

        } while (!nome.equalsIgnoreCase("Zimbabue de Minas"));

        // Cálculos Finais e Impressão (conforme o slide 49 de image_caf675.jpg)
        System.out.println("\n======= RELATÓRIO IBGE - MINAS GERAIS =======");
        System.out.println("b) Quantidade total de cidades: " + totalCidades);
        System.out.println("c) População total do estado: " + populacaoTotalEstado);

        // d) Percentual de eleitores em relação à população total do estado
        double percEleitores = (totalEleitoresEstado * 100.0) / populacaoTotalEstado;
        System.out.printf("d) Percentual de eleitores do estado: %.2f%%\n", percEleitores);

        System.out.println("e) Cidades com mais mulheres que homens: " + cidadesMaisMulheres);

        // f) Média de homens em relação a todas as cidades
        double mediaHomens = (double) somaHomensTotal / totalCidades;
        System.out.printf("f) Média de homens por cidade: %.2f\n", mediaHomens);

        System.out.println("g) Cidade de menor população: " + nomeCidadeMenorPop + " (" + menorPopulacao + " hab.)");

        arquivo.close();
    }
}