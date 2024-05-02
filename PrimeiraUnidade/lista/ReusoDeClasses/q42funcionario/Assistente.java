package PrimeiraUnidade.lista.ReusoDeClasses.q42funcionario;

public class Assistente extends Funcionario {
    private int numeroMatricula;

    public Assistente(String nome, double salario, int numeroMatricula) {
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Matrícula: " + numeroMatricula;
    }
}
