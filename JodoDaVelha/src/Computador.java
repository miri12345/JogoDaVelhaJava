public class Computador extends Jogador {
    public Computador(int jogador) {
        super(jogador);
        System.out.println("Jogador 'Computador' criado!");
    }

    @Override
    public void jogar(Tabuleiro tabuleiro) {
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);
    }

    @Override
    public void Tentativa(Tabuleiro tabuleiro) {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tentativa[0] = linha;
                tentativa[1] = coluna;
                if (checaTentativa(tentativa, tabuleiro)) {
                    return;
                }
            }
        }
    }
}
