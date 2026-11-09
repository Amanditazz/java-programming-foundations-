package Etapa3;
import java.util.Arrays;
import java.util.Scanner;

public class C12EX18 { public static void main(String[] args){
int [] numeros=new int[10];
double numAleatorio;
    System.out.println("Informe 10 números");
    Scanner teclado= new Scanner(System.in);
    for(int i=0; i<numeros.length; i++){
        System.out.print((i+1+"º>"));
        numeros[i]=teclado.nextInt();
    }
    System.out.println("Informe um número aleatório");
    numAleatorio=teclado.nextDouble();


    System.out.println("Resultados da multiplicação:");
    for(int i=0; i<numeros.length; i++){
        System.out.println(numeros[i]*numAleatorio);
    }

 }
}
