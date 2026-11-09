package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.sql.SQLOutput;
import java.util.Scanner;

public class C10EX01 {
    public static void main(String[] args) {
        double multa, valor, soma=0, cont=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Para interromper o programa digite -1");
        do {
            System.out.println("Informe o valor financeiro: ");
            valor = teclado.nextDouble();
            if(valor!=-1){
            multa = 10 / 100.0 * valor;
                System.out.println("Valor da multa:"+multa);
                soma+=multa;
                cont++;
            }

        }  while (valor != -1);

        System.out.println("A média das multas é:" + (soma/cont));
    }

}
//QUANDO NAO QUERO QUE O VALOR ENTRE NO CALCULO, COLOCO O IF.
// QUANDO QUERO, NAO BOTO O IF

//POR QUE O DO FAZ O COMANDO ANTES DE TESTAR