package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA

import java.util.Scanner;
import javax.swing.JOptionPane;

public class C05EX03 {
    public static void main() {

        double salarioNumero, liquido, imposto, numDependentes;


        String salario = JOptionPane.showInputDialog(null,
                "Insira seu salário",
                "Questionário INSS",
                JOptionPane.QUESTION_MESSAGE);

        salarioNumero = Double.valueOf(salario);

        String dependentes = JOptionPane.showInputDialog(null,
                "Insira o número de dependentes",
                "Questionário INSS",
                JOptionPane.QUESTION_MESSAGE);


        numDependentes = Double.valueOf(dependentes);

        liquido = salarioNumero - (numDependentes * 60);
        imposto = liquido * (15f / 100);

//opção 1
        JOptionPane.showMessageDialog(null,
                "O valor a ser retido é de: " + Math.round(imposto),
                "Valor imposto",
                JOptionPane.INFORMATION_MESSAGE);


    }
}

// Erro na conta do imposto: Porque 15 e 100 são números inteiros, então o Java faz uma divisão inteira. não é 15/100
// e sim 15.0/100 ou 15f/100