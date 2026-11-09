package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA

import java.util.Scanner;

public class C05EX02 {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        double raio, area, volume;


        System.out.print("Insira o valor do raio do círculo: ");
        raio = teclado.nextDouble();

//OBS: área a fórmula no slide esta 4 x pi x r^2, mas na verdade é pi x r^2
        System.out.println("O valor da área do círculo é: " + Math.round(3.1416 * Math.pow(raio, 2)));
//volume
        System.out.println("O valor do volume do círculo é: " + Math.round(+4f / 3 * 3.1416 * Math.pow(raio, 3)));

        teclado.close();
    }

}