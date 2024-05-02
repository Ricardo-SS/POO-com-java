public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    private boolean emprestado;
    private int prazo;
    private String local;
    private String descricao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, boolean emprestado, int prazo,
            String local, String descricao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.emprestado = emprestado;
        this.prazo = prazo;
        this.local = local;
        this.descricao = descricao;
    }

    public String qualTitulo() {
        return super.qualTitulo();
    }

    public String qualAutor() {
        return super.qualAutor();
    }

    public boolean estaEmprestado(){
        if(emprestado == true){
            return true;
        } else{
            return false;
        }
    }

    public boolean empresta(){
        this.emprestado = true;
        return estaEmprestado() == true ? true : false;
    }

    public boolean devolve(){
        this.emprestado = false;
        return estaEmprestado() == true ? true : false;
    }

    public String localizacao(){
        return local;
    } 

    public String descricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return "LivroDeBiblioteca [emprestado=" + emprestado + ", prazo=" + prazo + ", local=" + local + ", descricao="
                + descricao + "]";
    }

}
