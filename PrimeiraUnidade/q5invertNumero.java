package PrimeiraUnidade;

// 5. Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena, Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve ser reescrito como 312.

import java.util.Scanner;

public class q5invertNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 3 dígitos (CDU): ");
        int numero = sc.nextInt();
        sc.close();

        // Extrai os dígitos
        int unidade = numero % 10;
        int dezena = (numero / 10) % 10;
        int centena = numero / 100;

        // Reescreve no formato UCD
        int novoNumero = unidade * 100 + dezena * 10 + centena;

        System.out.println("Número reescrito no formato UCD: " + novoNumero);
    }
}