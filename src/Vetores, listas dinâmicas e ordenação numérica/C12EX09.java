package Etapa3;
import java.util.Scanner;
public class C12EX09 { public static void main(String[] args) {
    double numeros[]=new double[10], soma=0;
    Scanner teclado=new Scanner(System.in);

System.out.println("Insira 10 valores numéricos");

for(int rep = 0; rep <numeros.length; rep++){
    System.out.print((rep +1)+"º> ");
    numeros[rep]=teclado.nextDouble();
    soma+= numeros[rep];

}
    System.out.println("Dividores da soma de todos os números: ");
    for(int rep = 0; rep <=soma; rep++){
if(soma%rep==0){
        System.out.println(rep);

    }



}
    teclado.close();
}}
