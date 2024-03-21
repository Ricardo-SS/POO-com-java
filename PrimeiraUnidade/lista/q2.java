//2. Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3 valores reais serão informados pelo usuário.
package PrimeiraUnidade.lista;

import java.util.Scanner;

public class q2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite 3 notas: ");
    float n1 = sc.nextFloat();
    float n2 = sc.nextFloat();
    float n3 = sc.nextFloat();

    sc.close();

    float media = (n1 + n2 + n3)/3;
    System.out.println("A media é: "  + media);
  }
}
