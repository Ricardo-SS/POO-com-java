public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int quantOcupado;

    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        andarAtual = 0;
        quantOcupado = 0;
    }

    public void entra(){
        if(quantOcupado < capacidade){
            System.out.println("Entrando uma pessoa! ");
            quantOcupado++;
        } else {
            System.out.println("Atingiu a capacidade maxima!");
        }
    }

    public void sai(){
        if(quantOcupado > 0){
            System.out.println("Saindo uma pessoa! ");
            quantOcupado--;
        } else {
            System.out.println("Nao ha ninguem no elevador!");
        }
    }

    public void sobe(){
        if(andarAtual < totalAndares){
            System.out.println("Subindo... ");
            andarAtual++;
        } else {
            System.out.println("Ja esta no ultimo andar!");
        }
    }

    public void desce(){
        if(andarAtual > 0){
            System.out.println("Descendo... ");
            andarAtual--;
        } else {
            System.out.println("Ja esta no terreo!");
        }
    }
}
