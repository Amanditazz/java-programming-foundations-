package Etapa3;

//Faça um programa que leia uma frase curta e a imprima de novo
// com a primeira letra de cada palavra da frase em
// maiúscula e o restante da palavra em minúsculo.
import java.util.Scanner;

public class C13EX09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String frase;

        String fraseFormatada;

        System.out.print("Informe uma frase: ");

        frase = teclado.nextLine();

        fraseFormatada = FormataFrase(frase);

        System.out.println("Frase formatada: " + fraseFormatada);

        teclado.close();

    }

    static String FormataFrase(String frase) {

        String palavras[] = frase.split(" ");

        String resultado = "";

        for (int aux = 0; aux < palavras.length; aux++) {

            resultado = resultado +

                    palavras[aux].substring(0, 1).toUpperCase() +

                    palavras[aux].substring(1).toLowerCase();

            if (aux < palavras.length - 1) {

                resultado = resultado + " ";

            }

        }

        return resultado;

    }

}