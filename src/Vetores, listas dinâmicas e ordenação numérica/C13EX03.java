package Etapa3;

import java.util.Scanner;

public class C13EX03 {

    // método que decompõe o número e descobre o dígito na posição desejada
    public static int retornarDigito(int numero, int posicao) {

        int digito = 0;

        // repetimos a divisão para "andar" com o número até a posição que quero
        for (int i = 1; i <= posicao; i++) {
            // o resto da divisão por 10 pega sempre o último dígito do momento
            digito = numero % 10;

            // divide o número por 10 para eliminar o último dígito já testado
            numero = numero / 10;
        }

        return digito;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int posicao;
        int resultado;

        // leitura dos dados
        System.out.println("Informe um número inteiro qualquer (de 0 até 999999999):");
        numero = teclado.nextInt();

        System.out.println("Informe a posição do dígito (de trás para frente):");
        posicao = teclado.nextInt();

        // chama o método passando o número e a posição informada
        resultado = retornarDigito(numero, posicao);

        // mostra o dígito encontrado
        System.out.println("Retorno = " + resultado);

        teclado.close();
    }
}