package PrimeiraUnidade.lista;
//1. Escreva um programa que calcule a área de um quadrado. O valor do lado de um quadrado deverá ser informado pelo usuário.

import java.util.Scanner;

public class q1area {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor do lado do quadrado: ");
    int lado = sc.nextInt();
    int area = lado * lado;
    System.out.printf("Area = %d", area);
    sc.close();
  }
}