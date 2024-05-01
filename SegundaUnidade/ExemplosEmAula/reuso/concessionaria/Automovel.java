package ExemplosEmAula.reuso.concessionaria;

public class Automovel {
    private double ano;
    private String modelo;
    private String cor;
    
    public Automovel(Double ano, String modelo, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

    public double quantoCusta(){
        if (ano < 2000) {
            return 200000;
        } else {
            return 400000;
        }
    }
}
