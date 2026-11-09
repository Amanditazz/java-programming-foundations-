package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C08EX19 {
    static void main(String[] args)
    {    double soma=0.0;
        for(int aux=1; aux<=100; aux++){

            System.out.println(Math.pow(aux,2));
        soma+=Math.pow(aux,2);
    }

        System.out.println("A soma de todos os termos é: "+ soma);
}}
