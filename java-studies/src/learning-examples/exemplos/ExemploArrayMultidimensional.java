package arrays;

import java.util.Random;

public class ExemploArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int elementoColuna : linha) {
                System.out.println(elementoColuna + " ");
            }
            System.out.println();
        }
    }
}
