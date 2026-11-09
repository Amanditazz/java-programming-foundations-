package Etapa3;

import java.util.Scanner;
import java.util.Random;

public class C13EX04 {

    // método que gera e retorna um número aleatório entre 0 e 100
    public static int gerarNumeroAleatorio() {

        int numeroSecreto;
        Random gerador = new Random();

        // nextInt(101) gera valores de 0 até 100
        numeroSecreto = gerador.nextInt(101);

        return numeroSecreto;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroGerado;
        int palpite;
        int tentativas;

        tentativas = 0;

        // chama o método para sortear o número que o usuário deve descobrir
        numeroGerado = gerarNumeroAleatorio();

        System.out.println("=== JOGO DA ADIVINHAÇÃO ===");
        System.out.println("O computador gerou um número entre 0 e 100. Tente acertar!");
        System.out.println();

        // laço que continua rodando até o palpite ser igual ao número gerado
        do {
            System.out.println("Digite o seu palpite:");
            palpite = teclado.nextInt();

            // a cada número digitado, somamos 1 no contador de tentativas
            tentativas = tentativas + 1;

            // verifica se o palpite está acima, abaixo ou se acertou
            if (palpite > numeroGerado) {
                System.out.println("O número gerado é MENOR do que o seu palpite.");
                System.out.println();
            }
            else if (palpite < numeroGerado) {
                System.out.println("O número gerado é MAIOR do que o seu palpite.");
                System.out.println();
            }
            else {
                System.out.println("Parabéns! Você acertou o número.");
            }

        } while (palpite != numeroGerado);

        // mostra o total de tentativas acumuladas ao final do jogo
        System.out.println("Total de tentativas necessárias: " + tentativas);

        teclado.close();
    }
}

// Cada arquivo .java só pode ter, no máximo, uma CLASSE pública (public class).
//
//Porém, dentro dessa única classe pública, você pode ter quantos MÉTODOS públicos (public static void, public static int, etc.) você quiser
//Estrutura: Uma única public class que guarda o seu método main
// e os seus métodos auxiliares (todos marcados com static). caso queira ai sim posso criar uma nova classe separada em outro arq
// "Faça um programa que contenha um método a parte..." Não crio classe nova. FaçO tudo em um arquivo só, usando métodos static embaixo ou em cima do seu main.
//  "Faça uma classe pública X e outra classe Y..."
//  Aí sim arquivos e classes separadas, porque o enunciado pediu essa separação de estruturas.