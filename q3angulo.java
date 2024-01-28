// 3. Escreva um programa que receba um ângulo em graus e o converta para sua represen- tação em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e cotangente do ângulo.

import java.util.Scanner;

public class q3angulo {
  public static void main (String[] args){
    double angulo, sen, cos, tan, cossec, sec, cotan, rad;
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o valor do angulo: ");
    angulo = input.nextDouble();

    rad = (angulo * 3.1416)/180;
    sen = Math.sin(angulo);
    cos = Math.cos(angulo);
    tan = Math.tan(angulo);
    cossec = (1/sen);
    sec = (1/cos);
    cotan = (1/tan);

    System.out.println("Angulo em rad = " + rad + "\nSeno = " + sen + "\nCosseno = " + cos + "\nTangente = " + tan);
    System.out.println("Cossecante = " + cossec + "\nSecante = " + sec + "\nCotagente = " + cotan);

    input.close();
  }
}
