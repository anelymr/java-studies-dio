/*
1. Faça um programa que solicite uma nova entre zero e dez.
2. Mostre uma mensagem caso o valor seja inválido.
3. Continue solicitando até que o usuário informe um valor inválido.
*/

import java.util.Scanner;

public class ExercicioNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota;

        while (true) {
            System.out.println("Informe a nota: ");
                nota = scan.nextFloat();
                if (nota > 10) break;
        }

        System.out.println("Nota inválida");
        scan.close();
    }
}