package Etapa2;
import java.util.Scanner;
//Amanda Aparecida Freitas da Silva CC1MA
public class C08EX30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x, n, serie=0;

        // Leitura dos valores de x e n
        System.out.print("Informe o valor de x: ");
        x = teclado.nextDouble();
        System.out.print("Informe o valor de n: ");
        n = teclado.nextDouble();

        // Inicializa série com o primeiro termo: ln(x)


        // O laço começa de 1 e vai até n para somar as frações
        for (int i = 1; i <= n; i++) {
            // Math.pow(x, i) calcula x elevado a i
            serie += Math.pow(x, i) / i;
        }

        System.out.println("O valor da série S é: "+ ( Math.log(x) + serie));

        teclado.close();
    }
}