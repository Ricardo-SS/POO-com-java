public class Principal {
    public static void main(String[] args) {
        Fatura compra = new Fatura("32059036", "Produto de limpeza", 3, 15.90);

        System.out.println("O total da fatura é de " + compra.calculaTotal() + "");
    }
}
