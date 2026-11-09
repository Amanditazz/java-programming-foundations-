
package Etapa1;
import java.util.Scanner;

public class C07EX04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome da equipe de futebol: ");

        String equipe = teclado.nextLine();

        System.out.print("A equipe " + equipe + " pertence ao estado: ");


        switch (equipe.toLowerCase()) {
            case "américa":
            case "atlético":
            case "cruzeiro":
            case "villa nova":
                System.out.println("Minas Gerais");
                break;

            case "botafogo":
            case "flamengo":
            case "fluminense":
            case "vasco":
                System.out.println("Rio de Janeiro");
                break;

            case "corinthians":
            case "palmeiras":
            case "santos":
            case "são paulo":
                System.out.println("São Paulo");
                break;

            case "grêmio":
            case "internacional":
            case "juventude":
                System.out.println("Rio Grande do Sul");
                break;

            case "náutico":
            case "santa cruz":
            case "sport":
                System.out.println("Pernambuco");
                break;

            default:
                System.out.println("Estado não encontrado para esta equipe.");
                break;
        }

        teclado.close();
    }
}

//OBS DUVIDA // Usamos .trim() para remover ERRO de espaços extras no input e .toLowerCase() para evitar erros de maiúsculas? PERGUNTAR
//SOBRE PARA RICARDO
//Se tiver mais de um comando dentro do case ou do default, deve-se abrir bloco de comandos com as chaves { e }.
// switch (dia.toLowerCase()) ou  switch (dia.trim().toLowerCase())