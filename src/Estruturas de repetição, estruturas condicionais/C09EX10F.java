package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX10F {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int rep = 1; rep <= 100; rep++) {
            num = Math.pow(rep,2);
            den = Math.pow(rep*2,2);
            serie +=num/den ;
        }
        System.out.println("F= " + serie);
    }
}
