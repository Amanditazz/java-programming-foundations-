package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C08EX26 {
    public static void main(String[] args) {
        int posicao;
        for (int rep = 1; rep <= 10; rep++) {
            for (int linhas = 2; linhas <= 10; linhas++) {
                for (int colunas = 2; colunas < linhas; colunas++) {
                    System.out.print(" ");

                }
                System.out.print("*");
                System.out.println();
            }
            for (int linhas = 10; linhas >= 2; linhas--) {
                for (int colunas = linhas; colunas > 2; colunas--) {
                    System.out.print(" ");

                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
