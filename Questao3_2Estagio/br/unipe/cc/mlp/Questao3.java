package br.unipe.cc.mlp;

public class Questao3 {
	/*
	 * Test Driven Development (TDD) é uma técnica de desenvolvimento de software que baseia em um ciclo curto de repetições:
	 * Primeiramente o desenvolvedor escreve um caso de teste automatizado que define uma melhoria desejada ou uma nova funcionalidade.
	 * Então, é produzido código que possa ser validado pelo teste para posteriormente o código ser refatorado para um 
	 * código sob padrões aceitáveis.				


1. Adicione um teste
Em Test Driven Development, cada nova funcionalidade inicia com a criação de um teste. Este teste precisa inevitavelmente falhar porque ele é 
escrito antes da funcionalidade a ser implementada (se ele não falha, então a funcionalidade ou melhoria 'proposta' é óbvia). Para escrever 
um teste, o desenvolvedor precisa claramente entender as especificações e requisitos da funcionalidade. O desenvolvedor pode fazer isso 
através de casos de uso ou user stories que cubram os requisitos e exceções condicionais. Esta é a diferenciação entre desenvolvimento 
dirigido a testes entre escrever testes de unidade 'depois' do código desenvolvido. Ele torna o desenvolvedor focado nos requisitos 'antes' do 
código, que é uma sutil mas importante diferença.

2. Execute todos os testes e veja se algum deles falha
Esse passo valida se todos os testes estão funcionando corretamente e se o novo teste não traz nenhum equívoco, sem requerer nenhum código novo.
Pode-se considerar que este passo então testa o próprio teste: ele regula a possibilidade de novo teste passar.
O novo teste deve então falhar pela razão esperada: a funcionalidade não foi desenvolvida. Isto aumenta a confiança (por outro lado não 
exatamente a garante) que se está testando a coisa certa, e que o teste somente irá passar nos casos intencionados.

3. Escrever código
O próximo passo é escrever código que irá ocasionar ao teste passar. O novo código escrito até esse ponto poderá não ser perfeito e 
pode, por exemplo, passar no teste de uma forma não elegante. Isso é aceitável porque posteriormente ele será melhorado.
O importante é que o código escrito deve ser construído somente para passar no teste; nenhuma funcionalidade (muito menos não testada) 
deve ser predita ou permitida em qualquer ponto.

4. Execute os testes automatizados e veja-os executarem com sucesso
Se todos os testes passam agora, o programador pode ficar confiante de que o código possui todos os requisitos testados. 
Este é um bom ponto que inicia o passo final do ciclo TDD.

5. Refatorar código
Nesse ponto o código pode ser limpo como necessário. Ao re-executar os testes, o desenvolvedor pode confiar que a refatoração não é um 
processo danoso a qualquer funcionalidade existente. Um conceito relevante nesse momento é o de remoção de duplicação de código,
considerado um importante aspecto ao design de um software. Nesse caso, entretanto, isso aplica remover qualquer duplicação 
entre código de teste e código de produção — por exemplo magic numbers or strings que nós repetimos nos testes e no código de produção, de 
forma que faça o teste passar no passo 3.

6. Repita tudo
Iniciando com outro teste, o ciclo é então repetido, empurrando a funcionalidade a frente. O tamanho dos passos deve ser pequeno - tão quanto de 1 a 10 edições de texto entre 
cada execução de testes. Se novo código não satisfaz rapidamente um novo teste, ou outros testes falham inesperadamente, o programador deve desfazer ou reverter as alterações 
ao invés do uso de excessiva depuração. A Integração contínua ajuda a prover pontos reversíveis. É importante lembrar que ao usar bibliotecas externas não é interessante gerar
incrementos tão pequenos que possam efetivamente testar a biblioteca ,3 a menos que haja alguma razão para acreditar que a biblioteca tenha defeitos ou não seja suficientemente 
completada com suas funcionalidades de forma a servir às necessidades do programa em que está sendo escrito.

	 * */
	
}
