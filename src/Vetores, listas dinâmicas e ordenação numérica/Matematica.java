package Etapa3;

public class Matematica {

    // método que recebe o valor de x, calcula e retorna o valor de f(x)
    public static double calcularFuncao(double x) {

        double resultado;

        if (x < 4) {
            resultado = (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2));
        }
        else if (x == 4) {
            resultado = 0;
        }
        else {
            resultado = (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
        }

        return resultado;
    }
}