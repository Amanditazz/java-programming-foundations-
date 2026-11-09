//Amanda Aparecida Freitas da Silva

package Etapa3;

import java.util.Scanner;


//Clientes=tipo, igual int string etc
//vetCLientes= vetor

public class D29750A {
    public static void main(String[] args) {

        Clientes vetClientes[] = new Clientes[100];
        Clientes varTemp;
        Scanner teclado = new Scanner(System.in);
        int cont = vetClientes.length - 1;

        for (int i = 0; i < vetClientes.length; i++) {


            vetClientes[i] = new Clientes();
            //CRIA UM NOVO OBJETO Clientes NA POSIÇÃO I DO VETOR VETCLIENTES COM OS ATRIBUTOS NA POSIÇÃO I

            System.out.println("Insira o nome do cliente: ");
            vetClientes[i].nome = teclado.nextLine();

            System.out.println("Insira o investimento do cliente");
            vetClientes[i].montante = teclado.nextLong();

            teclado.nextLine();
        }
// fazendo o bubblesort usando o montante como parametro pra mudança de ordem DE TODOS OS OUTROS
        for (int i = 0; i < vetClientes.length; i++) {
            for (int i2 = 0; i2 < cont; i2++) {
                if (vetClientes[i2].montante < vetClientes[i2 + 1].montante)

                //se o montante for menor que o da próxima posição, eu troco DE POSIÇÃO TUDO QUE TA NA PRÓXIMA POSIÇÃO
                //nome, montante....
                {
                    varTemp = vetClientes[i2 + 1];
                    vetClientes[i2 + 1] = vetClientes[i2];
                    vetClientes[i2] = varTemp;
                }


            }
            cont--; //não precisa comparar até o fim sempre
        }
        System.out.println("10 clientes com maior aplicação: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf((i + 1) + "º: %-14s | %10d  \n", vetClientes[i].nome, vetClientes[i].montante);

        }

        teclado.close();
    }


}

