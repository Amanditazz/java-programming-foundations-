package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Double> ListaSalario = new ArrayList<>();
        List<String> ListaNome = new ArrayList<>();
        String nome;
        double salario, reajuste;
        do {
            System.out.println("Informe o nome do funcionário");
            nome = teclado.nextLine();
            if (nome.equalsIgnoreCase("x"))
            {
                break;
            }
            ListaNome.add(nome);
            System.out.println("Informe o salário do funcionário");
            salario = teclado.nextDouble();
            ListaSalario.add(salario);

            teclado.nextLine();
        }
        while (!nome.equalsIgnoreCase("x"));

        System.out.println("Informe o índice de reajuste salarial");
        reajuste= teclado.nextDouble();
        for(int i=0; i<ListaNome.size(); i++){
            if (ListaSalario.get(i)<1000){
                ListaSalario.set(i, ListaSalario.get(i)+(ListaSalario.get(i)*(reajuste/100)) );
            } }
            for(int i=0; i<ListaNome.size(); i++){
                System.out.println(ListaNome.get(i)+": "+ListaSalario.get(i));
        }
        //List= Faz parte do comando
//List<TIPO> NOME = new ArrayList<TIPO>();
//get() apenas lê o valor; ele não permite atribuição.

//
//set(indice, novoValor) substitui o valor naquela posição.
}}