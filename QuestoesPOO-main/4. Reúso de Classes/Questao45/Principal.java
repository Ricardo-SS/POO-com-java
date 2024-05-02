public class Principal {
    public static void main(String[] args) {
        LivroBiblioteca livro1 = new LivroBiblioteca(1, "Flores", "Livia", 1, 200, false, true);
        LivroLivaria livro2 = new LivroLivaria(2, "Sou do Ceara", "Geisa", 7, 150, 120.00);
        
        System.out.println(livro1);
        System.out.println(livro2);
    }
}
