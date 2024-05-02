package PrimeiraUnidade.lista;

import java.util.Scanner;

public class q22calculadoraPolinomio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        double[] coeficientes = new double[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print("Digite o coeficiente a" + i + ": ");
            coeficientes[i] = scanner.nextDouble();
        }

        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        double resultado = calcularPolinomio(coeficientes, n, x);
        System.out.println("O valor de Pn(x) é: " + resultado);

        scanner.close();
    }

    private static double calcularPolinomio(double[] coeficientes, int n, double x) {
        if (n == 0) {
            // Caso base: P0(x) = a0
            return coeficientes[0];
        } else {
            // Pn(x) = x * Pn-1(x) + an
            return x * calcularPolinomio(coeficientes, n - 1, x) + coeficientes[n];
        }
    }
}
