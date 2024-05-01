package PrimeiraUnidade.lista.ReusoDeClasses.q40livraria;

public class LivroBiblioteca extends Livro {
    private boolean disponivel;

    // Construtor
    public LivroBiblioteca(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        super(titulo, autor, anoPublicacao);
        this.disponivel = disponivel;
    }

    // Getter para a disponibilidade
    public boolean isDisponivel() {
        return disponivel;
    }
}

