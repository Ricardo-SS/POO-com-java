package PrimeiraUnidade.lista.criacaoDeClasses.q26elevador;

public class TesteElevador {
  public static void main(String[] args) {
      // Criando um elevador com 10 andares e capacidade para 8 pessoas
      Elevador elevador = new Elevador(10, 8);

      // Simulando algumas ações
      elevador.entra(3); // Entra 3 pessoas
      elevador.sobe(); // Sobe um andar
      elevador.entra(2); // Entra mais 2 pessoas
      elevador.desce(); // Desce um andar
      elevador.sai(1); // Sai 1 pessoa

      // Exibindo informações
      System.out.println("Andar atual: " + elevador.getAndarAtual());
      System.out.println("Total de pessoas: " + elevador.getTotalPessoas());
  }
}