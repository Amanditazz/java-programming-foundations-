package Etapa3;

import java.util.Scanner;

public class C13EX08 {

    // método que recebe o nome completo e monta a String formatada em ABNT
    public static String formatarABNT(String nomeCompleto) {

        String resultado;
        String iniciais;
        String[] palavras;
        int posicaoUltimoElemento;
        String ultimoSobrenome;

        // remove espaços extras nas pontas
        nomeCompleto = nomeCompleto.trim();

        // quebra o nome completo em um vetor de palavras
        palavras = nomeCompleto.split(" ");
        posicaoUltimoElemento = palavras.length - 1;

        // o último sobrenome fica todo em maiúsculo
        ultimoSobrenome = palavras[posicaoUltimoElemento].toUpperCase();

        // string vazia para acumular as iniciais dos primeiros nomes
        iniciais = "";

        // loop para olhar todas as palavras, EXCETO a última (que é o sobrenome)
        for (int i = 0; i < posicaoUltimoElemento; i++) {
            String palavraAtual = palavras[i];

            // se a palavra for maior que 2 letras, pega a inicial (ignora da, de, do, etc
            if (palavraAtual.length() > 2) {
                // pega a primeira letra da palavra, joga para maiúsculo e põe o ponto
                char letraInicial = palavraAtual.charAt(0); // comando usado pegar a primeira letra/caractere de um texto
                iniciais = iniciais + Character.toUpperCase(letraInicial) + ". ";
            }
        }

        // junta o Sobrenome em maiúsculo, a vírgula e as iniciais limpas no final
        resultado = ultimoSobrenome + ", " + iniciais.trim();

        return resultado;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nomeAutor;
        String nomeFormatado;


        System.out.println("Informe o nome completo do autor:");
        nomeAutor = teclado.nextLine();

        // chama o método para fazer a transformação
        nomeFormatado = formatarABNT(nomeAutor);

        // mostra o resultado no padrão abnt
        System.out.println("=> " + nomeFormatado);

        teclado.close();
    }
}