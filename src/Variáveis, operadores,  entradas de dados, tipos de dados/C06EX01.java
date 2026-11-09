package Etapa1;
//Faça um programa que receba o valor de x, e calcule e imprima o valor de f(x) conforme a função abaixo.

import java.util.Scanner;

public class C06EX01 {
    public static void main(String[] args) {
        double valorDeX, fx;
        Scanner teclado = new Scanner(System.in);

        System.out.print("insira o valor de x: ");

        valorDeX = teclado.nextDouble();

        if (valorDeX < 4) {
            fx = (5 * valorDeX + 3) / (Math.sqrt(16 - (Math.pow(valorDeX, 2))));
        } else if (valorDeX == 4) {
            fx = 0;
        } else {//x>4
            fx = (5 * valorDeX + 3) / (Math.sqrt(Math.pow(valorDeX, 2) - 16));
        }

        System.out.println("fx=" + fx);

        teclado.close();


    }


}

//Sempre use else if ao invés de if dentro de else quando for uma sequência de condições.
//
//Preste atenção em onde abrir e fechar {} — isso evita muitos erros.