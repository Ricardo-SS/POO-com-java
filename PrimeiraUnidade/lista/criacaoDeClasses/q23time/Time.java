// 23. Escreva uma classe para representar um time de um esporte qualquer em um campeonato desse esporte. Que atributos devem ser representados nessa classe? Quais métodos ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da classe criada.
package PrimeiraUnidade.lista.criacaoDeClasses.q23time;

public class Time {
  private String nome;
  private int vitorias;
  private int derrotas;
  private int empates;

  // metodo para inicializando as variaveis
  public Time(String nome){
    this.nome = nome;
    this.vitorias = 0;
    this.derrotas = 0;
    this.empates = 0;
  }

  // metodos
  public void vitorias(){ //passando uma vitoria
    this.vitorias++;  
  }
  public void derrotas(){ // passando uma derrota
    this.derrotas++;
  }

  public void empates(){  // passando um empate
    this.empates++;
  }

  public int pontos (){ //fazendo a soma de pontos baseado nas vitorias e nos empates
    return (this.vitorias * 3) + this.empates;
  }

  public void imprimeEstatisticas(){
    System.out.println("Time: " + this.nome);
    System.out.println("Vitorias: " + this.vitorias);
    System.out.println("Derretos: " + this.derrotas);
    System.out.println("Empates: " + this.empates);
    System.out.println("Pontos: " + pontos());
  }
}
