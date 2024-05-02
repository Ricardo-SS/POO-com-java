public class Lampada {
    private boolean estadoLampada;
    private Contador vezesLigado;

    public Lampada(boolean estadoLampada) {
        this.estadoLampada = estadoLampada;
        this.vezesLigado = new Contador(0);
    }

    public void acender(){
        this.estadoLampada = true;
        vezesLigado.incrementarNumero();
    }

    public void apagar(){
        this.estadoLampada = false;
    }

    public int numVezesLigado() {
        return vezesLigado.getNumero();
    }

    // public String getEstadoLampada() {
    //     if(estadoLampada){
    //         return "A lâmpada está LIGADA!";
    //     }

    //     return "A lâmpada está DESLIGADA";
    // }

    public boolean estaLigada(){
        if(estadoLampada){
            return true;
        }

        return false;
    }

    
}
