public class Computador extends Equipamento{
    private double preco;
    private String marca;

    public Computador(int id, String modelo, double preco, String marca) {
        super(id, modelo);
        this.preco = preco;
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + "Computador [preco=" + preco + ", marca=" + marca + "]";
    }

    

    
}