package PrimeiraUnidade.lista.ReusoDeClasses.q42funcionario;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public String toString(){
        return super.toString() + " [matricula=" + matricula + "]";
    }
}
