package PrimeiraUnidade.lista.Encasulamento.q27contador;

public class TesteContador {
    public static void main(String[] args) {
        Contador contador = new Contador();

        contador.incrementar();
        contador.incrementar();
        System.out.println("Valor do contador: " + contador.getValor());

        contador.zerar();
        System.out.println("Valor do contador após zerar: " + contador.getValor());
    }
}

