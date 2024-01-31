package PrimeiraUnidade;
// 7. Escreva um programa que lê três números e determina qual número é o menor.

import java.util.Scanner;

public class q7menorNumero {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int n1, n2, n3;
    System.out.print("Digite o valor 1: ");
    n1 = input.nextInt();
    System.out.print("Digite o valor 2: ");
    n2 = input.nextInt();
    System.out.print("Digite o valor 3: ");
    n3 = input.nextInt();

    int menor = n1;
    if (n2 < menor) {
      menor = n2;
    }
    if (n3 < menor){
      menor = n3;
    }

    System.out.println("Menor: " + menor);

    input.close();
  }
}
