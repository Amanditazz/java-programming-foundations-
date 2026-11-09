package Etapa1;
//Aluna: Amanda Aparecida Freitas da Silva. Sala: CC1MA

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class C04EX05 {
    public static void main(String[] args) {

        // Precisamos indicar o caminho do arquivo
        File arquivo = new File("pessoas.txt");

        try {
            // Criamos o Scanner apontando para o arquivo, não para o teclado (System.in)
            Scanner leitorArquivo = new Scanner(arquivo);

            // 1. Lendo os dados na ordem do enunciado
            String nomeCompleto = leitorArquivo.nextLine();
            int qtdFilhos = leitorArquivo.nextInt();
            double salario = leitorArquivo.nextDouble();

            // Limpeza de buffer (necessário após ler número e antes de ler texto novamente)
            leitorArquivo.nextLine();

            String nomeMae = leitorArquivo.nextLine();

            // 2. Imprimindo as informações na tela
            System.out.println("--- Dados Lidos do Arquivo ---");
            System.out.println("Nome: " + nomeCompleto);
            System.out.println("Filhos: " + qtdFilhos);
            System.out.printf("Salário: R$ %.2f\n", salario);
            System.out.println("Nome da Mãe: " + nomeMae);

            leitorArquivo.close();

        } catch (FileNotFoundException e) {
            // Caso o arquivo pessoas.txt não seja encontrado
            System.out.println("Erro: O arquivo 'pessoa.txt' não foi encontrado!");
            System.out.println("Certifique-se de que ele está na pasta correta do projeto.");
        }
    }
}


//OBS: SOBRE O CONTEUDO TXT PARA APRENDIZADO PROPRIO
//import java.io.File: Necessário para que o Java entenda que vamos lidar com arquivos físicos.
//try { ... } catch: O Java "obriga" você a tratar o erro de arquivo não encontrado. O código dentro do try é a tentativa, e o catch é o plano B se algo der errado.

//Buffer (leitorArquivo.nextLine()): Sempre que você lê um número (nextInt ou nextDouble) e logo depois quer ler um texto (nextLine), o Java "pula" uma linha. Por isso, usamos aquele nextLine() vazio ali no meio para "limpar" o caminho.

//Localização: O arquivo pessoa.txt deve estar na raiz do projeto. Se  estiver usando o VS Code ou IntelliJ, ele fica na pasta principal do projeto, fora da pasta src.

//Se o computador estiver em Português, o nextDouble() vai esperar o salário com vírgula (2500,50). Se estiver em Inglês, será com ponto (2500.50);//