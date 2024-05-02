package PrimeiraUnidade.lista.ReusoDeClasses.q42funcionario;

public class Administrativo extends Assistente {
    public Administrativo(String nome, double salario, int numeroMatricula) {
        super(nome, salario, numeroMatricula);
    }

    @Override
    public double ganhoAnual() {
        // Implementação do ganho anual para Assistente Administrativo
        return super.ganhoAnual();
    }
}
