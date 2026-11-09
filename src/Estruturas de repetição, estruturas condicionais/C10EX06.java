package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C10EX06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double A, B, C;
        double x, y;
        double distancia;

        // Entrada da reta
        System.out.print("Digite A: ");
        A = teclado.nextDouble();

        System.out.print("Digite B: ");
        B = teclado.nextDouble();

        System.out.print("Digite C: ");
        C = teclado.nextDouble();

        do {
            // Entrada do ponto
            System.out.print("\nDigite X: ");
            x = teclado.nextDouble();

            System.out.print("Digite Y: ");
            y = teclado.nextDouble();

            // Cálculo da distância
            distancia = (A * x + B * y + C) / Math.sqrt(A * A + B * B);

            System.out.println("Distância = " + distancia);

        } while (distancia != 0);

        // Quando sair do loop
        System.out.println("\nPonto que pertence à reta:");
        System.out.println("X = " + x + " | Y = " + y);

        teclado.close();
    }
}