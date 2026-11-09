package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX11E{
    public static void main(String[] args) {
        double num, den, serie=0.0;

        for(int rep=1;rep<=100; rep++){

            num= Math.pow(rep,2)*Math.sqrt(rep*2+3);
            den= Math.pow(rep+1,rep);
            serie+=num/den;
        }
        serie= 2/3.0*serie;
        System.out.println("E="+serie);
    }
}

