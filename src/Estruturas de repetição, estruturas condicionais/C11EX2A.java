package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C11EX2A {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;

        String nome;
        double valor;

        int qtdBronze = 0, qtdPrata = 0, qtdOuro = 0;

        double somaBronze = 0;
        double totalAplicado = 0;

        double menorValor = 0;
        String nomeMenor = "";

        while (contador <= 538) {

            System.out.print("Nome: ");
            nome = teclado.next();

            System.out.print("Valor aplicado: ");
            valor = teclado.nextDouble();

            // classificação
            if (valor <= 1000) {
                System.out.println(nome + " - Bronze");
                qtdBronze++;
                somaBronze = somaBronze + valor;

            } else if (valor <= 5000) {
                System.out.println(nome + " - Prata");
                qtdPrata++;

            } else {
                System.out.println(nome + " - Ouro");
                qtdOuro++;
            }

            // total
            totalAplicado = totalAplicado + valor;

            // menor valor
            if (contador == 1) {
                menorValor = valor;
                nomeMenor = nome;
            } else {
                if (valor < menorValor) {
                    menorValor = valor;
                    nomeMenor = nome;
                }
            }

            contador++;
        }

        double mediaBronze = somaBronze / qtdBronze;

        System.out.println("\nQuantidade Bronze: " + qtdBronze);
        System.out.println("Quantidade Prata: " + qtdPrata);
        System.out.println("Quantidade Ouro: " + qtdOuro);

        System.out.println("Média Bronze: " + mediaBronze);
        System.out.println("Total aplicado: " + totalAplicado);

        System.out.println("Menor aplicação: " + nomeMenor + " - " + menorValor);
    }
}
