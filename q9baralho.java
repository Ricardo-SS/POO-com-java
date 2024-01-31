//9. Escreva um programa que lê um número que representa o valor da carta, de um (ás) a treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 = espadas). O programa deve imprimir o nome da carta por extenso.

import java.util.Scanner;

public class q9baralho {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o numero da carta: ");
    int carta = input.nextInt();
    System.out.println("Digite o nipe: (1 = ouros, 2 = paus, 3 = copas e 4 = espadas)");
    int nipe = input.nextInt();
    String msgNipe = " ";

    switch (nipe) {
      case 1:
        msgNipe = "outro";
        break;
      case 2:
        msgNipe = "paus";
        break;
      case 3:
        msgNipe = "copas";
        break;
      case 4:
        msgNipe = "espadas";
        break;
      default:
        System.out.println("Nipe invalida");
        break;
    }

    switch (carta) {
      case 1:
        System.out.println("As de " + msgNipe);
        break;
      case 2:
        System.out.println(carta + " de " + msgNipe);
        break;
      case 3:
        System.out.println(carta + " de " + msgNipe);
        break;
      case 4:
        System.out.println(carta + " de " + msgNipe);
        break;
      case 5:
        System.out.println(carta + " de " + msgNipe);
        break;
      case 6:
        System.out.println(carta + " de " + msgNipe);
        break;
      case 7:
        System.out.println(carta + " de " + msgNipe);
        break;
      case 8:
        System.out.println(carta + " de " + msgNipe);
        break;
      case 9:
        System.out.println(carta + " de " + msgNipe);
        break;
      case 10:
        System.out.println(carta + " de " + msgNipe);
        break;
      case 11:
        System.out.println("Valete de "  + msgNipe);
        break;
      case 12:
        System.out.println("Dama de " + msgNipe);
        break;
      case 13:
        System.out.println("Rei de " + msgNipe);
        break;    
      default:
        System.out.println("Carta invalida");
        break;
    }
    input.close();
  }
}
