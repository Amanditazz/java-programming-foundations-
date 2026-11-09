
//Amanda Aparecida Freitas da Silva CC1MA

//FOR É UM E IF É OUTRO, NO IF CONTA AS REPETIÇOES, NO FOR FAZ A REPETIÇÃO, DOIS CONTADORES DIFERENTES
package Etapa2;

import java.util.Scanner;

public class C08EX03 {
    public static void main(String[] args) {
        double notaFinal;
        int totalFaltas, contagemReprovados, contagemAprovados;
        contagemReprovados=0;
        contagemAprovados=0;

        Scanner teclado = new Scanner(System.in);
        for (int repeticao = 1; repeticao <= 4; repeticao++) {
            System.out.println("Informe a nota final: ");
            notaFinal = teclado.nextDouble();
            System.out.println("Informe o total de faltas: ");
            totalFaltas = teclado.nextInt();
            if (notaFinal >= 65 && totalFaltas <= 16) {
                System.out.println("Aluno Aprovado");
                contagemAprovados++;
            } else {
                System.out.println("Aluno reprovado\n");

            } }
        contagemReprovados= 4- contagemAprovados;
            System.out.println("A quantidade de alunos aprovados é: " +  contagemAprovados +
                    "\nA quantidade de alunos reprovados é: "+  contagemReprovados);
             teclado.close();
        }
    }

