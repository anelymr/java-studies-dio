public class ExemploOperadores {
    public static void main(String[] args) {
        //  ***EXEMPLO DE OPERADORES ARITMÉTICOS***
        int a = 10; 
        int b = 3;

        System.out.println("***Operadores Aritméticos***");
        System.out.println(a + b); // Efetua a soma dos valores atribuidos, neste exemplo: 10 + 3 = 13
        System.out.println(a - b); // Efetua a subtração dos valores atribuídos, neste exemplo: 10 - 3 = 7
        System.out.println(a * b); // Efetua a multiplicação dos valores atribuidos, neste exemplo: 10 * 3 = 30
        System.out.println(a / b); // Efetua a divisão dos valores atríbuidos, neste exemplo: 10 / 3 = 3
        System.out.println(a % b); // Efetua o resto da disvisão, neste exemplo: 10 % 3 = 1
    
        //  ***EXEMPLO DE OPERADORES DE ATRIBUIÇÃO***
        int x = 5;
        x += 3; // O operador += adiciona o valor a variável, neste exemplo: x = 5 então x + 3 = 8

        System.out.println("***Operadores de Atribuição***");
        System.out.println("Resultado de x += 3: " + x);

        //  ***EXEMPLO DE OPERADORES RELACIONAIS***
        System.out.println("***Operadores Relacionais***");
        System.out.println(a == b); // Compara se a é igual a b
        System.out.println(a != b); // Compara se a é diferente de b
        System.out.println(a > b);  // Verifica se a é maior que b
        System.out.println(a < b);  // Verifica se a é menor que b
        System.out.println(a >= b); // Verifica se a é maior ou igual a b
        System.out.println(a <= b); // Verifica se a é menor ou igual a b

        //  ***EXEMPLO DE OPERADORES LÓGICOS***
        boolean condicao1 = true;
        boolean condicao2 = false;

        System.out.println("***Operadores Lógicos***");
        System.out.println(condicao1 && condicao2); // AND: true && false = false
        System.out.println(condicao1 || condicao2); // OR: true || false = true
        System.out.println(!condicao1); // NEGAÇÃO lógica: !true = false

        //  ***EXEMPLO DE OPERADORES UNÁRIOS***
        int y = 5;

        System.out.println("***Operadores Unários***");
        System.out.println(y);      // Mostra o valor atual de y
        System.out.println(y++);    // Pós-incremento: mostra y (5), depois incrementa → y agora é 6
        System.out.println(y);      // Mostra y já incrementado → 6
        System.out.println(++y);    // Pré-incremento: incrementa y (7), depois mostra
        System.out.println(y--);    // Pós-decremento: mostra y (7), depois decrementa → y agora é 6
        System.out.println(y);      // Mostra y após o decremento → 6
        System.out.println(--y);    // Pré-decremento: decrementa y (5), depois mostra
    }
}
