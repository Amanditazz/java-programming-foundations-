package Etapa3;

import java.util.Scanner;


public class C12EX01 {
    public static void main(String[] args) {
        int tamanho = 10, cont=0;
        int vet[] = new int[tamanho];


        Scanner teclado = new Scanner(System.in);

        for (int rep = 0; rep < vet.length; rep++) {
            System.out.println("Informe um número");
            vet[rep] = teclado.nextInt();

            if (vet[rep] % 5 == 0 && vet[rep] % 7 == 0) {
               cont++;
            }

        }
        System.out.println("Quantidade de numeros divisíveis por 7 e 5 ao mesmo tempo= "+cont);


        teclado.close();
    }
}


//OU
// int x = 0, NOTAS[] = new int[100];
//...
//do {
//   System.out.print("Digite uma nota: ");
//   NOTAS[x] = teclado.nextInt();
//   x++;
//} while (x<100);
