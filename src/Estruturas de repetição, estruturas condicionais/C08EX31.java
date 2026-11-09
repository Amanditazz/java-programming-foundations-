package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;
import java.io.File;

public class C08EX31 {
    public static void main(String[] args) throws Exception {
        // Vinculando o arquivo conforme image_ca8d3a.jpg
        Scanner arquivo = new Scanner(new File("c08ex31.txt"));

        int totalEngenheiros = 0;
        int abaixoDoMinimo = 0;
        double somaSalarioProjetista = 0;
        int contProjetista = 0;

        // Lendo enquanto houver nomes no arquivo
        while (arquivo.hasNextLine()) {
            String nome = arquivo.nextLine();
            if (nome.isEmpty()) break; // Proteção contra linhas vazias no fim do arquivo

            String codigo = arquivo.nextLine().toUpperCase();
            double salarioBruto = Double.parseDouble(arquivo.nextLine().replace(",", "."));

            totalEngenheiros++;

            // Verificação de salário mínimo por categoria (image_ca8d9f.png)
            double salarioMinimoCategoria = 0;
            boolean categoriaComMinimo = true;

            switch (codigo) {
                case "C": // Engenheiro Calculista
                    salarioMinimoCategoria = 2500.00;
                    break;
                case "P": // Engenheiro Projetista
                    salarioMinimoCategoria = 4650.00;
                    somaSalarioProjetista += salarioBruto;
                    contProjetista++;
                    break;
                case "O": // Engenheiro de Obra
                    salarioMinimoCategoria = 3200.00;
                    break;
                case "A": // Engenheiro Administrador
                    salarioMinimoCategoria = 5100.00;
                    break;
                default: // Outros (X)
                    categoriaComMinimo = false;
                    break;
            }

            // b) Verificar se ganha menos que o mínimo da categoria
            if (categoriaComMinimo && salarioBruto < salarioMinimoCategoria) {
                System.out.println("Alerta: O engenheiro " + nome + " recebe abaixo do mínimo de R$ " + salarioMinimoCategoria);
                abaixoDoMinimo++;
            }
        }

        // Exibição dos resultados (Exemplo de apuração)
        System.out.println("\n======= RELATÓRIO CREA-MG =======");
        System.out.println("Total de engenheiros pesquisados: " + totalEngenheiros);
        System.out.println("Engenheiros recebendo abaixo do mínimo: " + abaixoDoMinimo);

        if (contProjetista > 0) {
            double mediaP = somaSalarioProjetista / contProjetista;
            System.out.println("Média salarial dos Projetistas: R$ " + String.format("%.2f", mediaP));
        }

        arquivo.close();
    }
}