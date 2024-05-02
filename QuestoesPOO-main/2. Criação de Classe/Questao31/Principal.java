public class Principal {
    public static void main(String[] args) {
        Elevador central = new Elevador(20, 6);
        
        System.out.println("O elevado está no andar " + central.getAndarAtual());
        System.out.println("Tem " + central.getQuantOcupado() + " no elevador.\n");

        central.entra();
        central.entra();
        central.entra();
        central.sobe();
        central.sobe();
        central.sobe();
        central.sobe();

        System.out.println("\nO elevado está no andar " + central.getAndarAtual());
        System.out.println("Tem " + central.getQuantOcupado() + " no elevador.");

        central.sai();
        central.sai();
        central.desce();
        central.sai();
        
        System.out.println("\nO elevado está no andar " + central.getAndarAtual());
        System.out.println("Tem " + central.getQuantOcupado() + " no elevador.\n");

        central.desce();
        central.desce();
        central.desce();
        central.desce();

        System.out.println("\nO elevado está no andar " + central.getAndarAtual());
        System.out.println("Tem " + central.getQuantOcupado() + " no elevador.");
    }    
}
