package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C11EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variáveis para os canais (Somatórios de audiência - Item a)
        int audCanal4 = 0, audCanal7 = 0, audCanal12 = 0;

        // Variáveis de suporte
        int canal, pessoas;
        int totalPessoasGeral = 0;

        // Repetição definida para as 78 casas que entraram na pesquisa
        for (int i = 1; i <= 78; i++) {
            System.out.println("--- Casa Válida nº " + i + " ---");
            System.out.print("Número do canal (4, 7 ou 12): ");
            canal = teclado.nextInt();
            System.out.print("Número de pessoas assistindo: ");
            pessoas = teclado.nextInt();

            // Acumulando a audiência por canal (Item a)
            if (canal == 4) {
                audCanal4 += pessoas;
            } else if (canal == 7) {
                audCanal7 += pessoas;
            } else if (canal == 12) {
                audCanal12 += pessoas;
            }

            // Somando ao total para cálculos de porcentagem e média
            totalPessoasGeral += pessoas;
        }

        // Cálculos de porcentagem (Item b)
        // Usamos 100.0 para garantir que o resultado tenha casas decimais
        double perc4 = (audCanal4 * 100.0) / totalPessoasGeral;
        double perc7 = (audCanal7 * 100.0) / totalPessoasGeral;
        double perc12 = (audCanal12 * 100.0) / totalPessoasGeral;

        // Lógica para o canal mais assistido (Item c)
        int canalMaisAssistido = 4;
        int maiorAudiencia = audCanal4;

        if (audCanal7 > maiorAudiencia) {
            maiorAudiencia = audCanal7;
            canalMaisAssistido = 7;
        }
        if (audCanal12 > maiorAudiencia) {
            maiorAudiencia = audCanal12;
            canalMaisAssistido = 12;
        }

        // Impressão dos resultados
        System.out.println("\n======= RESULTADOS DA PESQUISA =======");
        System.out.println("a) Audiência Total:");
        System.out.println("   Canal 4: " + audCanal4 + " pessoas");
        System.out.println("   Canal 7: " + audCanal7 + " pessoas");
        System.out.println("   Canal 12: " + audCanal12 + " pessoas");

        System.out.println("b) Porcentagem de audiência:");
        System.out.println("   Canal 4: " + perc4 + "%");
        System.out.println("   Canal 7: " + perc7 + "%");
        System.out.println("   Canal 12: " + perc12 + "%");

        System.out.println("c) Canal mais assistido: Canal " + canalMaisAssistido);

        // Item d: Média de pessoas por casa (total de pessoas / 78 casas válidas)
        System.out.println("d) Média de pessoas por TV ligada: " + (totalPessoasGeral / 78.0));

        teclado.close();
    }
}