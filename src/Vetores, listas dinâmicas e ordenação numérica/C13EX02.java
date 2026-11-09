package Etapa3;

import java.util.Scanner;

public class C13EX02 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double x;
        double fx;

        do {
            System.out.println("Informe o valor de x (ou -1 para sair):");
            x = teclado.nextDouble();

            if (x != -1) {
                // ATENÇÃO AQUI: Chamamos indicando o nome da classe onde o método está
                fx = Matematica.calcularFuncao(x);
                //nome da classe/nome do comando-metodo. igual math.sqrt

                System.out.println("f(x) = " + fx);
                System.out.println();
            }

        } while (x != -1);

        System.out.println("Programa encerrado.");
        teclado.close();
    }
}