package Etapa1;

//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA

import java.util.Scanner;

public class C05EX06 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        double coeficienteA, coeficienteB, coeficienteC, pontoX, pontoY, distancia;
        String unidadeMedida;

        System.out.println("insira a coordenada X do ponto no plano cartesiano: ");
        pontoX = teclado.nextDouble();

        System.out.println("insira a coordenada Y referente ao ponto X: ");
        pontoY = teclado.nextDouble();

        System.out.println(" Insira o coeficiente A da reta. ");
        coeficienteA = teclado.nextDouble();

        System.out.println(" Insira o coeficiente B da reta. ");
        coeficienteB = teclado.nextDouble();

        System.out.println(" informe onde a reta corta o eixo y (constante C)");
        coeficienteC = teclado.nextDouble();

        teclado.nextLine();

        System.out.println("Insira a unidade de medida utilizada (exemplo: metros, centímetros): ");
        unidadeMedida = teclado.nextLine();


        distancia = Math.abs((coeficienteA * pontoX + coeficienteB * pontoY + coeficienteC) /
                Math.sqrt(Math.pow(coeficienteA, 2) + Math.pow(coeficienteB, 2)));

        System.out.println("A distância entre o ponto do plano cartesiano e a reta apresentada é de: " + distancia + " " + unidadeMedida + ", " +
                "equivalente a aproximadamente: " + Math.round(distancia) + " " + unidadeMedida
        );

        teclado.close();

    }

}
//OBS: em caso de next numerica (ex nextDouble) antes de next line, precisamos escrever um
// teclado.nextLine(); ANTES
//da nossa nextline e nao depois