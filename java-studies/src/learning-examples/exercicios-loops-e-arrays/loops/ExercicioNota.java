package loops;
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

        System.out.println("Informe a nota: ");
                nota = scan.nextFloat();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, digite novamente: ");
                nota = scan.nextFloat();
        }

        System.out.println("Nota registrada. Fim!");
        scan.close();
    }
}