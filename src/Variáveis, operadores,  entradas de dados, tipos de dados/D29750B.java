package Etapa1;
//Amanda Aparecida Freitas da Silva
import javax.swing.JOptionPane;

public class D29750B {
    public static void main(String[] args) {

        String codigoRa;
        long codigoDv;

        codigoRa = JOptionPane.showInputDialog(null, "Insira seu código de registro acadêmico",
                "Cálculo digito verificador",
                JOptionPane.QUESTION_MESSAGE);
//12345678
        long codigoRaCalculo = Long.valueOf(codigoRa);

        codigoDv = ((codigoRaCalculo / 10000) * 3 + (codigoRaCalculo / 1000 % 10) * 6 + (codigoRaCalculo % 1000) * 9) % 5;

        // 8 digitos 100.000.000
        if (codigoRaCalculo >= 10000000 && codigoRaCalculo <= 99999999) {
            JOptionPane.showMessageDialog(null, "Seu dígito verificador é: " + codigoDv,
                    "Cálculo digito verificador",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Código inválido",
                    "Cálculo digito verificador",
                    JOptionPane.INFORMATION_MESSAGE);
        }


    }
}
