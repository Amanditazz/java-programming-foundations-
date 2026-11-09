package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C08EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notaFinal, soma = 0;
        int quantFaltas, contAprovados = 0, contFaltas16 = 0;

        for (int rep = 1; rep <=50; rep++) {
            System.out.println(" Insira sua nota final: ");
            notaFinal = teclado.nextDouble();
            System.out.println("Insira sua quantidade de faltas: ");
            quantFaltas = teclado.nextInt();
            if (quantFaltas > 16) {
                contFaltas16++;
            }
            if (notaFinal >= 65 && quantFaltas <= 16) {
                System.out.println("Aluno aprovado!!");
                contAprovados++;
                soma += notaFinal;
            } else {
                System.out.println("Aluno reprovado!!");

            }

        }
        System.out.println("A média das notas dos alunos aprovados é de: "+ soma / contAprovados);
        System.out.println("Quantidade de alunos com mais de 16 faltas: "+ contFaltas16);
    }
}
