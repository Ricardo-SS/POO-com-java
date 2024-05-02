public class Contador {
    private int numero;

    public Contador(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void zerar(){
        numero = 0;
    }

    public void incrementarNumero() {
        this.numero++;
    }

}
