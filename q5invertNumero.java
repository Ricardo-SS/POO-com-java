
// 5. Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena, Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve ser reescrito como 312.

import java.util.Scanner;

public class q5invertNumero {
  public static void main (String[] args){
    int numero;
    Scanner input = new Scanner(System.in);
    System.out.println("Digite um numero de 3 digitos: ");
    numero = input.nextInt();

    int centena = numero/100;
    int dezena = (numero % 100)/10;
    int unidade = numero % 10;

    //fazendo a inversao
    int novoNumero = unidade * 100 + centena * 10 + dezena;

    System.out.println("Novo numero: " + novoNumero);

    input.close();

  }
}
