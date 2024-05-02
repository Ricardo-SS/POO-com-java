import java.util.ArrayList;

public class Agenda {
    ArrayList<EntradaEmAgenda> compromissos = new ArrayList<>();

    public Agenda() {
        
    }

    public void addCompromisso(int hora, int dia, int mes, int ano, String assunto){
        EntradaEmAgenda compromisso = new EntradaEmAgenda(hora, dia, mes, ano, assunto);
        compromissos.add(compromisso);
    }

    public void listaDia(int d, int m, int a){
        for (EntradaEmAgenda compromisso : compromissos) {
            if(compromisso.ehNoDia(d, m, a)){
                System.out.println(compromisso);
            }
        }
    }
}
