package PrimeiraUnidade.lista.criacaoDeClasses.q25aluno;

public class DemoAluno {
  public static void main (String[] args){
    Aluno aluno = new Aluno("123", "Joao", 7, 3, 8.6);

    System.out.println("Matricula: " + aluno.getMatricula());
    System.out.println("Nome: "+ aluno.getNome());
    System.out.println("Media Parcial: " + aluno.mediaParcial());
    System.out.println("Nota necessaria para prova final: " + aluno.provaFinal());
  }
}
