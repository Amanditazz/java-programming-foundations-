package Etapa3;
//VERSAO DO PROGRAMA UTILIZANDO APENAS UM VETOR, ONDE A POSIÇÃO NA FILA É O INDICE, E USANDO A PESQUISA LINEAR,
//ONDE NÃO PRECISO ORDENAR AS PESSOAS PARA PESQUISAR, MAS EM SISTEMAS MAIORES SERIA MELHOR EU USAR POO, QUE GUARDA A PESSOA E O LUGAR NA FILA DELA.
// DEPOIS ORDENAR ALFABETICAMENTE E FAZER A PESQUISA BINÁRIA MESMO, POIS ELA EVITA DE TER QUE PASSAR DE PESSOA POR PESSOA NA FILA!!!
import java.util.Scanner;

public class C12EX13 {
    public static void main(String[] args) {
        String nomes[] = new String[10];
        String procurando; //variavel que vai ser comparada com oq quero (nome)
        Scanner teclado = new Scanner(System.in);
boolean encontrado=false;
        System.out.println("Fila: ");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + "º >");
            nomes[i] = teclado.nextLine();
        }

        System.out.println("Insira o nome de quem quer achar: ");
        procurando = teclado.nextLine();

        // enquanto o i passa pelo vetor, comparar o procurando pra
        // ver se é igual o dado na posção i
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(procurando)) {
                encontrado = true;

                System.out.printf("%s se encontra na posição %d da fila", procurando, (i + 1));

                break; // se eu colocar um else dentro desse for, no primeiro teste qu eu
                //fizer, se não achar nesse primeiro ele ja vai dizer que não encontrou, por isso usar o bool
            }}
            //esse if tem que ficar fora, pra não ser testado junto ao outro, mesmo motivo de não ter else
       if (!encontrado) {
              System.out.println("Usuário não encontrado");

       }
    }
}
