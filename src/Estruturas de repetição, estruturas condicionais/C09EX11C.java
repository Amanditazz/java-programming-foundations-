package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX11C { public static void main(String[] args) {
    double num, den, serie=0;

    for(int rep=1; rep<=100; rep++){
        num= (rep*2+1)*(Math.pow((rep*4+1),1/2.0));
        den=Math.pow(5, rep);
        serie+=num/den;

    }
    serie= Math.pow(serie,2);

    System.out.println("C="+serie);
}
}
