public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento e = new Equipamento(12, "Notebook Gamer");
        Computador c = new Computador(1, "Notebook Basico", 3000, "Positivo");

        System.out.println(e);
        System.out.println(c);
    }
}
