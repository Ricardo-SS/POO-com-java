public class Politico extends Pessoa{
    private String partido;

    public Politico(String cpf, String nome, int idade, String partido) {
        super(cpf, nome, idade);
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }
    
    @Override
    public String toString() {
        return "Nome: " + super.getNome() + "\tCPF: " + super.getCpf() + "\tIdade: " + super.getIdade() + "\nPartido: " + partido + "\n";
    }
}
