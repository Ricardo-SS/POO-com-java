public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double salario) {
        if(salario > this.salario) this.salario = salario;
    }

    public double ganhoAnual(){
        return salario*13;
    }

    @Override
    public String toString() {
        return "Funcionario:\n\t Nome: " + nome + "\tSalario: " + salario;
    }
 
}
