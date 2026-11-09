package Etapa1;

import java.util.Scanner;

public class C06EX09 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String genero;
        double altura, pesoIdeal;

        System.out.println("Insira seu gênero, F para feminino e M para masculino: ");
        genero = teclado.nextLine();
        System.out.println("Insira sua altura");
        altura = teclado.nextDouble();

        if (genero.equalsIgnoreCase("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        } else if (genero.equalsIgnoreCase("M")) {
            pesoIdeal = 72.7 * altura - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        } else {
            System.out.println("Inválido, tente novamente");
        }


        teclado.close();
    }
}

//if (variavel.equalsIgnoreCase("F")){} é usado para comparar string ao invés de número