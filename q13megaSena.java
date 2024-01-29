// 13. Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena (somente com os números, respeitando o número de linhas e a distribuição dos números nas linhas).

public class q13megaSena {
  public static void main (String[] args){
    for(int i = 1; i <= 60; i++ ){
      System.out.printf("%02d ", i);
      if ( i % 10 == 0){
        System.out.println();
      }
    }
  }
}
