package Etapa1;

import java.util.Scanner;

public class C06EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double altura, peso, imc;

        System.out.println("Insira seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Insira sua altura com ,: ");
        altura = teclado.nextDouble();
        System.out.println("Insira seu peso em kg: ");
        peso = teclado.nextDouble();

        imc = peso / Math.pow(altura, 2);

        if (imc <= 18) {
            System.out.println(" quadro de desnutrição");
        } else if (imc > 18 && imc < 20) {
            System.out.println(nome + " está abaixo do peso");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println(nome + " está no peso ideal");
        } else if (imc > 25 && imc <= 27) {
            System.out.println(nome + " está acima do peso");
        } else {
            System.out.println(nome + "está obesa(o)");
        }

        teclado.close();
    }
}
