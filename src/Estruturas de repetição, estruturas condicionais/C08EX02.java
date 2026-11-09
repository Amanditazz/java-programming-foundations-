//Amanda Aparecida Freitas da Silva CC1MA

package Etapa2;

import java.util.Scanner;

public class C08EX02 {
    public static void main(String[] args) {
        double notaFinal;
        int totalFaltas;
        Scanner teclado = new Scanner(System.in);
        for (int repeticao = 1; repeticao <= 50; repeticao++) {
            System.out.println("Informe a nota final: ");
            notaFinal = teclado.nextDouble();
            if (notaFinal == -1)
                break;
            System.out.println("Informe o total de faltas: ");
            totalFaltas = teclado.nextInt();
            if (notaFinal >= 65 && totalFaltas <= 16) {
                System.out.println("Aluno Aprovado");
            } else {
                System.out.println("Aluno reprovado\n");

            }
        }
    }
}