public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento motor = new Equipamento("Motor 100 cavalos", 10000.99);
        Computador pc = new Computador("MonstroVerde", 5500.99, "I9 - 10 geracao", 32);

        System.out.println(motor);
        System.out.println(pc);
    }    
}
