package Etapa3;

import java.util.Scanner;

public class C12EX12 {
    public static void main(String[] args) {
        String nomes[] = new String[8];
        double notas[] = new double[8];
        Scanner teclado = new Scanner(System.in);
        int posicaoMaior = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Insira o nome do aluno: ");
            nomes[i] = teclado.nextLine();
            System.out.println("nota: ");
            notas[i] = teclado.nextDouble();

            teclado.nextLine();


        }
//testando qual vai ser a posição com maior valor de nota
        for (int i = 0; i < nomes.length; i++) {
            if (notas[i] > notas[posicaoMaior]) {
                posicaoMaior = i;

            }
        }

        System.out.println("Alunos com maior nota:");

        for (int i = 0; i < nomes.length; i++) {

            if (notas[i] == notas[posicaoMaior]) {
                System.out.println(nomes[i] + " - " + notas[i]);
            }
        }


        teclado.close();
    }
}