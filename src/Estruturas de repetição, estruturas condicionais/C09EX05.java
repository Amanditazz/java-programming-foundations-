package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C09EX05 {
    public static void main() {
        double num, den, serie = 0;
        int termos;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a quantidade de termos da série:");
        termos = teclado.nextInt();

        for (int rep = 1; rep <= termos; rep++) {
            num = (rep * 2 - 2) + rep * 3;
            den = (rep * 6 + 1);
            serie += num / den;

        }
        serie=5*(serie);

        System.out.println("O valor da série é: "+ serie);
    }
}
