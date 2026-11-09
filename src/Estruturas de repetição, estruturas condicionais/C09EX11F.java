package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX11F {
    public static void main(String[] args) {
        double num, den, serie=0.0;

        for(int rep=1;rep<=100; rep++){

            num= (rep*2-1) * Math.pow(2,rep+1);
            den= Math.pow((rep*5)-3,2);
            serie+=num/den;
        }
        serie=5*Math.pow(serie,1.0/2);
        System.out.println("F="+serie);
    }
}
