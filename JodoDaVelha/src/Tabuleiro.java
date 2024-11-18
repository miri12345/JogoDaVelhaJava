public class Tabuleiro {
    private int[][] tabuleiro = new int[3][3];

    public Tabuleiro() {
        zerarTabuleiro();
    }

    public void zerarTabuleiro() {
        for (int linha = 0; linha < 3; linha++)
            for (int coluna = 0; coluna < 3; coluna++)
                tabuleiro[linha][coluna] = 0;
    }

    public void exibeTabuleiro() {
        System.out.println();
        System.out.println("   1   2   3");
        for (int linha = 0; linha < 3; linha++) {
            System.out.print(linha + 1);
            for (int coluna = 0; coluna < 3; coluna++) {

                if (tabuleiro[linha][coluna] == -1) {
                    System.out.print("  X ");
                } else if (tabuleiro[linha][coluna] == 1) {
                    System.out.print("  O ");
                } else {
                    System.out.print("    ");
                }


                if (coluna < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();


            if (linha < 2) {
                System.out.println("  ---+---+---");
            }
        }
        System.out.println();
    }


    public int getPosicao(int[] tentativa) {
        return tabuleiro[tentativa[0]][tentativa[1]];
    }

    public void setPosicao(int[] tentativa, int jogador) {
        tabuleiro[tentativa[0]][tentativa[1]] = (jogador == 1) ? -1 : 1;
        exibeTabuleiro();
    }

    public int checaLinhas() {
        for (int linha = 0; linha < 3; linha++) {
            int soma = tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2];
            if (soma == -3) return -1;
            if (soma == 3) return 1;
        }
        return 0;
    }

    public int checaColunas() {
        for (int coluna = 0; coluna < 3; coluna++) {
            int soma = tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna];
            if (soma == -3) return -1;
            if (soma == 3) return 1;
        }
        return 0;
    }

    public int checaDiagonais() {
        int diagonal1 = tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2];
        int diagonal2 = tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0];
        if (diagonal1 == -3 || diagonal2 == -3) return -1;
        if (diagonal1 == 3 || diagonal2 == 3) return 1;
        return 0;
    }

    public boolean tabuleiroCompleto() {
        for (int[] linha : tabuleiro)
            for (int posicao : linha)
                if (posicao == 0) return false;
        return true;
    }
}
