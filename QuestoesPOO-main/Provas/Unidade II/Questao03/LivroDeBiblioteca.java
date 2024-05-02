public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    public LivroDeBiblioteca(String titulo, String autor, int anoEdicao, int quantsPags, int prateleira, int corredor, String descricao) {
        super(titulo, autor, anoEdicao, quantsPags, prateleira, corredor, descricao);
    }

    public boolean estaEmprestado(){
        return (isDisponivel() == true) ? false : true;
    }

    public void empresta(){
        setDisponivel(false);
    }

    public void devolve(){
        setDisponivel(true);
    }

    public String localizacao(){
        return "Na " + getPrateleira() + " do corredor " + getCorredor() + ".";
    }

    public String descricao(){
        return getDescricao();
    }
}
