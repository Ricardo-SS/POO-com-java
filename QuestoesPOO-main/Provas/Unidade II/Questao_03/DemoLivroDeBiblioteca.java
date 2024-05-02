public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        Livro l = new Livro("O poder do subconciente", "Murley", 39, 2022);
        LivroDeBiblioteca lb = new LivroDeBiblioteca("Ansiedade", "Augusto Cury", 123, 2012, false, 10, "Prateleria 2", "Livro de autoajuda");

        System.out.println("Livro");
        System.out.println(l.qualTitulo());
        System.out.println(l.qualAutor());

        System.out.println("\nLivro Biblioteca");

        System.out.println(lb.qualTitulo());
        System.out.println(lb.qualAutor());
        System.out.println(lb.estaEmprestado());
        lb.empresta();
        System.out.println(lb.estaEmprestado());
        lb.devolve();
        System.out.println(lb.estaEmprestado());
        System.out.println(lb.localizacao());
        System.out.println(lb.descricao());
    }
}
