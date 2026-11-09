package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX11B {
    public static void main(String[] args) {
        double num, den, serie=0.0;

        for(int rep=1;rep<=100; rep++){

            num= (rep*3)-2;
            den= Math.sqrt(rep*3+4);
            serie+=num/den;
        }
        serie=5.0/3 * serie;// ou cbrt
        System.out.println("B="+serie);
    }
}

