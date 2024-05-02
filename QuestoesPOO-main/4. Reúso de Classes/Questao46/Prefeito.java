public class Prefeito extends Politico{
    private String cidade;

    public Prefeito(String cpf, String nome, int idade, String partido, String cidade) {
        super(cpf, nome, idade, partido);
        this.cidade = cidade;
    }
    
    @Override
    public String toString() {
        return "Nome: " + super.getNome() + "\tCPF: " + super.getCpf() + "\tIdade: " + super.getIdade() + "\nPartido: " +
         super.getPartido() + "\tCidade: " + cidade + "\n";
    }
}
