public class Governador extends Politico{
    private String estado;

    public Governador(String cpf, String nome, int idade, String partido, String estado) {
        super(cpf, nome, idade, partido);
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + "\tCPF: " + super.getCpf() + "\tIdade: " + super.getIdade() + "\nPartido: " +
         super.getPartido() + "\tEstado: " + estado + "\n";
    }
}
