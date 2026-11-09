package Etapa1;
//A legislação brasileira prevê a distribuição dos lucros de uma empresa semestralmente. Cada empresa faz esta distribuição proporcional ao salário de cada empregado e
//com cálculos específicos. Faça um programa que solicite ao usuário o salário de um empregado e calcule e imprima o valor de sua participação nos lucros (PL Líquido)
//de acordo com a tabela e fórmulas abaixo:

import javax.swing.JOptionPane;

public class C06EX07 {
    public static void main(String[] args) {

        String salario;
        double plBruto, plLiquido, impostoRenda;


        salario = JOptionPane.showInputDialog(null, "Insira o salário do funcionário",
                "Participação de lucros",
                JOptionPane.QUESTION_MESSAGE);

        double salarioCalculo = Double.valueOf(salario);

        if (salarioCalculo <= 300) {
            plBruto = 500 + (70f / 100) * salarioCalculo;
        } else if (salarioCalculo <= 1000) {
            plBruto = 200 + (50f / 100) * salarioCalculo;
        } else {
            plBruto = 1000 + (30f / 100) * salarioCalculo;
        }

        impostoRenda = (25f / 100) * plBruto;
        plLiquido = plBruto - impostoRenda;

        JOptionPane.showMessageDialog(null, " O valor da participação de lucros a ser recebido é de: " + String.format("%1.2f", plLiquido),
                "Participação de lucro ",
                JOptionPane.INFORMATION_MESSAGE);


    }
}


// dar ctrlAltL pra deixar bonitin
//"MAS POR QUE STRING FORMAT SE O QUE TA SAINDO EU COLOQUEI COMO DOUBLE E NAO STRING?"
//O String.format não muda o número, ele só muda como ele aparece na tela.
//String.format("%.2f", plLiquido)
//PODE USAR O Math.round(x) também