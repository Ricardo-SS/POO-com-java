package PrimeiraUnidade.lista.criacaoDeClasses.q24fatura;

public class DemoFatura {
  public static void main(String[] args){
    Fatura fatura = new Fatura("123", "Mouse", 2, 45.0);

    System.out.println("ID: " + fatura.getId());
    System.out.println("Descricao: " + fatura.getDescricao());
    System.out.println("Quantidade: " + fatura.getQuantidade());
    System.out.println("Preco unitario: " + fatura.getPrecoUnitario());
    System.out.println("Total da fatura: " + fatura.calculaTotal());
  }
}