package PrimeiraUnidade.lista.Encasulamento.q30statico;

public class TesteMaiorValor {
    public static void main(String[] args) {
        System.out.println("Maior de 5, 10: " + MaiorValor.maior(5, 10));
        System.out.println("Maior de 3.5, 2.8: " + MaiorValor.maior(3.5, 2.8));
        System.out.println("Maior de 7, 12, 9: " + MaiorValor.maior(7, 12, 9));
        System.out.println("Maior de 4.2, 6.1, 5.5: " + MaiorValor.maior(4.2, 6.1, 5.5));
        System.out.println("Maior de 15, 8, 20, 12: " + MaiorValor.maior(15, 8, 20, 12));
        System.out.println("Maior de 3.7, 4.9, 2.3, 5.8: " + MaiorValor.maior(3.7, 4.9, 2.3, 5.8));
    }
}

