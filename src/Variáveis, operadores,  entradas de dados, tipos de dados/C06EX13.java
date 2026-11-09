package Etapa1;

import java.util.Scanner;

public class C06EX13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horaInicial, minutoInicial, horaFinal, minutoFinal, duracaoMinutos, duracaoHoras;
        System.out.println("Insira a hora de início do jogo: ");
        horaInicial = teclado.nextInt();
        System.out.println("Insira o minuto de início do jogo: ");
        minutoInicial = teclado.nextInt();


        System.out.println("Insira a hora do fim do jogo: ");
        horaFinal = teclado.nextInt();
        System.out.println("Insira o minuto de fim do jogo: ");
        minutoFinal = teclado.nextInt();


        //horaFinal*60 + minutoFinal = DURAÇÃO TOTAL EM MINUTOS DA HORA FINAL
        //horaInicial*60 + minutoInicial= DURAÇÃO TOTAL EM MINUTOS DA HORA INICIAL

        duracaoHoras = ((horaFinal * 60 + minutoFinal) - (horaInicial * 60 + minutoInicial)) / 60; //MINUTOS HORA FINAL-MINUTOS HORA INICIAL
        duracaoMinutos = ((horaFinal * 60 + minutoFinal) - (horaInicial * 60 + minutoInicial)) % 60; //MINUTOS HORA FINAL-MINUTOS HORA INICIAL

        System.out.printf("O jogo durou %d horas e %d minutos", duracaoHoras, duracaoMinutos);
    }
}
