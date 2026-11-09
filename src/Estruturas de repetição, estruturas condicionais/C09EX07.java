package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX07 { public static void main(String[] args) {

    double num, den, serie=0;

    for(int rep=1; rep<=6; rep++){
        num= (rep*2-2) + (rep*3);
        den=rep*6+1;
        serie+=num/den;



    }

    System.out.println("O valor da série é:"+ serie);

}
}
