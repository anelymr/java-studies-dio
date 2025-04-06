## Objetivo deste arquivo:
- Anotar todas as informações sobre como criar um novo projeto em Java.
- Anotar o significado de tudo o que está sendo utilizado.
- Anotar todas as dúvidas e suas respostas, se necessário.

## Criando um novo projeto:
- Passo 01: inicializar o vs code e utilizar o comando <span style="color:#F73873;">"ctrl + shift + p"</span>;
- Passo 02: pesquisar por <span style="color:#F73873;">">java"</span>;
- Passo 03: clicar em <span style="color:#F73873;">"Java: Create Java Project"</span>;
- Passo 04: clicar em <span style="color:#F73873;">"No build tools"</span>;
- Passo 05: definir o local do diretório do projeto;
- Passo 06: após definir o local do diretório, inserir o nome dele;


## Anatomia de Classes:
- Onde a classe deve ser alocada?
<pre>No arquivo src</pre>

- Como nomear uma classe?
<pre>Por padrão, a primeira letra do nome de cada classe deverá ser maiúscula, caso a classe contenha um nome composto, a letra da segunda palavra também deverá ser maiúcula.

Exemplo: Calculadora.java | CalculadoraCientifica.java</pre>

- Quais os tipos de classe?
<pre>
1. Classe executável: precisa ter um método especial seguindo um padrão, mas nem tudo está no método main.

2. Classe de sistema: tem inúmeras operações de input e output dentro da aplicação onde é passado um parâmetro dentro do "( )".

Exemplo:
    <span style="color:#F73873;">public class</span> <span style="color:#87CEFA;">MinhaClasse</span> {
        <span style="color:#F73873;">public static</span> <span style="color:#87CEFA;">void</span> <span style="color:#00FF7F;">main</span> (<span style="color:#87CEFA;">String</span> [] <span style="color:#D2691E;">args</span>) {
             <span style="color:#87CEFA;">System</span>.<span style="color:#836FFF;">out</span>.<span style="color:#00FF7F;">print</span> (<span style="color:#DAA520;">"Hello World"</span>);
        }
    }
</pre>

## Variáveis:
<pre>
Regra 1: Deve conter apenas letras, underline, $ ou números de 0 a 9;
Regra 2: Deve obrigatoriamente se iniciar por uma letra, underline ou $, mas jamais com números;
Regra 3: Deve iniciar com uma letra minúscula;
Regra 4: Não pode conter espaços;
Regra 5: Não podemos usar palavras-chave da linguagem;
Regra 6: O nome deve ser único dentro de um escopo;

Exemplo de declarações inválidas:
int numero&um = 1;      //Os únicos símbolos permitidos são _ e $
int 1numero = 1;        //Uma variável não pode começar com números
int numero um = 1;      //Não pode ter espaço no nome da variável
int long = 1;           //long faz parte das palavras reservadas da linguagem
</pre>

- Como nomear uma variável?
<pre>
Seguindo as regras acima, toda variável deve ser escrita com a letra minúscula, porém, se o nome for composto a primeita letra a partir da segunda palavra deverá ser maiúscula. Essa prática para nomear variáveis se chama "camelCase"

Exemplo: data | dataInclusao | dataDeCancelamento
</pre>

- Como declarar uma variável?
<pre>
A declaração de uma variável em java, sempre seguirá a estrutura abaixo:
    //Estrutura
    Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)

    //Exemplo:
    int idade = 27;
    double altura = 1.59;
    Dog spike; //aqui a variável spike não tem valor
</pre>

- Variáveis que não podem ser alteradas (Constantes):
<pre>
Quando queremos criar variáveis no qual o seu valor não poderá ser alterado, elas deverão conter o nome completamente em maíusculo e deverão ter a expressão `final` escrito primeiro.

Exemplo:
final String BR = "Brasil"
final double PI = 3.14
final int ESTADOS_BRASILEIRO = 27
final int ANO_2000 = 2000
</pre>

## Métodos:
<pre>
A declaração de um método em java, segue uma estrutura bem simples:
    //Estrutura básica de um método
    modificador tipoRetorno nomeDoMetodo(parâmetros) {
    // corpo do método
    }

- modificador: geralmente public ou private, define a visibilidade do método.
- tipoRetorno: define o tipo de valor que o método vai retornar (int, String, void...).
- nomeDoMetodo: o nome que você escolher, seguindo convenções (letra minúscula no início, nome descritivo).
- parâmetros: valores que o método pode receber como entrada. Pode ser nenhum ou vários.

obs: um exemplo prático foi adicionado ao src, com o nome "ExemploMetodos.java"
</pre>

