import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> agenda = new ArrayList<>();

    public Agenda() {

    }

    public void adicionarCompromisso(int hora, int dia, int mes, int ano, String assunto){
        EntradaEmAgenda compromisso = new EntradaEmAgenda(hora, dia, mes, ano, assunto);
        agenda.add(compromisso);
    }

    public void listaDia(int d, int m, int a){
        for(int i = 0; i < agenda.size(); i++){
            if(agenda.get(i).ehNoDia(d, m, a)){
                System.out.println(agenda.get(i) + "\n");
            }
        }
    }
}
