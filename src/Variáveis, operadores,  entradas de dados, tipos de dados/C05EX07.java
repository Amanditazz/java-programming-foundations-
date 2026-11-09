package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA

import java.util.Scanner;

public class C05EX07 {
    public static void main(String[] args) {
        double x, funcaoDeX;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o valor de X da função f(x) = √((x/4 + 1)² + (1/5)x): ");
        x = teclado.nextDouble();

        funcaoDeX = Math.sqrt(Math.pow(x / 4f + 1, 2) + 1f / 5 * x);

        //LEMBRAR DE COLOCAR O F FLUTUANTE PARA NÃO DAR DIVISÃO INTEIRA

        System.out.printf("F(x)= %1.3f", funcaoDeX);

        teclado.close();
    }


}
