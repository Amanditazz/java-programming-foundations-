package Etapa1;
//Uma indústria produtora de  bolas de futebol fabricou uma grande quantidade para vender na época da Copa
// do Mundo em 2018. Para isto ela deverá estocar toda a produção em galpões a serem alugados até a Copa.
// As bolas serão armazenadas em caixas de papelão, que comportam até 10 bolas. Cada galpão a ser alugado
// comporta até 850 caixas de papelão. Faça um programa que leia a quantidade de bolas produzidas pela fábrica, a
// quantidade de bolas com defeito e que serão descartadas, o preço unitário das caixas de papelão, a quantidade
// de meses até a Copa, além do valor mensal do aluguel, e calcule e imprima o custo total de embalagem mais custo
// total de estocagem de toda a produção.
//
//Observação: A última caixa de papelão deverá ser estocada mesmo que incompleta. O último galpão deverá ser
// alugado mesmo que não esteja totalmente cheio.

import java.util.Scanner;

public class C06EX12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //math ceil com variavel int deu o erro= "java: incompatible types: possible lossy conversion from double to int"
        // não foi possível deixar galpoes e caixas como int

        int bolasTotal, bolasDescarte, meses;
        double galpoes, caixas, custoEmbalagem, precoAluguel, custoTotal;

        System.out.println("Insira a quantidade de bolas a serem armazenadas: ");
        bolasTotal = teclado.nextInt();
        System.out.println("Insira a quantidade de bolas com defeito: ");
        bolasDescarte = teclado.nextInt();
        System.out.println("Insira o custo unitário da caixa: ");
        custoEmbalagem = teclado.nextDouble();
        System.out.println("Insira o preço do aluguel do galpão: ");
        precoAluguel = teclado.nextDouble();
        System.out.println("Insira a quantidade de meses armazenado (meses incompletos contam como um mês: )");
        meses = teclado.nextInt();


        caixas = Math.ceil((bolasTotal - bolasDescarte) / 10.0);
        galpoes = Math.ceil(caixas / 850.0);
//math ceil com variavel int= "java: incompatible types: possible lossy conversion from double to int"


        custoTotal = (custoEmbalagem * caixas) + (precoAluguel * galpoes * meses);
        System.out.printf("O custo total é de: %1.2f", custoTotal);
    }
}


//MATH CEIL ARREDONDA UM NUMERO PRA CIMA, MATH ROUND SO ARREDONDA MESMO