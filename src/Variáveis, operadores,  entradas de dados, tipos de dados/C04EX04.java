
package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA


import javax.swing.JOptionPane;

public class C04EX04 {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null,
                "Insira seu nome",
                "Questionário",
                JOptionPane.QUESTION_MESSAGE
        );
        String sobrenome = JOptionPane.showInputDialog(null,
                "Insira seu sobrenome",
                "Questionário",
                JOptionPane.QUESTION_MESSAGE
        );
        String nomeDoMeio = JOptionPane.showInputDialog(null,
                "Insira seu nome do meio",
                "Questionário",
                JOptionPane.QUESTION_MESSAGE
        );
        String idadeTexto = JOptionPane.showInputDialog(null,
                "Insira sua idade",
                "Questionário",
                JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.parseInt(idadeTexto);

//output

        JOptionPane.showMessageDialog(null,
                sobrenome + ", " + nome + " " + nomeDoMeio + "\nidade: " + idadeTexto,
                "Informações do usuário",
                JOptionPane.INFORMATION_MESSAGE
        );


    }
}


//Observações para aprendizado próprio:
//
//
//
// System sempre maiúscula a primeira letra. Import  sempre antes
// do programa, dentro é "como colocar o manual ja no lego montado"
//JOptionPane P maiúsculo
// sempre trata como string mesmo a pessoa colocando um número, mas precisa converter depois
//ShowInputDialog é um método, então precisa ser chamado assim:
//JOptionPane.showInputDialog("mensagem");
//String idade;	cria a variável
//idade = ...	coloca valor
//String idade = ...	cria e coloca valor ao mesmo tempo
//conversão = (parse). parseLong, parseDouble, parseInt......Exemplo
//double peso = Double.parseDouble(texto); texto é o nome da variavel antes de eu transformar ela
//em número, novo nome que dei agora que ela foi convertida para numero é peso
//int idade = Integer.parseInt(idadeTexto);<<< mesmo aqui
//PARA JUNTAR TEXTOS E VARIAVEIS O JAVA USA + (MAIS) E NÃO , (VÍRGULA) OK e para números decimIS É .
//A vírgula , → separa argumentos do método, O sinal de mais + → junta textos (concatenação)
//
//Quando você chama um método, como JOptionPane.showMessageDialog, cada coisa que você passa
// para ele vai separada por vírgula.
//
//Exemplo:
//
//JOptionPane.showMessageDialog(
//    null,               // 1º argumento: quem é o "pai" da janela
//    "Oi, tudo bem?",    // 2º argumento: a mensagem que vai aparecer
//    "Título da Janela", // 3º argumento: o título
//    JOptionPane.INFORMATION_MESSAGE // 4º argumento: o tipo de ícone
//);