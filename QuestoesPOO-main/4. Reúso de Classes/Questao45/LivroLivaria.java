public class LivroLivaria extends Livro{
    private double valor;

    public LivroLivaria(int cod, String titulo, String autor, int edicao, int pags, double valor) {
        super(cod, titulo, autor, edicao, pags);
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Id:" + getCod() + "\tTítulo: " + getTitulo() + "\tAutor: "+ getAutor() + "\nEdicao: " + getEdicao() + "\t Paginas: " + getPags() +
        "\t " + "\nValor: " + valor + "\n";
    }
}
