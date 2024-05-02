public class Principal {
    public static void main(String[] args) {
        Equipamento equip = new Equipamento("Fogao", 1234.00);
        Computador comp = new Computador("Alienware", 4321.90, "I9", 16);

        System.out.println(equip);
        System.out.println(comp);
    }
}
