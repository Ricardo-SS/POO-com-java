package PrimeiraUnidade.lista.criacaoDeClasses.q20time;

public class demoTime {
  public static void main(String[] args){
    Time time = new Time("Sao Paulo");

    time.vitorias();
    time.derrotas();
    time.empates();

    time.imprimeEstatisticas();
  }
}
