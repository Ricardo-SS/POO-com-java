package PrimeiraUnidade.lista.ReusoDeClasses.q38equipamento;

class Equipamento {
    private String marca;
    private int anoDeFabricacao;

    public Equipamento(String marca, int anoDeFabricacao){
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    // Métodos de acesso (getters e setters)
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public int getAnoDeFabricacao(){
        return anoDeFabricacao;
    }
    public void setAnoDeFabricacao(int anoDeFabricacao){
        this.anoDeFabricacao = anoDeFabricacao;
    }

    @Override
    public String toString(){
        return "Equipamento [marca=" + marca + ", anoFabricacao=" + anoDeFabricacao + "]";
    }
}

class Computador extends Equipamento {
    private String sistemaOperacional;

    public Computador(String marca, int anoDeFabricacao, String sistemaOperacional) {
        super(marca, anoDeFabricacao);
        this.sistemaOperacional = sistemaOperacional;
    }

    // Método de acesso específico para o atributo sistemaOperacional
    public String getSistemaOperacional(){
        return sistemaOperacional;
    }
    public void setSistemaOperacional(String sistemaOperacional){
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString(){
        return super.toString() + " - Sistema Operacional: " + sistemaOperacional;
    }
}
