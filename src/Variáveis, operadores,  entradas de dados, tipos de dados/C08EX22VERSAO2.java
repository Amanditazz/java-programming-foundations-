package Etapa1;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C08EX22VERSAO2 {


    public static void main(String[] args) {

        boolean ehPrimo = true; // Começamos acreditando que é primo
        int numeroInteiro;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número inteiro");
        numeroInteiro = teclado.nextInt();

// Começamos do 2, pois todo número divide por 1 e menor que numInteiro pois todo numero divide por ele mesmo
        for (int rep = 2; rep < numeroInteiro; rep++) {
            if (numeroInteiro % rep == 0) {
                ehPrimo = false; // Descobre que tem outro divisor
                break;           // PARA O LAÇO IMEDIATAMENTE
            }
        }

        if (ehPrimo == true && numeroInteiro > 1) {
            System.out.println("Esse número é primo");
        } else {
            System.out.println("Esse número não é primo");
        }
    }
}
