public class Tecnico extends Assistente{
    private int bonus;

    public Tecnico(String nome, double salario, int matricula, int bonus) {
        super(nome, salario, matricula);
        this.bonus = bonus;
    }

    @Override
    public double ganhoAnual(){
        return (getSalario() * (1 + (bonus/100))) * 13;
    }

    @Override
    public String toString() {
        return "Funcionario:\n\tNome: " + super.getNome() + "\tSalario: " + (super.getSalario() * (1 + (bonus/100))) + "\tBonus: " +
        bonus + "\n";
    }
}
