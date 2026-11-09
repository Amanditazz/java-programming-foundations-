package Etapa1;

//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA


//Fazer um programa que calcule a conversão de temperaturas. O usuário informará o valor
//de uma temperatura em Celsius e o programa irá calcular e imprimir esta mesma temperatura
//em Kelvin e Fahrenheit

import java.util.Scanner;

public class C05EX05 {
    public static void main(String[] args) {

        Scanner temperatura = new Scanner(System.in);
        double celsius, kelvin, farenheit;


        System.out.println("Informe o valor da temperatura em Celsius para a conversão para Kelvin e Farenheit: ");
        celsius = temperatura.nextDouble();

        kelvin = celsius + 273;
        farenheit = (9f / 5) * celsius + 32;

        System.out.printf(celsius + " graus celcius equivalem a %1.2f graus kelvin e a %1.2f graus farenheit", kelvin, farenheit);


        temperatura.close();
    }
}

//OBS ERROS %d é para inteiro, mas as variáveis são double
//faltou formatar corretamente a string
//Use %f.