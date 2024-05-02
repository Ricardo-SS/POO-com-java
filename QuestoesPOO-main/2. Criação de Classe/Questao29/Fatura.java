public class Fatura {
    private String id;
    private String desc;
    private int quant;
    private double preco;

    public Fatura(String id, String desc, int quant, double preco) {
        this.id = id;
        this.desc = desc;

        if(!(quant < 0)){
            this.quant = quant;
        }

        if(!(preco < 0.00)){
            this.preco = preco;
        }
    }

    public double calculaTotal(){
        return (quant * preco);
    }

    public String getId() {
        return "O produto tem id igual a " + id + ".";
    }

}
