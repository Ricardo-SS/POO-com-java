public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int quantOcupado;

    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.andarAtual = 0;
        this.quantOcupado = 0;
    }

    public void entra(){
        if(quantOcupado < capacidade){
            System.out.println("Entrando...");
            quantOcupado++;
        }
    }

    public void sai(){
        if(quantOcupado > 0){
            System.out.println("Saindo...");
            quantOcupado--;
        }
    }

    public void sobe(){
        if(andarAtual < totalAndares){
            System.out.println("Subindo...");
            andarAtual++;
        }
    }
    
    public void desce(){
        if(andarAtual > 0){
            System.out.println("Descendo...");
            andarAtual--;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getQuantOcupado() {
        return quantOcupado;
    }
}
