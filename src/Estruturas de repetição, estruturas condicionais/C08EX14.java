package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;
public class C08EX14 { public static void main(String[]args){
    String simbolo;
    int colunas, linhas;

    Scanner teclado=new Scanner(System.in);
    System.out.println("insira um dígito ou um símbolo: ");
    simbolo=teclado.nextLine();

    System.out.println("insira aquantidade de linhas: ");
    linhas=teclado.nextInt();

    System.out.println("insira a quantidade de colunas: ");
    colunas= teclado.nextInt();

    for (int rep = 1; rep <= linhas; rep++) {
        for (int rep1 = 1; rep1 <= colunas; rep1++) {
            System.out.print(simbolo);
        }
        System.out.println(); // quebra no lugar certo
    }







}
}
