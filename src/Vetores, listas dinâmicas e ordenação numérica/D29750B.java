package Etapa3;

import java.util.Scanner;
import java.util.regex.Pattern;
//STR.replaceAll(STR1, STR2)

/// / Troca TODAS as ocorrências de STR1 por STR2
public class D29750B {
    public static void main(String[] args) {
        String frase, fraseCriptografada;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira uma frase");
        frase = teclado.nextLine().toUpperCase();


        System.out.println(frase);

        teclado.close();

        fraseCriptografada = Criptografar(frase);


    }

    static String Criptografar(String frase) {
        frase.replaceAll("A", "X");
        frase.replaceAll("E", "Y");
        frase.replaceAll("I", "W");
        frase.replaceAll("O", "K");
        frase.replaceAll("U", "Z");
        Pattern.compile("y").matcher(frase).replaceAll("x");
        return frase;


    }
}
