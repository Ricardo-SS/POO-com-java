public class Livro {
    private int cod;
    private String titulo;
    private String autor;
    private int edicao;
    private int pags;

    public Livro(int cod, String titulo, String autor, int edicao, int pags) {
        this.cod = cod;
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.pags = pags;
    }

    public int getCod() {
        return cod;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public int getPags() {
        return pags;
    }

    
}
