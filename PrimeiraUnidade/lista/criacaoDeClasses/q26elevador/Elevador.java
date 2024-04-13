package PrimeiraUnidade.lista.criacaoDeClasses.q26elevador;

public class Elevador {
  //parametros
  private int andarAtual;
  private int totalDeAndares;
  private int totalPessoas;
  private int capacidade;

  //construtor
  public Elevador(int atual, int total, int pessoas, int capacid) {
    andarAtual = atual;
    totalDeAndares = total;
    totalPessoas = pessoas;
    capacidade = capacid;
  }

  //metodos
  public void Entrar(int pessoas) {
    totalPessoas += pessoas;
  }

  public void Sair(int pessoas) {
    totalPessoas -= pessoas;
  }

  public void sobe(int atual) {
    if (andarAtual < totalDeAndares) {
      andarAtual += atual;
    } else {
      System.out.println("O elevador ja esta no ultimo andar.");
    }
  }

  public void desce(int atual) {
    if (andarAtual > 0) {
      andarAtual -= atual;
    } else {
      System.out.println("O elevador ja esta no terreo.");
    }
  }

  public int getTotalPessoas(){
    return totalPessoas;
  }

  public int getAndarAtual(){
    return andarAtual;
  }
}
