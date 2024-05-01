package PrimeiraUnidade.lista.ReusoDeClasses.q40livraria;

public class demoLivro {
    public static void main(String[] args) {
        // Criando um livro para livraria
        LivroLivraria livroLivraria = new LivroLivraria("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 39.99);
        System.out.println("Livro na livraria: " + livroLivraria.getTitulo() + ", Preço: $" + livroLivraria.getPreco());

        // Criando um livro para biblioteca
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca("Dom Quixote", "Miguel de Cervantes", 1605, true);
        System.out.println("Livro na biblioteca: " + livroBiblioteca.getTitulo() + ", Disponível: " + livroBiblioteca.isDisponivel());
    }
}
