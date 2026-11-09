package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C09EX12 { public static void main(String[] args) {

 double num, den, serie=0;
    for(int rep=1;rep<=10000;rep++){
        num= 1;
                den=rep*2-1;

        if (rep%2==0){serie-=num/den;}
        else {serie+=num/den;}

    }
    serie=4*(serie);

    System.out.println("O valor de pi é: "+serie);
}
}
