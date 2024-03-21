// 24. Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes informações sobre o item vendido: o número de identificação, a descrição, a quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste que demonstre as capacidades da classe criada.

package PrimeiraUnidade.lista.criacaoDeClasses.q21fatura;

public class Fatura {
  private String id;
  private String descricao;
  private int quantidade;
  private double precoUnitario;

  public Fatura(String id, String descricao, int quantidade, double precoUnitario){
    this.id = id;
    this.descricao = descricao;
    this.quantidade = Math.max(quantidade, 0);
    this.precoUnitario = Math.max(precoUnitario, 0.0);
  }

  public double calculaTotal(){
    return this.quantidade * this.precoUnitario;
  }

  // metoidos get
  public String getId(){
    return this.id;
  }
  public String getDescricao(){
    return this.descricao;
  }
  public int getQuantidade(){
    return this.quantidade;
  }
  public double getPrecoUnitario(){
    return this.precoUnitario;
  }

}