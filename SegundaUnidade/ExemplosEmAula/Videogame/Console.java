package SegundaUnidade.ExemplosEmAula.Videogame;

public class Console {
    private String nome;
    private String marca;
    private int anoLancamento;
    private int geracao;


    public Console(String nome, String marca, int anoLancamento, int geracao){
        this.nome = nome;
        this.marca = marca;
        this.anoLancamento = anoLancamento;
        this.geracao = geracao;
    }

    public void mostrarConsole(){
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de lancamento: " + anoLancamento);
        System.out.println("Geração: " + geracao);
    }
}