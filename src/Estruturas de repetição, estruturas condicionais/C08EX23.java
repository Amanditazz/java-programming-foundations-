//Amanda Aparecida Freitas da Silva CC1MA
package Etapa2;
import java.util.Scanner;

public class C08EX23 {
    public static void main(String[] args) {
        int numInt, a=0, b=0, c=0, d=0, cont=0;
        double soma=0.0;



        for (numInt = 1000; numInt <= 9999; numInt++) {
             a = numInt % 10;
             b = numInt % 100 / 10;
             c = numInt % 1000 / 100;
             d = numInt / 1000;
            if (a == d && b == c) {
                System.out.println(numInt);
                cont++;
                soma+=numInt;
            }
            }


        System.out.println("A média desses números é: " + soma/cont);

    }
}
