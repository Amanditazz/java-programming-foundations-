package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C11EX13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos da série: ");
        int n = teclado.nextInt();

        double somaInterna = 0;

        // n1: 1, 2, 3... | n2: 10, 19, 28... | exp: 2, 4, 6...
        double n1 = 1, n2 = 10, exp = 2;

        for (int i = 1; i <= n; i++) {
            // Numerador: n1 * n2^exp
            double num = n1 * Math.pow(n2, exp);
            // Denominador: 7^(i-1)
            double den = Math.pow(7, i - 1);

            somaInterna += (num / den);

            n1++;
            n2 += 9;
            exp += 2;
        }

        double serie = 71 + Math.cbrt(somaInterna);
        System.out.println("Valor da Série = " + serie);

        teclado.close();
    }
}
