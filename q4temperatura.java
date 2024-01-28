// 4. Escreva um programa que receba uma temperatura em graus centígrados e a apresente em graus Fahrenheit.

import java.util.Scanner;

public class q4temperatura {
  public static void main (String[] args){
    double c, f;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite a temperatura em C: ");
    c = input.nextDouble();
    f = (c * 9/5)+32;

    System.out.println("Fahrenheit: " + f);

    input.close();
  }
}
