package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA

import javax.swing.JOptionPane;

public class C05EX11 {
    public static void main() {

        int codigoBanco, codigoAgencia, sequencialNumerico;
        String codigoChequeA;


        codigoChequeA = JOptionPane.showInputDialog(null, "Insira o códido do banco de 3 dígitos",
                "Informações bancárias",
                JOptionPane.QUESTION_MESSAGE);
        int codigoChequeB = Integer.valueOf(codigoChequeA);

        codigoBanco = codigoChequeB / 1000000;
        codigoAgencia = codigoChequeB % 1000000 / 1000;
        sequencialNumerico = codigoChequeB % 1000;


        JOptionPane.showMessageDialog(null, "Número do cheque: " + codigoChequeB + "\nNúmero do banco: "
                        + codigoBanco + "\nCódigo da agência: " + codigoAgencia + "\nSequencial: " + sequencialNumerico,
                "Informações bancárias",
                JOptionPane.INFORMATION_MESSAGE);


    }
}