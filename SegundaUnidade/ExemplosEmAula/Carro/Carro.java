package SegundaUnidade.ExemplosEmAula.Carro;

public class Carro {
    private String nome;
    private String descricao;
    private int ano;
    private double preco;


    public Carro(String nome, String descricao, int ano, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.ano = ano;
        this.preco = preco;
    }

    public void mostraCarro (){
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);
    }

}
