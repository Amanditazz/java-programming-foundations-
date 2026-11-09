package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C10EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe a população da região: ");
        double populacaoTotal = teclado.nextDouble();

        // Variáveis de simulação
        double infectados = 1; // Começa com uma pessoa contaminada
        int diasTotais = 0;

        // Simulação: enquanto houver pessoas não infectadas
        if (populacaoTotal > 1) {
            do {
                // Aumenta 0,3% sobre quem já está contaminado
                infectados += infectados * 0.003;
                diasTotais++;
            } while (infectados < populacaoTotal);
        }

        // Conversão de dias totais para Anos, Meses e Dias
        // Considerando ano = 365 dias e mês = 30 dias
        int anos = diasTotais / 365;
        int restoDiasAno = diasTotais % 365;

        int meses = restoDiasAno / 30;
        int dias = restoDiasAno % 30;

        // Saída de resultados conforme o exemplo "Para testar"
        System.out.println("\nTempo necessário para infectar toda a população:");
        System.out.println("Anos: " + anos);
        System.out.println("Meses: " + meses);
        System.out.println("Dias: " + dias);

        teclado.close();
    }
}