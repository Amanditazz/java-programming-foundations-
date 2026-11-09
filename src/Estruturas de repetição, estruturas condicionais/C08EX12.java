
//Amanda Aparecida Freitas da Silva CC1MA

package Etapa2;

import javax.swing.*;

public class C08EX12 {
    public static void main(String[] args) {
        int modelo;
        double soma0 = 0, soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0;
        String[] opcoes = {" 1: A2450", "\n2: B2356", "\n 3: C3900", "\n4: D4100", "\n5: E6749"};

        double precoUnitario;
        for (int rep = 1; rep <= 1000; rep++) {
            modelo = JOptionPane.showOptionDialog(null, "Escola o modelo de sua preferência: ",
                    "Cálculo faturamento",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            if (modelo == 0) {
                soma0 += 1565.0;
            } else if (modelo == 1) {
                soma1 += 1890.0;
            } else if (modelo == 2) {
                soma2 += 2150.0;
            } else if (modelo == 3) {
                soma3 += 2963.0;
            } else {
                soma4 += 3750.0;
            }

        }

        JOptionPane.showMessageDialog(null, "O faturamento total foi de: " + (soma0 + soma1 + soma2 + soma3 + soma4));
    }


}

