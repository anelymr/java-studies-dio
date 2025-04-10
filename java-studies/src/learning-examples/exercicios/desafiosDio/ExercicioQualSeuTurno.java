package desafiosDio;

import java.util.Scanner;

public class ExercicioQualSeuTurno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        char turno;

        do {
            System.out.println("Digite o turno: ");
            turno = leitor.next().toUpperCase().charAt(0);

            if (turno != 'M' && turno != 'N' && turno != 'V') {
                System.out.println("Valor Inválido!");
            }
        } while (turno != 'M' && turno != 'N' && turno != 'V');

            if (turno == 'M') {
                System.out.println("Bom Dia!");
            } else if (turno == 'V') {
                System.out.println("Boa Tarde!");
            } else if (turno == 'N'){
                System.out.println("Boa Noite!");
            }

        leitor.close();
    }
}