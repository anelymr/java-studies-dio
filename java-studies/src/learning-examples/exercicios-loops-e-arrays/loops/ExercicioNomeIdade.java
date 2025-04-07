package loops;
/*
 Faça um programa que leia conjuntos de dois valores;
 1. representando o nome do aluno;
 2. representando a idade do aluno;
 3. pare o programa, inserindo o valor 0 no campo nome;
*/

import java.util.Scanner;

public class ExercicioNomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  nome;
        int     idade;

        while (true) {
            System.out.println("Nome: ");
                nome = scan.next();
                if (nome.equals("0")) break;

            System.out.println("Idade: ");
                idade = scan.nextInt();
        }
        
        System.out.println("Você encerrou o processo");
        scan.close();
    }
}