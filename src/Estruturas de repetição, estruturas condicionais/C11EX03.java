package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;
public class C11EX03 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            // Variáveis para os dados da multa
            int dia, pontos;
            String placa;
            double valorMulta = 0;

            // Variáveis para os cálculos (Somatórios e Contadores)
            int contadorMultas8PrimeiraQuinzena = 0;
            double totalArrecadado = 0;

            // Primeira leitura do DIA para testar a condição do while
            System.out.print("Informe o DIA (ou 99 para sair): ");
            dia = teclado.nextInt();

            // O laço continua enquanto o dia for diferente de 99 (flag)
            while (dia != 99) {
                // Limpeza do buffer e leitura da PLACA e PONTOS
                System.out.print("Informe a PLACA: ");
                placa = teclado.next();
                System.out.print("Informe os PONTOS: ");
                pontos = teclado.nextInt();

                // Lógica para descobrir o valor da multa com base nos pontos
                if (pontos == 3) {
                    valorMulta = 42.00;
                } else if (pontos == 5) {
                    valorMulta = 108.00;
                } else if (pontos == 8) {
                    valorMulta = 479.00;

                    // Item b) Se for pontuação 8 e na primeira quinzena (dia 1 até 15)
                    if (dia <= 15) {
                        contadorMultas8PrimeiraQuinzena++;
                    }
                }

                // Item a) Imprimir placa e valor de cada multa
                System.out.println("Placa: " + placa + " | Valor da Multa: R$ " + valorMulta);

                // Item c) Somar ao total arrecadado
                totalArrecadado += valorMulta;

                System.out.println("------------------------------------");

                // Leitura para a próxima volta do laço
                System.out.print("Informe o DIA da próxima multa (ou 99 para sair): ");
                dia = teclado.nextInt();
            }

            // Resultados finais após o encerramento (flag 99)
            System.out.println("\n======= RELATÓRIO FINAL =======");
            System.out.println("Multas de 8 pontos na 1ª quinzena: " + contadorMultas8PrimeiraQuinzena);
            System.out.println("Valor total arrecadado: R$ " + totalArrecadado);

            teclado.close();
        }
    }
