package SegundaUnidade.ExemplosEmAula;

public class PiSobre6 {
    public static void main(String[] args) {
        double[] seq = new double[10000000];

        for (int i = 0; i < seq.length; i++) {
            seq[i] = 1.0/Math.pow(i + 1, 2);
        }

        for (int num = 10; num <= 10000000; num *=10) {;
            calculaEMostraSomatorio(seq, num);
        }
    }

    public static void calculaEMostraSomatorio(double[] vetor, int num) {
        double soma = 0.0;
        for (int i = 0; i < num; i++) {
            soma += vetor[i];
        }
        System.out.println(soma + " ");
    }
}
