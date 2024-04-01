import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<EntradaEmAgenda> compromissos;

    // Construtor da classe
    public Agenda() {
        this.compromissos = new ArrayList<>();
    }

    // Método para adicionar um novo compromisso à lista
    public void adicionarCompromisso(EntradaEmAgenda entrada) {
        compromissos.add(entrada);
    }

    // Método para listar as entradas em um determinado dia
    public void listaDia(int dia, int mes, int ano) {
        System.out.println("Compromissos em " + dia + "/" + mes + "/" + ano + ":");
        for (EntradaEmAgenda entrada : compromissos) {
            if (entrada.ehNoDia(dia, mes, ano)) {
                System.out.println(entrada);
            }
        }
    }
}
