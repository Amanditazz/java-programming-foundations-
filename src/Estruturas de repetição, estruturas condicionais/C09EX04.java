package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;
public class C09EX04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
    int termos;
    double num, den, serie=0;

        System.out.print("Insira o numero de termos da série: ");
        termos=teclado.nextInt();

        for(int rep=1; rep<=termos;rep++){
            num=(rep*4-3)*(rep*4-2);
            den= (rep*4-1)*(rep*4);
        serie+=num/den;

    }
        serie=Math.sqrt( serie);
        System.out.println("O valor da série é: "+serie);




}
}
