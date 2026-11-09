package Etapa1;

import java.util.Scanner;
import java.util.Locale;

public class C06EX06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US); // usando pra aceitar ponto pq estou tendo problemas com o double quando a entrada é . e não ,

        double a, b, c, delta, x1, x2;

        System.out.print("Digite o valor de a: ");
        a = teclado.nextDouble();

        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble();

        System.out.print("Digite o valor de C: ");
        c = teclado.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Duas raízes reais:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (delta == 0) {
            x1 = -b / (2 * a);

            System.out.println("Uma raiz real:");
            System.out.println("x = " + x1);

        } else {
            System.out.println("Não existem raízes reais.");
        }

        teclado.close();
    }
}
