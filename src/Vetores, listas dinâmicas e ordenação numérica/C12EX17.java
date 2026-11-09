package Etapa3;
import java.util.Scanner;
public class C12EX17 { public static void main(String[] args) {
    int numeros[]=new int[10];
    int cont=0;
    double soma=0;
    Scanner teclado= new Scanner(System.in);

    System.out.println("Informe 10 números: ");

    //FOR PARA PREENCHER O VETOR
    for(int i = 0; i< numeros.length; i++){
        System.out.print((i+1)+ "º>");
        numeros[i]=teclado.nextInt();

    }

    System.out.println("Números pares: ");
    //FOR PARA PROCURAR
    for(int i=0; i<numeros.length; i++){
        if(numeros[i]%2==0){
            System.out.println(numeros[i]);
            soma+=numeros[i];
            cont++;



        }



    }

    System.out.println("Média dos números pares=" +(soma/cont));
}
}
