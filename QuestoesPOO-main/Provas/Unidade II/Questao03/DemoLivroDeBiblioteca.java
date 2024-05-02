public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("Pequeno Rei", "Leonardo", 2023, 200, 7, 2, "Conta uma historia de um Rei pequeno.");
    
        System.out.println(livro.qualTitulo());
        System.out.println(livro.qualAutor());
        System.out.println(livro.getAnoEdicao());
        System.out.println(livro.getDescricao());
        System.out.println(livro.getQuantsPags());
        System.out.println(livro.getCorredor());
        System.out.println(livro.getPrateleira());
        System.out.println(livro.isDisponivel());

        
        livro.empresta();
        
        System.out.println(livro.estaEmprestado());

        livro.devolve();
        
        System.out.println(livro.estaEmprestado());
        System.out.println(livro.localizacao());
        System.out.println(livro.descricao());
    }
}
