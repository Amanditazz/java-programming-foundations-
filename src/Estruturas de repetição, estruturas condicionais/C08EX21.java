package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C08EX21 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double altura;

        System.out.print("Digite sua altura (em metros): ");
        altura = teclado.nextDouble();

        // Cabeçalho
        System.out.printf("%-10s %-10s %-6s","Peso","IMC","Situação" +"\n");

        for(int peso = 60; peso <= 100; peso++) {

            double imc = peso / (altura * altura);

            String situacao;

            if(imc < 20) {
                situacao = "ABAIXO DO PESO";
            } else if(imc <= 25) {
                situacao = "PESO IDEAL";
            } else {
                situacao = "ACIMA DO PESO";
            }

            System.out.printf("%5d\t%5.2f\t\t%s%n", peso, imc, situacao);
        }
        teclado.close();
    }
}

// esse numero do system.out.print que vai antes do . controla a largura de campo (espaço reservado)
//%[alinhamento][tamanho].[casasdecimais][tipo]
//O - faz alinhar à esquerda
//%10.2f é como uma caixinha de 10 espaços, com 2 nmeros depois da virgula e o número entra dentro
//\t → o sistema alinha automaticamente