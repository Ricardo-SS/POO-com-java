// 5. Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena, Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve ser reescrito como 312.

package PrimeiraUnidade;

import java.util.Scanner;

public class q5invertNumero{
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int centena, dezena, unidade, numero;
    System.out.println("Digite um numero de 3 digitos: ");
    numero = sc.nextInt();
    sc.close();
    centena = numero / 100;
    dezena = (numero % 100) / 10;
    unidade = numero % 10;

    int novoNumero = (unidade * 100) + (dezena * 10) + centena;
    System.out.println("novo numero UDC: " + novoNumero);
  }
}
