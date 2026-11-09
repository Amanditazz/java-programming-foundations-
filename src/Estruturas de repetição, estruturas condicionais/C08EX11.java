package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import javax.swing.JOptionPane;

public class C08EX11 {
    public static void main(String[] args) {
        //ex: String[] opcoes = {"M", "F"};
//OP= OPTION
        String[] sexoOp = {"M", "F"}, estadoCivilOp = {"S", "C", "O"}, corOlhosOp = {"A", "C", "P", "O"}, corCabelosOp = {"L", "P", "C", "R", "O"},
        escolaridadeOp = {"1", "2", "3", "4"};;
        String nome, nomeMaiorS=" " ;
        double salario, salarioMaior=0, maiorSalarioHomens=0, menorSalarioHomens=0;
        int sexo, idade, estadoCivil, corOlhos, corCabelo, escolaridade, cont = 0;


        for (int rep = 1; rep <= 4; rep++) {
        nome = JOptionPane.showInputDialog(null, " Informe seu nome",
                "questionário",
                JOptionPane.QUESTION_MESSAGE
        );

        idade =  Integer.parseInt(JOptionPane.showInputDialog(null, " Informe sua idade",
                "questionário",
                JOptionPane.QUESTION_MESSAGE
        ));

        sexo = JOptionPane.showOptionDialog(null, "Insira seu sexo (“M” para masculino ou “F” para feminino:",
                "questionario",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                sexoOp,
                sexoOp[0]
        );

        estadoCivil = JOptionPane.showOptionDialog(null, "Insira seu estado civil (“C” para casado, “S” para solteiro ou “O” para outros):",
                "questionario",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                estadoCivilOp,
                estadoCivilOp[0]
        );

        corOlhos = JOptionPane.showOptionDialog(null, "Insira a cor de seus olhos (“A” para azul, “C” para castanhos, “P” para preto ou “O” para outros)",
                "questionario",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                corOlhosOp,
                corOlhosOp[0]
        );

        corCabelo = JOptionPane.showOptionDialog(null, "Insira a cor de seu cabelo (“L” para loiro,“P” para preto, “C” para castanhos ou “R” para ruivos)",
                "questionario",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                corCabelosOp,
                corCabelosOp[0]);

        salario =  Double.parseDouble(JOptionPane.showInputDialog(null, " Informe seu salario",
                "questionário",
                JOptionPane.QUESTION_MESSAGE));
         if(salario>salarioMaior){salarioMaior=salario;
         nomeMaiorS=nome;}

         if(sexo==0 && salario>maiorSalarioHomens){ maiorSalarioHomens=salario;}
         if (sexo==0 && salario<menorSalarioHomens){ menorSalarioHomens=salario;}


                escolaridade= JOptionPane.showOptionDialog(null, "Insira sua escolaridade (1 para analfabeto, 2 para ensino fundamental, 3 " +
                                "para ensino médio ou 4 para superior)",
                        "questionario",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        escolaridadeOp,
                        escolaridadeOp[0]
                );



            if(idade>=18 && idade<=25 && sexo==0 && estadoCivil==1 && corOlhos==0 && corCabelo==0 && escolaridade==3 && salario>10000){ cont++;

        }}


JOptionPane.showMessageDialog(null, "A quantidade de mulheres loiras, solteiras, entre 18 e 25 anos e com olhos azuis é de: "+ cont +
        "\nA pessoa com maior salário é: "+nomeMaiorS+", recebendo: "+salarioMaior+
        "\nA diferença entre o maior e o menor salário entre os homens é de: "+ (maiorSalarioHomens-menorSalarioHomens),
        "questionário",
        JOptionPane.INFORMATION_MESSAGE);

    }
};