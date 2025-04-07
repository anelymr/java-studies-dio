package loops;
/*
 Faça um programa que:
 1. Leia 5 números.
 2. Informe o maior número.
 3. Informe a média desses números.
 */

import java.util.Scanner;

public class ExercicioNroMaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nro;
        int qtd_Nro_Informados = 0;
        int maior_Nro = 0;
        int soma = 0;

        do {
            System.out.println("Informe o nro: ");
            nro = scan.nextInt();

            qtd_Nro_Informados = qtd_Nro_Informados + 1;
            soma = soma + nro;

            if (nro > maior_Nro) maior_Nro = nro;
        } while(qtd_Nro_Informados < 5);

        System.out.println("Esse é o maior nro: " + maior_Nro);
        System.out.println("A média dos nro's é: " + (soma/qtd_Nro_Informados));

        scan.close();
    }    
}