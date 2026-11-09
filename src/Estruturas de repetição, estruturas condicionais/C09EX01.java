package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX01 {
    public static void main(String[] args) {

        double num, den, serie = 0;

        for (int i = 37; i >= 1; i--) {
            num = i * (i + 1);
            den = 38 - i;
            serie += num / den;
        }
        System.out.println("O valor da série é: " + serie);
    }
}
