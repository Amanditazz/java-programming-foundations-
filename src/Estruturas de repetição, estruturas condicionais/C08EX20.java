package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;
public class C08EX20 {
    static void main(String[] args)
    {
        Scanner teclado= new Scanner(System.in);
        double soma=0.0;
            int termos;
        System.out.println("Insira a quantidade de termos da progressão:");
        termos=teclado.nextInt();

        for(int aux=1; aux<=termos; aux++){

            System.out.println(Math.pow(2,aux-1));
            soma+=Math.pow(2, aux-1);
        }

        System.out.println("A soma de todos os termos é: "+ soma);
    }}
