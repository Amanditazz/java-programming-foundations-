package Etapa3;

import java.util.Scanner;

public class C13EX05 {

    // método que recebe o ângulo em radianos e calcula as funções trigonométricas
    public static void calcularTrigonometria(double radiano) {

        double seno;
        double cosseno;
        double tangente;
        double arcoSenoFormula;
        double arcoCossenoFormula;
        double arcoTangenteFormula;

        // cálculos básicos usando a classe Math
        seno = Math.sin(radiano);
        cosseno = Math.cos(radiano);
        tangente = Math.tan(radiano);

        // cálculos baseados nas fórmulas descritas nos parênteses do slide
        arcoSenoFormula = 1 / seno;
        arcoCossenoFormula = 1 / cosseno;
        arcoTangenteFormula = cosseno / seno;

        // mostra os resultados obtidos
        System.out.println("Seno = " + seno);
        System.out.println("Cosseno = " + cosseno);
        System.out.println("Tangente = " + tangente);
        System.out.println("Arco Seno (1/seno) = " + arcoSenoFormula);
        System.out.println("Arco Cosseno (1/cosseno) = " + arcoCossenoFormula);
        System.out.println("Arco Tangente (cosseno/seno) = " + arcoTangenteFormula);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double grau;
        double radiano;

        // leitura do ângulo em graus fornecido pelo usuário
        System.out.println("Informe o valor de um ângulo (em graus):");
        grau = teclado.nextDouble();

        // conversão obrigatória de graus para radianos conforme a dica do slide
        radiano = Math.toRadians(grau);

        System.out.println("\n=== RESULTADOS ===");

        // chama o método enviando o valor convertido
        calcularTrigonometria(radiano);

        teclado.close();
    }
}