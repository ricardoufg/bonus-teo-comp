Repositório bonus-teo-comp
==============

Repositório criado para o projeto bônus valendo hum ponto na média na disciplina de Teoria da Computação 2013.2 da UFG Jataí.

1. Introdução
-------------

No semestre de 2013.2, está sendo ministrada a disciplina de Teoria da Computação no Bacharelado em Ciência da Computação. Nesta disciplina, tópicos em Teoria da Computabilidade estão sendo abordados, como por exemplo, decidibilidade. Foi proposto pelo Prof. Esdras Bispo Jr. a implementação da máquina de Turing que decide a linguagem A<sub>AFD</sub> conforme descrito por Sipser (#ref).

Será apresentado a seguir a descrição do problema (Seção 2), a metodologia (Seção 3), e os critérios a serem utilizados para atribuição do ponto bônus.

2. Descrição do Problema
-------------------------

O **problema da aceitação** é um problema clássico em Teoria da Computação. Podemos descrever ele informalmente da seguinte forma: 

    Para um dado modelo computacional MC e uma cadeia w, é possível identificar se MC aceita w?
    
Como estratégia de resolução deste problema, podemos definir uma linguagem L, de forma que, 

    L = { <M,w> | M é um MC que aceita a cadeia de entrada w}.
    
E, se para um dado par \<M,w\> conseguirmos decidir se este par pertence ou não à L, então conseguiremos resolver o problema da aceitação. Com outras palavras, uma forma de resolver o problema da aceitação é provar que L é decidível.

### Problema de aceitação para um AFD ######

Podemos aplicar o problema da aceitação em um Autômato Finito Determinístico (AFD). Definiremos uma linguagem L-AFD, como se segue,

    L-AFD = { <B,w> | B é um AFD que aceita a cadeia de entrada w}.
  



