package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
import java.util.Scanner;

public class C11EX09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variáveis de entrada
        String nome, nomePrimeiro = "", nomeUltimo = "";
        int rf;

        // Contadores por setor (Item b)
        int contGerencia = 0, contAdmin = 0, contPesquisa = 0, contObras = 0;

        // Contador específico (Item c)
        int contAdmin2010 = 0;

        // Flag para controle do primeiro e último (Item e)
        boolean primeiroFuncionario = true;

        // Leitura inicial do nome (Flag: pode ser "FIM" ou similar)
        System.out.print("Nome do funcionário (ou 'SAIR' para encerrar): ");
        nome = teclado.next();

        while (!nome.equalsIgnoreCase("SAIR")) {
            System.out.print("Digite o RF (6 dígitos): ");
            rf = teclado.nextInt();

            // --- Lógica para "quebrar" o RF de 6 dígitos (Ex: 123456) ---
            // Pegar os 2 primeiros (Ano): 123456 / 10000 = 12
            int anoRF = rf / 10000;

            // Pegar o 3º dígito (Setor): (123456 / 1000) % 10 = 3
            int setorRF = (rf / 1000) % 10;

            // a) Validação do Registro
            boolean erroAno = (anoRF < 10 || anoRF > 14);
            boolean erroSetor = (setorRF < 1 || setorRF > 4);
            boolean erroDigitos = (rf < 100000 || rf > 999999);

            if (erroAno || erroSetor || erroDigitos) {
                System.out.println("REGISTRO INVÁLIDO");
            } else {
                // Registro válido: processar contagens

                // Item b e d: Contagem por setor
                if (setorRF == 1) {
                    contGerencia++;
                } else if (setorRF == 2) {
                    contAdmin++;
                    // Item c: Admitidos em 2010 (dezena 10) na Administração (código 2)
                    if (anoRF == 10) {
                        contAdmin2010++;
                    }
                } else if (setorRF == 3) {
                    contPesquisa++;
                } else if (setorRF == 4) {
                    contObras++;
                }

                // Item e: Guardar primeiro e último nomes válidos
                if (primeiroFuncionario) {
                    nomePrimeiro = nome;
                    primeiroFuncionario = false;
                }
                nomeUltimo = nome; // Sempre atualiza, o último a ser lido será o "último"
            }

            System.out.println("------------------------------------");
            System.out.print("Nome do próximo funcionário (ou 'SAIR'): ");
            nome = teclado.next();
        }

        // --- Resultados Finais ---
        System.out.println("\n======= RELATÓRIO RH =======");
        System.out.println("b) Funcionários por setor:");
        System.out.println("   Gerência: " + contGerencia + " | Admin: " + contAdmin);
        System.out.println("   Pesquisa: " + contPesquisa + " | Obras: " + contObras);

        System.out.println("c) Admitidos em 2010 na Administração: " + contAdmin2010);

        // Item d: Setor com mais funcionários
        String setorMaisPopulado = "Gerência";
        int maiorQtd = contGerencia;
        if (contAdmin > maiorQtd) { setorMaisPopulado = "Administração"; maiorQtd = contAdmin; }
        if (contPesquisa > maiorQtd) { setorMaisPopulado = "Pesquisa"; maiorQtd = contPesquisa; }
        if (contObras > maiorQtd) { setorMaisPopulado = "Obras"; }

        System.out.println("d) Setor com mais funcionários: " + setorMaisPopulado);
        System.out.println("e) Primeiro admitido: " + nomePrimeiro + " | Último admitido: " + nomeUltimo);

        teclado.close();
    }
}