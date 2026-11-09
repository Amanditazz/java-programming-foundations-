package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class           C09EX03 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);

        double num, den, serie = 0, termos;

        System.out.print("Informe a quantidade de termos: ");
        termos = teclado.nextDouble();

        for (int i = 1; i <= termos; i++) {
            num = 1 + Math.sqrt(i * 4);
            den = i * 3;
            serie += num/den;
        }
        System.out.println("O valor da série é: " + serie);

    }
}

