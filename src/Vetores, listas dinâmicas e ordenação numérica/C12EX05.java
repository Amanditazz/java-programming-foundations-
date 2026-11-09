package Etapa3;
// NÃO TINHA EXERCICIO 5, FIZ O EXEMPLO 5 SEM OLHAR A RESPOSTA
import java.util.Scanner;

public class C12EX05 {
    public static void main(String[] args) {
        int pos = -1;
        int numeros[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe 10 números inteiros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + "º= ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Informe um número para pesquisa: ");
        int numAleatorio = teclado.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numAleatorio == numeros[i]) {
                System.out.println("Número encontrado no índice "+i);
                pos=i;
                break;
            }
            }

    if (pos==-1){
                System.out.println("Valor não encontrado");
            }



    }
}
// da pra usar o binary search, ordenando antes com arrays.sort claro. isso pq é só um vetor, mas em caso de mais de um não da
