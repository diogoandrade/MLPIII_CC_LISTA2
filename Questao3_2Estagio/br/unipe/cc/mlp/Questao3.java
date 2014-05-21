package br.unipe.cc.mlp;

public class Questao3 {
	/*
	 * Test Driven Development (TDD) � uma t�cnica de desenvolvimento de software que baseia em um ciclo curto de repeti��es:
	 * Primeiramente o desenvolvedor escreve um caso de teste automatizado que define uma melhoria desejada ou uma nova funcionalidade.
	 * Ent�o, � produzido c�digo que possa ser validado pelo teste para posteriormente o c�digo ser refatorado para um 
	 * c�digo sob padr�es aceit�veis.				


1. Adicione um teste
Em Test Driven Development, cada nova funcionalidade inicia com a cria��o de um teste. Este teste precisa inevitavelmente falhar porque ele � 
escrito antes da funcionalidade a ser implementada (se ele n�o falha, ent�o a funcionalidade ou melhoria 'proposta' � �bvia). Para escrever 
um teste, o desenvolvedor precisa claramente entender as especifica��es e requisitos da funcionalidade. O desenvolvedor pode fazer isso 
atrav�s de casos de uso ou user stories que cubram os requisitos e exce��es condicionais. Esta � a diferencia��o entre desenvolvimento 
dirigido a testes entre escrever testes de unidade 'depois' do c�digo desenvolvido. Ele torna o desenvolvedor focado nos requisitos 'antes' do 
c�digo, que � uma sutil mas importante diferen�a.

2. Execute todos os testes e veja se algum deles falha
Esse passo valida se todos os testes est�o funcionando corretamente e se o novo teste n�o traz nenhum equ�voco, sem requerer nenhum c�digo novo.
Pode-se considerar que este passo ent�o testa o pr�prio teste: ele regula a possibilidade de novo teste passar.
O novo teste deve ent�o falhar pela raz�o esperada: a funcionalidade n�o foi desenvolvida. Isto aumenta a confian�a (por outro lado n�o 
exatamente a garante) que se est� testando a coisa certa, e que o teste somente ir� passar nos casos intencionados.

3. Escrever c�digo
O pr�ximo passo � escrever c�digo que ir� ocasionar ao teste passar. O novo c�digo escrito at� esse ponto poder� n�o ser perfeito e 
pode, por exemplo, passar no teste de uma forma n�o elegante. Isso � aceit�vel porque posteriormente ele ser� melhorado.
O importante � que o c�digo escrito deve ser constru�do somente para passar no teste; nenhuma funcionalidade (muito menos n�o testada) 
deve ser predita ou permitida em qualquer ponto.

4. Execute os testes automatizados e veja-os executarem com sucesso
Se todos os testes passam agora, o programador pode ficar confiante de que o c�digo possui todos os requisitos testados. 
Este � um bom ponto que inicia o passo final do ciclo TDD.

5. Refatorar c�digo
Nesse ponto o c�digo pode ser limpo como necess�rio. Ao re-executar os testes, o desenvolvedor pode confiar que a refatora��o n�o � um 
processo danoso a qualquer funcionalidade existente. Um conceito relevante nesse momento � o de remo��o de duplica��o de c�digo,
considerado um importante aspecto ao design de um software. Nesse caso, entretanto, isso aplica remover qualquer duplica��o 
entre c�digo de teste e c�digo de produ��o � por exemplo magic numbers or strings que n�s repetimos nos testes e no c�digo de produ��o, de 
forma que fa�a o teste passar no passo 3.

6. Repita tudo
Iniciando com outro teste, o ciclo � ent�o repetido, empurrando a funcionalidade a frente. O tamanho dos passos deve ser pequeno - t�o quanto de 1 a 10 edi��es de texto entre 
cada execu��o de testes. Se novo c�digo n�o satisfaz rapidamente um novo teste, ou outros testes falham inesperadamente, o programador deve desfazer ou reverter as altera��es 
ao inv�s do uso de excessiva depura��o. A Integra��o cont�nua ajuda a prover pontos revers�veis. � importante lembrar que ao usar bibliotecas externas n�o � interessante gerar
incrementos t�o pequenos que possam efetivamente testar a biblioteca ,3 a menos que haja alguma raz�o para acreditar que a biblioteca tenha defeitos ou n�o seja suficientemente 
completada com suas funcionalidades de forma a servir �s necessidades do programa em que est� sendo escrito.

	 * */
	
}
