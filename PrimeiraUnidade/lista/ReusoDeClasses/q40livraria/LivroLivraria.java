package PrimeiraUnidade.lista.ReusoDeClasses.q40livraria;

public class LivroLivraria extends Livro {
    private double preco;

    // Construtor
    public LivroLivraria(String titulo, String autor, int anoPublicacao, double preco) {
        super(titulo, autor, anoPublicacao);
        this.preco = preco;
    }

    // Getter para o preço
    public double getPreco() {
        return preco;
    }
}

