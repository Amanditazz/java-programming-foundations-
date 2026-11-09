


package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA


//Faça um programa que solicite ao usuário o seu primeiro  nome, seu nome do meio,
// seu sobrenome, sua idade e depois imprima todos estes dados de acordo com o layout abaixo:
//Sobrenome, PrimeiroNome nomeDoMeio
//Idade: 99 anos

import java.util.Scanner;


public class C04EX01 {
    public static void main(String[] args) {
        ;
        Scanner teclado = new Scanner(System.in);
        int idade;
        String primeiroNome, sobrenome, nomeDoMeio;
        System.out.println(" Escreva seu primeiro nome: ");

        primeiroNome = teclado.nextLine();
        System.out.println(" Escreva seu sobrenome: ");

        sobrenome = teclado.nextLine();


        System.out.println(" Escreva seu nome do meio: ");
        nomeDoMeio = teclado.nextLine();

        System.out.println("informe a sua idade: ");

        idade = teclado.nextInt();

        System.out.printf("%s , %s , %s \nidade: %d  ", sobrenome, primeiroNome, nomeDoMeio, idade);


    }
}

