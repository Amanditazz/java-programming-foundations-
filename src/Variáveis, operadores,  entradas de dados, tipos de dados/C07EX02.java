package Etapa1;
import java.util.Scanner;

public class C07EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Digite a nota 1: ");
        int n1 = teclado.nextInt();

        System.out.print("Digite a nota 2: ");
        int n2 = teclado.nextInt();

        System.out.print("Digite a nota 3: ");
        int n3 = teclado.nextInt();

        // Ao dividir por 3 (inteiro), o Java já faz o "truncamento" ?
        int notaFinal = (n1 + n2 + n3) / 3;

        System.out.println("\nNota Final (parte inteira): " + notaFinal);


        char conceito; //CHAR-LEMBRAR 1 CARACTER

        switch (notaFinal) {
            case 10:
            case 9:
                conceito = 'A';
                break;
            case 8:
                conceito = 'B';
                break;
            case 7:
                conceito = 'C';
                break;
            case 6:
            case 5:
                conceito = 'D';
                break;
            case 4:
            case 3:
            case 2:
            case 1:
                conceito = 'E';
                break;
            default:
                // Caso a média seja 0 ou algo fora do esperado
                conceito = 'E';
                break;
        }

        System.out.println("Conceito do aluno: " + conceito);

        teclado.close();
    }
}