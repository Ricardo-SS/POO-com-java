public class Principal {
    public static void main(String[] args) {
        Elevador central = new Elevador(7, 6);

        central.entra();
        central.entra();
        central.entra();

        central.desce();
        central.sobe();
        central.sobe();
        central.sobe();
        central.sobe();

        central.sai();
        central.sai();
        central.sai();
        central.sai();

        central.entra();
        central.entra();
        central.entra();
        central.entra();
        central.entra();
        central.entra();
        central.entra();

        central.sobe();
        central.sobe();
        central.sobe();
        central.sobe();
    }
}
