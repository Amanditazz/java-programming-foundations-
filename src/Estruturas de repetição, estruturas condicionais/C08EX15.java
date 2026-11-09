package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
//OBS PODE SER QUE O ARQUIVO TXT NAO SEJA ENVIADO JUNTO COM O PACKAGE ETAPA 2 POR ESTAR EM OUTRA PARTE, E ASSIM O PROGRAMA
//NAO RODE
import java.util.Scanner;
import java.io.File;

public class C08EX15 {
    public static void main(String[] args) throws Exception {
        // Lendo o arquivo mencionado na imagem
        Scanner arquivo = new Scanner(new File("c08ex15.txt"));

        // Variáveis para os cálculos
        double somaSalariosAte18 = 0;
        int contAte18 = 0;

        String nomeMaiorSalario = "", cargoMaiorSalario = "";
        double maiorSalario = -1;

        // O laço FOR deve rodar 1000 vezes conforme o enunciado
        for (int i = 1; i <= 1000; i++) {
            // Leitura dos dados (usando nextLine para nomes com espaços)
            String nome = arquivo.nextLine();
            String cargo = arquivo.nextLine();
            double salario = Double.parseDouble(arquivo.nextLine().replace(",", "."));
            int idade = Integer.parseInt(arquivo.nextLine());

            // a) Verificar se é SÊNIOR (Salário > 10.000 E idade > 50)
            if (salario > 10000 && idade > 50) {
                System.out.println("Funcionário: " + nome + " é SÊNIOR.");
            }

            // b) Acumular dados para média de funcionários com até 18 anos
            if (idade <= 18) {
                somaSalariosAte18 += salario;
                contAte18++;
            }

            // c) Encontrar o maior salário, nome e cargo
            if (salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
                cargoMaiorSalario = cargo;
            }
        }

        // Exibição dos resultados finais
        System.out.println("\n======= RELATÓRIO FINAL =======");

        if (contAte18 > 0) {
            double media = somaSalariosAte18 / contAte18;
            System.out.println("b) Média salarial dos funcionários com até 18 anos: R$ " + media);
        } else {
            System.out.println("b) Não há funcionários com até 18 anos.");
        }

        System.out.println("c) Funcionário com maior salário: " + nomeMaiorSalario +
                " | Cargo: " + cargoMaiorSalario + " (R$ " + maiorSalario + ")");

        arquivo.close();
    }
}