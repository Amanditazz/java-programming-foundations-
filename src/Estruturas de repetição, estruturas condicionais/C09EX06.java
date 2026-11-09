package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX06 { public static void main(String[] args) {
    double num, den, serie=0;

    for(int rep=1; rep<=20; rep++){

        num= rep;
        den= Math.sqrt(rep*2);
        serie+= num/den;
    }
    serie= 10 + serie;
    System.out.println("O valor da série é:"+serie);

}}
