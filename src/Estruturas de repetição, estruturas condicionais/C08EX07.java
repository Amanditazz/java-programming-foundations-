package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA


import java.util.Scanner;

public class C08EX07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int rep, idade, cont12 = 0, cont30 = 0, contador = 0;
        String nome;
        double media = 0, soma = 0.0;

        for (rep = 1; rep <= 5; rep++) {
            System.out.println("Insira seu nome: ");
            nome = teclado.nextLine();

            System.out.println("Insira sua idade: ");
            idade = teclado.nextInt();
            contador++;
            media = (soma += idade) / contador;
            if (idade <= 12) {
                cont12++;
            }
            if (idade > 30) {
                cont30++;
            }
            teclado.nextLine();
        }

        System.out.println("A quantidade de alunos de até 12 anos é de: " + cont12);
        System.out.println("A quantidade de alunos de 30 anos ou mais é de: " + cont30);
        System.out.println("A média das idades informadas é de: " + media);
    }

}

