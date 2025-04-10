//Código abaixo é o código que eu fiz para entregar o desafio "Média de Idade" da .Dio
import java.util.Scanner;

public class ExercicioMediaIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();
        
        while (idade1 < 0 || idade2 < 0 || idade3 < 0) {
            System.out.println("Uma ou mais idade(s) inválida, tente novamente: ");
            idade1 = leitor.nextInt();
            idade2 = leitor.nextInt();
            idade3 = leitor.nextInt();
        }

        int soma   = idade1 + idade2 + idade3;
        int mediaIdade = soma/3;

        if (mediaIdade >= 0 && mediaIdade <= 25) {
            System.out.println("Jovem!");
        } else if (mediaIdade >= 26 && mediaIdade <= 60) {
            System.out.println("Adulta!");
        } else {
            System.out.println("Idosa!");
        }
        leitor.close();
    }
}

// mrocha: primeira versão do código do desafio "Média de Idade" da .Dio, apesar de funcionar, a plataforma não havia aceitado, então desativei e fiz um novo código.
/*
import java.util.Scanner;

public class ExercicioMediaIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade1, idade2, idade3;
        int mediaIdade, soma;

        do {
            System.out.println("Informe a idade 1: ");
            idade1 = scan.nextInt();

            System.out.println("Informe a idade 2: ");
            idade2 = scan.nextInt();

            System.out.println("Informe a idade 3: ");
            idade3 = scan.nextInt();

            if (idade1 < 0 || idade2 < 0 || idade3 < 0) {
                System.out.println("Não é permitido idade negativa, tente novamente: ");
            }

        } while (idade1 < 0 || idade2 < 0 || idade3 < 0);

        soma = idade1 + idade2 + idade3;
        mediaIdade = soma / 3;

        System.out.println("A média das idades é: " + mediaIdade);

        if (mediaIdade >= 0 && mediaIdade <= 25) {
            System.out.println("Jovem");
        } else if (mediaIdade >= 26 && mediaIdade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        scan.close();
    }
}
*/