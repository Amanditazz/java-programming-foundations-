package Etapa1;

import java.util.Scanner;

public class C06EX17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Questionário de Aptidão (Responda com true ou false) ---");

        //lendo as respostas basicas
        System.out.print("1) Resposta: ");
        boolean r1 = teclado.nextBoolean();
        System.out.print("2) Resposta: ");
        boolean r2 = teclado.nextBoolean();
        System.out.print("3) Resposta: ");
        boolean r3 = teclado.nextBoolean();

        // itens 4, 6, 7 e 9 são fixos!!!
        boolean r4 = true;
        boolean r6 = false;
        boolean r7 = true;
        boolean r9 = false;

        System.out.print("5) Resposta: ");
        boolean r5 = teclado.nextBoolean();
        System.out.print("8) Resposta: ");
        boolean r8 = teclado.nextBoolean();

        // variáveis para as condições extras (a e b)
        System.out.print("\nFez apenas curso técnico? (true/false): ");
        boolean soTecnico = teclado.nextBoolean();
        System.out.print("Anos de experiência: ");
        int anosExperiencia = teclado.nextInt();

        System.out.print("Só aceita trabalhar se for liderar? (true/false): ");
        boolean soLidera = teclado.nextBoolean();
        System.out.print("Pretensão salarial: ");
        double salario = teclado.nextDouble();

        // LÓGICA DE VERIFICAÇÃO
        boolean apto = true;

        // Verificando as respostas fixas tipo a 4 TEM que ser true)
        if (r4 != true || r6 != false || r7 != true || r9 != false) {
            apto = false;
        }

        // condição (a: Se só fez técnico, precisa de mais de 3 anos de experiência
        if (soTecnico && anosExperiencia <= 3) {
            apto = false;
        }

        // condição (b): Se só aceita liderar, não pode aceitar salário de até R$1500
        if (soLidera && salario <= 1500) {
            apto = false;
        }


        System.out.println("\n--------------------------------");
        if (apto) {
            System.out.println("RESULTADO: Candidato APTO.");
        } else {
            System.out.println("RESULTADO: Candidato NÃO APTO.");
        }

        teclado.close();
    }
}