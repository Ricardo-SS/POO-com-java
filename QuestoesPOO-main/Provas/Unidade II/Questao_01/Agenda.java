import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> compromisso = new ArrayList<>();

    public Agenda() {
        this.compromisso = compromisso;
    }

    public void adicionaCompromisso(int hora, int dia, int mes, int ano, String ass) {
        EntradaEmAgenda evento = new EntradaEmAgenda(hora, dia, mes, ano, ass);
        compromisso.add(evento);
    }

    public void listaDia(int dia, int mes, int ano){
        for (int i = 0; i < compromisso.size(); i++) {
            if(compromisso.get(i).ehNoDia(dia, mes, ano)){
                System.out.println(compromisso.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Agenda [compromisso=" + compromisso + "]";
    }

}
