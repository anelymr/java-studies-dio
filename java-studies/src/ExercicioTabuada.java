/*
 Faça um programa que:
 1. Seja capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10
 2. Permita que o usuáio informe o número no qual ele deseja gerar a tabuada.
 */

import java.util.Scanner;

public class ExercicioTabuada {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int nro_informado;
    int multiplicador = 0;
    int resultado_tabuada;

    do{
        System.out.println("Informe um nro de 1 a 10: ");
        nro_informado = scan.nextInt();

        if(nro_informado < 1 || nro_informado > 19){
            System.out.println("Número não permitido, digite novamente: ");
            nro_informado = scan.nextInt();
        }
    }while (nro_informado < 1 || nro_informado > 10);

    System.out.println("Tabuada de " + nro_informado + ":");

    while (multiplicador <= 10) {
        resultado_tabuada = nro_informado * multiplicador;
        System.out.println(nro_informado + " x "  + multiplicador + " = " + resultado_tabuada);
        multiplicador++;
    }

        scan.close();
    }
}