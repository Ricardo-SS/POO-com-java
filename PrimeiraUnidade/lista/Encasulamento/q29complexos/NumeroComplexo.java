package PrimeiraUnidade.lista.Encasulamento.q29complexos;

// 29. Escreva uma classe para representar um número complexo. Essa classe deve conter
// três construtores. Um construtor deverá receber os dois valores (parte real e parte imagi-
// nária) como argumentos, o outro somente o valor real, considerando o imaginário como
// sendo zero, e o terceiro construtor não recebe argumentos, considerando as partes real e
// imaginária do número complexo como sendo iguais a zero. Escreva um método toString
// que apresente o número complexo em notação apropriada (ex.: 2 + 4i) e o use em um
// aplicativo de teste que demonstre as capacidades da classe criada.

public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    // Construtor que recebe ambos os valores (parte real e parte imaginária)
    public NumeroComplexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // Construtor que recebe apenas o valor real (parte imaginária é zero)
    public NumeroComplexo(double parteReal) {
        this.parteReal = parteReal;
        this.parteImaginaria = 0;
    }

    // Construtor padrão (partes real e imaginária são zero)
    public NumeroComplexo() {
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }

    // Método para apresentar o número complexo em notação apropriada
    @Override
    public String toString() {
        if (parteImaginaria == 0) {
            return String.format("%.2f", parteReal); // Apenas parte real
        } else if (parteImaginaria > 0) {
            return String.format("%.2f + %.2fi", parteReal, parteImaginaria); // Parte imaginária positiva
        } else {
            return String.format("%.2f - %.2fi", parteReal, Math.abs(parteImaginaria)); // Parte imaginária negativa
        }
    }
}