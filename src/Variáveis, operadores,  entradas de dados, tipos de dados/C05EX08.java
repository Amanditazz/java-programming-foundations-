package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA


import javax.swing.JOptionPane;

public class C05EX08 {
    public static void main(String[] args) {
        String angulo, area;
        double anguloCalculo, raio, areaCalculo;
        angulo = JOptionPane.showInputDialog(null, "Insira o valor do ângulo referente ao setor circular",
                "Calculo Raio setor circular,",
                JOptionPane.QUESTION_MESSAGE);

        anguloCalculo = Double.valueOf(angulo);

        area = JOptionPane.showInputDialog(null, "Informe o valor da área do setor circular",
                "Calculo Raio setor circular",
                JOptionPane.QUESTION_MESSAGE);

        areaCalculo = Double.valueOf(area);

        raio = Math.sqrt((360 * areaCalculo) / (3.1416 * anguloCalculo));

        JOptionPane.showMessageDialog(null, "O valor do raio do setor circular é de: " + raio,
                "Calculo Raio setor circular",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
//OBS diferença de conversões
// letra pra número:
// anguloCalculo = Double.valueOf(angulo);

//número pra letra
//String anguloLetra=Integer.toString(anguloCalculo)