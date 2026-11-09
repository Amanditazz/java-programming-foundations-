package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX11A {
    public static void main(String[] args) {
        double num, den, serie=0.0;

        for(int rep=1;rep<=100; rep++){

            num= rep+(rep*7-6);
            den= Math.pow(4,rep-1);
            serie+=num/den;
        }
        serie=Math.pow(serie,1/3.0); // ou cbrt
        System.out.println("A="+serie);
    }
}
