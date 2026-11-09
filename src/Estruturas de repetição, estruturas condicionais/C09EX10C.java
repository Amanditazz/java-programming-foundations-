package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX10C {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int rep = 1; rep <= 100; rep++) {
            num = rep*2-1;
            den = rep*2;
            serie +=num/den ;
        }
        serie=1.0/3*Math.pow(serie,2);
        System.out.println("C= " + serie);
    }
}

