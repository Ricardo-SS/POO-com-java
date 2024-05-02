package PrimeiraUnidade.lista.criacaoDeClasses.q26elevador;

public class Elevador {
  // Atributos
  private int andarAtual;
  private int totalDeAndares;
  private int totalPessoas;
  private final int capacidade; // Capacidade fixa em 8 pessoas

  // Construtor
  public Elevador(int totalDeAndares, int capacidade) {
      this.andarAtual = 0; // Começa no térreo
      this.totalDeAndares = totalDeAndares;
      this.totalPessoas = 0; // Inicialmente vazio
      this.capacidade = capacidade;
  }

  // Métodos
  public void entra(int pessoas) {
      if (totalPessoas + pessoas <= capacidade) {
          totalPessoas += pessoas;
      } else {
          System.out.println("Capacidade máxima excedida. Não é possível entrar mais pessoas.");
      }
  }

  public void sai(int pessoas) {
      if (totalPessoas >= pessoas) {
          totalPessoas -= pessoas;
      } else {
          System.out.println("Não há pessoas no elevador.");
      }
  }

  public void sobe() {
      if (andarAtual < totalDeAndares) {
          andarAtual++;
      } else {
          System.out.println("O elevador já está no último andar.");
      }
  }

  public void desce() {
      if (andarAtual > 0) {
          andarAtual--;
      } else {
          System.out.println("O elevador já está no térreo.");
      }
  }

  // Getters
  public int getTotalPessoas() {
      return totalPessoas;
  }

  public int getAndarAtual() {
      return andarAtual;
  }
}
