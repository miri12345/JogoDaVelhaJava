import java.util.Scanner;

public class Jogo {
    private Tabuleiro tabuleiro;
    private int rodada = 1;
    private boolean jogador1Vez = true;
    private Jogador jogador1;
    private Jogador jogador2;
    private int scoreJogador1 = 0; // Pontuação do Jogador 1
    private int scoreJogador2 = 0; // Pontuação do Jogador 2
    private Scanner entrada = new Scanner(System.in);

    public Jogo() {
        do {
            tabuleiro = new Tabuleiro();
            rodada = 1;
            jogador1Vez = true;

            if (jogador1 == null || jogador2 == null) {
                iniciarJogadores();
            }

            while (Jogar());
        } while (menuPosJogo());
    }

    public void iniciarJogadores() {
        System.out.println("Quem vai ser o Jogador 1?");
        jogador1 = (escolherJogador() == 1) ? new Humano(1) : new Computador(1);

        System.out.println("----------------------");
        System.out.println("Quem vai ser o Jogador 2?");
        jogador2 = (escolherJogador() == 1) ? new Humano(2) : new Computador(2);
    }

    public int escolherJogador() {
        int opcao = 0;
        do {
            System.out.println("1. Humano");
            System.out.println("2. Computador\n");
            System.out.print("Opção: ");
            try {
                opcao = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente.");
                entrada.nextLine(); // Limpa o buffer
            }
            if (opcao != 1 && opcao != 2)
                System.out.println("Opção inválida! Tente novamente");
        } while (opcao != 1 && opcao != 2);

        return opcao;
    }

    public boolean Jogar() {
        if (ganhou() == 0) {
            System.out.println("----------------------");
            System.out.println("\nRodada " + rodada);
            System.out.println("É a vez do jogador " + vez());

            if (jogador1Vez)
                jogador1.jogar(tabuleiro);
            else
                jogador2.jogar(tabuleiro);

            if (tabuleiro.tabuleiroCompleto()) {
                System.out.println("Tabuleiro completo. Jogo empatado!");
                return false;
            }

            jogador1Vez = !jogador1Vez;
            rodada++;
            return true;
        } else {
            int vencedor = ganhou();
            if (vencedor == -1) {
                System.out.println("Jogador 1 ganhou!");
                scoreJogador1++;
            } else {
                System.out.println("Jogador 2 ganhou!");
                scoreJogador2++;
            }
            return false;
        }
    }

    public int vez() {
        return jogador1Vez ? 1 : 2;
    }

    public int ganhou() {
        int resultado = tabuleiro.checaLinhas();
        if (resultado != 0) return resultado;

        resultado = tabuleiro.checaColunas();
        if (resultado != 0) return resultado;

        return tabuleiro.checaDiagonais();
    }

    public boolean menuPosJogo() {
        int opcao = 0;
        do {
            System.out.println("\n----------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Jogar novamente");
            System.out.println("2. Ver pontuação");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            try {
                opcao = entrada.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite 1, 2 ou 3.");
                entrada.nextLine();
            }

            switch (opcao) {
                case 1:
                    return true;
                case 2:
                    exibirPontuacao();
                    break;
                case 3:
                    System.out.println("Obrigado por jogar!");
                    return false;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 1 && opcao != 3);

        return false;
    }

    public void exibirPontuacao() {
        System.out.println("\n------ PONTUAÇÃO ------");
        System.out.println("Jogador 1: " + scoreJogador1 + " ponto(s)");
        System.out.println("Jogador 2: " + scoreJogador2 + " ponto(s)");
        System.out.println("-----------------------");
    }
}
