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

- Regras para criar uma variável:
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

- Como declarar um método?
<pre>
A declaração de um método em java, segue uma estrutura bem simples:
    //Estrutura
    TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

    //Exemplo
    int somar (int numeroUm, int numero2)

    String formatarCep (long cep)

obs: um exemplo prático foi adicionado ao src, com o nome "ExemploMetodos.java"
</pre>

- Informações sobre a classe String:
<pre>
- Em Java, String é uma classe (com "S" maiúsculo) usada para representar cadeias de caracteres;
- É imutável → uma vez criada, o conteúdo de uma String não muda;
- É um objeto → por isso usamos métodos como .length(), .toUpperCase(), etc.;
- Pode ser concatenada com + ou .concat();
- Está no pacote java.lang, então você não precisa importar;
</pre>

- Métodos úteis da classe String:
<pre>
.length()                   // Retorna o número de caracteres da string.
.toUpperCase()              // Transformam o texto em maiúsculas.
.toLowerCase()              // Transformam o texto em minúsculas.
.contains()                 // Verifica se contém um trecho especifico.
.equals()                   // Verifica se é igual a outra string.
.substring(inicio, fim)     // Pega um pedaço da string.
.replace()                  // Substitui partes do texto.
.concat()                   // Concatena (junta) duas strings.
</pre>


