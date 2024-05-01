package ExemplosEmAula.reuso.universidade.rh;

public class Funcionario extends Pessoa {
    private Double salario;

    public Funcionario(String nome, String identidade, Double salario) {
        super(nome, identidade);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    
    public String toString(){
        String res = super.toString();
        res += "Salario: " + salario + "\n";
        return res;
    }

    
}
