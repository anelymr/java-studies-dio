package arrays;

import java.util.Random;

/*
 Faça um programa que:
 1. Leia 20 números inteiros aleatórios (entre 0 e 100)
 2. Faça o armazenamento desses números em um vetor.
 3. Ao final, mostre os números e seus sucessores.
 */

public class ExercicioNroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int[] nroAleatorio = new int[20];

        for(int i = 0; i < nroAleatorio.length; i++){
            int nro = random.nextInt(100);
            nroAleatorio[i] = nro;
        }
        
        System.out.println("Números Aleatórios: ");
        for (int nro : nroAleatorio) {
            System.out.println(nro + " ");
        }

        System.out.println("Números Sucessores: ");
        for (int nro : nroAleatorio) {
            System.out.println((nro+1) + " ");
        }
    }
    
}
