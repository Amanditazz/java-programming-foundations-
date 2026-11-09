package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import javax.swing.JOptionPane;

public class C08EX09 {
    public static void main(String[] args) {
        String entrada, entradaIdade, nome;
        int quantPessoas, idadeInt, sexo, contadorM = 0, contadorF = 0;
        double somaMasc = 0, somaFem = 0;
        String[] opcoes = {"M", "F"};


        entrada = JOptionPane.showInputDialog(null, " Informe a quantidade de pessoas", "Idade média",
                JOptionPane.QUESTION_MESSAGE);
        quantPessoas = Integer.valueOf(entrada);


        for (int rep = 1; rep <= quantPessoas; rep++) {
            nome = JOptionPane.showInputDialog(null, " Informe seu nome", "Idade média",
                    JOptionPane.QUESTION_MESSAGE);

            sexo = JOptionPane.showOptionDialog(null, "Selecione seu sexo", "contagem pessoas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            entradaIdade = JOptionPane.showInputDialog(null, " Informe a sua idade", "Idade média",
                    JOptionPane.QUESTION_MESSAGE);
            idadeInt = Integer.valueOf(entradaIdade);


            if (sexo == 0) {

                contadorM++;
                somaMasc += idadeInt;
            }
            if (sexo == 1) {

                contadorF++;

                somaFem += idadeInt;
            }


        }
        JOptionPane.showMessageDialog(null, "A média da idade das mulheres é de: " + somaFem / contadorF +
                "\n A médiada idade dos homens é de: " + somaMasc / contadorM, "Média de idades", JOptionPane.INFORMATION_MESSAGE);


    }
}
//JOptionPane.showInputDialog(...) → retorna String
//JOptionPane.showOptionDialog(...) → retorna int