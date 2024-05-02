public interface ItemDeBiblioteca {
    int maximoDeDiasParaEmprestimo = 14;

    public abstract boolean estaEmprestado();
    public abstract void empresta();
    public abstract void devolve();
    public abstract String localizacao();
    public abstract String descricao();
}
