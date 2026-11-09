package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;
public class C09EX09 { public static void main(String[] args) {


    int termos;
    double num, den, serie=0;
    Scanner teclado= new Scanner(System.in);

    System.out.println("Informe a quantidade de termos:");
    termos= teclado.nextInt();
    for(int rep=1;rep<=termos;rep++){
        num= Math.pow(3,rep+1);
        den=(rep+9)*(Math.sqrt(Math.pow(rep,4)));
        serie+=num/den;

    }
    serie=100- (Math.pow(serie,3));

    System.out.println("Valor da série: "+ serie);
}}
