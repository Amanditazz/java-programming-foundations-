package Etapa2;
//Amanda Aparecida Freitas da Silva CC1MA
public class C08EX28 {
    public static void main(String[] args) {
        int a = 0, soma=0, cont=0;
        System.out.println("Números triangulares entre 1 e 1000:");

        for (a = 0; a <= 10; a++) {
            for (int rep = 1; rep <= 1000; rep++) {
                if (a * (a + 1) * (a + 2) == rep) {
                    System.out.println(rep);
                     soma+=rep;
                     cont++;
                }

            }
        }

        System.out.println("A média desses números é de:"+soma/cont);
    }
}
