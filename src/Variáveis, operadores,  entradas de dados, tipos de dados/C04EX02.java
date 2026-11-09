package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA


import java.util.Scanner;

public class C04EX02 {
    public static void main(String args[]) {
        ;
        Scanner informacoes = new Scanner(System.in);
        String nomeDaEmpresa, nome, cpf;
        int carteiraMotorista, tituloDeEleitor, identidade;
        double salario;


        System.out.println("Insira seu nome: ");
        nome = informacoes.nextLine();

        System.out.println("Insira seu cpf sem pontuações: ");
        cpf = informacoes.nextLine();
        System.out.println("Insira o número da identidade sem pontuações: ");
        identidade = informacoes.nextInt();

        System.out.println("Insira o número do título de eleitor sem pontuações: ");
        tituloDeEleitor = informacoes.nextInt();

        System.out.println("Insira o número da carteira de motorista sem pontuações: ");
        carteiraMotorista = informacoes.nextInt();

        System.out.println("Insira o salário");
        salario = informacoes.nextDouble();
        informacoes.nextLine();
        //Quando usa o next long e depois o next line (númerico e depois line) pode dar bug, então o ideal é
        //colocar entre eles NOmeObjeto.nextLine();<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        System.out.println("Insira o nome da empresa: ");
        nomeDaEmpresa = informacoes.nextLine();

        System.out.printf("Ficha funcional de: %s \n Cpf:............... %s \nC.I:............... %d \n Título de eleitor:............... %d \n " +
                        "Carteira de motorista:............... %d \n\nEmpresa:............... %s \n Salário:............... R$ %7.2f"
                , nome, cpf, identidade, tituloDeEleitor, carteiraMotorista, nomeDaEmpresa, salario);


        informacoes.close();

    }

}

