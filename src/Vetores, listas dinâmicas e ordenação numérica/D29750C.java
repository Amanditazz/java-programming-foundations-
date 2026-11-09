package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D29750C {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Long> ListaCodigo = new ArrayList<>();
        List<Integer> ListaEstoque = new ArrayList<>();

        String codigo;
        int quantidade;
        long pos = -1;
        do {
            System.out.println("Informe o código do produto: ");
            codigo = teclado.nextLine();
            if (codigo.equalsIgnoreCase("x")) {
                break;
            }

            ListaCodigo.add(Long.parseLong(codigo));

            System.out.println("Informe a quantidade: ");
            quantidade = teclado.nextInt();
            ListaEstoque.add(quantidade);

            teclado.nextLine();

        }
        while (!codigo.equalsIgnoreCase("x"));


        System.out.println("Informe o código do produto do qual deseja adicionar 100 unidades: ");
        long codigoPesquisa = teclado.nextLong();

//pesquisando..
        for (int i = 0; i < ListaEstoque.size(); i++) {
            //achou!
            if (ListaCodigo.get(i) == codigoPesquisa) {
                ListaEstoque.set(i, (ListaEstoque.get(i) + 100));
                pos = ListaCodigo.get(i);
                System.out.println("Nova quantidade: " + ListaEstoque.get(i));
            }
        }
//não achou! adiciona com estoque zerado
        if (pos == -1) {
            System.out.println("Código de produto não encontrado, adicionando código com estoque zerado...");
            ListaCodigo.addFirst(codigoPesquisa);
            ListaEstoque.addFirst(0);
        }

        //ordenando (EXTRA)

        for (int i = 0; i < ListaEstoque.size() - 1; i++) {
            for (int j = 0; j < ListaEstoque.size() - 1 - i; j++) {
                if (ListaEstoque.get(j) > ListaEstoque.get(j + 1)) {

                    // ordena
                    int estoqueTemp = ListaEstoque.get(j);
                    ListaEstoque.set(j, ListaEstoque.get(j + 1));
                    ListaEstoque.set(j + 1, estoqueTemp);

                    // Troca os códigos para manter sincronizado
                    long codTemp = ListaCodigo.get(j);
                    ListaCodigo.set(j, ListaCodigo.get(j + 1));
                    ListaCodigo.set(j + 1, codTemp);
                }
            }
        }
// imprimindo ordenada
        System.out.println("Lista completa: \n");
        for (int i2 = 0; i2 < ListaEstoque.size(); i2++) {
            System.out.println("Código:  " + ListaCodigo.get(i2) + "  | Estoque:  " + ListaEstoque.get(i2));
        }
        teclado.close();
    }
}
