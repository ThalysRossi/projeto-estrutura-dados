# Estruturas-de-dados-Projeto
Repositório para os códigos utilizados no projeto de avaliação da primeira nota da disciplina de Estruturas de Dados
- - - - 
# Projeto - Unidade 1 #

- [X] __1 - Elaborar uma implementação para um tipo abstrato de dados que represente uma DATA (dia, mês e ano- DD/MM/AAAA). Garantir que as informações da data estejam coerentes, válidas. Implementar os seguintes operações:__

  - [X] Construtor (DD, MM, AAAA)
  - [X] toString() – retornando na forma de “DD/MM/AAAA” 
  - [X] diasEntreDatas( Data outra): int

- - - - 
- [X] __2 - Complete as implementações de LISTA (vetor e dinâmica) vistas em aula. Implementar (em Lista_vetor e Lista_dinamica)  os seguintes métodos:__

  - [X] double  - get(int i)
  - [X] double  - remove(int i)
  - [X] double  - set(int i, double v) - Retorna o valor que estava na posição antes de ser alterado.
  - [X] double  - media() - Retorna a média dos valores da Lista.
  - [X] String  - toString() - Retorna uma String com a Lista. Seus elementos serão separados por espaço, colocando os caracteres “[“ no início e “]” no fim. Ex: [ 12 34 22 42 ]

- - - - 

- [X] __3 - Com base nas implementações de Listas, implemente (usando vetor, ponteiro e LinkedList - ver relação abaixo) uma pilha de caractere (char) com as operações de Pilha:__
  
  - [X] Push
  - [X] Pop
  - [X] Top
  - [X] Underflow – Pilha vazia
  - [X] Overflow – Pilha cheia 

- - - - 

- [X] __4 - Usando as implementações do exercício anterior, faça: Um programa para ler uma expressão aritmética na forma de uma cadeia de caractere ( Ex: “(a+b*(2/3)-((2*3)+5))” ). Verificar de os parênteses dessa expressão estão corretos, ou seja se para cada ‘(’ teremos uma ‘)’. Usar uma pilha para colocar ‘(’ toda vez que encontrar um ‘(’ na expressão e remover da pilha o elemento do topo toda vez que encontrar um ‘)’  na expressão. Durante a análise não deve haver operação de POP em situação de UNDERFLOW. No final da análise a pilha deverá estar VAZIA.__
  
- - - - 

- [X] __5 - Baseado em alguns dos métodos disponíveis na classe LinkedList (ver relação abaixo) do JAVA (java.util), implemente, em JAVA, uma classe FILA com os 05 (cinco) métodos de uma estrutura de FILA. Implemente também o método toString() para essa classe FILA, esse método deve retornar uma String com as informações da FILA em ordem:__
  - [X] void - entraFila(int elem) - Coloca um número inteiro no fim da fila.
  - [X] int - saiFila() - Remove e retorna o elemento (número inteiro) do início da fila.
  - [X] int - primeiroFila() - Retorna, sem remover, o elemento (número inteiro) do início da fila.
  - [X] boolean - underflow() - Retorna true se a fila estiver vazia e false caso contrário.
  - [X] boolean - overflow() - Retorna true se a fila estiver cheia e false caso contrário.
  - [X] String - toString() - Retorna uma String com a fila. Seus elementos serão separados por espaço, colocando os caracteres “<“ no início e “<” no fim. Ex: < 12 34 22 42 < 

### LinkedList - Method Summary ###
  - __void - addFirst(E o) - Inserts the given element at the beginning of this list.__
  - __void - addLast(E o) - Appends the given element to the end of this list.__
  - __E - getFirst() - Returns the first element in this list.__
  - __E - getLast() - Returns the last element in this list.__
  - __E - removeFirst() - Removes and returns the first element from this list.__
  - __E - removeLast() - Removes and returns the last element from this list.__
  - __int - size() - Returns the number of elements in this list.__
  - __E - get(int index) - Returns the element at the specified position in this list.__

__OBS:__
  - Use programas de teste para verificar o funcionamento das estruturas.
  - Entregar em formato digital (código fonte).
  - Trabalho em grupo de até 05 alunos ou individual.
  - Na apresentação serão solicitadas algumas mudanças no exercício para avaliação do aprendizado, por um integrante do grupo indicado pelo professor.
  - Todos os integrantes devem apresentar o trabalho.
  - O trabalho deve ser ORIGINAL.

Esse trabalho corresponde a 50% da avaliação da 1ª unidade.  
__Data de entrega e apresentação: Aula após a prova.__



 

  
