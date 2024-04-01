public class DemoAgenda {
    public static void main(String[] args){
        // criando uma instacia da Agenda
        Agenda minhaAgenda = new Agenda();

        // Adicionando 5 compromissos à agenda (substitua com seus próprios dados)
        minhaAgenda.adicionarCompromisso(new EntradaEmAgenda(10, 23, 3, 2024, "Reunião de Trabalho."));

        minhaAgenda.adicionarCompromisso(new EntradaEmAgenda(15, 23, 3, 2024, "Almoço com amigos"));

        minhaAgenda.adicionarCompromisso(new EntradaEmAgenda(18, 23, 3, 2024, "Aula de dança"));
        minhaAgenda.adicionarCompromisso(new EntradaEmAgenda(20, 23, 3, 2024, "Cinema"));
        minhaAgenda.adicionarCompromisso(new EntradaEmAgenda(9, 24, 3, 2024, "Exercícios físicos"));

        // Listando os compromissos do seu aniversário (substitua com sua data de aniversário)
        minhaAgenda.listaDia(23, 3, 2024);
    }
}
