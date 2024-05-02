public class Principal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarCompromisso(7, 6, 3, 2023, "Aula de Computacao");
        agenda.adicionarCompromisso(9, 7, 3, 2023, "Aula de PDI");
        agenda.adicionarCompromisso(11, 8, 3, 2023, "Aula de Banco de Dados");
        agenda.adicionarCompromisso(15, 9, 3, 2023, "Aula de POO");
        agenda.adicionarCompromisso(17, 10, 3, 2023, "Aula de Redes");

        agenda.listaDia(8, 3, 2023);
    }  
}
