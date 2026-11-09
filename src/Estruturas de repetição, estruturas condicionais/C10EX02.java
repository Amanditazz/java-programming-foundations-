package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C10EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor, soma = 0;
        int cont = 0, cont1000 = 0;
        System.out.println("Digite 0 para parar o programa: ");
        do {
            System.out.println("Valor:");
            valor = teclado.nextDouble();
            if (valor != 0) {
                soma += valor;
                cont++;
                if (valor != 0 && valor > 1000) {
                    cont1000++;
                }
            }

        } while (valor != 0);
        System.out.println("A média dos valores recebidos e: " + (soma / cont));
        System.out.println("Valor total recebido: " + soma);
        System.out.println("Valores recebidos acima de 1000: " + cont1000);
    }
}
