public class Principal {
    public static void main(String[] args) {
        Contador evento = new Contador(4);

        System.out.println(evento.getNumero());

        evento.incrementarNumero();

        System.out.println(evento.getNumero());

        evento.zerar();

        System.out.println(evento.getNumero());
    }
}
