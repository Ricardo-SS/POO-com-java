package PrimeiraUnidade.lista.ReusoDeClasses.q42funcionario;

public class Funcionario {
    private String nome;
    private double salario;

    //construtor
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentSalario(double aumento){
        this.salario += aumento;
    }

    public double ganhoAnual(){
        return salario * 13;
    }

    @Override
    public String toString() {
        return "Funcionario [nome = " + nome + ", salario = " + salario + "]";
    }
}