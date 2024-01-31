package PrimeiraUnidade;
// 6. Escreva um programa que recebe um valor inteiro representando um intervalo em minutos e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.

import java.util.Scanner;

public class q6tempo {
  public static void main (String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Digite os minutos: ");

    int minutos = input.nextInt();

// um dia tem 1440 minutos (24*60)
// uma hora tem 60 minutos 

    int dias = minutos / (60 * 24);
    minutos = minutos % (60 * 24);
    int horas = minutos / 60;
    minutos = minutos % 60;

    System.out.println("O período equivale a: " + dias + " dias, " + horas + " horas e " + minutos + " minutos.");

    input.close();
  }
}
