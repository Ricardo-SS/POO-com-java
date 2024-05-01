package ExemplosEmAula.reuso.universidade.rh;

public class Pessoa {
    private String nome;    //apenas a propria class pode acessar
    private String identidade;
    
    public Pessoa(String nome, String identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public String toString(){
        String res = "";
        res += "Nome: " + nome + "\n";
        res += "Indentidade: " + identidade + "\n";
        return res;
    }

}
