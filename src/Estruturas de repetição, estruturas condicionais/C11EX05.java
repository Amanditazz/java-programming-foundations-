package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C11EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int codigo, contIngles = 0,totalAlunos = 0 ;
        double mensalidade = 0, totalEspanhol = 0,totalFrances = 0, totalIngles = 0, somaMensalidades = 0;;






        // Primeira leitura do nome (Flag "FIM")
        System.out.print("Informe o NOME do aluno (ou FIM para encerrar): ");
        nome = teclado.next();

        // O laço continua enquanto o nome não for "FIM"
        while (!nome.equalsIgnoreCase("FIM")) {
            System.out.print("Informe o CÓDIGO da opção (1-Inglês, 2-Francês, 3-Espanhol): ");
            codigo = teclado.nextInt();

            // Lógica para definir o valor da mensalidade e somar por categoria
            if (codigo == 1) {
                mensalidade = 100.00;
                contIngles++; // Item b
                totalIngles += mensalidade; // Parte do Item d
            } else if (codigo == 2) {
                mensalidade = 150.00;
                totalFrances += mensalidade; // Parte do Item d
            } else if (codigo == 3) {
                mensalidade = 120.00;
                totalEspanhol += mensalidade; // Parte do Item d
            }

            // Item a: imprimir nome e mensalidade de cada aluno
            System.out.println("Aluno: " + nome + " | Valor: R$ " + mensalidade);

            // Acumuladores gerais para a média posterior
            totalAlunos++;
            somaMensalidades += mensalidade;

            System.out.println("-------------------------------------------");

            // Leitura para a próxima volta do laço
            System.out.print("Informe o NOME do próximo aluno (ou FIM para encerrar): ");
            nome = teclado.next();
        }

        // Resultados finais (apenas se houver alunos processados)
        if (totalAlunos > 0) {
            System.out.println("\n======= RELATÓRIO FINAL =======");
            System.out.println("b) Quantidade de alunos em Inglês: " + contIngles);
            System.out.println("c) Mensalidade média da escola: R$ " + (somaMensalidades / totalAlunos));
            System.out.println("d) Valor total das mensalidades por opção:");
            System.out.println("   - Inglês: R$ " + totalIngles);
            System.out.println("   - Francês: R$ " + totalFrances);
            System.out.println("   - Espanhol: R$ " + totalEspanhol);
        } else {
            System.out.println("Nenhum dado processado.");
        }

        teclado.close();
    }
}
