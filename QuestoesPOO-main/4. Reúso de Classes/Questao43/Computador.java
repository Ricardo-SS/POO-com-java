public class Computador extends Equipamento{
    private String processador;
    private int quantMemoriaRam;

    public Computador(String nome, double valor, String processador, int quantMemoriaRam) {
        super(nome, valor);
        this.processador = processador;
        this.quantMemoriaRam = quantMemoriaRam;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getQuantMemoriaRam() {
        return quantMemoriaRam;
    }

    public void setQuantMemoriaRam(int quantMemoria) {
        this.quantMemoriaRam = quantMemoria;
    }

    @Override
    public String toString() {
        return "Computador [processador=" + processador + ", quantMemoriaRam=" + quantMemoriaRam + "]";
    }

}
