//Faça um programa que leia o nome e a altura (em metros) de uma pessoa e calcule e imprima os pesos mínimo e máximo para que ela esteja dentro da faixa de peso ideal de acordo com a tabela de IMC (Índice de Massa Corporal) abaixo.
//
// IMC = Peso / Altura2

//IMC menor que 20  pessoa está abaixo do peso
//IMC entre 20 e 25  pessoa está no peso ideal
//IMC maior que 25  pessoa está acima do peso
package etapa1;

import java.util.Scanner;

public class C06EX08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double imc, peso, altura;


        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua altura (em metros): ");
        altura = teclado.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        peso = teclado.nextDouble();

        // Cálculo do IMC
        imc = peso / (altura * altura);

        // Classificação
        String situacao;
        if (imc < 18) {
            situacao = "Desnutrido";
        } else if (imc < 20) {
            situacao = "Abaixo do peso";
        } else if (imc <= 25) {
            situacao = "Peso ideal";
        } else if (imc <= 27) {
            situacao = "Acima do peso";
        } else {
            situacao = "Obeso";
        }


        System.out.println("\nNome: " + nome);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Situação: " + situacao);

        teclado.close();
    }
}