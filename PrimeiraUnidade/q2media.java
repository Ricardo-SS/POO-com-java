package PrimeiraUnidade;
//2. Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3 valores reais serão informados pelo usuário.

import java.util.Scanner;

public class q2media {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    double n1, n2, n3, media=0.0;
    System.out.println("Digite o valor de N1: ");
    n1 = sc.nextDouble();
    System.out.println("N2: ");
    n2 = sc.nextDouble();
    System.out.println("N3: ");
    n3 = sc.nextDouble();
    sc.close();

    media = (n1 + n2 + n3)/3;
    System.out.printf("Meida = %.2f", media);
  }
}
