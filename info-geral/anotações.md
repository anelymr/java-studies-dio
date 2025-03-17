## Objetivo deste arquivo:
- Anotar todas as informações sobre como criar um novo projeto em Java.
- Anotar o significado de tudo o que está sendo utilizado.
- Anotar todas as dúvidas e suas respostas, se necessário.

## Criando um novo projeto:
<pre>
Passo 01: inicializar o vs code e utilizar o comando <span style="color:#F73873;">"ctrl + shift + p"</span>;
Passo 02: pesquisar por <span style="color:#F73873;">">java"</span>;
Passo 03: clicar em <span style="color:#F73873;">"Java: Create Java Project"</span>;
Passo 04: clicar em <span style="color:#F73873;">"No build tools"</span>;
Passo 05: definir o local do diretório do projeto;
Passo 06: após definir o local do diretório, inserir o nome dele;
</pre>

## Anatomia de Classes:
- Onde a classe deve ser alocada?
<pre>No arquivo src</pre>

- Como nomear uma classe?
<pre>Por padrão, a primeira letra do nome de cada classe deverá ser maiúscula.</pre>

- Quais os tipos de classe?
<pre>
1. Classe executável: precisa ter um método especial seguindo um padrão, mas nem tudo está no método main.
2. Classe de sistema: tem inúmeras operações de input e output dentro da aplicação onde é passado um parâmetro dentro do "( )".

Conforme o exemplo abaixo.
    <span style="color:#F73873;">public class</span> <span style="color:#87CEFA;">MinhaClasse</span> {
        <span style="color:#F73873;">public static</span> <span style="color:#87CEFA;">void</span> <span style="color:#00FF7F;">main</span> (<span style="color:#87CEFA;">String</span> [] <span style="color:#D2691E;">args</span>) {
             <span style="color:#87CEFA;">System</span>.<span style="color:#836FFF;">out</span>.<span style="color:#00FF7F;">print</span> (<span style="color:#DAA520;">"Hello World"</span>);
        }
    }
</pre>