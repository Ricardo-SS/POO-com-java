public class Principal {
    public static void main(String[] args) {
        EventoDelegacao evD = new EventoDelegacao("ECOP ", 15, 10, 2023, 19, 00);
        EventoHeranca evH = new EventoHeranca(29, 9, 2024, 12, 30, "AWS");

        System.out.println(evD);
        System.out.println(evH);
    }
}
