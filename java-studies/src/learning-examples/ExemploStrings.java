public class ExemploStrings {
    public static void main(String[] args) {
        String nome = "Mylena";
        String sobrenome = "Rocha";
        String frase = "Olá, mundo!";

        // Concatenação
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome completo: " + nomeCompleto);

        // .length()
        System.out.println("Quantidade de caracteres no nome: " + nome.length());

        // .toUpperCase() e .toLowerCase()
        System.out.println("Nome em maiúsculas: " + nome.toUpperCase());
        System.out.println("Nome em minúsculas: " + nome.toLowerCase());

        // .contains()
        System.out.println("O nome contém 'len'? " + nome.contains("len"));

        // .equals()
        System.out.println("O nome é igual a 'Mylena'? " + nome.equals("Mylena"));

        // .substring()
        System.out.println("Primeiras 3 letras do nome: " + nome.substring(0, 3));

        // .replace()
        System.out.println("Frase modificada: " + frase.replace("mundo", "Java"));

        // .concat()
        String mensagem = nome.concat(" está aprendendo Java!");
        System.out.println(mensagem);
    }
}
