package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;
public class C11EX04 {

    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            // Variáveis de entrada
            String nome, sexo, nomeMaisVelho = "";
            int idade, pontos, idadeMaisVelha = -1;
            double valorMulta;

            // Variáveis para cálculos
            double somaIdades = 0;
            double valorTotalMultas = 0;
            int contHomens = 0;
            int contMulheres7Pontos = 0;

            // Repetição definida: sabemos que são 230 vezes
            for (int i = 1; i <= 230; i++) {
                System.out.println("--- Dados da Multa " + i + " ---");
                System.out.print("Nome do condutor: ");
                nome = teclado.next();
                System.out.print("Idade: ");
                idade = teclado.nextInt();
                System.out.print("Sexo (M/F): ");
                sexo = teclado.next();
                System.out.print("Pontos perdidos: ");
                pontos = teclado.nextInt();
                System.out.print("Valor da multa: ");
                valorMulta = teclado.nextDouble();

                // a) Acumular idade para média
                somaIdades += idade;

                // b) Acumular valor total
                valorTotalMultas += valorMulta;

                // c) Contar homens para o percentual
                if (sexo.equalsIgnoreCase("M")) {
                    contHomens++;
                }

                // d) Contar mulheres com exatamente 7 pontos
                if (sexo.equalsIgnoreCase("F") && pontos == 7) {
                    contMulheres7Pontos++;
                }

                // e) Lógica da pessoa mais velha
                if (idade > idadeMaisVelha) {
                    idadeMaisVelha = idade;
                    nomeMaisVelho = nome;
                }
            }

            // Cálculos finais após o laço
            double idadeMedia = somaIdades / 230;
            double percentualHomens = (contHomens / 230.0) * 100;

            // Impressão dos resultados
            System.out.println("\n======= RESULTADOS =======");
            System.out.println("a) Idade média dos condutores: " + idadeMedia);
            System.out.println("b) Valor total das multas: R$ " + valorTotalMultas);
            System.out.println("c) Percentual de homens multados: " + percentualHomens + "%");
            System.out.println("d) Mulheres que perderam 7 pontos: " + contMulheres7Pontos);
            System.out.println("e) Pessoa mais velha: " + nomeMaisVelho + " (" + idadeMaisVelha + " anos)");

            teclado.close();
        }
    }

