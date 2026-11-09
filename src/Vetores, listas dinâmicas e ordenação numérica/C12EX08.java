package Etapa3;
import java.util.Scanner;
public class C12EX08 { public static void main(String[] args) {
    int numeros[]= new int[20];
    Scanner teclado=new Scanner(System.in);
    System.out.println("Insira 20 numeros inteiros");

    for(int rep=0; rep<numeros.length; rep++){
        System.out.print((rep+1)+"º> ");
        numeros[rep]=teclado.nextInt();
    }
    System.out.println("Somas: ");
    for(int rep=0; rep<10; rep++){
        System.out.println(numeros[rep+1]+" + "+numeros[rep+10]+" = "+(numeros[rep]+numeros[rep+10]));
    }

teclado.close();
}
}
