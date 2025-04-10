package arrays;
/*
 Crie um vetor de 06 números inteiros e mostre-os na ordem inversa.
 */
public class ExercicioOrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {5, -10, 50, 20, 10, 1};
        int count = 0;

        while (count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor Inverso: ");

        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }
    }
}
