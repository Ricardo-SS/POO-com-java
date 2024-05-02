public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("123456789-00", "Leonardo", 20);
        Politico p2 = new Politico("321654987-99", "Livia", 20, "PT");
        Governador p3 = new Governador("369258147-11", "Geisa", 20, "PDT", "Ceara");
        Prefeito p4 = new Prefeito("471258963-55", "Pedro", 20, "PSDB", "Jose da Penha");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
