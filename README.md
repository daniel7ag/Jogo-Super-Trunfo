# Jogo Super Trunfo - Java Console

Este é um jogo de cartas estilo **Super Trunfo** desenvolvido em Java para ser jogado via console ou terminal. O jogador compete contra o computador, e o objetivo é vencer rodadas escolhendo os melhores atributos das cartas.

## Funcionalidades

- O jogador e o computador recebem 10 cartas cada um.
- Cada carta possui três atributos: **Ataque**, **Defesa** e **Velocidade**.
- Em cada rodada, o jogador (ou o computador, alternadamente) escolhe um atributo para comparar.
- O vencedor da rodada ganha a carta do oponente.
- O jogo termina após 10 rodadas, e o jogador com mais pontos vence.

## Como jogar

1. **Iniciar o jogo:** Ao iniciar, as cartas são distribuídas e o jogo começa com 10 rodadas.
2. **Escolha de atributos:** O jogador escolhe qual atributo comparar em sua vez, enquanto o computador escolhe aleatoriamente.
3. **Pontuação:** O vencedor da rodada é quem tiver o maior valor no atributo escolhido. O vencedor ganha um ponto e a carta do oponente.
4. **Final do jogo:** Após as 10 rodadas, o placar final é exibido e o vencedor é anunciado.

## Requisitos

- Java Development Kit (JDK) 8 ou superior.
- Um ambiente de desenvolvimento integrado (IDE) como **Visual Studio Code**, **Eclipse** ou **IntelliJ IDEA**.

## Executar o jogo

1. Clone este repositório para a sua máquina local:
   ```bash
   git clone https://github.com/daniel7ag/Jogo-Super-Trunfo
   ```

2. Navegue até o diretório do projeto e compile o código:
   ```bash
   javac Jogo.java
   ```

3. Execute o jogo no terminal:
   ```bash
   java Jogo
   ```

## Exemplo de jogabilidade

```
Sua carta: Dragão
Ataque: 10
Defesa: 10
Velocidade: 10
Escolha um atributo (1-Ataque, 2-Defesa, 3-Velocidade):
1
Carta do computador: Tigre
Disputa de atributos: Você 10 x 6 Computador
Você venceu a rodada!
Placar: Você 1 x 0 Computador
```

## Estrutura do código

- **Jogo.java**: Contém a lógica principal do jogo.
- **Carta.java**: Define a estrutura de uma carta com atributos de ataque, defesa e velocidade.

## Contribuições

Contribuições são bem-vindas! Se você tiver sugestões ou melhorias, fique à vontade para abrir um pull request.

## Feito por:
Daniel Alves Gimenez e Arthur Ferreira Marciano