- Tipos de métodos:
<pre>
Tipo: Sem retorno e sem parâmetro	| Exemplo: public void mostrarMensagem()	    | Descrição: Apenas executa algo.
Tipo: Com retorno e sem parâmetro	| Exemplo: public int obterAno()	            | Descrição: Retorna um valor, mas não precisa de dados de entrada.
Tipo: Com retorno e com parâmetro	| Exemplo: public int somar(int a, int b)	    | Descrição: Precisa de entradas e retorna um valor.
Tipo: Sem retorno e com parâmetro	| Exemplo: public void exibirNome(String nome)	| Descrição: Recebe dados, mas não retorna nada.
</pre>

## Tipos de dados primitivos e de referência:
<pre>
- String:
    Representa uma sequência de caracteres (texto).
    É imutável (não pode ser alterada depois de criada).
    Possui muitos métodos úteis como:
    .length()                   // Retorna o número de caracteres da string.
    .toUpperCase()              // Transformam o texto em maiúsculas.
    .toLowerCase()              // Transformam o texto em minúsculas.
    .contains()                 // Verifica se contém um trecho especifico.
    .equals()                   // Verifica se é igual a outra string.
    .substring(inicio, fim)     // Pega um pedaço da string.
    .replace()                  // Substitui partes do texto.
    .concat()                   // Concatena (junta) duas strings.

    obs: um exemplo prático foi adicionado ao src > learning-examples com o nome "ExemploStrings.java"

- Integer, Double, Float, Long, etc:
    São wrappers (classes "embrulho") dos tipos primitivos int, double, float, long...
    Permitem usar métodos úteis, como Integer.parseInt("123") para converter String em número.
    Podem ser usados com coleções (ArrayList, por exemplo), que não aceitam tipos primitivos.

- Array:
    estrutura de dados com tamanho fixo (ex: int[] numeros = new int[5];)
- ArrayList:
    lista flexível da biblioteca Java (java.util.ArrayList) que cresce conforme necessário.
    Ex: ArrayList<String> nomes = new ArrayList<>();

- Date:
    classe antiga para manipulação de datas.
- LocalDate:
    mais moderna e recomendada, do pacote java.time.
    Ex: LocalDate hoje = LocalDate.now();

- Random:
    Classe para gerar números aleatórios.
    Ex: Random random = new Random(); int numero = random.nextInt(10);

- System:
    Classe utilitária que contém métodos como:
    System.out.println() para exibir no console.
    System.currentTimeMillis() para pegar o tempo atual em milissegundos.
</pre>

## Operadores em Java:
<pre>
- Operadores Aritméticos
    São usados para realizar operações matemáticas.

Operador: +	    | Descrição: Soma	         | Exemplo: a + b
Operador: -	    | Descrição: Subtração       | Exemplo: a - b
Operador: *	    | Descrição: Multiplicação   | Exemplo: a * b
Operador: /	    | Descrição: Divisão         | Exemplo: a / b
Operador: %	    | Descrição: Módulo (resto)  | Exemplo: a % b

- Operadores Relacionais (Comparação)
    São usados para comparar dois valores e retornam um valor boolean (true ou false).

Operador: ==    | Significado: Igual a          | Exemplo: a == b
Operador: !=    | Significado: Diferente de	    | Exemplo: a != b
Operador: >	    | Significado: Maior que	    | Exemplo: a > b
Operador: <	    | Significado: Menor que	    | Exemplo: a < b
Operador: >=    | Significado: Maior ou igual a | Exemplo: a >= b
Operador: <=    | Significado: Menor ou igual a | Exemplo: a <= b

- Operadores Lógicos
    São usados para combinar expressões booleanas.

Operador: &&   | Significado: E (AND)	 | Exemplo: a > 5 && b < 10
Operador: !	   | Significado: NÃO (NOT)  | Exemplo: !(a > b)

- Operadores de Atribuição
    São usados para atribuir valores a variáveis.

Operador: =	    | Exemplo: a = 10	| Equivalente a: Atribuir valor
Operador: +=	| Exemplo: a += 5	| Equivalente a: a = a + 5
Operador: -=	| Exemplo: a -= 3	| Equivalente a: a = a - 3
Operador: *=	| Exemplo: a *= 2	| Equivalente a: a = a * 2
Operador: /=	| Exemplo: a /= 2	| Equivalente a: a = a / 2
Operador: %=	| Exemplo: a %= 2	| Equivalente a: a = a % 2

- Operadores Unários
    São usados com apenas um operando.

Operador	Significado	Exemplo
Operador: +	    | Significado: Valor positivo	    | Exemplo: +a
Operador: -	    | Significado: Valor negativo	    | Exemplo: -a
Operador: ++	| Significado: Incremento	        | Exemplo: a++ ou ++a
Operador: --	| Significado: Decremento	        | Exemplo: a-- ou --a
Operador: !	    | Significado: Inversão booleana	| Exemplo: !true → false

obs: um exemplo prático foi adicionado ao src > learning-examples > "ExemploOperadores.java"
</pre>
