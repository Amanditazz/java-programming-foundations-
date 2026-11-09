package Etapa1;

import java.util.Scanner;

public class C06EX16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Número de faltas: ");
        int faltas = teclado.nextInt();

        System.out.print("Nota da prova 1: ");
        double p1 = teclado.nextDouble();
        System.out.print("Nota da prova 2: ");
        double p2 = teclado.nextDouble();
        System.out.print("Nota da prova 3: ");
        double p3 = teclado.nextDouble();

        System.out.print("Nota do trabalho final: ");
        double trabalho = teclado.nextDouble();

        System.out.print("Idade do aluno: ");
        int idade = teclado.nextInt();

        // MÉDIA
        double mediaProvas;
        if (p1 <= p2 && p1 <= p3) {
            mediaProvas = (p2 + p3) / 2.0;
        } else if (p2 <= p1 && p2 <= p3) {
            mediaProvas = (p1 + p3) / 2.0;
        } else {
            mediaProvas = (p1 + p2) / 2.0;
        }

        // PESO1
        int peso1;
        if (faltas <= 5) {
            peso1 = 3;
        } else if (faltas <= 10) {
            peso1 = 2;
        } else {
            peso1 = 1;
        }

        // PESO2
        int peso2;
        if (idade <= 17) {
            peso2 = 1;
        } else if (idade <= 50) {
            peso2 = 2;
        } else {
            peso2 = 3;
        }


        double notaFinal = (mediaProvas * peso1) + (trabalho * peso2);
        System.out.println("\nNota Final Calculada: " + notaFinal);


        String resultado;
        if (notaFinal <= 50) {
            resultado = "Reprovado";
        } else if (notaFinal <= 70) {
            resultado = "Regular";
        } else if (notaFinal <= 80) {
            resultado = "Bom";
        } else if (notaFinal <= 90) {
            resultado = "Muito Bom";
        } else {
            resultado = "Excelente";
        }

        System.out.println("Resultado: " + resultado);

        teclado.close();
    }
}