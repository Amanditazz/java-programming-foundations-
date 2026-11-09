package Etapa1;

import java.util.Scanner;

public class C06EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double vendaMensal, salario;

        System.out.println("Insira o valor mensal de vendas:");
        vendaMensal = teclado.nextDouble();
        if (vendaMensal <= 1000) {
            salario = 240;
        } else if (vendaMensal > 1000 && vendaMensal <= 10000) {
            salario = 240 + (10f / 100 * vendaMensal);
        } else {
            salario = 240 + 1000;
        }

        System.out.printf("O salário total a ser recebido é de:R$%1.2f", salario);

        teclado.close();
    }
}
