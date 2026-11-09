package Etapa1;
//Amanda Aparecida Freitas da Silva
import java.util.Scanner;

public class D29750C {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long pulsosConsumidos;

        double gastoPulsos, valorIss, valorConta, taxaResidencial;

        System.out.println("Insira o valor da taxa residencial: ");
        taxaResidencial = teclado.nextDouble();
        System.out.println("Insira a quantidade de pulsos consumidos: ");
        pulsosConsumidos = teclado.nextLong();

        if (pulsosConsumidos <= 100) {
            gastoPulsos = 0;
        } else if (pulsosConsumidos <= 1000) {
            gastoPulsos = 100;
        } else {
            gastoPulsos = (5.0 / 100) * pulsosConsumidos;
        }

        valorIss = (6.0 / 100) * (taxaResidencial + gastoPulsos);
        valorConta = taxaResidencial + gastoPulsos + valorIss;

        System.out.printf("O valor em conta é de: R$%1.2f", valorConta);

        teclado.close();

    }
}
