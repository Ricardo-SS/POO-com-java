package PrimeiraUnidade.lista.ReusoDeClasses.q42funcionario;

public class Tecnico extends Assistente {
    public Tecnico(String nome, double salario, int matricula) {
        super(nome, salario, matricula);
    }
    private double bonusSalario;

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + bonusSalario;
    }
}

