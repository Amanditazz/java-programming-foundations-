package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA


// toda classe que a gente vai criar, sempre criar o main
// O nome da classe sempre deve ser o mesmo nome do titulozinho

import java.util.Scanner;

public class C03EX02 {
    // Função : Calcular o fatorial de um número
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número: ");
        long numero = teclado.nextLong();
        long fatorial = 1L;
        for (long contador = 2; contador <= numero; contador++) {
            fatorial = fatorial * contador;
        }
        System.out.println("Fatorial = " + fatorial);
        teclado.close();
    }
}