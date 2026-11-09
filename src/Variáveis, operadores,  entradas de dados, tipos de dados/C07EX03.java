package Etapa1;
import java.util.Scanner;
public class C07EX03 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);


            System.out.print("Valor do imposto: R$ ");
            double imposto = teclado.nextDouble();

            System.out.print("Dias de atraso: ");
            int dias = teclado.nextInt();

            double multa = 0;


            switch (dias) {
                // Até 5 dias (Isenta)
                case 0: case 1: case 2: case 3: case 4: case 5:
                    multa = 0;
                    break;

                // De 6 a 8 dias (2%)
                case 6: case 7: case 8:
                    multa = imposto * 0.02;
                    break;

                // De 9 a 10 dias (10% + 0,5% por dia de atraso)
                case 9: case 10:
                    multa = (imposto * 0.10) + (imposto * 0.005 * dias);
                    break;

                // Acima de 10 dias (150% + R$ 1,00 por dia de atraso)
                default:
                    if (dias > 10) {
                        multa = (imposto * 1.50) + (1.0 * dias);
                    } else {
                        System.out.println("Número de dias inválido.");
                    }
                    break;
            }


            System.out.printf("\nValor da multa: R$ %.2f", multa);
            System.out.printf("\nTotal a pagar: R$ %.2f\n", (imposto + multa));

            teclado.close();
        }
    }

