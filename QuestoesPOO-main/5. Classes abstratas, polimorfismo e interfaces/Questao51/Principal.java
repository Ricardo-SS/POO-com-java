public class Principal {
    public static void main(String[] args) {
        Circulo circ = new Circulo(1, 2);
        Quadrado quad = new Quadrado(3, 5);
        Triangulo trig = new Triangulo(4, 1);

        Desenho desenho1 = new Desenho(circ, quad);
        Desenho desenho2 = new Desenho(quad, trig);

        desenho1.apresenta();
        desenho2.apresenta();
    }
}
