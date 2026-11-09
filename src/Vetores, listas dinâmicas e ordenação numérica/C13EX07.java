package Etapa3;

import java.util.Scanner;

public class C13EX07 {

    // método que encontra e isola o último sobrenome do nome completo
    public static String obterUltimoSobrenome(String nomeCompleto) {

        String ultimoSobrenome;
        int indiceUltimoEspaco;

        // remove espaços inúteis que o usuário possa ter digitado sem querer no início ou fim
        nomeCompleto = nomeCompleto.trim();

        // encontra a posição do último espaço em branco no texto
        indiceUltimoEspaco = nomeCompleto.lastIndexOf(' ');

        // o substring corta o texto começando da posição do espaço + 1 (para não pegar o próprio espaço)
        ultimoSobrenome = nomeCompleto.substring(indiceUltimoEspaco + 1);

        return ultimoSobrenome;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome;
        String sobrenomeFamilia;

        // leitura do nome completo da pessoa
        System.out.println("Informe o nome completo de uma pessoa:");
        nome = teclado.nextLine();

        // chama o método enviando o nome completo lido
        sobrenomeFamilia = obterUltimoSobrenome(nome);

        // mostra o resultado final na tela
        System.out.println("=> " + sobrenomeFamilia);

        teclado.close();
    }
}

//O lastIndexOf(' ') varre o texto e descobre que o último espaço está no índice 16 (logo antes do F).Se fizermos o corte exatamente no 16, ele traria " Freitas" (com o espaço junto).
// Por isso, usamos indiceUltimoEspaco + 1 (16 + 1 = 17$).
// O índice 17 é onde começa a letra F.O substring(17) pega tudo do índice 17 até o final do texto, devolvE apenas "Freitas"!