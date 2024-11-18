# Jogo da Velha (Tic-Tac-Toe)
Um jogo da velha interativo desenvolvido em `Java`. Este projeto suporta partidas entre dois jogadores (`humano` ou `computador`) e mantém um placar para as partidas jogadas. Este projeto tem o objetivo de ser um estudo da linguagem `Java` e contém vários elementos de programação 
listados no fim.


### 📋 Funcionalidades
* Modo para 2 jogadores (humano vs. humano ou humano vs. computador).
* Exibição de um tabuleiro alinhado no console.
* Detecção automática de vitórias (linhas, colunas ou diagonais) e empates.
* Opção de jogar novamente ou visualizar o placar ao final de cada partida.
* Sistema de pontuação que exibe o número de vitórias de cada jogador.
  
### 🛠️ Estrutura do Projeto
O projeto está organizado nas seguintes classes:

1. `JogoDaVelha`: Classe principal que inicia o jogo.
2. `Jogo`: Lida com a lógica principal do jogo, como o fluxo das rodadas e a verificação de vitória.
3. `Tabuleiro`: Representa o tabuleiro do jogo e gerencia sua exibição e estado.
4. `Jogador`: Classe abstrata que serve como base para jogadores humanos e computador.
5. `Humano`: Implementação da classe Jogador para um jogador humano.
6. `Computador`: Implementação da classe Jogador para um oponente controlado pelo computador.
   
### 🎮 Como Jogar
1. Execute o programa através da classe JogoDaVelha.
2. Escolha os tipos de jogadores:
   * 1 para Humano.
   * 2 para Computador.
3. Durante o jogo:
   * Para humanos, insira o número da linha e da coluna onde deseja jogar.
   * Para computadores, as jogadas são feitas automaticamente.
4. Após o final de cada partida, escolha uma das opções:
   * Jogar novamente.
   * Ver o placar atual.
   * Sair do jogo.

### ♟️ Tabuleiro
```
   1   2   3
1  X | O |    
  ---+---+---
2    | X | O  
  ---+---+---
3  O |    | X 
```

## 🖥️ Elementos de Programação Utilizados

### 1. Programação Orientada a Objetos (POO)
#### Classes e Objetos:

* Uso de classes como `Tabuleiro`, `Jogo`, `Humano`, `Computador`, e `Jogador` para organizar a lógica do jogo.
* Instanciação de objetos como `jogador1`, `jogador2`, e `tabuleiro`.
  
#### Herança:

* A classe abstrata Jogador é estendida pelas classes `Humano` e `Computador`.
  
#### Polimorfismo:

* Uso do método abstrato `jogar()` implementado de forma diferente em `Humano` e `Computador`.
  
#### Encapsulamento:

* Uso de atributos privados, como tabuleiro e tentativa, acessados ou modificados por métodos públicos.
  
### 2. Estruturas de Dados
#### Arrays:
* Uso de um array bidimensional `int[][]` para representar o tabuleiro do jogo.
* Uso de um array unidimensional `int[]` tentativa para armazenar a tentativa de jogada.
  
### 3. Estruturas de Controle
#### Condicionais (`if`, `else`, `if-else`):

* Verificação de condições para validar tentativas, identificar vitórias e determinar o próximo jogador.
#### Laços (`for`, `do-while`, `while`):

* Iteração sobre as linhas e colunas do tabuleiro.
* Laços para validar entradas e processar tentativas.
  
### 4. Métodos e Funções
#### Métodos Públicos e Privados:

* Métodos como `zerarTabuleiro()`, `exibeTabuleiro()`, `jogar()`, e `checaTentativa()` para modularizar e reutilizar o código.
#### Sobrescrita de Métodos:

* Implementação de métodos abstratos da classe Jogador nas classes Humano e Computador.
### 5. Tipos de Dados
#### Primitivos:

* `int`: Para representar o estado do tabuleiro, jogadores, e tentativas.
* `boolean`: Para verificar condições, como a validade de uma tentativa e se o tabuleiro está completo.
#### Referências:

* Uso de objetos como `Scanner` para entrada do usuário e referências às classes criadas.
  
### 6. Entrada e Saída
#### Entrada de Dados:

* Uso da classe `Scanner` para capturar entradas do jogador.
#### Saída de Dados:

* Uso de `System.out.println` e `System.out.print` para exibir o tabuleiro, mensagens e resultados do jogo no console.
### 7. Gerenciamento de Fluxo do Jogo
#### Rodadas:

* Controle da rodada atual e do jogador da vez utilizando variáveis como `rodada` e `vez`.
#### Detecção de Vitória:

* Métodos como `checaLinhas()`, `checaColunas()`, e `checaDiagonais()` para identificar um vencedor.
#### Pontuação:

* Contagem de vitórias para cada jogador.
  
### 8. Abstração
#### Separação clara das responsabilidades:
* `Tabuleiro`: Lida exclusivamente com o estado e a exibição do tabuleiro.
* `Jogador`: Define o comportamento básico de um jogador.
* `Humano` e `Computador`: Implementam comportamentos específicos para cada tipo de jogador.
* `Jogo`: Gerencia o fluxo geral da partida.
  
### 9. Validação de Entradas
* Verificação de valores válidos para `linhas` e `colunas` no tabuleiro.
* Mensagens de erro para entradas inválidas ou posições já ocupadas.
