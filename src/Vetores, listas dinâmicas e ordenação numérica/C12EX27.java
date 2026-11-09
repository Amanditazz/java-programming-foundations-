package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX27 {
    public static void main(String[] args) {

        List<Long> ListaCpf = new ArrayList<>();
        List<String> ListaEndereco = new ArrayList<>();

        long cpf;
        String endereco;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Informe o cpf: ");
            cpf = teclado.nextLong();

            if (cpf == 0) {
                break;
            }

            ListaCpf.add(cpf);

            teclado.nextLine();

            System.out.println("Informe o endereço: ");
            endereco = teclado.nextLine().toLowerCase();

            ListaEndereco.add(endereco);

        } while (cpf != 0);

        System.out.println("Informe um cpf");
        cpf = teclado.nextLong();
        teclado.nextLine(); // consumir o ENTER

        int pos = ListaCpf.indexOf(cpf);

        if (pos != -1) {

            System.out.println("Endereço ligado ao cpf: " + ListaEndereco.get(pos));

            System.out.println(" Digite A para alterar o endereço \n Digite E para excluir. \n Digite M para manter");

            String opcao = teclado.nextLine();

            if (opcao.equalsIgnoreCase("A")) {

                System.out.println("Informe qual novo endereço gostaria de utilizar:");
                endereco = teclado.nextLine().toLowerCase();

                ListaEndereco.set(pos, endereco);

                System.out.println("Endereço alterado com sucesso.");

            } else if (opcao.equalsIgnoreCase("E")) {

                ListaEndereco.remove(pos);
                ListaCpf.remove(pos);

                System.out.println("Endereço e CPF excluídos.");

            } else if (opcao.equalsIgnoreCase("M")) {

                System.out.println("Endereço mantido.");

            } else {

                System.out.println("Opção inválida.");

            }

        } else {

            System.out.println(" Cpf não encontrado, deseja adicionar um cpf e um endereço?\n Digite S para sim. \n Digite N para não.");

            String opcao = teclado.nextLine();

            if (opcao.equalsIgnoreCase("N")) {

                System.out.println("Nenhum CPF ou endereço adicionado.");

            } else if (opcao.equalsIgnoreCase("S")) {

                System.out.println("Informe o CPF:");
                cpf = teclado.nextLong();
                ListaCpf.add(cpf);

                teclado.nextLine(); // consumir ENTER

                System.out.println("Informe o endereço:");
                endereco = teclado.nextLine().toLowerCase();

                ListaEndereco.add(endereco);

                System.out.println("CPF e endereço adicionados.");

            } else {

                System.out.println("Opção inválida.");

            }
        }

        System.out.println("\nLISTA FINAL");

        //Imprimindo as listas
        for (int i = 0; i < ListaCpf.size(); i++) {

            System.out.println(
                    "CPF: " + ListaCpf.get(i)
                            + " | Endereço: " + ListaEndereco.get(i)
            );
        }

        teclado.close();
    }
}

// Caso não saiba o índice, combine o .indexOf(valorAntigo) com o .set()
// para buscar e substituir de forma dinâmica.
// String valorAntigo = "Banana";
//
//        // Verifica se o valor está na lista antes de substituir
//        int indice = frutas.indexOf(valorAntigo);
//        if (indice != -1) {
//            frutas.set(indice, "Morango");
//        }