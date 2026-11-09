package Etapa3;
//nao manual: criei uma classe com parametros ao invès de fazer vetor por vetor
//manual: bubblesort, for na hora de imprimir
// obs: o arraysort para ordenação sozinho só funciona com vetores simples, para
//classes inteiras implementa combarable e comparator
//obs2: o arraystostring tambem só imprime vetores simples, nao classes
//obs3: Collections.reverseOrder() não funciona para organizar tipos primitivos
//em ordem decrescente, apenas objetos.

import java.util.Scanner;
//cidades=tipo, igual int string etc
//vetCidade= vetor
class cidades {
    String nome;
    long populacao;
    String estado;
}

public class C12EX16 {
    public static void main(String[] args) {
        cidades vetCidade[] = new cidades[15];
        cidades varTemp; //cidades virou um tipo (nao sei pq)
        Scanner teclado = new Scanner(System.in);

        int cont = vetCidade.length-1;
        for (int i = 0; i < vetCidade.length; i++) {


            vetCidade[i] = new cidades();
            //CRIA UM NOVO OBJETO CIDADE NA POSIÇÃO I DO VETOR VETCIDADES COM OS ATRIBUTOS NA POSIÇÃO I
            System.out.println("Insira o nome da cidade: ");
            vetCidade[i].nome = teclado.nextLine();

            System.out.println("Estado onde se localiza: ");
            vetCidade[i].estado = teclado.nextLine();

            System.out.println("população total:");
            vetCidade[i].populacao = teclado.nextLong();

            teclado.nextLine();
        }
// fazendo o bubblesort usando a POPULAÇÃO como parametro pra mudança de ordem DE TODOS OS OUTROS
        for (int i = 0; i < vetCidade.length; i++) {
            for (int i2 = 0; i2 < cont; i2++) {
                if (vetCidade[i2].populacao < vetCidade[i2 + 1].populacao)
                //se a população for menor que a próxima, eu troco DE POSIÇÃO TUDO QUE TA NA PRÓXIMA POSIÇÃO
                //POPULAÇÃO, NOME, ESTADO....
                {
                    varTemp = vetCidade[i2 + 1];
                    vetCidade[i2 + 1] = vetCidade[i2];
                    vetCidade[i2] = varTemp;
                }


            }
            cont--; //não precisa comparar até o fim sempre
        }
        System.out.println("10 cidades mais populosas:");
        for(int i=0; i<10;i++){
            System.out.printf((i+1)+"º: %-14s | %10d  \n",   vetCidade[i].nome, vetCidade[i].populacao);

        }

    }


}

