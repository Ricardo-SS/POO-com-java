package PrimeiraUnidade.lista.ArraysEArrayList.q36produtoInteiros;

public class TesteProdutoInteiros {
    public static void main(String[] args) {
        // Testando com diferentes números de argumentos
        System.out.println("Produto de 2, 3, 4: " + ProdutoInteiros.produto(2, 3, 4));
        System.out.println("Produto de 5, 10: " + ProdutoInteiros.produto(5, 10));
        System.out.println("Produto de 1, 2, 3, 4, 5: " + ProdutoInteiros.produto(1, 2, 3, 4, 5));
        System.out.println("Produto de 1: " + ProdutoInteiros.produto(1));
        System.out.println("Produto de 2, 2, 2, 2: " + ProdutoInteiros.produto(2, 2, 2, 2));
    }
}



