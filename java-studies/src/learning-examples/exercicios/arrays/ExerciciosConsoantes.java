package arrays;
/*
 Faça um programa que:
 1. Leia um vetor de 06 caracteres
 2. Informe quantas consoantes foram lidas
 3. Imprima as consoantes.
 */

import java.util.Scanner;

public class ExerciciosConsoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtd_Consoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a")
                    || letra.equalsIgnoreCase("e")
                    || letra.equalsIgnoreCase("i")
                    || letra.equalsIgnoreCase("o")
                    || letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                qtd_Consoantes++;
            };

            count++;
        } while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null)
                System.out.println(consoante);
        }
        System.out.println("Quantidade de consoantes: " + qtd_Consoantes);
        scan.close();
    }
}
