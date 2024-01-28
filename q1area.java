//1. Escreva um programa que calcule a área de um quadrado. O valor do lado de um qua- drado deverá ser informado pelo usuário.

import java.util.Scanner;

public class q1area {
  public static void main (String[] args) {
    double lado, area;
    Scanner input = new Scanner(System.in);

    System.out.print("Diginte o valor do lado: ");
    lado = input.nextDouble();
    area = lado * lado;

    System.out.print("Area = " + area);

    input.close();

  }
}