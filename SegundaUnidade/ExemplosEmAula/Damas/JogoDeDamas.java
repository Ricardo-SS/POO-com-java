public class JogoDeDamas {
    private char tabuleiro[][];

    public static void main(String[] args) {
        JogoDeDamas jogo = new JogoDeDamas();
        System.out.println(jogo);
    }

    public JogoDeDamas() {
        tabuleiro = new char[8][8];
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                tabuleiro[i][j] = '.';
            }

        }
        // inicializa jogador x
        for (int linha = 5; linha <= 7; linha++) {
            int priCol = linha%2;
            for (int coluna = priCol; coluna < tabuleiro[linha].length; coluna+=2) {
                tabuleiro[linha][coluna] = 'x';
            }            
        }
        // inicializa jogador o
        for (int linha = 0; linha <= 2; linha++) {
            int priCol = linha%2;
            for (int coluna = priCol; coluna < tabuleiro[linha].length; coluna+=2) {
                tabuleiro[linha][coluna] = 'o';
            }            
        }
    }
    
    public String toString() {
        String str = "";
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                str += tabuleiro[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
}
