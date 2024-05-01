// Escreva uma classe que encapsule uma atriz de tamanho 2 × 2 de valores do tipo float
// usando um array de duas dimensões. Nesta classe, além do construtor, escreva um
// método que calcule o determinante da atriz encapsulada e um método que permita a
// impressão formatada dos seus valores. Escreva um aplicativo de teste que demonstre as capacidades da classe criada

package PrimeiraUnidade.lista.ArraysEArrayList.q34matriz;

public class Matriz {
    private float[][] matriz;

    public Matriz(float a, float b, float c, float d) {
        matriz = new float[2][2];
        matriz[0][0] = a;
        matriz[0][1] = b;
        matriz[1][0] = c;
        matriz[1][1] = d;
    }

    public float calcularDeterminante() {
        return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
    }

    public void imprimirMatriz() {
        System.out.println("Matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
