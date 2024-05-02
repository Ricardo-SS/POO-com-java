public class Computador extends Equipamento{
    private String processador;
    private int quantMemoria;
    
    public Computador(String nome, double valor, String processador, int quantMemoria) {
        super(nome, valor);
        this.processador = processador;
        this.quantMemoria = quantMemoria;
    }

    public String getProcessador() {
        return processador;
    }

    public int getQuantMemoria() {
        return quantMemoria;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setQuantMemoria(int quantMemoria) {
        this.quantMemoria = quantMemoria;
    }

    @Override
    public String toString() {
        return getNome() + " um Computador no valor de " + getValor() + " acompanha um " + processador + " e " + quantMemoria + " de memoria RAM.";
    }   
}
