public class ExemploMetodos {

        // Método principal - ponto de partida da execução
        public static void main(String[] args) {
            // Chamando o método que não retorna nada
            saudacao();
    
            // Chamando o método que retorna uma String
            String nome = obterNome();
            System.out.println("Nome retornado: " + nome);
    
            // Chamando o método que recebe parâmetros e retorna um valor
            int resultado = somar(5, 3);
            System.out.println("Resultado da soma: " + resultado);
        }
    
        // Método sem retorno e sem parâmetro
        public static void saudacao() {
            System.out.println("Olá! Bem-vindo(a) ao Java.");
        }
    
        // Método com retorno e sem parâmetro
        public static String obterNome() {
            return "Mylena";
        }
    
        // Método com retorno e com parâmetro
        public static int somar(int a, int b) {
            return a + b;
        }
    
}
