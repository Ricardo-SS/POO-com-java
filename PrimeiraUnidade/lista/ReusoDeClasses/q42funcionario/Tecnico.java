package PrimeiraUnidade.lista.ReusoDeClasses.q42funcionario;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(String nome, double salario, int numeroMatricula, double bonusSalarial) {
        super(nome, salario, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + bonusSalarial;
    }
}
