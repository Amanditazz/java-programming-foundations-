package Etapa3;

import java.util.Arrays;
public class C12EX19 {
    public static void main(String[] args) {
        double [] numeros={8, 6, 2, 3, 4, 5, 5, 1, 9, 7};
        double numerosInverso[]=new double[numeros.length];
int j=0;
for(int i=numeros.length-1; i>=0; i--){
    numerosInverso[j]=numeros[i];
    j++;
}

        System.out.println(Arrays.toString(numerosInverso));
    }
}
