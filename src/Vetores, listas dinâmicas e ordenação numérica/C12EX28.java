package Etapa3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C12EX28 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Listas sincronizadas
        List<Integer> ListaRA = new ArrayList<>();
        List<String> ListaNome = new ArrayList<>();

        int ra;
        String nome;

        // Cadastro dos alunos
        do {
            System.out.println("Informe o RA:");
            ra = teclado.nextInt();

            if (ra == 0) {
                break;
            }

            ListaRA.add(ra);

            teclado.nextLine(); // limpa o buffer

            System.out.println("Informe o nome:");
            nome = teclado.nextLine().toUpperCase();

            ListaNome.add(nome);

        } while (ra != 0);

        // Ordenação das listas pelo nome
        for (int i = 0; i < ListaNome.size() - 1; i++) {

            for (int j = i + 1; j < ListaNome.size(); j++) {

                // Se o nome da posição i vier depois do nome da posição j
                if (ListaNome.get(i).compareTo(ListaNome.get(j)) > 0) {

                    // Troca os nomes
                    String nomeTemp = ListaNome.get(i);
                    ListaNome.set(i, ListaNome.get(j));
                    ListaNome.set(j, nomeTemp);

                    // Troca os RAs para manter sincronizado
                    int raTemp = ListaRA.get(i);
                    ListaRA.set(i, ListaRA.get(j));
                    ListaRA.set(j, raTemp);
                }
            }
        }

        // Mostrar a lista ordenada
        System.out.println("\nLISTA ORDENADA");

        for (int i = 0; i < ListaNome.size(); i++) {
            System.out.println(
                    (i + 1) + "º - "
                            + ListaNome.get(i)
                            + " | RA: "
                            + ListaRA.get(i)
            );
        }

        // Pesquisa
        System.out.println("\nInforme um nome para pesquisar:");
        nome = teclado.nextLine().toUpperCase();

        int pos = ListaNome.indexOf(nome);

        if (pos != -1) {

            System.out.println("\nALUNO ENCONTRADO");

            System.out.println("Nome: " + ListaNome.get(pos));
            System.out.println("RA: " + ListaRA.get(pos));
            System.out.println("Posição: " + pos);

        } else {

            System.out.println("NOME NÃO ENCONTRADO");

        }

        teclado.close();
    }
}