package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C08EX05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contadorDaviBrito = 0, contadorHoshi = 0, contadorLadyGaga = 0, voto;


        for (int rep = 1; rep <= 100; rep++) {
            System.out.println("Insira o número do candidato no qual deseja votar: \n(1) Hoshi \n(2) Davi Brito \n(3) Lady Gaga ");
            voto = teclado.nextInt();
            switch (voto) {
                case 1:
                    contadorHoshi++;
                    break;
                case 2:
                    contadorDaviBrito++;
                    break;
                case 3:
                    contadorLadyGaga++;
                    break;
            }
        }
        System.out.print("O(a) candidato(a) Hoshi recebeu " + contadorHoshi + " votos \n O(a) candidato(a) Davi Brito recebeu " + contadorDaviBrito +
                " votos \n O(a) candidato(a) Lady gaga recebeu " + contadorLadyGaga + " votos");

        if (contadorHoshi > contadorDaviBrito && contadorHoshi > contadorLadyGaga) {
            System.out.println("\nHoshi foi o(a) vencedor(a)!");
        } else if (contadorDaviBrito > contadorHoshi && contadorDaviBrito > contadorLadyGaga) {
            System.out.println("\nDavi Brito foi o(a) vencedor(a)!");
        } else if (contadorLadyGaga > contadorHoshi && contadorLadyGaga > contadorDaviBrito) {
            System.out.println("\nLady Gaga foi a vencedora!");
        }
    }


}

