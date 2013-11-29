Repositório bonus-teo-comp
==============

Repositório criado para o projeto bônus valendo hum ponto na média na disciplina de Teoria da Computação 2013.2 da UFG Jataí.

1. Introdução
-------------

No semestre de 2013.2, está sendo ministrada a disciplina de Teoria da Computação no Bacharelado em Ciência da Computação. Nesta disciplina, tópicos em Teoria da Computabilidade estão sendo abordados, como por exemplo, decidibilidade. Foi proposto pelo Prof. Esdras Bispo Jr. a implementação da máquina de Turing que decide a linguagem A<sub>AFD</sub> conforme descrito por Sipser (2007).

Será apresentado a seguir a descrição do problema (Seção 2), a metodologia (Seção 3), e os critérios a serem utilizados para atribuição do ponto bônus.

2. Descrição do Problema
-------------------------

O **problema da aceitação** é um problema clássico em Teoria da Computação. Podemos descrever ele informalmente da seguinte forma: 

> Para um dado modelo computacional **MC** e uma cadeia **w**, é possível identificar se **MC** aceita **w**?
    
Como estratégia de resolução deste problema, podemos definir uma linguagem **L**, de forma que, 

> **L** = { \<**M**,**w**\> | **M** é um **MC** que aceita a cadeia de entrada **w**}.
    
E, se para um dado par \<**M**,**w**\> conseguirmos decidir se \<**M**,**w**\> &isin; **L**, então conseguiremos resolver o problema da aceitação. Com outras palavras, uma forma de resolver o problema da aceitação é provar que **L** é decidível.

### 2.1 Problema de aceitação em um AFD ######

Podemos aplicar o problema da aceitação em um Autômato Finito Determinístico (AFD). Definiremos uma linguagem **L<sub>AFD</sub>**, como se segue,

> **L<sub>AFD</sub>** = { <**B**,**w**> | **B** é um AFD que aceita a cadeia de entrada *w*}.
  
Logo, se provarmos que **L<sub>AFD</sub>** é decidível, então teremos uma solução para o problema da aceitação em um AFD. Segue abaixo a demonstração proposta por Sipser (2007):

> **IDÉIA DA PROVA:** Simplesmente precisamos apresentar uma máquina de Turing **M<sub>AFD</sub>** que decide **L<sub>AFD</sub>**.
>  
> **M<sub>AFD</sub>** = "Sobre a entrada \<**B**,**w**\>, em que **B** é um AFD e **w** é uma cadeia:

> 1.  Simule **B** sobre a entrada **w**.
> 2.  Se a simulacão não termina em um estado de aceitação, *aceite*. Se ela termina em um estado de não-aceitação, *rejeite*."
>
> **PROVA:** Mencionamos apenas alguns poucos detalhes de implementação dessa prova. Para aqueles de vocês familiarizados com escrever programas em alguma linguagem de programação padrão, imagine como você escreveria um programa para realizar a simulação. 
>
> Primeiro, vamos examinar a entrada \<**B**,**w**\>. Ela é uma representação de um AFD **B** juntamente com uma cadeia **w**. Uma representação razoável de **B** é simplesmente uma lista de seus cinco componentes, **Q**, **Σ**, **δ**, **q<sub>0</sub>** e **F**. Quando **M<sub>AFD</sub>** recebe sua entrada, **M<sub>AFD</sub>** primeiro determina se ela representa apropriadamente
um AFD **B** e uma cadeia **w**. Se não, **M<sub>AFD</sub>** *rejeita*. 
>
> Então **M<sub>AFD</sub>** realiza a simulação diretamente. Ela mantém registro do estado atual de **B** e da posição atual de **B** na entrada **w** escrevendo essa informação na sua fita. Inicialmente, o estado atual de **B** é **q<sub>0</sub>** e a posição atual de **B** sobre a entrada é o símbolo mais à esquerda de **w**. Os estados e a posição são atualizados conforme a função de transição especificada δ. Quando **M<sub>AFD</sub>** termina de processar o último símbolo de **w**, **M<sub>AFD</sub>** aceita a entrada se **B** está em um estado de aceitação; **M<sub>AFD</sub>** rejeita a entrada se **B** está em um estado de não-aceitação.

3. Metodologia
-------------------------

4. Referências
-------------------------

* SIPSER, Michael. Introdução à teoria da Computação, 2a Edição, Editora Thomson Learning, 2007.
