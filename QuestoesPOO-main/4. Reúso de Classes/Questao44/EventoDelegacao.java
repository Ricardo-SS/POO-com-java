public class EventoDelegacao {
    private String evento;
    private DataHora horario;

    public EventoDelegacao(String evento, int dia, int mes, int ano, int hora, int min) {
        this.evento = evento;
        this.horario = new DataHora(dia, mes, ano, hora, min);
    }

    @Override
    public String toString() {
        return "EventoDelegacao " + evento + horario;
    }

}
