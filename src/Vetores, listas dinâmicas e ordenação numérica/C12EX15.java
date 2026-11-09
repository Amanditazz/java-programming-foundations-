package Etapa3;
//manual: bubbleSort// poderia utilizar array sort. obs ele é case sensitive
//nao manual: ArrayToString. (poderia utilizar print dentro do for)
import java.util.Arrays;
import java.util.Scanner;

public class C12EX15 {
    public static void main(String[] args) {

        String meses[] = new String[12];
        int cont =meses.length-1;
        String varTemp;
        Scanner teclado= new Scanner(System.in);

        System.out.println("Insira os meses do ano");


        //um for para preencher o vetor
        for (int i = 0; i < meses.length; i++) {
            System.out.println((i + 1) + "º> ");
            meses[i]=teclado.nextLine();
        }

        //um for para controlar quantas vezes vai ter oordenação completa usando bubble sort

        for (int i = 0; i < meses.length-1; i++) {
            for (int i2 = 0; i2 < cont; i2++)//roda dentro, faz uma comparação completa de dentro
            {
                if (meses[i2].compareToIgnoreCase(meses[i2 + 1]) > 0) // se a comparação retornar um número maior q 0, que significa que tem que trocar
                {
                    varTemp = meses[i2];
                    meses[i2] = meses[i2+1];
                    meses[i2+1] = varTemp;
                }

            }
            cont--;  //o numero de vezes que tem que ordenar dentro diminui, pois a cada ordenação o ultimo numero ordenado sempre ta certo
            //esse cont tem que ficar dentro do for de fora, pq o for de fora roda 1 vez e o de dentro roda todas as vezes,
            //ele iria diminuir todo sendo que tem que diminuir de 1 em 1

        }
        System.out.println(Arrays.toString(meses)); //precisa desse arraystostring para sair o que ta escrito dentro do vetor,
        // caso não quisesse usar ele, da para usar um for para printar sempre o dado do vetor na posição i


    }
}
