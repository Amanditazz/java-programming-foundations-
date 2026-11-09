package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C11EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        String nome, funcao, nomeMaiorSalario = "";
        String funcaoMaiorSalario = "";
        int horas, totalPessoas = 0, somaHorasTotal = 0;
        double valorHora, totalFolhaPagamento = 0, maiorSalario = 0;




        // Contadores por faixa de prêmio (Item d)
        int contFaixa1 = 0, contFaixa2 = 0, contFaixa3 = 0;


        System.out.print("Informe o valor da hora trabalhada no projeto: ");
        valorHora = teclado.nextDouble();


        System.out.print("Nome do trabalhador (ou 'SAIR' para encerrar): ");
        nome = teclado.next();

        while (!nome.equalsIgnoreCase("SAIR")) {
            System.out.print("Função: ");
            funcao = teclado.next();
            System.out.print("Horas trabalhadas: ");
            horas = teclado.nextInt();

            // Cálculo do prêmio por produtividade de acordo com a tabela
            double premio = 0;
            if (horas <= 100) {
                premio = 1000.00;
                contFaixa1++; // Item d
            } else if (horas <= 500) {
                premio = horas * 10.00;
                contFaixa2++; // Item d
            } else {
                // 100 para cada 10 horas completas
                premio = (horas / 10) * 100.00;
                contFaixa3++; // Item d
            }

            // Cálculo do salário final desta pessoa
            double salarioPessoa = (horas * valorHora) + premio;

            // Item a: Imprimir valor que a pessoa tem a receber
            System.out.println("O trabalhador " + nome + " receberá: R$ " + salarioPessoa);

            // Item c: Verificar se é o maior salário até agora
            if (salarioPessoa > maiorSalario) {
                maiorSalario = salarioPessoa;
                nomeMaiorSalario = nome;
                funcaoMaiorSalario = funcao;
            }


            totalPessoas++;
            somaHorasTotal += horas;
            totalFolhaPagamento += salarioPessoa;

            System.out.println("------------------------------------");
            // Leitura pra próxima volta
            System.out.print("Nome do próximo trabalhador (ou 'SAIR' para encerrar): ");
            nome = teclado.next();
        }


        if (totalPessoas > 0) {
            System.out.println("\n======= RESUMO DA FOLHA DE PAGAMENTO =======");
            System.out.println("b) Média de horas trabalhadas: " + (double)somaHorasTotal / totalPessoas);
            System.out.println("c) Maior salário: " + nomeMaiorSalario + " | Função: " + funcaoMaiorSalario);
            System.out.println("d) Pessoas por faixa de prêmio:");
            System.out.println("   - Até 100h: " + contFaixa1);
            System.out.println("   - 101h até 500h: " + contFaixa2);
            System.out.println("   - Acima de 500h: " + contFaixa3);
            System.out.println("e) Valor total da folha de pagamento: R$ " + totalFolhaPagamento);
        } else {
            System.out.println("Nenhum dado inserido.");
        }

        teclado.close();
    }
}