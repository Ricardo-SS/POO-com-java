public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String tel;

    public Cliente(int id, String nome, int idade, String tel) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.tel = tel;
    }
    
    public String toString(){
        return ("ID - " + id + "\nNome: " + nome + "\nIdade: " + idade + "\tTelefone: " + tel);
    }
}
