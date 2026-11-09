package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX10B {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int rep = 1; rep <= 100; rep++) {
            num = rep * 2;
            den = rep * 3;
            serie += num / den;
        }
                  serie=1+Math.sqrt(serie);
        System.out.println("B= " + serie);
        }
    }


