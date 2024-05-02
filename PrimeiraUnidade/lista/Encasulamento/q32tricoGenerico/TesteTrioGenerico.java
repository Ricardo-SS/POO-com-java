package PrimeiraUnidade.lista.Encasulamento.q32tricoGenerico;

public class TesteTrioGenerico {
    public static void main(String[] args) {
        TrioGenerico<Integer> trioInt = new TrioGenerico<>(1, 2, 1);
        System.out.println("Quantidade de atributos iguais: " + trioInt.contarIguais());
        trioInt.imprimirAtributos();

        TrioGenerico<String> trioStr = new TrioGenerico<>("A", "B", "C");
        System.out.println("Quantidade de atributos iguais: " + trioStr.contarIguais());
        trioStr.imprimirAtributos();
    }
}
