package SegundaUnidade.ExemplosEmAula.Carro;

public class DemoCarro {
    public static void main(String[] args){
        // cria a instacia do carro  com o nome meu carro;
        // passa a descrição do carro por parametros dentro do objeto carro.
        Carro meuCarro = new Carro("Goll", "Popular", 2018, 35.500);

        meuCarro.mostraCarro();

        meuCarro = new Carro("Voyage", "Popular", 2013, 37.500);
        
        meuCarro.mostraCarro();

    }
}
