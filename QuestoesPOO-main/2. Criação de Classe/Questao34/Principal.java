public class Principal {
    public static void main(String[] args) {
        NumeroComplexo expressao1 = new NumeroComplexo(3.0, 6.0);
        NumeroComplexo expressao2 = new NumeroComplexo(5.0);
        NumeroComplexo expressao3 = new NumeroComplexo();

        System.out.println(expressao1.toString());
        System.out.println(expressao2.toString());
        System.out.println(expressao3.toString());
    }
}
