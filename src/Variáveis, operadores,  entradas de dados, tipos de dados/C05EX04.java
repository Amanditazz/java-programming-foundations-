package Etapa1;

//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA

import java.util.Scanner;
import javax.swing.JOptionPane;

public class C05EX04 {
    public static void main() {
        String x1, x2, y1, y2;
        double distancia;
        x1 = JOptionPane.showInputDialog(null,
                "Insira a coordenada do ponto x1",
                "Coordenadas plano cartesiano",
                JOptionPane.QUESTION_MESSAGE);
        Double x1Calculo = Double.valueOf(x1);

        y1 = JOptionPane.showInputDialog(null,
                "Insira a coordenada do ponto y1 referente ao ponto x1",
                "Coordenadas plano cartesiano",
                JOptionPane.QUESTION_MESSAGE);
        Double y1Calculo = Double.valueOf(y1);
        x2 = JOptionPane.showInputDialog(null,
                "Insira a coordenada do ponto x2",
                "Coordenadas plano cartesiano",
                JOptionPane.QUESTION_MESSAGE);
        Double x2Calculo = Double.valueOf(x2);

        y2 = JOptionPane.showInputDialog(null,
                "Insira a coordenada do ponto y2 referente ao ponto x2",
                "Coordenadas plano cartesiano",
                JOptionPane.QUESTION_MESSAGE);
        Double y2Calculo = Double.valueOf(y2);

        distancia = Math.sqrt(Math.pow(x1Calculo - x2Calculo, 2) + (Math.pow(y1Calculo - y2Calculo, 2)));


        JOptionPane.showMessageDialog(null,
                "A distância entre os dois pontos é de: " + Math.round(distancia),
                "Cálculo distância",
                JOptionPane.QUESTION_MESSAGE);


    }
}
