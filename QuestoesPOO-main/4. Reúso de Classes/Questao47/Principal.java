public class Principal {
    public static void main(String[] args) {
        Funcionario p1 = new Funcionario("Leonardo", 2000.99);
        Assistente p2 = new Assistente("Pedro", 2200.20, 1);
        Tecnico p3 = new Tecnico("Livia", 1000.00, 2, 15);
        Administrativo p4 = new Administrativo("Geisa", 1000.00, 3, "Noite");

        System.out.println(p1);
        System.out.println("\t" + p1.getSalario());
        System.out.println("\t" + p1.ganhoAnual());

        System.out.println("\n" + p2);
        
        System.out.println("\n" + p3);
        System.out.println("\t" + p3.ganhoAnual());

        System.out.println("\n" + p4);
        System.out.println("\t" + p4.ganhoAnual());
    }
}
