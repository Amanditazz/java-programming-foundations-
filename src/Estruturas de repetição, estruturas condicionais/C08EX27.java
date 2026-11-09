package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C08EX27 {
    public static void main(String[] args) {
        int estrelas = 1;


        for (int rep = 1; rep <= 10; rep++) {


            // SUBINDO
            for (int linhas = 1; linhas <= 7; linhas++) {
                for (int colunas = 1; colunas <= estrelas; colunas++) {
                    System.out.print("*");
                }
                System.out.println();
                estrelas *= 2; // dobra
            }

            // DESCENDO
            estrelas /= 2; // ajusta

            for (int linhas = 1; linhas <= 7; linhas++) {
                estrelas /= 2; // divide

                for (int colunas = 1; colunas <= estrelas; colunas++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }}