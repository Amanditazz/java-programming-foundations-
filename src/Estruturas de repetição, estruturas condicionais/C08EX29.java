package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import javax.swing.JOptionPane;

public class C08EX29 {
    public static void main(String[] args) {
        long x, y, resultado=1;
// x é o valor inteiro do que vai ser inserido no joptionpane
        x = Long.valueOf(JOptionPane.showInputDialog(null,
                "Insira a base da potência",
                "Cálculo",
                JOptionPane.QUESTION_MESSAGE));

        //y é o valor inteiro do que vai ser inserido no joptionpane
        y = Long.valueOf(JOptionPane.showInputDialog(null,
                "Insira o expoente",
                "Cálculo",
                JOptionPane.QUESTION_MESSAGE));
//x vai ser multiplicado por x a quantidade de vezes o valor de y
        for (int rep = 1; rep <= y; rep++) {
            resultado *= x; //(resultado=resultado*x)
        }


JOptionPane.showMessageDialog(null,
        "O valor da potência é:" + resultado,
        "Cálculo",
        JOptionPane.INFORMATION_MESSAGE);
    }
}
