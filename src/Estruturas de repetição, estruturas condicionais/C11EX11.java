package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C11EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        // Solicita um número inteiro entre 1 e 9
        System.out.print("Digite um número entre 1 e 9: ");
        numero = teclado.nextInt();

        // Valida se o número está dentro da faixa permitida
        if (numero >= 1 && numero <= 9) {

            // Primeiro FOR: Controla qual número será impresso e em qual linha estamos
            for (int linha = 1; linha <= numero; linha++) {

                // Segundo FOR: Controla quantas vezes o número da linha se repete
                for (int coluna = 1; coluna <= linha; coluna++) {
                    // Imprime o valor da variável 'linha'
                    System.out.print(linha + " ");
                }

                // Pula para a próxima linha após terminar as repetições da coluna
                System.out.println();
            }

        } else {
            System.out.println("Entrada inválida. Digite apenas números de 1 a 9.");
        }

        teclado.close();
    }
}