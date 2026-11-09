package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA

public class C11EX14 {
    public static void main(String[] args) {
        double somaSerie = 0;
        double piCalculado = 0;
        double den = 1; // Denominador começando em 1
        int sinal = 1;
        int termos;

        // For "infinito": a contagem de termos controla o laço,
        // mas o 'break' decide a hora exata de parar
        for (termos = 0; ; termos++) {
            double num = 1.0; // Numerador é sempre 1

            somaSerie += (num / den) * sinal;
            piCalculado = 4 * somaSerie;

            // Condição de parada: se o PI estiver na faixa desejada
            if (piCalculado >= 3.1416 && piCalculado <= 3.1417) {
                termos++; // Conta o último termo antes de sair
                break;
            }

            den += 2;
            sinal *= -1;
        }

        System.out.println("Valor de PI alcançado: " + piCalculado);
        System.out.println("Quantidade de termos necessários: " + termos);
    }
}