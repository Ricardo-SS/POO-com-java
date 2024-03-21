//1. Escreva um programa que calcule a área de um quadrado. O valor do lado de um quadrado deverá ser informado pelo usuário.
package PrimeiraUnidade.lista;

import java.util.Scanner;

public class q1 {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o valor do lado! ");
    int lado = sc.nextInt();
    int area = lado * lado;
    System.out.println("A area é: " + area);
    sc.close();
  }
}