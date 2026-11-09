package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C08EX05A {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contadorDaviBrito = 0, contadorHoshi = 0, contadorLadyGaga = 0, votoNulo = 0, voto;

        // PRIMEIRO TURNO
        for (int rep = 1; rep <= 100; rep++) {
            System.out.println("Voto #" + rep);
            System.out.println("(1) Hoshi \n(2) Davi Brito \n(3) Lady Gaga");
            voto = teclado.nextInt();

            if (voto == 1) {
                contadorHoshi++;
            } else if (voto == 2) {
                contadorDaviBrito++;
            } else if (voto == 3) {
                contadorLadyGaga++;
            } else {
                System.out.println("Voto nulo!");
                votoNulo++;
            }
        }

        int votosValidos = contadorHoshi + contadorDaviBrito + contadorLadyGaga;

        System.out.println("\n--- RESULTADO 1º TURNO ---");
        System.out.print("\nO(a) candidato(a) Hoshi recebeu " + contadorHoshi + " votos \n O(a) candidato(a) Davi Brito recebeu " + contadorDaviBrito +
                " votos \n O(a) candidato(a) Lady gaga recebeu " + contadorLadyGaga + " votos \n a quantidade de votos nulos foi de: " + votoNulo);

        // ANULAÇÃO
        if (votoNulo > votosValidos) {
            System.out.println("Votação anulada!");
            return;
        }

        // VERIFICA VENCEDOR DIRETO
        if (contadorHoshi > contadorDaviBrito && contadorHoshi > contadorLadyGaga) {
            System.out.println("Hoshi venceu!");
            return;
        } else if (contadorDaviBrito > contadorHoshi && contadorDaviBrito > contadorLadyGaga) {
            System.out.println("Davi Brito venceu!");
            return;
        } else if (contadorLadyGaga > contadorHoshi && contadorLadyGaga > contadorDaviBrito) {
            System.out.println("Lady Gaga venceu!");
            return;
        }

        // EMPATES → SEGUNDO TURNO
        System.out.println("\nEmpate detectado! Iniciando segundo turno...");

        int h2 = 0, d2 = 0, l2 = 0;

        for (int rep = 1; rep <= 50; rep++) {
            System.out.println("\n2º TURNO - Voto #" + rep);

            // EMPATE TRIPLO
            if (contadorHoshi == contadorDaviBrito && contadorHoshi == contadorLadyGaga) {
                System.out.println("(1) Hoshi \n(2) Davi Brito \n(3) Lady Gaga");
                voto = teclado.nextInt();

                if (voto == 1) h2++;
                else if (voto == 2) d2++;
                else if (voto == 3) l2++;

            }
            // EMPATE HOSHI E DAVI
            else if (contadorHoshi == contadorDaviBrito) {
                System.out.println("(1) Hoshi \n(2) Davi Brito");
                voto = teclado.nextInt();

                if (voto == 1) h2++;
                else if (voto == 2) d2++;
            }
            // EMPATE HOSHI E LADY GAGA
            else if (contadorHoshi == contadorLadyGaga) {
                System.out.println("(1) Hoshi \n(3) Lady Gaga");
                voto = teclado.nextInt();

                if (voto == 1) h2++;
                else if (voto == 3) l2++;
            }
            // EMPATE DAVI E LADY GAGA
            else if (contadorDaviBrito == contadorLadyGaga) {
                System.out.println("(2) Davi Brito \n(3) Lady Gaga");
                voto = teclado.nextInt();

                if (voto == 2) d2++;
                else if (voto == 3) l2++;
            }
        }

        System.out.println("\n--- RESULTADO 2º TURNO ---");
        System.out.println("Hoshi: " + h2);
        System.out.println("Davi Brito: " + d2);
        System.out.println("Lady Gaga: " + l2);

        // RESULTADO FINAL
        if (h2 > d2 && h2 > l2) {
            System.out.println("Hoshi venceu no 2º turno!");
        } else if (d2 > h2 && d2 > l2) {
            System.out.println("Davi Brito venceu no 2º turno!");
        } else if (l2 > h2 && l2 > d2) {
            System.out.println("Lady Gaga venceu no 2º turno!");
        } else {
            System.out.println("Empate novamente!");
        }
    }
}









