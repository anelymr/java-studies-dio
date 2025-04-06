public class TiposPrimitivos {
    public static void main(String[] args) {
        //Tipos numéricos inteiros
        byte idade = 25;
        short ano = 2025;
        int salario = 3000;
        long populacaoMundial = 8000000000L; // precisa do 'L' no final
    
        //Tipos numéricos com ponto flutuante
        float altura = 1.75f; // precisa do 'f' no final
        double peso = 65.8;
    
        //Tipo caractere
        char inicial = 'M'; // sempre entre aspas simples
    
        //Tipo lógico (booleano)
        boolean estudante = true;
    
        //Exibindo todos os valores
        System.out.println("=== Tipos Primitivos em Java ===");
        System.out.println("Idade (byte): " + idade);
        System.out.println("Ano (short): " + ano);
        System.out.println("Salário (int): " + salario);
        System.out.println("População Mundial (long): " + populacaoMundial);
        System.out.println("Altura (float): " + altura);
        System.out.println("Peso (double): " + peso);
        System.out.println("Inicial do nome (char): " + inicial);
        System.out.println("É estudante? (boolean): " + estudante);
    }
}

