package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C10EX04 {
    public static void main(String[] args) {
        double taxaBDI, precoUnitario, custoTotal=0, custoParcial;
        int quantidade;
        String material;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite fim para finalizar a contagem");
        System.out.println("Informe a taxa de BDI (sem o simbolo de %): ");
        taxaBDI = teclado.nextDouble();


        do {
            teclado.nextLine();

            System.out.println("Informe o material");
            material = teclado.nextLine();
            if (!material.equalsIgnoreCase("fim")) {
                System.out.println("Informe a quantidade");
                quantidade = teclado.nextInt();

                System.out.println("Informe o preço unitário");
                precoUnitario = teclado.nextDouble();

                custoParcial = quantidade * precoUnitario;
                System.out.println("CustoParcial: " + custoParcial);
                custoTotal+=custoParcial;

            }

        }
        while (!material.equalsIgnoreCase("FIM"));
        // adicionando mais valores para chegar ao preço final
        custoTotal=(taxaBDI/100)*custoTotal+custoTotal;

        System.out.println("Preço final: "+ custoTotal);
teclado.close();
    }
}
