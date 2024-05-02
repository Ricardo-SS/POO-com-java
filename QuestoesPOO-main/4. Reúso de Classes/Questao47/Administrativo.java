public class Administrativo extends Assistente{
    private String turno;
    private double adicionalNot;

    public Administrativo(String nome, double salario, int matricula, String turno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNot = 300.00;
    }

    @Override
    public double ganhoAnual(){
        return (getSalario() + adicionalNot) * 12 + getSalario();
    }

    @Override
    public String toString() {
        return "Funcionario:\n\tNome: " + super.getNome() + "\tSalario: " + (super.getSalario() + adicionalNot) + "\tTurno: " + turno + "\n";
    }
}
