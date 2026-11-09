package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX11D {
    public static void main(String[] args) {
        double num, den, serie=0.0;

        for(int rep=1;rep<=100; rep++){

            num= Math.pow(rep,3);
            den= Math.pow(10,rep-1);
            serie+=num/den;
        }
        System.out.println("D="+serie);
    }
}

