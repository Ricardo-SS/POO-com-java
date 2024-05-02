public class Principal {
    public static void main(String[] args) {
        Agenda a = new Agenda();

        a.adicionaCompromisso(10, 9, 10, 2002, "meu aniversario");
        a.adicionaCompromisso(20, 9, 10, 2023, "aniversario esse ano");
        a.adicionaCompromisso(6, 9, 10, 2005, "aniversario de três anos");
        a.adicionaCompromisso(19, 9, 10, 2012, "aniversario de 10 anos");
        a.adicionaCompromisso(8, 9, 10, 2020, "aniversario na pandemia");

        a.listaDia(9, 10, 2002);

    }
}
