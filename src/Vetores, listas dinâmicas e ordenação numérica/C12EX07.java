package Etapa3;

import java.util.Scanner;

public class C12EX07 {
    public static void main(String[] args) {


        String[] conceito = new String[5];
        String[] nome = new String[5];
        int nota[] = new int[5];
        Scanner teclado = new Scanner(System.in);


        for (int rep = 0; rep < nota.length - 1; rep++) {
            System.out.println("Insira o nome do aluno: ");
            nome[rep] = teclado.nextLine();

            System.out.println("Insira a nota: ");
            nota[rep] = teclado.nextInt();

           teclado.nextLine();
        }


        for (int rep = 0; rep < nota.length - 1; rep++) {
            if (nota[rep] <= 30) {
                conceito[rep] = "D";
            } else if (nota[rep] < 60) {
                conceito[rep] = "C";
            } else if (nota[rep] < 80) {
                conceito[rep] = "B";
            } else {
                conceito[rep] = "A";
            }


            System.out.println("Aluno: " + nome[rep] + "\n conceito: " + conceito[rep]);


        }
        teclado.close();
    }

}

//%: Inicia o formato.
// -: Alinha à esquerda (padrão é à direita).
// 10: Largura do campo (número de caracteres).
// s: Indica que é uma String.
// d: Indica que é um número inteiro (decimal).
// %n: Quebra de linha (recomendado no lugar de \n).
