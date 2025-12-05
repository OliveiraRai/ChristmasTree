<h1>Christmas Tree Generator</h1>

<hr>
<h2>📌 Descrição</h2>

<p>Este programa gera uma árvore de Natal estilizada usando apenas caracteres, baseada na altura informada pelo usuário. A entrada é validada para garantir que apenas inteiros positivos sejam aceitos. Uma altura igual a <strong>0</strong> exibe uma mensagem especial.</p>

<hr>
<h2>🧠 Funcionalidades</h2>

<ul>
    <li>Validação de entrada usando regex para aceitar apenas inteiros positivos.</li>
    <li>Geração de árvore proporcional ao valor informado.</li>
    <li>Uso de <code>String.repeat()</code> para formar linhas da árvore.</li>
    <li>Mensagem alternativa caso a altura seja <strong>0</strong>.</li>
</ul>

<hr>
<h2>▶️ Como executar</h2>

<ol>
    <li>Certifique-se de ter o Java instalado (JDK 17 ou superior recomendado).</li>
    <li>Compile o programa:  
        <pre><code>javac Main.java MyUtil.java</code></pre>
    </li>
    <li>Execute:  
        <pre><code>java Main</code></pre>
    </li>
</ol>

<hr>
<h2>📝 Exemplo de uso</h2>

<p>Entrada:</p>
<pre>
5
</pre>

<p>Saída:</p>
<pre>
    *
   ***
  *****
 *******
*********
</pre>

<hr>
<h2>📁 Estrutura dos arquivos</h2>

<pre>
├── Main.java
└── MyUtil.java
</pre>

<hr>
<h2>📚 Conceitos praticados</h2>

<ul>
    <li>Loops <code>for</code></li>
    <li>String manipulation</li>
    <li>Validação simples com regex</li>
    <li>Uso de <code>String.repeat()</code></li>
    <li><code>StringBuilder</code> opcional</li>
</ul>

<hr>
<h2>🔧 Melhorias futuras</h2>

<ul>
    <li>Adicionar tronco e base para a árvore.</li>
    <li>Permitir árvores com ornamentos aleatórios.</li>
    <li>Adicionar modo colorido no terminal.</li>
</ul>
