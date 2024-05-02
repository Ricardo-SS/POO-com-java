package PrimeiraUnidade.lista.ReusoDeClasses.q42funcionario;
// 42. Implemente a classe Funcionario com nome, salário e os métodos:
// • aumentarSalario : recebe o valor do aumento e o adiciona ao salário;
// • ganhoAnual : computa o valor recebido em 12 meses e o 13o;
// • e toString : retorna uma representação textual de um objeto de Funcionario.
// (i) Crie também a classe Assistente, que também é um funcionário e que possui um
// número de matrícula (e seus métodos de acesso), além de um método toString.
// (ii) Escreva as classes Tecnico e Administrativo
// • Ambas as classes são filhas da classe Assistente
// • Ambas as classes devem ter um método ganhoAnual
// • Assistentes Técnicos possuem um bônus salarial

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }

    public double ganhoAnual() {
        return salario * 12;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário: R$" + salario;
    }
}

