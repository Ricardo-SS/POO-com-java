public class Principal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addCompromisso(7, 23, 1, 2023, "Aula01");
        agenda.addCompromisso(15, 29, 9, 2002, "Aula02");
        agenda.addCompromisso(6, 21, 12, 2023, "Aula03");
        agenda.addCompromisso(20, 29, 9, 2002, "Aula05");
        agenda.addCompromisso(23, 14, 4, 2023, "Aula04");

        agenda.listaDia(29, 9, 2002);
    }    
}
