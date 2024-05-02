package PrimeiraUnidade.lista.ArraysEArrayList.q37dados;

// 37. Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar
// um objeto de classe Random, uma vez para lançar o primeiro dado e novamente para
// lançar o segundo dado. A soma dos dois valores deve então ser calculada. Cada dado
// pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a
// 12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. Seu
// aplicativo deve lançar o dado 36.000.000 vezes. Utilize um array unidimensional para
// contar o número de vezes que cada possível soma aparece. Exiba os resultados

import java.util.Random;

public class SimuladorDados {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frequencia = new int[13]; // Índices de 2 a 12

        // Simular o lançamento dos dados 36.000.000 vezes
        for (int i = 0; i < 36_000_000; i++) {
            int dado1 = random.nextInt(6) + 1; // Gerar número aleatório de 1 a 6 para o dado 1
            int dado2 = random.nextInt(6) + 1; // Gerar número aleatório de 1 a 6 para o dado 2
            int soma = dado1 + dado2;
            frequencia[soma]++; // Incrementar a frequência da soma
        }

        // Exibir os resultados
        System.out.println("Soma\tFrequência");
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "\t" + frequencia[i]);
        }
    }
}

