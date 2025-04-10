package desafiosDio;

import java.util.Scanner;

public class ExercicioFilaDoBanco {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);

        String[] nomeFila = new String[3];
        
        for (int i = 0; i < nomeFila.length; i++) {
            nomeFila[i] = nome.nextLine();
        }

        for (int i = 0; i < nomeFila.length; i++) {
            System.out.println(nomeFila[i] + " - esta na posicao: " + (i+1));
        }

        nome.close();
    }
}
