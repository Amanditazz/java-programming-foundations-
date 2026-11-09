package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C11EX10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;


        System.out.print("Digite um número inteiro entre 1 e 9: ");
        numero = teclado.nextInt();


        if (numero >= 1 && numero <= 9) {

            //  LINHAS (quantas vezes vamos descer)
            for (int linha = 1; linha <= numero; linha++) {

                // colunas (quantos "DH" aparecem na mesma linha)
                for (int coluna = 1; coluna <= linha; coluna++) {
                    System.out.print("DH ");
                }

                // Depois de imprimir os "DH" daquela linha pula para a linha de baixo
                System.out.println();
            }

        } else {
            System.out.println("Número fora da faixa permitida (1 a 9).");
        }

        teclado.close();
    }
}