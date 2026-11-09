package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX10E {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int rep = 1; rep <= 100; rep++) {
            num = rep;
            den = 3 * (rep*2);
            serie +=num/den ;
        }
        System.out.println("E= " + serie);
    }
}
