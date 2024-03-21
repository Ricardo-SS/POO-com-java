
//25. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da Ufersa. 
// Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova 
// (P 1 e P 2) e 1 nota de trabalho (T ). Escreva os seguintes métodos para esta classe:
// • media: calcula a média parcial do aluno (MP)
// – cada prova tem peso 2,5 e o trabalho tem peso 2 (M P = 2,5×P 1+2,5×P 2+2×T )7
// • provaF inal: calcula quanto o aluno precisa para o exame final (EF )
// – retorna zero se o launo não necessita realizar o exame final (MP < 3 ou MP >= 7)
// – média final MF = (MP × 6 + EF × 4)/10
// – é necessário que MF seja maior ou igual a 5 para que o aluno seja aprovado após realizar o exame final
// Escreva um aplicativo de teste que demonstre as capacidades da classe criada.
package PrimeiraUnidade.lista.criacaoDeClasses.q25aluno;

public class Aluno {
  private String matricula;
  private String nome;
  private double p1;
  private double p2;
  private double t;

  public Aluno(String matricula, String nome, double p1, double p2, double t){
    this.matricula = matricula;
    this.nome = nome;
    this.p1 = p1;
    this.p2 = p2;
    this.t = t;
  } 

  public String getMatricula(){
    return this.matricula;
  }
  public String getNome(){
    return this.nome;
  }

  //(M P = 2,5×P1 + 2,5×P 2+2×T )7
  public double mediaParcial(){
    return ((2.5*p1)+(2.5*p2)+(t*2)) / 7;
  }

  public double provaFinal(){
    double mediaParcial = this.mediaParcial();
    if (mediaParcial < 3 || mediaParcial >= 7){
      return 0;
    } else {
      return (5 * 10 - 6 * mediaParcial) / 4;
    }
  }
}