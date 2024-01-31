package PrimeiraUnidade;
//  12. O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia da semana correspondente.
//  • Exemplo de entrada: 10
//  • Exemplo de saída: O dia 10 será uma terça-feira.

import java.util.Scanner;

public class q12diaSemana {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o dia do mes: ");
    int dia = input.nextInt();

    switch (dia) {
      case 1:
      case 8:
      case 16:
      case 24:
        System.out.println("Domingo");
        break;

      case 2:
      case 9:
      case 17:
      case 25:
        System.out.println("Segunda");
        break;

      case 3:
      case 10:
      case 18:
      case 26:
        System.out.println("Terca");
        break;

      case 4:
      case 11:
      case 19:
      case 27:
        System.out.println("Quarta");
        break;
      
      case 5:
      case 12:
      case 20:
      case 28:
        System.out.println("Quinta");
        break;
      
      case 6:
      case 13:
      case 21:
        System.out.println("Sexta");
        break;
      
      case 7:
      case 14:
      case 22:
        System.out.println("Sabado");
        break;
      default:
        System.out.println("Data invalida!");
        break;
    }
    input.close();
  }
}
