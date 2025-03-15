### Configuração Inicial
<pre>
▪ Git config --global user.name "Digite seu nome"
▪ Git config --global user.email "digite@seuemail.com"
▪ Git config --global core.editor "code --wait" <span style="color:#F73873;"># Esse comando define vs code como editor.</span>
▪ Git config --list <span style="color:#F73873;"># Esse comando exibe as configurações atuais.</span>
</pre>

### Iniciando um Repositório
<pre>
▪ Git init <span style="color:#F73873;"> # Inicializa um repositório Git na pasta atual.</span>
▪ Git clone chave_ssh <span style="color:#F73873;"># Clona um repositório remoto.</span>
</pre>

### Status & Logs
<pre>
▪ Git status <span style="color:#F73873;"># Mostra o status dos arquivos no repositório</span>
▪ Git log <span style="color:#F73873;"># Mostra o histórico de commits</span>
▪ Git log --online --graph <span style="color:#F73873;"># Mostra um histórico resumido e visual</span>
</pre>

### Adicionando & Removendo Arquivos
<pre>
▪ Git add nome_do_arq <span style="color:#F73873;"># Adiciona um arquivo específico ao staging</span>
▪ Git add . <span style="color:#F73873;"># Adiciona todos os arquivos modificados ao staging</span>
▪ Git reset nome_do_arquivo <span style="color:#F73873;"># Remove um arquivo do staging</span>
▪ Git rm nome_do_arquivo <span style="color:#F73873;"># Remove um arquivo do repositório e do sistema de arquivos</span>
</pre>

### Comitando Mudanças
<pre>
▪ Git commit -m "Comentário do commit" <span style="color:#F73873;"># Cria um commit com os arquivos no staging</span>
▪ Git commit --amend -m "Nova mensagem" <span style="color:#F73873;"># Edita o último commit</span>
</pre>

### Trabalhando com Branches
<pre>
▪ Git branch  <span style="color:#F73873;"># Lista todas as branches</span>
▪ Git branch nova_branch  <span style="color:#F73873;"># Cria uma nova branch</span>
▪ Git checkout nova_branch  <span style="color:#F73873;"># Muda para a nova branch (Git < 2.23)</span>
▪ Git switch nova_branch  <span style="color:#F73873;"># Alternativa moderna ao checkout (Git >= 2.23)</span>
▪ Git branch -d nome_branch  <span style="color:#F73873;"># Deleta uma branch local</span>
▪ Git branch -D nome_branch  <span style="color:#F73873;"># Deleta uma branch local à força</span>
</pre>

### Juntando Branches (Merge & Rebase)
<pre>
▪ Git merge nome_branch  <span style="color:#F73873;"># Junta a branch especificada na branch atual</span>
▪ Git rebase nome_branch  <span style="color:#F73873;"># Move commits da branch atual para a base da outra branch</span>
</pre>

### Trabalhando com Repositórios Remotos
<pre>
▪ Git remote -v  <span style="color:#F73873;"># Lista os repositórios remotos conectados</span>
▪ Git remote add origin URL_DO_REPOSITORIO  <span style="color:#F73873;"># Conecta o repositório local ao remoto</span>
▪ Git push origin nome_branch  <span style="color:#F73873;"># Envia alterações para o repositório remoto</span>
▪ Git push -u origin nome_branch  <span style="color:#F73873;"># Envia e define a branch remota como padrão</span>
▪ Git fetch origin  <span style="color:#F73873;"># Baixa alterações do repositório remoto sem aplicar</span>
▪ Git pull origin nome_branch  <span style="color:#F73873;"># Atualiza o repositório local com o remoto</span>
▪ Git remote remove origin  <span style="color:#F73873;"># Remove a conexão com o repositório remoto</span>
</pre>

### Revertendo & Corrigindo Erros
<pre>
▪ Git checkout nome_arquivo  <span style="color:#F73873;"># Restaura um arquivo para a última versão commitada</span>
▪ Git restore nome_arquivo  <span style="color:#F73873;"># Alternativa moderna ao checkout (Git >= 2.23)</span>
▪ Git revert HASH_DO_COMMIT  <span style="color:#F73873;"># Cria um novo commit desfazendo um commit específico</span>
▪ Git reset --soft HEAD~1  <span style="color:#F73873;"># Desfaz o último commit mantendo as mudanças</span>
▪ Git reset --hard HEAD~1  <span style="color:#F73873;"># Desfaz o último commit e apaga as mudanças</span>
</pre>

### Trabalhando com Stash (Guardar Mudanças Temporariamente)
<pre>
▪ Git stash  <span style="color:#F73873;"># Salva mudanças temporariamente sem commit</span>
▪ Git stash list  <span style="color:#F73873;"># Lista os stashes salvos</span>
▪ Gitit stash apply  <span style="color:#F73873;"># Aplica as mudanças salvas no stash mais recente</span>
▪ Git stash drop  <span style="color:#F73873;"># Remove o último stash</span>
▪ Git stash pop  <span style="color:#F73873;"># Aplica e remove o último stash da lista</span>
</pre>

### Alias (Atalhos para Comandos)
<pre>
▪ Git config --global alias.s "status -s"  <span style="color:#F73873;"># Criar alias para status simplificado</span>
▪ Git config --global alias.lg "log --oneline --graph --all"  <span style="color:#F73873;"># Histórico resumido</span>
</pre>