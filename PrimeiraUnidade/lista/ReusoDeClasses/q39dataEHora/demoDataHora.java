package PrimeiraUnidade.lista.ReusoDeClasses.q39dataEHora;

public class demoDataHora {
    public static void main(String[] args) {
        // Exemplo de uso das classes
        EventoDelegacao eventoDelegacao = new EventoDelegacao(24, 3, 2024, 12, 30, "Conferência");
        EventoHeranca eventoHeranca = new EventoHeranca(24, 3, 2024, 12, 30, "Palestra");

        System.out.println("Evento Delegação: " + eventoDelegacao);
        System.out.println("Evento Herança: " + eventoHeranca);
    }
}
