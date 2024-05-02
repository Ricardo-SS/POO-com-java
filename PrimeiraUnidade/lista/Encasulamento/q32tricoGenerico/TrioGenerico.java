package PrimeiraUnidade.lista.Encasulamento.q32tricoGenerico;

public class TrioGenerico<T> {
    private T atributo1;
    private T atributo2;
    private T atributo3;

    public TrioGenerico(T atributo1, T atributo2, T atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public int contarIguais() {
        int contador = 0;
        if (atributo1.equals(atributo2)) {
            contador++;
        }
        if (atributo1.equals(atributo3)) {
            contador++;
        }
        if (atributo2.equals(atributo3)) {
            contador++;
        }
        return contador;
    }

    public void imprimirAtributos() {
        System.out.println("Atributo 1: " + atributo1);
        System.out.println("Atributo 2: " + atributo2);
        System.out.println("Atributo 3: " + atributo3);
    }
}
