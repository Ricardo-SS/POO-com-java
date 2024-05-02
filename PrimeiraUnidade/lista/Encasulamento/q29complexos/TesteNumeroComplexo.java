package PrimeiraUnidade.lista.Encasulamento.q29complexos;

public class TesteNumeroComplexo {
    public static void main(String[] args) {
        NumeroComplexo c1 = new NumeroComplexo(2, 4);
        NumeroComplexo c2 = new NumeroComplexo(3);
        NumeroComplexo c3 = new NumeroComplexo();

        System.out.println("Número complexo c1: " + c1); // Deve imprimir "2.00 + 4.00i"
        System.out.println("Número complexo c2: " + c2); // Deve imprimir "3.00"
        System.out.println("Número complexo c3: " + c3); // Deve imprimir "0.00"
    }
}
