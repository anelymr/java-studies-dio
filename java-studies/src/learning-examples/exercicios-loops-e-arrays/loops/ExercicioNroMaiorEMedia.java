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
        int qtd_nro_informados = 0;
        int maior_nro = 0;
        int soma = 0;

        do {
            System.out.println("Informe o nro: ");
            nro = scan.nextInt();

            qtd_nro_informados = qtd_nro_informados + 1;
            soma = soma + nro;

            if (nro > maior_nro) maior_nro = nro;
        } while(qtd_nro_informados < 5);

        System.out.println("Esse é o maior nro: " + maior_nro);
        System.out.println("A média dos nro's é: " + (soma/qtd_nro_informados));

        scan.close();
    }    
}