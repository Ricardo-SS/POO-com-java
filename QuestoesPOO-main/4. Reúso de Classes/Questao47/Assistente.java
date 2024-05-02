public class Assistente extends Funcionario{
    private int matricula;

    public Assistente(String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario:\n\t Matricula: " + matricula + "\tNome: " + super.getNome() + "\tSalario: " + super.getSalario() + "\n";
    }
}
