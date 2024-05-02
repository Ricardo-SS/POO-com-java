public class EventoHeranca extends DataHora{
    private String evento;

    public EventoHeranca(int dia, int mes, int ano, int hora, int min, String evento) {
        super(dia, mes, ano, hora, min);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "EventoHeranca " + evento + " no "+ super.getDia() + "/" + getMes() + "/" + getAno() + " as " + getHora() + ":" + getMin() + "\n";
    }
}
