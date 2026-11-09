package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA


import java.util.Scanner;

public class C05EX01 {
    public static void main(String[] args) {
        double x, fx;
        Scanner teclado = new Scanner(System.in);

//f(x)=x^3+4x+10

        System.out.println("f(x)=x^3+4x+10: Insira um valor para X: ");
        x = teclado.nextDouble();
        System.out.println(fx = +Math.pow(x, 3) + (4 * x) + 10);
        teclado.close();
    }
}
