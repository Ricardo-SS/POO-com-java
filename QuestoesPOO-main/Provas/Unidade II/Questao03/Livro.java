public class Livro{
    private String titulo;
    private String autor;
    private int anoEdicao;
    private int quantsPags;
    private boolean disponivel;
    private int prateleira;
    private int corredor;
    private String descricao;
    
    public Livro(String titulo, String autor,int anoEdicao, int quantsPags, int prateleira, int corredor, String descricao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoEdicao = anoEdicao;
        this.quantsPags = quantsPags;
        this.disponivel = true;
        this.prateleira = prateleira;
        this.corredor = corredor;
        this.descricao = descricao;
    }

    public String qualTitulo() {
        return titulo;
    }

    public String qualAutor() {
        return autor;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public int getQuantsPags() {
        return quantsPags;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public int getPrateleira() {
        return prateleira;
    }

    public int getCorredor() {
        return corredor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public void setQuantsPags(int quantsPags) {
        this.quantsPags = quantsPags;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setPrateleira(int prateleira) {
        this.prateleira = prateleira;
    }

    public void setCorredor(int corredor) {
        this.corredor = corredor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
