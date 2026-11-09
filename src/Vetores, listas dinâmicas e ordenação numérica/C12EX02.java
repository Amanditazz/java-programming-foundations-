package Etapa3;
import java.util.Scanner;
public class C12EX02 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

         int vet[]= new int [10], cont=0;

         for(int rep=0; rep<vet.length; rep++) {
             System.out.println("informe um número inteiro");
             vet[rep]= teclado.nextInt();
         }
//PREENCHE O VETOR TODO PRIMEIRO, para depois pegar os números
        //vet[rep]
             for(int rep = 0; rep <vet.length; rep++){
                 if(vet[rep]>5 &&vet[rep]<10){
                     System.out.println("Números maiores que 5 e menores que 10= " + vet[rep]);
                 }

             }
teclado.close();
         }



    }

