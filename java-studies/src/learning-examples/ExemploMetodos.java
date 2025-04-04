
//Public Class: define uma classe a ser chamada, neste caso a classe ExemploMetodos
//Public static void main: é o ponto de entrada do programa, onde passamos as instruções principais
//Variáveis: estão armazenando o primeiro e o segundo nome que foram passados no parâmetro
//Public static String nomeCompleto: é um método personalizado, utilizado para juntar as duas variáveis e armazená-las na variável nome completo

public class ExemploMetodos {
    public static void main (String [] args) {
        String primeiroNome = "Mylena";
        String segundoNome = "Rocha";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
