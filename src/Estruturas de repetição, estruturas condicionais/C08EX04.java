package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA

import java.util.Scanner;

public class C08EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idadeAluno, contadorMaior = 0, contadorMenor = 0;
        String nomeAluno;

        for (int rep = 1; rep <= 50; rep++) {
            System.out.println("Insira o nome do aluno: ");
            nomeAluno = teclado.nextLine();
            System.out.println("Insira a idade do aluno:  ");
            idadeAluno = teclado.nextInt();
            teclado.nextLine();
            if (idadeAluno <= 18) {
                contadorMenor++;
            } else {
                contadorMaior++;
            }
        }
        System.out.println("A qantidade de alunos que possuem acima de 18 anos é de: " + contadorMaior);
        System.out.println(" A quantidade de alunos com 18 anos ou menos é de: " + contadorMenor);

        teclado.close();

    }
}
