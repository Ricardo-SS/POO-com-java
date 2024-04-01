package SegundaUnidade.ExemplosEmAula.Videogame;

public class DemoConsole {
    public static void main(String[] args){
        Console meuConsole = new Console("Xbox 360", "Microsoft", 2008, 2);

        meuConsole.mostrarConsole();

        meuConsole = new Console("PS5", "Sony", 2022, 5);

        meuConsole.mostrarConsole();
    }
}
