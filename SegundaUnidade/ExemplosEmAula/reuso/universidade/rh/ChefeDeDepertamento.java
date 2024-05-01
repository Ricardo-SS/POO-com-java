package ExemplosEmAula.reuso.universidade.rh;

public class ChefeDeDepertamento extends Funcionario {
    private String departamento;

    public ChefeDeDepertamento(String nome, String identidade, Double salario, String departamento) {
        super(nome, identidade, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String toString(){
        String res = super.toString();
        res += "Departamento: " + departamento + "\n";
        return res;
    }
    
}
