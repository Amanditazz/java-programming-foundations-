package Etapa3;
import java.util.Scanner;
public class C12EX06 {
    public static void main (String[] args){
         String meses[]=new String[12];
         Scanner teclado=new Scanner(System.in);
        System.out.println("Informe os meses do ano em ordem cronológica: ");
         for(int rep=0; rep<=meses.length-1; rep++){

             System.out.print((rep+1)+"º>");
             meses[rep]=teclado.nextLine();
         }
        System.out.println("Ordem inversa:");
         for(int rep= meses.length-1; rep>=0; rep--){
             System.out.println((rep+1)+"º> "+meses[rep]);

         }

        teclado.close();
    }

}
