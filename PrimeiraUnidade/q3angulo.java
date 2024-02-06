package PrimeiraUnidade;
// 3. Escreva um programa que receba um ângulo em graus e o converta para sua represen- tação em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e cotangente do ângulo.

import java.util.Scanner;

public class q3angulo {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double angulo, rad, seno, cosseno, tangente, coss, sec, cotan;

    System.out.println("Digite o valor do algulo: ");
    angulo = sc.nextDouble();
    sc.close();

    rad = (angulo * Math.PI)/180;
    seno = Math.sin(angulo);
    cosseno = Math.cos(angulo);
    tangente = Math.tan(angulo);
    coss = 1/seno;
    sec = 1/cosseno;
    cotan = 1/tangente;
    System.out.printf("Angura em Rad %.2f\n", rad);
    System.out.println("Seno = " + seno + "\nCosseno = " + cosseno + "\nTangente = " + tangente);
    System.out.println("Cossecante = " + coss + "\nSecante = " + sec + "\nCotagente = " + cotan);
  }
}
