public class LivroBiblioteca extends Livro{
    private boolean disponivel;
    private boolean situacao;

    public LivroBiblioteca(int cod, String titulo, String autor, int edicao, int pags, boolean disponivel, boolean situacao) {
        super(cod, titulo, autor, edicao, pags);
        this.disponivel = disponivel;
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Id:" + getCod() + "\tTítulo: " + getTitulo() + "\tAutor: "+ getAutor() + "\nEdicao: " + getEdicao() + "\t Paginas: " + getPags() +
        "\t " + "\nDisponivel: " + (disponivel ? "Em acervo" : "Alugado") + "\t Situacao: " + (situacao ? "Em dia" : "Atrasado") + "\n";
    }

}
