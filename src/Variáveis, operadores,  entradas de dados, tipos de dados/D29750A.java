package Etapa1;
//Amanda Aparecida Freitas da Silva
import java.util.Scanner;

public class D29750A {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, y, z, funcaoDeXyz;

        System.out.println("Insira o valor de x da função: ");
        x = teclado.nextInt();
        System.out.println("Insira o valor de y da função: ");
        y = teclado.nextInt();
        System.out.println("Insira o valor de z da função: ");
        z = teclado.nextInt();

        funcaoDeXyz = 4 * Math.pow(x, 4) - (2 * ((y + 1) / (z - 1))) + (Math.pow(x - y + 4 * Math.pow(z, 2), 1.0 / 5)) + ((Math.sqrt(1 - x)) / (4 + Math.pow(y - z, 5)));

        System.out.println("O resultado do cálculo da função é:" + funcaoDeXyz);

        teclado.close();


    }

}
