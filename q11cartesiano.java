//11. Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.

import java.util.Scanner;

public class q11cartesiano {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Digite as cordenatas x e y do primeiro ponto");
    int x1 = input.nextInt();
    int y1 = input.nextInt();
    
    System.out.print("Digite as cordenatas x e y do segundo ponto");
    int x2 = input.nextInt();
    int y2 = input.nextInt();

    if (x2 > x1) {
      System.out.println("O segundo ponto está à direita do primeiro.");
    } else if (x2 < x1){
      System.out.println("O segundo ponto está à esquerda do primeiro.");
    }

    if (y2 > y1){
      System.out.println("O segundo ponto está acima do primeiro.");
    } else if (y2 < y1) {
      System.out.println("O segundo ponto está abaixo do primeiro.");
    }
  }
}
