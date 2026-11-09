package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA


import java.sql.SQLOutput;
import java.util.Scanner;
public class C05EX09 {
    static void main(String[]args)
    { Scanner teclado=new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("Insira o valor da nota 1: ");
         nota1=teclado.nextDouble();

        System.out.print("Insira o valor da nota 2: ");
        nota2=teclado.nextDouble();

        System.out.print("Insira o valor da nota 3: ");
        nota3=teclado.nextDouble();

        media= ((nota1 * 2 ) + (nota2 * 3) + (nota3 * 5) ) / (2f + 3 + 5);
        System.out.printf(" A média do aluno é de: %1.2f", media);

        teclado.close();
    }
}
