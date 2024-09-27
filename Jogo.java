import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private List<Carta> cartasDoJogador;
    private List<Carta> cartasDoComputador;
    private int pontosJogador;
    private int pontosComputador;
    private Scanner scanner;

    public void iniciar() {
        List<Carta> todasAsCartas = gerarCartas();
        Collections.shuffle(todasAsCartas); // Embaralha as cartas

        // Sorteia 10 cartas para o jogador e 10 para o computador
        this.cartasDoJogador = new ArrayList<>(todasAsCartas.subList(0, 10));
        this.cartasDoComputador = new ArrayList<>(todasAsCartas.subList(10, 20));
        this.pontosJogador = 0;
        this.pontosComputador = 0;
        this.scanner = new Scanner(System.in);

        // Joga 10 rodadas
        for (int i = 0; i < 10; i++) {
            jogarRodada(i % 2 == 0); // Verdadeiro se o jogador começa
        }

        // Resultado Final
        imprimirResultadoFinal();
    }

    public List<Carta> gerarCartas() {
        List<Carta> cartas = new ArrayList<>();
        cartas.add(new Carta("Dragão", 10, 10, 10));
        cartas.add(new Carta("Fênix", 7, 6, 8));
        cartas.add(new Carta("Tigre", 6, 8, 7));
        cartas.add(new Carta("Leão", 8, 7, 7));
        cartas.add(new Carta("Hipopótamo", 8, 7, 8));
        cartas.add(new Carta("Onça pintada", 7, 6, 9));
        cartas.add(new Carta("Gorila", 9, 8, 7));
        cartas.add(new Carta("Elefante", 8, 8, 5));
        cartas.add(new Carta("Rinoceronte", 7, 9, 6));
        cartas.add(new Carta("Mamba-negra", 7, 6, 8));
        cartas.add(new Carta("Urso Polar", 9, 7, 6));
        cartas.add(new Carta("Búfalo", 7, 6, 6));
        cartas.add(new Carta("Crocodilo", 7, 6, 8));
        cartas.add(new Carta("Tubarão Branco", 8, 6, 7));
        cartas.add(new Carta("Canguru", 6, 6, 6));
        cartas.add(new Carta("Jaguar", 6, 6, 8));
        cartas.add(new Carta("Urso Pardo", 7, 6, 6));
        cartas.add(new Carta("Cobra Píton Reticulada", 8, 6, 7));
        cartas.add(new Carta("Baleia Orca", 6, 6, 8));
        cartas.add(new Carta("Panda", 7, 6, 5));
        return cartas;
    }

    public void jogarRodada(boolean jogadorComeca) {
        Carta cartaJogador = cartasDoJogador.remove(0);
        Carta cartaComputador = cartasDoComputador.remove(0);

        System.out.println("Sua carta: " + cartaJogador.getNome());
        System.out.println("Ataque: " + cartaJogador.getAtaque());
        System.out.println("Defesa: " + cartaJogador.getDefesa());
        System.out.println("Velocidade: " + cartaJogador.getVelocidade());


        int atributoEscolhido;
        if (jogadorComeca) {
            System.out.println("Escolha um atributo (1-Ataque, 2-Defesa, 3-Velocidade):");
            atributoEscolhido = scanner.nextInt();
        } else {
            atributoEscolhido = (int) (Math.random() * 3) + 1; // O computador escolhe aleatoriamente
            System.out.println("Computador escolheu: " + atributoEscolhido);
        }

        // Comparação dos atributos
        int valorJogador = 0;
        int valorComputador = 0;

        switch (atributoEscolhido) {
            case 1: // Ataque
                valorJogador = cartaJogador.getAtaque();
                valorComputador = cartaComputador.getAtaque();
                break;
            case 2: // Defesa
                valorJogador = cartaJogador.getDefesa();
                valorComputador = cartaComputador.getDefesa();
                break;
            case 3: // Velocidade
                valorJogador = cartaJogador.getVelocidade();
                valorComputador = cartaComputador.getVelocidade();
                break;
        }

        // Determina o vencedor da rodada
        if (valorJogador > valorComputador) {
            System.out.println("Carta do computador: " + cartaComputador.getNome());
            System.out.println("Disputa de atributos: Você " + valorJogador + " x " + valorComputador + "Computador");
            System.out.println("Você venceu a rodada!");
            pontosJogador++;
            cartasDoJogador.add(cartaComputador); // O jogador ganha a carta do computador

        } else if (valorComputador > valorJogador) {
            System.out.println("Carta do computador: " + cartaComputador.getNome());
            System.out.println("Disputa de atributos: Você " + valorJogador + " x " + valorComputador + " Computador");
            System.out.println("O computador venceu a rodada!");
            pontosComputador++;
            cartasDoComputador.add(cartaJogador); // O computador ganha a carta do jogador

        } else {
            System.out.println("Carta do computador: " + cartaComputador.getNome());
            System.out.println("Disputa de atributos: Você " + valorJogador + " x " + valorComputador + " Computador");
            System.out.println("Empate! As cartas foram descartadas");
            // As cartas podem ser descartadas ou devolvidas, dependendo da regra que você deseja aplicar.
            cartasDoJogador.add(cartaJogador);
            cartasDoComputador.add(cartaComputador);
        }

        System.out.println("Placar: Você " + pontosJogador + " x " + pontosComputador + " Computador");
        System.out.println(" ");
    }

    public void fecharScanner() {
        scanner.close(); // Fecha o Scanner apenas quando o jogo terminar
    }

    public void imprimirResultadoFinal() {
        System.out.println("Resultado Final:");
        System.out.println("Você: " + pontosJogador + " pontos");
        System.out.println("Computador: " + pontosComputador + " pontos");

        if (pontosJogador > pontosComputador) {
            System.out.println("Você venceu o jogo!");
        } else if (pontosComputador > pontosJogador) {
            System.out.println("O computador venceu o jogo!");
        } else {
            System.out.println("Empate no jogo!");
        }
    }

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.iniciar();
    }
}