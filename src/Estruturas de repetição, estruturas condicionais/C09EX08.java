package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX08 {
    public static void main(String[] args) {
       double num, den, serie=0;
        for (int rep=1; rep<=20; rep++){
  num=(rep*2+1)*(Math.sqrt(rep*4+1));
  den= Math.pow(5, rep);
  serie+=num/den;
    }
        serie= Math.pow(serie,2);
        System.out.println(" O valor da série é:"+ serie);
}}
