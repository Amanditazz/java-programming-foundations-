package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA

public class C08EX25 {
    public static void main(String[] args) {
        for (int rep = 1; rep <= 10; rep++) {
            // Parte crescente
            // OBS SE EM COLUNAS EU COLOCAR<=10 AO INVÉS DE <=LINHAS >>>cada vez que o for de fora roda 1 vez, o de dentro roda 10 vezes<<<<
            for (int linhas = 1; linhas <= 10; linhas++) {
                for (int colunas = 1; colunas <= linhas; colunas++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Parte decrescente
            for (int linhas = 10; linhas >= 1; linhas--) {
                for (int colunas = 1; colunas <= linhas; colunas++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}