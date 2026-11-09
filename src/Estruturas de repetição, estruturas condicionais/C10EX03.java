package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;
public class C10EX03 {
    public static void main (String[]args){

    int angulo;
    double setor,raio;
Scanner teclado= new Scanner(System.in);
        System.out.println("Digite -1 para parar o programa");
        System.out.println("informe o ângulo: ");
        angulo=teclado.nextInt();

        do {
            System.out.println("Informe o raio");
            raio=teclado.nextDouble();

            if( raio!=-1){
            setor=(angulo*3.1416*Math.pow(raio,2))/360.0;
                System.out.println("Valordo setor="+setor);}

        }

                while(raio!=-1);


teclado.close();

    }
}

