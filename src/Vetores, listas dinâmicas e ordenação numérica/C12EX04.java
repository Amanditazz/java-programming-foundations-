package Etapa3;
import java.util.Scanner;
public class C12EX04 { public static void main(String[] args) {
     Scanner teclado= new Scanner(System.in);

int corredores[]= new int[20];

for(int rep=0; rep<corredores.length; rep++){
    System.out.println("Insira o número do colocado em " + (rep+1) + "º lugar: ");
    corredores[rep]=teclado.nextInt();
    //vetor preenchido
}
    System.out.println("Duplas:");
//pegando o primeiro e o que ta 10 numeros a frente
    //0 ate 9 ja pega 10 candidatos
    for(int rep=0; rep<10; rep++){

        System.out.println(corredores[rep]+"/"+ corredores[rep+10]);
    }
    }
}

