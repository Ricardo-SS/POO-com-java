package PrimeiraUnidade.lista.ArraysEArrayList.q34matriz;

public class DemoMatriz {
    public static void main(String[] args) {
        Matriz minhaMatriz = new Matriz(1.5f, 2.0f, 3.0f, 4.5f);

        minhaMatriz.imprimirMatriz();

        float determinante = minhaMatriz.calcularDeterminante();
        System.out.printf("Determinante: %.2f%n", determinante);
    }
}

