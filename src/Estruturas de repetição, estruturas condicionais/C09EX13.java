package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX13 { public static void main(String[] args) {

    double num=1, den, serie=0;
    for(int  rep=1; rep<=10; rep++){

        num*=rep;
        den=Math.pow(2,rep)-1;

        if(rep%2==0){serie-=num/den;}
        else{serie+=num/den;}


    }
    System.out.println("O valor da série é: "+ serie);
}
}
