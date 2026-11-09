package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C11EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variáveis para os cálculos
        double temp;
        double menorTemp = 999; // Começamos com um valor muito alto para qualquer um ser menor
        double maiorTemp = -999; // Começamos com um valor muito baixo para qualquer um ser maior
        double somaTemps = 0;
        int contDiasMaiorTemp = 0;

        // Repetição definida para os 121 dias
        for (int i = 1; i <= 121; i++) {
            System.out.print("Informe a temperatura do dia " + i + ": ");
            temp = teclado.nextDouble();

            // a) Verificar a menor temperatura
            if (temp < menorTemp) {
                menorTemp = temp;
            }

            // b) Verificar a maior temperatura
            if (temp > maiorTemp) {
                maiorTemp = temp;
                // d) Reiniciar a contagem sempre que uma nova maior temperatura for encontrada
                contDiasMaiorTemp = 1;
            } else if (temp == maiorTemp) {
                // d) Se a temperatura for igual à maior já registrada, apenas incrementa
                contDiasMaiorTemp++;
            }

            // c) Acumular para a média
            somaTemps += temp;
        }

        // Exibição dos resultados
        System.out.println("\n======= RELATÓRIO METEOROLÓGICO =======");
        System.out.println("a) Menor temperatura registrada: " + menorTemp + "°C");
        System.out.println("b) Maior temperatura registrada: " + maiorTemp + "°C");
        System.out.println("c) Média das temperaturas: " + (somaTemps / 121) + "°C");
        System.out.println("d) Quantidade de dias em que a maior temperatura ocorreu: " + contDiasMaiorTemp);

        teclado.close();
    }
}