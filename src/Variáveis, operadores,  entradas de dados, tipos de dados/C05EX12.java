package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA


import java.util.Scanner;

public class C05EX12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int horas, minutos, segundos, resto;

        System.out.print("Digite o tempo em segundos: ");
        segundos = teclado.nextInt();

        horas = segundos / 3600;
        resto = segundos % 3600;

        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        teclado.close();
    }
}
