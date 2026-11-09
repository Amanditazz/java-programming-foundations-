package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;
public class C11EX01{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int x = 1;
        int contador = 0;

        double fx;
        double soma = 0;
        double media;

        System.out.print("Digite um número: ");
        numero = teclado.nextInt();

        while (x <= numero) {

            fx = Math.pow(x , x) + ((4 * x - 2) / 5.0);

            System.out.println("f(" + x + ") = " + fx);

            soma = soma + fx;
            contador++;

            x = x + 2; // só números ímpares
        }

        media = soma / contador;

        System.out.println("Média = " + media);

    }
}

