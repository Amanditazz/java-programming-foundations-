package Etapa3;
import java.util.Scanner;

public class C12EX20 { public static void main(String[] args) {
   double soma=0;
   int cont=0;
    int numeros[]=new int[10];
    Scanner teclado= new Scanner(System.in);
    System.out.println("Informe 10 números");


    for(int i=0; i<numeros.length; i++){
        System.out.print((i+1)+">");
        numeros[i]= teclado.nextInt();
    }
    System.out.println("Números maiores que o último("+numeros[numeros.length-1]+"):");
    for(int i=0; i<numeros.length; i++){
        if(numeros[i]>numeros[numeros.length-1]){
            System.out.println(numeros[i]);
            soma+=numeros[i];
            cont++;
        }


    }
    System.out.println("Média dos números impressos="+(soma/cont++));
}
}
