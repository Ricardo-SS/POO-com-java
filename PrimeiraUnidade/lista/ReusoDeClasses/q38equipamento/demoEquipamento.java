package PrimeiraUnidade.lista.ReusoDeClasses.q38equipamento;

public class demoEquipamento {
    public static void main(String[] args){
        Equipamento equipamento = new Equipamento("Sony ", 2022);

        Computador computador = new Computador("Dell", 2017, "Windows 10");

        System.out.println("Equpamento: " + equipamento);
        System.out.println("Computador: " + computador);
    }
}
