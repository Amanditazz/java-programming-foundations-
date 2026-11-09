package Etapa3;

import java.util.Scanner;

public class C12EX10 {
    public static void main(String[] args) {
        String nomes[] = new String[8];
        double notas[] = new double[8], soma = 0;
        int cont = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira o nome do aluno: ");
            nomes[i] = teclado.nextLine();
            System.out.println("Insira a nota do aluno: ");
            notas[i] = teclado.nextDouble();
            cont++;
            soma += notas[i];

            teclado.nextLine();
        }
        System.out.println("Alunos com nota acima da média da sala:");
        System.out.printf("%-20s %10s%n", "Nome", "Aluno");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > (soma / cont)) {
                System.out.printf("%-20s %10.1f%n", nomes[i], notas[i]);
            }

        }


    }
}

//Entendendo a formatação (%-15s %-10.2f%n):
// %: Inicia o  especificador de formato.
// - (sinal de menos): Alinha o texto à esquerda (se omitido, alinha à direita).
// 15 / 10: Define o tamanho fixo da coluna em caracteres.O espaço restante é preenchido com brancos.
// s: Indica uma variável do tipo String.
// f: Indica um número de ponto flutuante (decimal).
// .2: Determina a precisão de casas decimais (ex: .2f exibe duas casas decimais).
// %n: Quebra a linha (recomendado em vez de \n
// por ser compatível com qualquer sistema operacional).