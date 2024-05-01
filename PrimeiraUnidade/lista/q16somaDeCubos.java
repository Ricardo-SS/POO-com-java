// 16 - Escreva um programa que determine quais são todos os números de 3 algarismos cuja soma dos 
// cubos de seus algarismos sejam iguais ao próprio número
// Exemplo: 153=1ˆ3 + 5ˆ3 + 3ˆ3 =1+125+27.

package PrimeiraUnidade.lista;

public class q16somaDeCubos {
  public static void main(String[] args) {
      for (int i = 100; i < 1000; i++) {  //cria um laço que vai de 100 até 999 (numeros de 3 algarismos)
          int numero = i;
          int suma = 0;

          while (numero != 0) { //Este é um loop que continua até que numero seja 0.
              int digit = numero % 10;  
              suma += Math.pow(digit, 3); //Em cada iteração do loop, removemos o último algarismo de number
              numero /= 10;
          }

          if (suma == i) {
              System.out.println(i);
          }
      }
  }
}

