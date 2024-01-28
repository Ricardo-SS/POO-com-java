//2. Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3 valores reais serão informados pelo usuário.

import java.util.Scanner;

public class q2media {
  public static void main (String[] args){
    float v1, v2, v3, media;
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o valor 1");
    v1 = input.nextFloat();
    System.out.println("Digite o valor 2");
    v2 = input.nextFloat();
    System.out.println("Digite o valor 2");
    v3 = input.nextFloat();
    media = (v1+v2+v3)/3;

    System.out.println("Sua media foi: " + media);

    input.close();
  }
}
