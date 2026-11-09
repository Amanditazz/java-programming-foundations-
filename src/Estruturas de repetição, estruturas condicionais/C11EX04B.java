package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C11EX04B {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        String nome, sexo, nomeMaisVelho = "";
        int idade, pontos, idadeMaisVelha = -1, contHomens = 0, contMulheres7Pontos = 0,    totalCondutores = 0;

        double valorMulta, somaIdades = 0, valorTotalMultas = 0;




        // Primeira leitura do nome para testar a condição de parada (flag X)
        System.out.print("Nome do condutor (ou X para encerrar): ");
        nome = teclado.next();

        // O laço continua enquanto o nome não for "X"
        while (!nome.equalsIgnoreCase("X")) {
            System.out.print("Idade: ");
            idade = teclado.nextInt();
            System.out.print("Sexo (M/F): ");
            sexo = teclado.next();
            System.out.print("Pontos perdidos: ");
            pontos = teclado.nextInt();
            System.out.print("Valor da multa: ");
            valorMulta = teclado.nextDouble();

            // Contador geral para calcular médias e percentuais depois
            totalCondutores++;

            // a) Acumular idade para a média
            somaIdades += idade;

            // b) Somar valor total das multas
            valorTotalMultas += valorMulta;

            // c) Contar homens para o percentual
            if (sexo.equalsIgnoreCase("M")) {
                contHomens++;
            }

            // d) Contar mulheres com 7 pontos
            if (sexo.equalsIgnoreCase("F") && pontos == 7) {
                contMulheres7Pontos++;
            }

            // e) Lógica para encontrar a pessoa mais velha
            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
                nomeMaisVelho = nome;
            }

            System.out.println("------------------------------------");
            // Nova leitura do nome para a próxima volta ou encerramento
            System.out.print("Nome do próximo condutor (ou X para encerrar): ");
            nome = teclado.next();
        }

        // Verificação para evitar divisão por zero caso o usuário saia de imediato
        if (totalCondutores > 0) {
            double idadeMedia = somaIdades / totalCondutores;
            double percentualHomens = (contHomens * 100.0) / totalCondutores;

            System.out.println("\n======= RELATÓRIO FINAL =======");
            System.out.println("a) Idade média dos condutores: " + idadeMedia);
            System.out.println("b) Valor total das multas: R$ " + valorTotalMultas);
            System.out.println("c) Percentual de homens multados: " + percentualHomens + "%");
            System.out.println("d) Mulheres que perderam 7 pontos: " + contMulheres7Pontos);
            System.out.println("e) Pessoa mais velha: " + nomeMaisVelho + " (" + idadeMaisVelha + " anos)");
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        teclado.close();
    }
}