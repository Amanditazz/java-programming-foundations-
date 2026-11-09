package Etapa3;

import java.util.Scanner;

public class C13EX01 {

   //método que recebe as coordenadas da distancia
    public static double calcularDistancia(double x1, double y1,
                                           double x2, double y2) {

        double distancia;

        distancia = Math.sqrt(
                Math.pow(x1 - x2, 2) +
                        Math.pow(y1 - y2, 2)
        );

        return distancia; //"RETORNA O VALOR DE DISTANCIA PRA QUEM PEDIU"
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double x1, y1, x2, y2;
        double distancia;

        // leitura do primeiro ponto
        System.out.println("Informe x1:");
        x1 = teclado.nextDouble();

        System.out.println("Informe y1:");
        y1 = teclado.nextDouble();

        // leitura do segundo ponto
        System.out.println("Informe x2:");
        x2 = teclado.nextDouble();

        System.out.println("Informe y2:");
        y2 = teclado.nextDouble();

        // chama o método e guarda o valor retornado
        distancia = calcularDistancia(x1, y1, x2, y2);

        // mostra o resultado
        System.out.println("Distância: " + distancia);

    }
}