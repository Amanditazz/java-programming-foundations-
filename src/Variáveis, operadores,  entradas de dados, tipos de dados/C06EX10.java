package Etapa1;

import javax.swing.JOptionPane;

public class C06EX10 {
    public static void main(String[] args) {
        String capitalAplicado, numeroDeDias, taxaDiaria;
        double rendimento, impostoRenda, valorResgatado, doubleCapital, doubleNumDias, doubleTaxa;
        int taxaAdmin;


        capitalAplicado = JOptionPane.showInputDialog(null, "insira o capital aplicado: ",
                "Cálculo financeiro",
                JOptionPane.QUESTION_MESSAGE);
        doubleCapital = Double.valueOf(capitalAplicado);

        numeroDeDias = JOptionPane.showInputDialog(null, "Insira a quantidade de dias aplicado",
                "Cálculo financeiro",
                JOptionPane.QUESTION_MESSAGE);
        doubleNumDias = Double.valueOf(numeroDeDias);


        taxaDiaria = JOptionPane.showInputDialog(null, "Informe a taxa diária sem o símbolo de porcentagem",
                "Cálculo financeiro",
                JOptionPane.QUESTION_MESSAGE);
        doubleTaxa = Double.valueOf(taxaDiaria);


//ERRO QUE LEVOU O CODIGO A DAR ERRO NO CÁLCULO: imposto de renda TAVA sem o .0 E DEU BUG NA CONTA achando que era divisão inteira
        taxaAdmin = 10;
        rendimento = doubleCapital * (doubleTaxa / 100) * doubleNumDias;
        impostoRenda = (15.0 / 100) * rendimento;
        valorResgatado = doubleCapital + rendimento - impostoRenda - taxaAdmin;


        JOptionPane.showMessageDialog(null,
                "O rendimento total é de: " + String.format("%1.2f", rendimento) + "\n O imposto de renda é de:" + String.format("%1.2f", impostoRenda) +
                        "\nO valor a ser resgatado é de:" + String.format("%1.2f", valorResgatado),
                "Cálculo financeiro",
                JOptionPane.INFORMATION_MESSAGE);


    }
}
