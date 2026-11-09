package Etapa1;
//Pelas regras da CBV, a pontuação que as equipes de vôlei ganham ao fim de uma partida da Super Liga
// são: placares de 3 a 0 ou 3 a 1, dão 3 pontos a equipe vencedora e nenhum ponto a equipe perdedora;
// placar de 3 a 2, dão 2 pontos a equipe vencedora e 1 ponto a equipe perdedora. Faça um programa que
// leia os nomes das equipes (equipe 1 e equipe 2) e o placar de um jogo (sets ganhos da equipe 1 e sets
// ganhos da equipe 2), e calcule e imprima os pontuação que cada equipe ganhou na partida.

import java.util.Scanner;

public class C06EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String equipeVencedora, equipePerdedora;
        int setsVenc, setsPerd, pontuacaoFinalVenc, pontuacaoFinalPerd;

        System.out.println("Insira o nome da equipe vencedora: ");
        equipeVencedora = teclado.nextLine();


        System.out.println("Insira aquantidade de sets da equipe vencedora: ");
        setsVenc = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Insira o nome da equipe perdedora: ");
        equipePerdedora = teclado.nextLine();

        System.out.println("Insira a quantidade de sets da equipe perdedora: ");
        setsPerd = teclado.nextInt();

        if (setsVenc == 3 & setsPerd == 0 | setsVenc == 3 & setsPerd == 1) {
            pontuacaoFinalVenc = 3;
            pontuacaoFinalPerd = 0;
        } else if (setsVenc == 3 & setsPerd == 2) {
            pontuacaoFinalVenc = 2;
            pontuacaoFinalPerd = 1;
        } else {
            System.out.println("Jogo incompleto!");
            pontuacaoFinalVenc = 0;
            pontuacaoFinalPerd = 0;
        }

        System.out.printf("Equipe 1= %s \n Sets equipe= %d \n Pontuação %s= %d \n\n equipe 2 = %s \n" +
                        "Sets equipe 2 = %d \n Pontuação %s= %d", equipeVencedora, setsVenc, equipeVencedora, pontuacaoFinalVenc,
                equipePerdedora, setsPerd, equipePerdedora, pontuacaoFinalPerd);


        teclado.close();
//NA CONDIÇÃO É SEMPRE == E NÃO =
    }
}

// ERRO, VALOR NÃO TINHA SIDO ATRIBUIDO ÀS VARIÁVEIS NO ELSE
//
// se der no else não tem valor nenhum
//
// resultado: erro de compilação