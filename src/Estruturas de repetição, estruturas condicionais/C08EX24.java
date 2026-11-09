package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C08EX24 { public static void main(String[] args)
{
    double num=0, serie;
    for(int aux=1; aux<=99; aux+=2){
        num+= Math.pow(2,aux);
    }
    serie=1/3.0*(num);

    System.out.println(serie);
}
}
