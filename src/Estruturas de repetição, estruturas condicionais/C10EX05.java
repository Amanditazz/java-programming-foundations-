package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.sql.SQLOutput;
import java.util.Scanner;

public class C10EX05 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        double altura, peso, alturaHomens = 0;
        String sexo = " ";
        int contF = 0, contM = 0, contF60 = 0;
        System.out.println("Digite 'fim' para parar");
        do {
                System.out.println("Sexo: (M para masculino e F para feminino): ");
                sexo = teclado.nextLine();

            if (!sexo.equalsIgnoreCase("fim")) {
                System.out.println("Informe sua altura: ");
                altura = teclado.nextDouble();

                System.out.println("Peso: ");
                peso = teclado.nextDouble();

                teclado.nextLine();

                if (sexo.equalsIgnoreCase("F")) {
                    contF++;
                } else {
                    contM++;
                    alturaHomens += altura;
                }
                if (sexo.equalsIgnoreCase("F") && peso < 60) {
                    contF60++;
                }
            }

        }

        while (!sexo.equalsIgnoreCase("fim"));
        System.out.println("Quantidade de pessoas pesquisadas: " + (contF + contM));
        System.out.println("Quantidade de mulheres: " + contF);
        System.out.println("Altura média dos homens" + (alturaHomens / contM));
        System.out.println("Quantidade de mulheres com peso menor que 60: " + contF60);

    }
}
