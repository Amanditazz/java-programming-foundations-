package Etapa3;

import java.util.Scanner;

public class C12EX11 {
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
        System.out.printf("Aluno com maior nota: %s com %.1f pontos", nomes[posicaoMaior], notas[posicaoMaior]);
        teclado.close();
    }
}


