public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int quantPessoas = 0;

    Elevador(int totalAndares, int capacidade){
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        andarAtual = 0;
        quantPessoas = 0;
    }

    public void entra(){
        if(quantPessoas < capacidade){
            ++quantPessoas;
            System.out.println("Entrando...");
        } else{
            System.out.println("Elevador cheio");
        }
    }
    public void sai(){
        if(quantPessoas != 0){
            quantPessoas--;
            System.out.println("Saindo...");
        }
    }

    public void sobe(){
        if(andarAtual < totalAndares){
            andarAtual++;
            System.out.println("Subindo");
        }
    }

    public void desce(){
        if(andarAtual > 0 && andarAtual <= totalAndares){
            andarAtual--;
            System.out.println("Descendo");
        } else{
            System.out.println("Terreo");
        }
    }
}
